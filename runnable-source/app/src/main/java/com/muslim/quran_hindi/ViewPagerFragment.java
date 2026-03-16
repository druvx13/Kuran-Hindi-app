package com.muslim.quran_hindi;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.text.InputFilter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.muslim.Settings.SettingsActivity;
import com.muslim.hafizi.InputFilterMinMax;
import com.muslim.necessary.db.DatabaseAccessor;
import com.muslim.necessary.utils.Constants;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.extras.Num114;
import com.muslim.quran_hindi.extras.SuraAdapter114;
import com.muslim.quran_hindi.model.QuranSuras;
import com.recyclerview.viewpager.RecyclerViewPager;
import java.io.File;
import java.util.ArrayList;

public class ViewPagerFragment extends Fragment {
    protected static DetailsListAdapter adapter = null;
    private static AlertDialog alertDialog = null;
    private static String audioFile = "";
    private static String audioFolder = "";
    private static int currentPage = 0;
    private static Dialog dialog = null;
    static FloatingActionMenu floatingActionMenu = null;
    private static File lastAudioFile = null;
    protected static ListView listView = null;
    protected static QuranSuras quranSuras = null;
    protected static ArrayList<QuranSuras> quranSurasArrayList = null;
    protected static boolean toolshowhide = true;
    private static String verseId;
    protected static ViewPager viewPager;
    protected static ViewPagerAdapter viewPagerAdapter;
    private String duaDBID;
    private FastScroller fastScrollerH;
    private Handler handlerTitle;
    private SuraAdapter114 mAdapterHorizontal;
    private int mCurrentPosition;
    private int mScrollState;
    private Handler myHandler;
    private Runnable myRunnable;
    private ProgressDialog pDialog;
    private RecyclerViewPager recyclerViewHorizontal;
    private Runnable runnableTitle;
    private TextView toastTitle;
    private String text = "";
    private ArrayList<Num114> numListHorizontal = new ArrayList<>();

    public static void playAudio() {
        stopPlaying();
        Dialog dialog2 = new Dialog(QuranActivity.mainActivity);
        dialog = dialog2;
        dialog2.requestWindowFeature(1);
        dialog.setContentView(R.layout.audio_range);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCanceledOnTouchOutside(false);
        Utils.setMyBanglaText((TextView) dialog.findViewById(R.id.tvSura), QuranActivity.mainActivity.getResources().getString(R.string.sura) + " " + quranSuras.getSuraName().trim());
        TextView textView = (TextView) dialog.findViewById(R.id.btnOk);
        Utils.setMyBanglaText(textView, textView.getText().toString());
        TextView textView2 = (TextView) dialog.findViewById(R.id.tvFrom);
        TextView textView3 = (TextView) dialog.findViewById(R.id.tvTo);
        Utils.setMyBanglaText(textView2, textView2.getText().toString());
        Utils.setMyBanglaText(textView3, textView3.getText().toString());
        final EditText editText = (EditText) dialog.findViewById(R.id.etFrom);
        final EditText editText2 = (EditText) dialog.findViewById(R.id.etTo);
        String valueOf = String.valueOf(DatabaseAccessor.getAllVersesBySuraId(String.valueOf(viewPager.getCurrentItem() + 1), "").size());
        editText.setHint(Utils.getBanglaNumber("1"));
        editText.setText(Utils.getBanglaNumber("1"));
        editText2.setHint(Utils.getBanglaNumber(valueOf));
        editText2.setText(Utils.getBanglaNumber(valueOf));
        editText.setFilters(new InputFilter[]{new InputFilterMinMax("1", valueOf)});
        editText2.setFilters(new InputFilter[]{new InputFilterMinMax("1", valueOf)});
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (editText.getText().toString().isEmpty() || editText2.getText().toString().isEmpty()) {
                    Toast.makeText(QuranActivity.mainActivity, "Please enter a range", 0).show();
                    return;
                }
                int parseInt = Integer.parseInt(Utils.getMyEnglishNumber(editText.getText().toString()));
                int parseInt2 = Integer.parseInt(Utils.getMyEnglishNumber(editText2.getText().toString()));
                Log.d("FREG", parseInt + " : " + parseInt2);
                if (parseInt <= parseInt2) {
                    ViewPagerFragment.dialog.dismiss();
                    ViewPagerFragment.multiPlay(parseInt, parseInt2);
                    return;
                }
                Toast.makeText(QuranActivity.mainActivity, "Please set a valid range", 0).show();
            }
        });
        ((ImageView) dialog.findViewById(R.id.iv_close)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ViewPagerFragment.dialog.dismiss();
            }
        });
        dialog.show();
    }

    
    public static void multiPlay(final int i, final int i2) {
        int currentItem = 114 - viewPager.getCurrentItem();
        if (String.valueOf(currentItem).length() == 1) {
            audioFolder = "00" + currentItem;
        } else if (String.valueOf(currentItem).length() == 2) {
            audioFolder = "0" + currentItem;
        } else {
            audioFolder = "" + currentItem;
        }
        stopPlaying();
        Constants.SCROLL_TO = 0;
        ViewPagerAdapter viewPagerAdapter2 = new ViewPagerAdapter(QuranActivity.mainActivity, quranSurasArrayList);
        viewPagerAdapter = viewPagerAdapter2;
        viewPager.setAdapter(viewPagerAdapter2);
        viewPagerAdapter.notifyDataSetChanged();
        viewPager.setCurrentItem(114 - Integer.parseInt(quranSuras.getSura_id()));
        if (Build.VERSION.SDK_INT >= 21) {
            QuranActivity.ivPlay.setImageDrawable(QuranActivity.mainActivity.getResources().getDrawable(R.mipmap.ic_pause, QuranActivity.mainActivity.getTheme()));
        } else {
            QuranActivity.ivPlay.setImageDrawable(QuranActivity.mainActivity.getResources().getDrawable(R.mipmap.ic_pause));
        }
        Constants.IS_BISMILLAH = true;
        Constants.isFirst = false;
        abAudio(currentItem);
        if (currentItem == 9) {
            Constants.IS_BISMILLAH = false;
            playNext(i, i2);
            return;
        }
        DetailsListAdapter.mp.start();
        DetailsListAdapter.mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.3
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                Constants.IS_BISMILLAH = false;
                ViewPagerFragment.playNext(i, i2);
            }
        });
    }

    private static void abAudio(int i) {
        if (Utils.getString(QuranActivity.mainActivity, Constants.KEY_RECEITER).equals(Constants.RECEITER_SUDAIS)) {
            if (i == 1) {
                DetailsListAdapter.mp = MediaPlayer.create(QuranActivity.mainActivity, (int) R.raw.auzubillah_sudais);
            } else {
                DetailsListAdapter.mp = MediaPlayer.create(QuranActivity.mainActivity, (int) R.raw.bismillah_sudais);
            }
        } else if (Utils.getString(QuranActivity.mainActivity, Constants.KEY_RECEITER).equals(Constants.RECEITER_GHAMDI)) {
            if (i == 1) {
                DetailsListAdapter.mp = MediaPlayer.create(QuranActivity.mainActivity, (int) R.raw.auzubillah_ghamdi);
            } else {
                DetailsListAdapter.mp = MediaPlayer.create(QuranActivity.mainActivity, (int) R.raw.bismillah_ghamdi);
            }
        } else if (Utils.getString(QuranActivity.mainActivity, Constants.KEY_RECEITER).equals(Constants.RECEITER_AL_AFASY)) {
            if (i == 1) {
                DetailsListAdapter.mp = MediaPlayer.create(QuranActivity.mainActivity, (int) R.raw.auzubillah_al_afasy);
            } else {
                DetailsListAdapter.mp = MediaPlayer.create(QuranActivity.mainActivity, (int) R.raw.bismillah_al_afasy);
            }
        } else if (Utils.getString(QuranActivity.mainActivity, Constants.KEY_RECEITER).equals(Constants.RECEITER_ABDUL_BASET)) {
            if (i == 1) {
                DetailsListAdapter.mp = MediaPlayer.create(QuranActivity.mainActivity, (int) R.raw.auzubillah_abdul_baset);
            } else {
                DetailsListAdapter.mp = MediaPlayer.create(QuranActivity.mainActivity, (int) R.raw.bismillah_abdul_baset);
            }
        }
    }

    protected static void playNext(final int i, final int i2) {
        Constants.SINGLE_PLAY = false;
        if (String.valueOf(i).length() == 1) {
            audioFile = "00" + i;
        } else if (String.valueOf(i).length() == 2) {
            audioFile = "0" + i;
        } else {
            audioFile = "" + i;
        }
        stopPlaying();
        Constants.SCROLL_TO = i - 1;
        ViewPagerAdapter viewPagerAdapter2 = new ViewPagerAdapter(QuranActivity.mainActivity, quranSurasArrayList);
        viewPagerAdapter = viewPagerAdapter2;
        viewPager.setAdapter(viewPagerAdapter2);
        viewPager.setCurrentItem(114 - Integer.parseInt(quranSuras.getSura_id()));
        if (Build.VERSION.SDK_INT >= 21) {
            QuranActivity.ivPlay.setImageDrawable(QuranActivity.mainActivity.getResources().getDrawable(R.mipmap.ic_pause, QuranActivity.mainActivity.getTheme()));
        } else {
            QuranActivity.ivPlay.setImageDrawable(QuranActivity.mainActivity.getResources().getDrawable(R.mipmap.ic_pause));
        }
        Constants.isFirst = false;
        Log.d("FREG", Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(QuranActivity.mainActivity, Constants.KEY_RECEITER) + "/" + audioFolder + "/" + audioFolder + audioFile + ".mp3/");
        QuranActivity quranActivity = QuranActivity.mainActivity;
        DetailsListAdapter.mp = MediaPlayer.create(quranActivity, Uri.parse(Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(QuranActivity.mainActivity, Constants.KEY_RECEITER) + "/" + audioFolder + "/" + audioFolder + audioFile + ".mp3/"));
        DetailsListAdapter.mp.start();
        DetailsListAdapter.mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.4
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                int i3 = i + 1;
                int i4 = i2;
                if (i3 <= i4) {
                    ViewPagerFragment.playNext(i3, i4);
                    return;
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    QuranActivity.ivPlay.setImageDrawable(QuranActivity.mainActivity.getResources().getDrawable(R.mipmap.ic_play, QuranActivity.mainActivity.getTheme()));
                } else {
                    QuranActivity.ivPlay.setImageDrawable(QuranActivity.mainActivity.getResources().getDrawable(R.mipmap.ic_play));
                }
                ViewPagerFragment.stopPlaying();
                Constants.INITIAL_SELECTION = i - 1;
                ViewPagerFragment.viewPagerAdapter = new ViewPagerAdapter(QuranActivity.mainActivity, ViewPagerFragment.quranSurasArrayList);
                ViewPagerFragment.viewPager.setAdapter(ViewPagerFragment.viewPagerAdapter);
                ViewPagerFragment.viewPager.setCurrentItem(114 - Integer.parseInt(ViewPagerFragment.quranSuras.getSura_id()));
                Constants.isFirst = true;
            }
        });
    }

    
    public static void stopPlaying() {
        Constants.IS_BISMILLAH = false;
        try {
            if (DetailsListAdapter.mp != null) {
                DetailsListAdapter.mp.stop();
                DetailsListAdapter.mp.release();
                DetailsListAdapter.mp = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ivPlayClick(boolean z) {
        String str;
        String str2;
        int currentItem = 114 - viewPager.getCurrentItem();
        if (String.valueOf(currentItem).length() == 1) {
            str = "00" + currentItem;
        } else if (String.valueOf(currentItem).length() == 2) {
            str = "0" + currentItem;
        } else {
            str = "" + currentItem;
        }
        Log.d("DREG", "Audio: " + str);
        File file = new File(Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(QuranActivity.mainActivity, Constants.KEY_RECEITER) + "/" + str + "/");
        if (!file.exists()) {
            file.mkdirs();
        }
        String verse_id = DatabaseAccessor.getVersesIdBySuraId(String.valueOf(currentItem)).getVerse_id();
        verseId = verse_id;
        if (verse_id.length() == 1) {
            str2 = "00" + verseId;
        } else if (verseId.length() == 2) {
            str2 = "0" + verseId;
        } else {
            str2 = verseId;
        }
        Log.d("DREG", "suraId: " + currentItem + " verseId: " + verseId);
        lastAudioFile = new File(Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(QuranActivity.mainActivity, Constants.KEY_RECEITER) + "/" + str + "/" + str + str2 + ".mp3/");
        StringBuilder sb = new StringBuilder();
        sb.append(Utils.getRoot().getAbsolutePath());
        sb.append("/QuranIDEA/Audio/");
        sb.append(Utils.getString(QuranActivity.mainActivity, Constants.KEY_RECEITER));
        sb.append("/");
        sb.append(str);
        sb.append("/");
        sb.append(str);
        existsAllFiles(sb.toString(), 1, Integer.parseInt(verseId), z);
    }

    private static void existsAllFiles(String str, int i, int i2, boolean z) {
        String str2;
        if (i < 10) {
            str2 = "00" + i;
        } else if (i < 100) {
            str2 = "0" + i;
        } else {
            str2 = "" + i;
        }
        if (!new File(str + str2 + ".mp3/").exists()) {
            if (z) {
                new AlertDialog.Builder(QuranActivity.mainActivity).setCancelable(false).setMessage("Sorry! this audio file is corrupted!!\nYou need to download this audio file again").setNeutralButton("OK", new DialogInterface.OnClickListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.5
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i3) {
                        dialogInterface.dismiss();
                        ViewPagerFragment.ifMultipleAudioNotExists();
                    }
                }).create().show();
                return;
            } else {
                ifMultipleAudioNotExists();
                return;
            }
        }
        Log.d("DREG" + i, "Exists");
        if (i < i2) {
            existsAllFiles(str, i + 1, i2, z);
        } else {
            ifMultipleAudioFileExists();
        }
    }

    private static void ifMultipleAudioFileExists() {
        if (DetailsListAdapter.mp != null && DetailsListAdapter.mp.isPlaying() && !Constants.SINGLE_PLAY) {
            if (Build.VERSION.SDK_INT >= 21) {
                QuranActivity.ivPlay.setImageDrawable(QuranActivity.mainActivity.getResources().getDrawable(R.mipmap.ic_play, QuranActivity.mainActivity.getTheme()));
            } else {
                QuranActivity.ivPlay.setImageDrawable(QuranActivity.mainActivity.getResources().getDrawable(R.mipmap.ic_play));
            }
            stopPlaying();
            Constants.INITIAL_SELECTION = Constants.SCROLL_TO;
            ViewPagerAdapter viewPagerAdapter2 = new ViewPagerAdapter(QuranActivity.mainActivity, quranSurasArrayList);
            viewPagerAdapter = viewPagerAdapter2;
            viewPager.setAdapter(viewPagerAdapter2);
            viewPagerAdapter.notifyDataSetChanged();
            viewPager.setCurrentItem(114 - Integer.parseInt(quranSuras.getSura_id()));
            Constants.isFirst = true;
            return;
        }
        Constants.SINGLE_PLAY = false;
        stopPlaying();
        Dialog dialog2 = dialog;
        if (dialog2 != null && dialog2.isShowing()) {
            dialog.dismiss();
        }
        playAudio();
    }

    
    public static void ifMultipleAudioNotExists() {
        final String str;
        final int currentItem = 114 - viewPager.getCurrentItem();
        if (String.valueOf(currentItem).length() == 1) {
            str = "00" + currentItem;
        } else if (String.valueOf(currentItem).length() == 2) {
            str = "0" + currentItem;
        } else {
            str = "" + currentItem;
        }
        File file = new File(Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(QuranActivity.mainActivity, Constants.KEY_RECEITER) + "/" + str + "/" + str + ".zip/");
        if (file.exists()) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(QuranActivity.mainActivity);
        builder.setTitle(QuranActivity.mainActivity.getResources().getString(R.string.sura) + " " + quranSuras.getSuraName()).setMessage(QuranActivity.mainActivity.getResources().getString(R.string.download_audio)).setPositiveButton(QuranActivity.mainActivity.getResources().getString(R.string.download), new DialogInterface.OnClickListener() { // from class: com.muslim.quran_hindi.-$$Lambda$ViewPagerFragment$HGjg2xRDDDp8hY2bAHBP20TF_V8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ViewPagerFragment.lambda$ifMultipleAudioNotExists$0(currentItem, str, dialogInterface, i);
            }
        }).setNegativeButton(QuranActivity.mainActivity.getResources().getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: com.muslim.quran_hindi.-$$Lambda$ViewPagerFragment$2niz1lrxSblqwTMAzk3DCzcxfn4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog alertDialog2 = alertDialog;
        if (alertDialog2 != null && alertDialog2.isShowing()) {
            alertDialog.dismiss();
        }
        AlertDialog create = builder.create();
        alertDialog = create;
        create.show();
    }

    
    public static /* synthetic */ void lambda$ifMultipleAudioNotExists$0(int i, String str, DialogInterface dialogInterface, int i2) {
        if (Utils.isNetworkAvailable(QuranActivity.mainActivity)) {
            new Utils.DownloadAudio(QuranActivity.mainActivity, Utils.getAudioLink(String.valueOf(i)), Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(QuranActivity.mainActivity, Constants.KEY_RECEITER) + "/" + str + "/" + str + ".zip", Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(QuranActivity.mainActivity, Constants.KEY_RECEITER) + "/" + str + "/").executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            return;
        }
        Toast.makeText(QuranActivity.mainActivity, "Please Check Your Internet Connection.", 1).show();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getActivity().setTheme(R.style.QuranAppTheme);
        toolshowhide = true;
        QuranActivity.ivPlay.setVisibility(0);
        QuranActivity.ivMore.setVisibility(0);
        QuranActivity.ivDrawerRight.setVisibility(8);
        QuranActivity.ivGoto.setVisibility(8);
        QuranActivity.mDrawerLayout.setDrawerLockMode(1);
        try {
            DatabaseAccessor.initDB(getActivity());
        } catch (Exception e) {
            e.printStackTrace();
        }
        QuranActivity.mDrawerLayoutRight.setDrawerLockMode(1);
        String string = getArguments().getString(Constants.KEY_SURA_ID);
        this.duaDBID = string;
        quranSuras = DatabaseAccessor.getSuraNameById(String.valueOf(115 - Integer.parseInt(string)));
        quranSurasArrayList = DatabaseAccessor.getAllSurasReverse();
        Utils.setMyBanglaText(QuranActivity.mTitle, quranSuras.getSuraName());
        currentPage = 114 - Integer.parseInt(this.duaDBID);
        View inflate = layoutInflater.inflate(R.layout.pager_layout, viewGroup, false);
        this.toastTitle = (TextView) inflate.findViewById(R.id.toast_title);
        viewPager = (ViewPager) inflate.findViewById(R.id.pager_layout);
        Constants.isFirst = true;
        ViewPagerAdapter viewPagerAdapter2 = new ViewPagerAdapter(getActivity(), quranSurasArrayList);
        viewPagerAdapter = viewPagerAdapter2;
        viewPager.setAdapter(viewPagerAdapter2);
        viewPagerAdapter.notifyDataSetChanged();
        if (Build.VERSION.SDK_INT >= 14) {
            viewPager.setOverScrollMode(2);
        }
        viewPager.setCurrentItem(113 - currentPage);
        FragmentActivity activity = getActivity();
        Utils.putString(activity, "savedviewpager", (viewPager.getCurrentItem() + 1) + "");
        Utils.putInt(getActivity(), "LASTLISTVIEW", 114 - (viewPager.getCurrentItem() + 1));
        Log.d("MyCows", (115 - (viewPager.getCurrentItem() + 1)) + "");
        extra(inflate);
        ListViewFragment.listView.setAdapter((ListAdapter) ListViewFragment.listViewAdapter);
        ListViewFragment.listView.setSelection(114 - (viewPager.getCurrentItem() + 2));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.6
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                ViewPagerFragment.this.handleScrollState(i);
                ViewPagerFragment.this.mScrollState = i;
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                if (DetailsListAdapter.mp != null && DetailsListAdapter.mp.isPlaying()) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        QuranActivity.ivPlay.setImageDrawable(QuranActivity.mainActivity.getResources().getDrawable(R.mipmap.ic_play, QuranActivity.mainActivity.getTheme()));
                    } else {
                        QuranActivity.ivPlay.setImageDrawable(QuranActivity.mainActivity.getResources().getDrawable(R.mipmap.ic_play));
                    }
                    ViewPagerFragment.stopPlaying();
                    ViewPagerFragment.viewPagerAdapter.notifyDataSetChanged();
                    Constants.isFirst = true;
                }
                ViewPagerFragment.this.mCurrentPosition = i;
                Utils.putInt(ViewPagerFragment.this.getActivity(), "LASTLISTVIEW", 114 - (ViewPagerFragment.this.mCurrentPosition + 1));
                ListViewFragment.listView.setAdapter((ListAdapter) ListViewFragment.listViewAdapter);
                ListViewFragment.listView.setSelection(114 - (ViewPagerFragment.this.mCurrentPosition + 2));
                Utils.putString(ViewPagerFragment.this.getActivity(), "savedviewpager", String.valueOf(ViewPagerFragment.this.mCurrentPosition + 1));
                ViewPagerFragment.quranSuras = DatabaseAccessor.getSuraNameById(String.valueOf(115 - (ViewPagerFragment.viewPager.getCurrentItem() + 1)));
                Utils.setMyBanglaText(QuranActivity.mTitle, ViewPagerFragment.quranSuras.getSuraName());
                ViewPagerFragment.this.recyclerViewHorizontal.getLayoutManager().scrollToPosition(ViewPagerFragment.this.mCurrentPosition);
            }
        });
        QuranActivity.ivPlay.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ViewPagerFragment.ivPlayClick(false);
            }
        });
        QuranActivity.ivMore.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ViewPagerFragment.dialog != null && ViewPagerFragment.dialog.isShowing()) {
                    ViewPagerFragment.dialog.dismiss();
                }
                ViewPagerFragment.this.dialogMore();
            }
        });
        fab(inflate);
        if (!Utils.getBoolean(getActivity(), "isTransNext")) {
            Utils.putBoolean(getActivity(), "isTransNext", true);
            setTranslationDialog();
        }
        return inflate;
    }

    
    public void dialogMore() {
        Dialog dialog2 = new Dialog(QuranActivity.mainActivity);
        dialog = dialog2;
        dialog2.requestWindowFeature(1);
        dialog.setContentView(R.layout.layout_popup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCancelable(true);
        double parseDouble = Double.parseDouble(Utils.getString(QuranActivity.mainActivity, "device_height"));
        Log.d("DREG", "" + parseDouble);
        double parseDouble2 = Double.parseDouble(Utils.getString(QuranActivity.mainActivity, "device_width_dp"));
        int i = 56;
        if (Build.VERSION.SDK_INT >= 21) {
            if (parseDouble2 >= 600.0d) {
                i = 64;
            }
        } else if (parseDouble >= 4.0d) {
            i = parseDouble2 >= 600.0d ? 86 : 78;
        }
        double d = i * getResources().getDisplayMetrics().density;
        Double.isNaN(d);
        Window window = dialog.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.0f;
        attributes.y = (int) (d + 0.5d);
        attributes.flags |= 2;
        window.setGravity(53);
        window.setAttributes(attributes);
        ((LinearLayout) dialog.findViewById(R.id.layoutSettings)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Constants.FROM_SURA_DETAILS = true;
                ViewPagerFragment.stopPlaying();
                if (Build.VERSION.SDK_INT >= 21) {
                    QuranActivity.ivPlay.setImageDrawable(ViewPagerFragment.this.getResources().getDrawable(R.mipmap.ic_play, ViewPagerFragment.this.getActivity().getTheme()));
                } else {
                    QuranActivity.ivPlay.setImageDrawable(ViewPagerFragment.this.getResources().getDrawable(R.mipmap.ic_play));
                }
                new Handler().postDelayed(new Runnable() { // from class: com.muslim.quran_hindi.ViewPagerFragment.9.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Constants.CURRENT_POS = ViewPagerFragment.viewPager.getCurrentItem();
                        Log.d("DREG", String.valueOf(Constants.CURRENT_POS));
                    }
                }, 100L);
                ViewPagerFragment.dialog.dismiss();
                ViewPagerFragment.this.startActivity(new Intent(ViewPagerFragment.this.getActivity(), SettingsActivity.class));
            }
        });
        ((LinearLayout) dialog.findViewById(R.id.layoutGotoAyah)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ViewPagerFragment.dialog.dismiss();
                if (QuranActivity.dialog != null && QuranActivity.dialog.isShowing()) {
                    QuranActivity.dialog.dismiss();
                } else {
                    QuranActivity.getInstance().gotoAyah();
                }
            }
        });
        dialog.show();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (Constants.IS_FROM_SETTINGS) {
            stopPlaying();
            Log.d("DREG", String.valueOf(Constants.CURRENT_POS));
            Constants.IS_FROM_SETTINGS = false;
            Constants.FROM_RESUME = true;
            quranSuras = DatabaseAccessor.getSuraNameById(String.valueOf(Constants.CURRENT_POS));
            quranSurasArrayList = DatabaseAccessor.getAllSurasReverse();
            ViewPagerAdapter viewPagerAdapter2 = new ViewPagerAdapter(getActivity(), quranSurasArrayList);
            viewPagerAdapter = viewPagerAdapter2;
            viewPager.setAdapter(viewPagerAdapter2);
            viewPagerAdapter.notifyDataSetChanged();
            viewPager.setCurrentItem(Constants.CURRENT_POS);
        }
    }

    
    public void handleScrollState(int i) {
        if (i == 0) {
            setNextItemIfNeeded();
        }
    }

    private void setNextItemIfNeeded() {
        if (isScrollStateSettling()) {
            return;
        }
        handleSetNextItem();
    }

    private boolean isScrollStateSettling() {
        return this.mScrollState == 2;
    }

    private void handleSetNextItem() {
        int count = viewPager.getAdapter().getCount() - 1;
        int i = this.mCurrentPosition;
        if (i == 0) {
            viewPager.setCurrentItem(count, false);
            viewPagerAdapter.notifyDataSetChanged();
        } else if (i == count) {
            viewPager.setCurrentItem(0, false);
            viewPagerAdapter.notifyDataSetChanged();
        }
    }

    private void fab(View view) {
        floatingActionMenu = (FloatingActionMenu) view.findViewById(R.id.floatingActionMenu);
        final FloatingActionButton floatingActionButton = (FloatingActionButton) view.findViewById(R.id.fabFullScreen);
        if (toolshowhide) {
            floatingActionButton.setImageResource(R.mipmap.ic_fullscreen);
            floatingActionButton.setLabelText(getActivity().getResources().getString(R.string.full_screen));
        } else {
            floatingActionButton.setImageResource(R.mipmap.ic_fullscreen_exit);
            floatingActionButton.setLabelText(getActivity().getResources().getString(R.string.normal_screen));
        }
        floatingActionButton.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (ViewPagerFragment.toolshowhide) {
                    QuranActivity.toolbar.setVisibility(8);
                    ViewPagerFragment.toolshowhide = false;
                    floatingActionButton.setImageResource(R.mipmap.ic_fullscreen_exit);
                    floatingActionButton.setLabelText(ViewPagerFragment.this.getActivity().getResources().getString(R.string.normal_screen));
                    return;
                }
                QuranActivity.toolbar.setVisibility(0);
                ViewPagerFragment.toolshowhide = true;
                floatingActionButton.setImageResource(R.mipmap.ic_fullscreen);
                floatingActionButton.setLabelText(ViewPagerFragment.this.getActivity().getResources().getString(R.string.full_screen));
            }
        });
        ((FloatingActionButton) view.findViewById(R.id.fabPronunciation)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                new Handler().postDelayed(new Runnable() { // from class: com.muslim.quran_hindi.ViewPagerFragment.12.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (Utils.getString(ViewPagerFragment.this.getActivity(), Constants.KEY_TRANSLITERATION_MOOD).equals(Constants.TRANSLITERATION_MOOD_ON)) {
                            Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_TRANSLITERATION_MOOD, Constants.TRANSLITERATION_MOOD_OFF);
                        } else {
                            Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_TRANSLITERATION_MOOD, Constants.TRANSLITERATION_MOOD_ON);
                        }
                        ViewPagerFragment.viewPagerAdapter.notifyDataSetChanged();
                    }
                }, 30L);
            }
        });
        ((FloatingActionButton) view.findViewById(R.id.fabTranslator)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ViewPagerFragment.floatingActionMenu.close(true);
                ViewPagerFragment.this.setTranslationDialog();
            }
        });
        ((FloatingActionButton) view.findViewById(R.id.fabArabicFont)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ViewPagerFragment.floatingActionMenu.close(true);
                ViewPagerFragment.this.setArabicFont();
            }
        });
        ((FloatingActionButton) view.findViewById(R.id.fabFontSize)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ViewPagerFragment.floatingActionMenu.close(true);
                ViewPagerFragment.this.setFontSize();
            }
        });
        ((FloatingActionButton) view.findViewById(R.id.fabReciter)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ViewPagerFragment.floatingActionMenu.close(true);
                ViewPagerFragment.this.selectReciter();
            }
        });
    }

    
    public void selectReciter() {
        new Handler().postDelayed(new Runnable() { // from class: com.muslim.quran_hindi.ViewPagerFragment.17
            @Override // java.lang.Runnable
            public void run() {
                Constants.CURRENT_POS = ViewPagerFragment.viewPager.getCurrentItem();
                Log.d("DREG", String.valueOf(Constants.CURRENT_POS));
            }
        }, 100L);
        final String string = Utils.getString(getActivity(), Constants.KEY_RECEITER);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(getResources().getString(R.string.select_reciter));
        builder.setSingleChoiceItems(new CharSequence[]{"Abdur-Rahman as-Sudais", "Saad Al-Ghamdi", "Mishari Rashid al-Afasy", "AbdulBaset AbdulSamad"}, Utils.getInt(getActivity(), Constants.KEY_RECEITER_SELECTED), new DialogInterface.OnClickListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.18
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(ViewPagerFragment.this.getActivity()).edit();
                edit.remove(Constants.KEY_RECEITER);
                edit.commit();
                Utils.putInt(ViewPagerFragment.this.getActivity(), Constants.KEY_RECEITER_SELECTED, i);
                if (i == 0) {
                    Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_RECEITER, Constants.RECEITER_SUDAIS);
                } else if (i == 1) {
                    Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_RECEITER, Constants.RECEITER_GHAMDI);
                } else if (i == 2) {
                    Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_RECEITER, Constants.RECEITER_AL_AFASY);
                } else if (i == 3) {
                    Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_RECEITER, Constants.RECEITER_ABDUL_BASET);
                }
                dialogInterface.dismiss();
                if (string.equals(Utils.getString(ViewPagerFragment.this.getActivity(), Constants.KEY_RECEITER))) {
                    return;
                }
                ViewPagerFragment.stopPlaying();
                if (Build.VERSION.SDK_INT >= 21) {
                    QuranActivity.ivPlay.setImageDrawable(ViewPagerFragment.this.getResources().getDrawable(R.mipmap.ic_play, ViewPagerFragment.this.getActivity().getTheme()));
                } else {
                    QuranActivity.ivPlay.setImageDrawable(ViewPagerFragment.this.getResources().getDrawable(R.mipmap.ic_play));
                }
                Constants.FROM_RESUME = true;
                Log.d("DREG", String.valueOf(Constants.CURRENT_POS));
                ViewPagerFragment.quranSuras = DatabaseAccessor.getSuraNameById(String.valueOf(Constants.CURRENT_POS));
                ViewPagerFragment.quranSurasArrayList = DatabaseAccessor.getAllSurasReverse();
                ViewPagerFragment.viewPagerAdapter = new ViewPagerAdapter(QuranActivity.mainActivity, ViewPagerFragment.quranSurasArrayList);
                ViewPagerFragment.viewPager.setAdapter(ViewPagerFragment.viewPagerAdapter);
                ViewPagerFragment.viewPagerAdapter.notifyDataSetChanged();
                ViewPagerFragment.viewPager.setCurrentItem(Constants.CURRENT_POS);
            }
        });
        builder.create().show();
    }

    
    public void setFontSize() {
        Dialog dialog2 = new Dialog(getActivity());
        dialog = dialog2;
        dialog2.requestWindowFeature(1);
        dialog.setContentView(R.layout.dialog_font_size);
        dialog.setCancelable(true);
        Window window = dialog.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.y = 120;
        attributes.dimAmount = 0.0f;
        attributes.flags |= 2;
        window.setGravity(81);
        window.setAttributes(attributes);
        setTextSize((SeekBar) dialog.findViewById(R.id.seekBar_ar), (SeekBar) dialog.findViewById(R.id.seekBar_bn));
        dialog.show();
    }

    private void setTextSize(SeekBar seekBar, SeekBar seekBar2) {
        if (Utils.getMyInt(getActivity(), Constants.KEY_ARABIC_FONT_PROGRESS) == -1) {
            if (Utils.getWidth(getActivity()) >= 720.0f) {
                seekBar.setProgress(26);
            } else if (Utils.getWidth(getActivity()) >= 600.0f) {
                seekBar.setProgress(24);
            } else if (Utils.getWidth(getActivity()) >= 400.0f) {
                seekBar.setProgress(22);
            } else {
                seekBar.setProgress(20);
            }
        } else {
            seekBar.setProgress(Utils.getMyInt(getActivity(), Constants.KEY_ARABIC_FONT_PROGRESS));
        }
        if (Utils.getMyInt(getActivity(), Constants.KEY_INDO_FONT_PROGRESS) == -1) {
            if (Utils.getWidth(getActivity()) >= 720.0f) {
                seekBar2.setProgress(10);
            } else if (Utils.getWidth(getActivity()) >= 600.0f) {
                seekBar2.setProgress(9);
            } else if (Utils.getWidth(getActivity()) >= 400.0f) {
                seekBar2.setProgress(8);
            } else {
                seekBar2.setProgress(7);
            }
        } else {
            seekBar2.setProgress(Utils.getMyInt(getActivity(), Constants.KEY_INDO_FONT_PROGRESS));
        }
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.19
            int progress = 0;

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar3, int i, boolean z) {
                this.progress = i + 10;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar3) {
                this.progress = seekBar3.getProgress() + 10;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar3) {
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(ViewPagerFragment.this.getActivity()).edit();
                edit.remove(Constants.KEY_ARABIC_FONT_PROGRESS).remove(Constants.KEY_ARABIC_FONT_SIZE);
                edit.commit();
                Utils.putInt(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_FONT_PROGRESS, seekBar3.getProgress());
                Utils.putInt(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_FONT_SIZE, this.progress);
                ViewPagerFragment.viewPagerAdapter.notifyDataSetChanged();
            }
        });
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.20
            int progress = 0;

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar3, int i, boolean z) {
                this.progress = i + 10;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar3) {
                this.progress = seekBar3.getProgress() + 10;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar3) {
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(ViewPagerFragment.this.getActivity()).edit();
                edit.remove(Constants.KEY_INDO_FONT_PROGRESS).remove(Constants.KEY_BANGLA_FONT_SIZE);
                edit.commit();
                Utils.putInt(ViewPagerFragment.this.getActivity(), Constants.KEY_INDO_FONT_PROGRESS, seekBar3.getProgress());
                Utils.putInt(ViewPagerFragment.this.getActivity(), Constants.KEY_BANGLA_FONT_SIZE, this.progress);
                ViewPagerFragment.viewPagerAdapter.notifyDataSetChanged();
            }
        });
    }

    
    public void setArabicFont() {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 18) {
            CharSequence[] charSequenceArr = {"Simple 1 (Expert)", "Simple 2 (Expert)", "Uthmanic 1 (Madinah)", "Uthmanic 2 (Madinah)", "IndoPak 1 (Asia)", "IndoPak 2 (Asia)"};
            if (Utils.getString(getActivity(), Constants.KEY_ARABIC_TEXT).equals(Constants.ARABIC_SIMPLE)) {
                if (Utils.getInt(getActivity(), Constants.KEY_ARABIC_FONT_SELECTED) != 1 && Utils.getInt(getActivity(), Constants.KEY_ARABIC_FONT_SELECTED) == 2) {
                    i = 1;
                }
            } else if (Utils.getString(getActivity(), Constants.KEY_ARABIC_TEXT).equals(Constants.ARABIC_UTHMANIC)) {
                if (Utils.getInt(getActivity(), Constants.KEY_ARABIC_FONT_SELECTED) != 1) {
                    Utils.getInt(getActivity(), Constants.KEY_ARABIC_FONT_SELECTED);
                    i = 3;
                }
                i = 2;
            } else {
                if (Utils.getString(getActivity(), Constants.KEY_ARABIC_TEXT).equals(Constants.ARABIC_INDOPAK)) {
                    if (Utils.getInt(getActivity(), Constants.KEY_ARABIC_FONT_SELECTED) == 4) {
                        i = 4;
                    } else {
                        Utils.getInt(getActivity(), Constants.KEY_ARABIC_FONT_SELECTED);
                        i = 5;
                    }
                }
                i = 2;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(getResources().getString(R.string.select_arabic_font));
            builder.setSingleChoiceItems(charSequenceArr, i, new DialogInterface.OnClickListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.21
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    if (i2 == 0) {
                        Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_FONT, Constants.FONT_UTHMANI_HAFS9);
                        Utils.putInt(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_FONT_SELECTED, 1);
                        Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_TEXT, Constants.ARABIC_SIMPLE);
                    } else if (i2 == 1) {
                        Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_FONT, Constants.FONT_QALAM_MAJEED);
                        Utils.putInt(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_FONT_SELECTED, 2);
                        Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_TEXT, Constants.ARABIC_SIMPLE);
                    } else if (i2 == 2) {
                        Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_FONT, Constants.FONT_UTHMANI_HAFS9);
                        Utils.putInt(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_FONT_SELECTED, 1);
                        Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_TEXT, Constants.ARABIC_UTHMANIC);
                    } else if (i2 == 3) {
                        Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_FONT, Constants.FONT_QALAM_MAJEED);
                        Utils.putInt(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_FONT_SELECTED, 2);
                        Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_TEXT, Constants.ARABIC_UTHMANIC);
                    } else if (i2 == 4) {
                        Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_FONT, Constants.FONT_NOOR_E_HIDAYAT);
                        Utils.putInt(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_FONT_SELECTED, 4);
                        Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_TEXT, Constants.ARABIC_INDOPAK);
                    } else if (i2 == 5) {
                        Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_FONT, Constants.FONT_NOOR_E_HUDA);
                        Utils.putInt(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_FONT_SELECTED, 5);
                        Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_TEXT, Constants.ARABIC_INDOPAK);
                    }
                    dialogInterface.dismiss();
                    ViewPagerFragment.viewPagerAdapter.notifyDataSetChanged();
                }
            });
            builder.create().show();
            return;
        }
        CharSequence[] charSequenceArr2 = Build.VERSION.SDK_INT >= 17 ? new CharSequence[]{"MeQuran Font", "Al-Mushaf Font"} : new CharSequence[]{"Al-Mushaf Font", "DroidNaskh Font"};
        AlertDialog.Builder builder2 = new AlertDialog.Builder(getActivity());
        builder2.setTitle(getResources().getString(R.string.select_arabic_font));
        builder2.setSingleChoiceItems(charSequenceArr2, Utils.getInt(getActivity(), Constants.KEY_ARABIC_FONT_SELECTED), new DialogInterface.OnClickListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.22
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                Utils.putInt(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_FONT_SELECTED, i2);
                if (Build.VERSION.SDK_INT >= 17) {
                    if (i2 == 0) {
                        Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_FONT, Constants.FONT_ME_QURAN);
                    } else if (i2 == 1) {
                        Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_FONT, Constants.FONT_AL_MUSHAF);
                    }
                } else if (Build.VERSION.SDK_INT >= 14) {
                    if (i2 == 0) {
                        Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_FONT, Constants.FONT_AL_MUSHAF);
                    } else if (i2 == 1) {
                        Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_ARABIC_FONT, Constants.FONT_DROID_NASKH);
                    }
                }
                dialogInterface.dismiss();
                ViewPagerFragment.viewPagerAdapter.notifyDataSetChanged();
            }
        });
        builder2.create().show();
    }

    
    public void setTranslationDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(getResources().getString(R.string.select_translation));
        CharSequence[] charSequenceArr = {getResources().getString(R.string.trans1), getResources().getString(R.string.trans2), "Saheeh International *"};
        final String string = Utils.getString(getActivity(), Constants.KEY_TRANSLATOR);
        builder.setSingleChoiceItems(charSequenceArr, Utils.getInt(getActivity(), Constants.KEY_BANGLA_TRANSLATOR_SELECTED), new DialogInterface.OnClickListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.23
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(ViewPagerFragment.this.getActivity()).edit();
                edit.remove(Constants.KEY_BANGLA_TRANSLATOR_SELECTED);
                edit.commit();
                Utils.putInt(ViewPagerFragment.this.getActivity(), Constants.KEY_BANGLA_TRANSLATOR_SELECTED, i);
                if (i == 0) {
                    Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_TRANSLATOR, Constants.TRANS_HINDI);
                } else if (i == 1) {
                    Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_TRANSLATOR, Constants.TRANS_FAROOQ);
                } else if (i == 2) {
                    Utils.putString(ViewPagerFragment.this.getActivity(), Constants.KEY_TRANSLATOR, Constants.TRANS_INTERNATIONAL);
                }
                if (!string.equals(Utils.getString(ViewPagerFragment.this.getActivity(), Constants.KEY_TRANSLATOR))) {
                    ViewPagerFragment.viewPagerAdapter.notifyDataSetChanged();
                }
                dialogInterface.dismiss();
            }
        });
        builder.create().show();
    }

    private void extra(View view) {
        this.recyclerViewHorizontal = (RecyclerViewPager) view.findViewById(R.id.recycler_view_horizontal);
        this.fastScrollerH = (FastScroller) view.findViewById(R.id.fastscrollH);
        this.mAdapterHorizontal = new SuraAdapter114(getActivity(), this.numListHorizontal);
        this.recyclerViewHorizontal.setLayoutManager(new LinearLayoutManager(QuranActivity.mainActivity, 0, false));
        this.recyclerViewHorizontal.setItemAnimator(new DefaultItemAnimator());
        this.recyclerViewHorizontal.setAdapter(this.mAdapterHorizontal);
        this.fastScrollerH.setRecyclerView(this.recyclerViewHorizontal);
        if (viewPager.getCurrentItem() == 0) {
            this.recyclerViewHorizontal.getLayoutManager().scrollToPosition(5);
        }
        new Handler().postDelayed(new Runnable() { // from class: com.muslim.quran_hindi.ViewPagerFragment.24
            @Override // java.lang.Runnable
            public void run() {
                ViewPagerFragment.this.recyclerViewHorizontal.getLayoutManager().scrollToPosition(ViewPagerFragment.viewPager.getCurrentItem());
            }
        }, 100L);
        this.recyclerViewHorizontal.setSinglePageFling(true);
        prepareimgDataHorizontal();
        this.recyclerViewHorizontal.addOnPageChangedListener(new RecyclerViewPager.OnPageChangedListener() { // from class: com.muslim.quran_hindi.ViewPagerFragment.25
            @Override // com.recyclerview.viewpager.RecyclerViewPager.OnPageChangedListener
            public void OnPageChanged(int i, final int i2) {
                if (ViewPagerFragment.this.myHandler != null && ViewPagerFragment.this.myRunnable != null) {
                    ViewPagerFragment.this.myHandler.removeCallbacks(ViewPagerFragment.this.myRunnable);
                }
                ViewPagerFragment.this.myHandler = new Handler();
                ViewPagerFragment.this.myRunnable = new Runnable() { // from class: com.muslim.quran_hindi.ViewPagerFragment.25.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ViewPagerFragment.viewPager.setCurrentItem(i2, true);
                        ViewPagerFragment.floatingActionMenu.close(true);
                    }
                };
                ViewPagerFragment.this.myHandler.postDelayed(ViewPagerFragment.this.myRunnable, 300L);
                TextView textView = ViewPagerFragment.this.toastTitle;
                StringBuilder sb = new StringBuilder();
                int i3 = 114 - i2;
                sb.append(Utils.getBanglaNumber(i3));
                sb.append(". ");
                sb.append(QuranActivity.mainActivity.getResources().getString(R.string.sura));
                sb.append(" ");
                sb.append(DatabaseAccessor.getSuraNameById(String.valueOf(i3)).getSuraName().trim());
                Utils.setMyBanglaText(textView, sb.toString());
                if (ViewPagerFragment.this.handlerTitle != null && ViewPagerFragment.this.runnableTitle != null) {
                    ViewPagerFragment.this.myHandler.removeCallbacks(ViewPagerFragment.this.runnableTitle);
                }
                ViewPagerFragment.this.toastTitle.setVisibility(0);
                ViewPagerFragment.this.runnableTitle = new Runnable() { // from class: com.muslim.quran_hindi.ViewPagerFragment.25.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ViewPagerFragment.this.handlerTitle = null;
                        ViewPagerFragment.this.runnableTitle = null;
                        ViewPagerFragment.this.toastTitle.setVisibility(8);
                    }
                };
                ViewPagerFragment.this.handlerTitle = new Handler();
                ViewPagerFragment.this.handlerTitle.postDelayed(ViewPagerFragment.this.runnableTitle, 3000L);
            }
        });
    }

    private void prepareimgDataHorizontal() {
        for (int i = 114; i >= 1; i--) {
            this.numListHorizontal.add(new Num114(String.valueOf(i)));
        }
        this.mAdapterHorizontal.notifyDataSetChanged();
    }

    
    class TheTask extends AsyncTask<String, String, String> {
        String page;

        
        @Override // android.os.AsyncTask
        public String doInBackground(String... strArr) {
            return null;
        }

        public TheTask(String str) {
            this.page = str;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            ViewPagerFragment.this.pDialog = new ProgressDialog(ViewPagerFragment.this.getActivity());
            ViewPagerFragment.this.pDialog.setMessage("Please wait...");
            ViewPagerFragment.this.pDialog.setCancelable(true);
            ViewPagerFragment.this.pDialog.show();
        }

        
        @Override // android.os.AsyncTask
        public void onPostExecute(String str) {
            super.onPostExecute((TheTask) str);
            if (ViewPagerFragment.this.pDialog.isShowing()) {
                ViewPagerFragment.this.pDialog.dismiss();
            }
        }
    }
}
