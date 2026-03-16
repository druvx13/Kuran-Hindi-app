package com.muslim.quran_hindi;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.muslim.necessary.db.DatabaseAccessor;
import com.muslim.necessary.utils.Constants;
import com.muslim.necessary.utils.Grammer;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.model.QuranDetails;
import com.muslim.quran_hindi.model.QuranSuras;
import java.io.File;
import java.util.ArrayList;

public class DetailsListAdapter extends BaseAdapter {
    private static Dialog alertDialog;
    private static String audioFile;
    private static String audioFolder;
    private static Context context;
    protected static Dialog dialog;
    public static MediaPlayer mp;
    private static String verse_id;
    ViewHolder holder;
    private LayoutInflater mInflater;
    private ArrayList<QuranDetails> quranDetails;
    private int size;
    private String sura_id;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public DetailsListAdapter(Context context2, ArrayList<QuranDetails> arrayList, String str) {
        context = context2;
        this.mInflater = LayoutInflater.from(context2);
        this.quranDetails = arrayList;
        this.sura_id = str;
        Log.d("DREG", "DDDDD");
    }

    public static void CustomDialog(final Context context2, final String str, AdapterView<?> adapterView) {
        int abs;
        float abs2;
        Dialog dialog2 = new Dialog(context2, R.style.PauseDialog);
        dialog = dialog2;
        dialog2.requestWindowFeature(1);
        dialog.setContentView(R.layout.dialogbox);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        Window window = dialog.getWindow();
        window.getAttributes().dimAmount = 0.0f;
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 51;
        dialog.setCanceledOnTouchOutside(true);
        Resources resources = context2.getResources();
        Activity activity = (Activity) context2;
        double parseDouble = Double.parseDouble(Utils.getString(activity, "device_height"));
        int i = ViewPagerFragment.toolshowhide ? 60 : 4;
        if (Utils.getWidth(context2) >= 720.0f) {
            if (Build.VERSION.SDK_INT < 21 && parseDouble >= 4.0d) {
                abs = (int) Math.abs(TypedValue.applyDimension(1, i + 22 + 10, resources.getDisplayMetrics()));
                abs2 = Math.abs(TypedValue.applyDimension(1, i + 50 + 22 + 10, resources.getDisplayMetrics()));
            } else {
                abs = (int) Math.abs(TypedValue.applyDimension(1, i + 10, resources.getDisplayMetrics()));
                abs2 = Math.abs(TypedValue.applyDimension(1, i + 50 + 10, resources.getDisplayMetrics()));
            }
        } else if (Utils.getWidth(context2) >= 600.0f) {
            if (Build.VERSION.SDK_INT < 21 && parseDouble >= 4.0d) {
                abs = (int) Math.abs(TypedValue.applyDimension(1, i + 22 + 8, resources.getDisplayMetrics()));
                abs2 = Math.abs(TypedValue.applyDimension(1, i + 50 + 22 + 8, resources.getDisplayMetrics()));
            } else {
                abs = (int) Math.abs(TypedValue.applyDimension(1, i + 8, resources.getDisplayMetrics()));
                abs2 = Math.abs(TypedValue.applyDimension(1, i + 50 + 8, resources.getDisplayMetrics()));
            }
        } else if (Build.VERSION.SDK_INT < 21 && parseDouble >= 4.0d) {
            abs = (int) Math.abs(TypedValue.applyDimension(1, i + 22, resources.getDisplayMetrics()));
            abs2 = Math.abs(TypedValue.applyDimension(1, i + 50 + 22, resources.getDisplayMetrics()));
        } else {
            abs = (int) Math.abs(TypedValue.applyDimension(1, i, resources.getDisplayMetrics()));
            abs2 = Math.abs(TypedValue.applyDimension(1, i + 50, resources.getDisplayMetrics()));
        }
        int i2 = (int) abs2;
        verse_id = DatabaseAccessor.getVersesIdById(str.split("_")[1]).getVerse_id();
        String str2 = str.split("_")[0];
        if (verse_id.equals("1") && !str2.equals("9")) {
            attributes.y = ViewPagerAdapter.new_top + i2;
            adapterView.setSelection(0);
        } else {
            attributes.y = ViewPagerAdapter.new_top + abs;
        }
        RelativeLayout relativeLayout = (RelativeLayout) dialog.findViewById(R.id.relBookmark);
        final ImageView imageView = (ImageView) dialog.findViewById(R.id.bookmark);
        RelativeLayout relativeLayout2 = (RelativeLayout) dialog.findViewById(R.id.relPlay);
        ((RelativeLayout) dialog.findViewById(R.id.relShare)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.DetailsListAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                QuranDetails versesByVersesId = DatabaseAccessor.getVersesByVersesId(str.split("_")[1]);
                new DatabaseAccessor();
                QuranSuras suraById = DatabaseAccessor.getSuraById(str.split("_")[0]);
                String str3 = context2.getResources().getString(R.string.sura) + " " + suraById.getSuraName() + " (" + suraById.getSura_name_ar() + ")" + context2.getResources().getString(R.string.verse) + " " + Utils.getBanglaNumber(versesByVersesId.getVerse_id()) + "\n\n" + versesByVersesId.getModified_content() + "\n\n" + DatabaseAccessor.getVersesByVersesId(str.split("_")[1]).getContent();
                Utils.sendViaIntent((Activity) context2, context2.getResources().getString(R.string.sura) + " " + suraById.getSuraName() + "(" + suraById.getSura_name_ar() + ")" + context2.getResources().getString(R.string.tvVerse) + " " + Utils.getBanglaNumber(versesByVersesId.getVerse_id()), str3 + ("\n\nPlaystore Link: \nhttps://play.google.com/store/apps/details?id=" + context2.getPackageName()));
                DetailsListAdapter.dialog.dismiss();
            }
        });
        ((RelativeLayout) dialog.findViewById(R.id.relCopy)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.DetailsListAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                QuranDetails versesByVersesId = DatabaseAccessor.getVersesByVersesId(str.split("_")[1]);
                new DatabaseAccessor();
                QuranSuras suraById = DatabaseAccessor.getSuraById(str.split("_")[0]);
                String str3 = context2.getResources().getString(R.string.sura) + " " + suraById.getSuraName() + " (" + suraById.getSura_name_ar() + ")" + context2.getResources().getString(R.string.verse) + " " + Utils.getBanglaNumber(versesByVersesId.getVerse_id()) + "\n\n" + versesByVersesId.getModified_content() + "\n\n" + DatabaseAccessor.getVersesByVersesId(str.split("_")[1]).getContent();
                ((ClipboardManager) context2.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(context2.getResources().getString(R.string.sura) + " " + suraById.getSuraName() + "(" + suraById.getSura_name_ar() + ")" + context2.getResources().getString(R.string.tvVerse) + " " + Utils.getBanglaNumber(versesByVersesId.getVerse_id()), str3 + ("\n\nPlaystore Link: \nhttps://play.google.com/store/apps/details?id=" + context2.getPackageName())));
                Toast.makeText(context2, "Copied", 0).show();
                DetailsListAdapter.dialog.dismiss();
            }
        });
        if (Utils.getString(activity, "bookmark_remove" + str).equals("")) {
            imageView.setImageResource(R.drawable.ic_star_bookmark_remove);
        } else {
            imageView.setImageResource(R.drawable.ic_star_bookmark);
        }
        final String str3 = str.split("_")[0];
        final String str4 = str.split("_")[1];
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.DetailsListAdapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Utils.getString((Activity) context2, "bookmark_remove" + str).equals("")) {
                    imageView.setImageResource(R.drawable.ic_star_bookmark);
                    Context context3 = context2;
                    Utils.putString(context3, "bookmark_remove" + str, str);
                    Context context4 = context2;
                    Utils.putString(context4, "bookmark_verse" + str4, str4);
                    Toast.makeText(context2, "Bookmarked", 0).show();
                } else {
                    imageView.setImageResource(R.drawable.ic_star_bookmark_remove);
                    Context context5 = context2;
                    Utils.putString(context5, "bookmark_remove" + str, "");
                    Context context6 = context2;
                    Utils.putString(context6, "bookmark_verse" + str4, "");
                    Toast.makeText(context2, "Bookmark Removed", 0).show();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(Utils.getString((Activity) context2, "bookmark_verse" + str4));
                sb.append(" ");
                sb.append(Utils.getString((Activity) context2, "bookmark_remove" + str));
                Log.d("COW", sb.toString());
                new Handler().postDelayed(new Runnable() { // from class: com.muslim.quran_hindi.DetailsListAdapter.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        DetailsListAdapter.dialog.dismiss();
                    }
                }, 10L);
            }
        });
        relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.-$$Lambda$DetailsListAdapter$XO0UIuwQU2syIfqPTRWRrD8k7OM
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailsListAdapter.lambda$CustomDialog$0(str3, context2, view);
            }
        });
        dialog.show();
    }

    
    public static /* synthetic */ void lambda$CustomDialog$0(String str, Context context2, View view) {
        dialog.dismiss();
        playAudio((Activity) context2, DatabaseAccessor.getSuraById(str).getSuraName(), Utils.getAudioLink(str), str);
    }

    private static void playAudio(final Activity activity, String str, final String str2, String str3) {
        audioFolder = "";
        if (String.valueOf(str3).length() == 1) {
            audioFolder = "00" + str3;
        } else if (String.valueOf(str3).length() == 2) {
            audioFolder = "0" + str3;
        } else {
            audioFolder = "" + str3;
        }
        if (String.valueOf(verse_id).length() == 1) {
            audioFile = "00" + verse_id;
        } else if (String.valueOf(verse_id).length() == 2) {
            audioFile = "0" + verse_id;
        } else {
            audioFile = "" + verse_id;
        }
        Log.d("DREG", "Audio: " + audioFolder + ":" + audioFile);
        File file = new File(Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(QuranActivity.mainActivity, Constants.KEY_RECEITER) + "/" + audioFolder + "/");
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!new File(Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(QuranActivity.mainActivity, Constants.KEY_RECEITER) + "/" + audioFolder + "/" + audioFolder + audioFile + ".mp3/").exists()) {
            File file2 = new File(Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(QuranActivity.mainActivity, Constants.KEY_RECEITER) + "/" + audioFolder + "/" + audioFolder + ".zip/");
            if (file2.exists()) {
                file2.delete();
            }
            if (file2.exists()) {
                return;
            }
            final String str4 = audioFolder;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            AlertDialog.Builder negativeButton = builder.setTitle(context.getResources().getString(R.string.sura) + " " + str).setMessage(context.getResources().getString(R.string.download_audio)).setPositiveButton(context.getResources().getString(R.string.download), new DialogInterface.OnClickListener() { // from class: com.muslim.quran_hindi.DetailsListAdapter.5
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (Utils.isNetworkAvailable(activity)) {
                        Constants.SINGLE_PLAY = true;
                        Constants.IS_FROM = 0;
                        new Utils.DownloadAudio(activity, str2, Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(QuranActivity.mainActivity, Constants.KEY_RECEITER) + "/" + str4 + "/" + str4 + ".zip", Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(QuranActivity.mainActivity, Constants.KEY_RECEITER) + "/" + str4 + "/").executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                        return;
                    }
                    Toast.makeText(QuranActivity.mainActivity, "Please Check Your Internet Connection.", 1).show();
                }
            }).setNegativeButton(context.getResources().getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: com.muslim.quran_hindi.DetailsListAdapter.4
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            Dialog dialog2 = alertDialog;
            if (dialog2 != null && dialog2.isShowing()) {
                alertDialog.dismiss();
            }
            AlertDialog create = negativeButton.create();
            alertDialog = create;
            create.show();
            return;
        }
        singlePlay(activity);
    }

    public static void singlePlay(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            QuranActivity.ivPlay.setImageDrawable(activity.getResources().getDrawable(R.mipmap.ic_play, QuranActivity.mainActivity.getTheme()));
        } else {
            QuranActivity.ivPlay.setImageDrawable(activity.getResources().getDrawable(R.mipmap.ic_play));
        }
        MediaPlayer mediaPlayer = mp;
        if (mediaPlayer != null && mediaPlayer.isPlaying() && !Constants.SINGLE_PLAY) {
            Constants.INITIAL_SELECTION = Integer.parseInt(verse_id) - 1;
            Constants.FROM_RESUME = true;
            ViewPagerFragment.viewPagerAdapter = new ViewPagerAdapter(QuranActivity.mainActivity, ViewPagerFragment.quranSurasArrayList);
            ViewPagerFragment.viewPager.setAdapter(ViewPagerFragment.viewPagerAdapter);
            ViewPagerFragment.viewPagerAdapter.notifyDataSetChanged();
            ViewPagerFragment.viewPager.setCurrentItem(114 - Integer.parseInt(ViewPagerFragment.quranSuras.getSura_id()));
            Constants.isFirst = true;
        }
        stopPlaying();
        Constants.SINGLE_PLAY = true;
        MediaPlayer create = MediaPlayer.create(activity, Uri.parse(Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(QuranActivity.mainActivity, Constants.KEY_RECEITER) + "/" + audioFolder + "/" + audioFolder + audioFile + ".mp3/"));
        mp = create;
        create.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.muslim.quran_hindi.DetailsListAdapter.6
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer2) {
                Constants.SINGLE_PLAY = false;
            }
        });
    }

    private static void stopPlaying() {
        Constants.IS_BISMILLAH = false;
        try {
            if (mp != null) {
                mp.stop();
                mp.release();
                mp = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        if (view == null) {
            view = this.mInflater.inflate(R.layout.listview_details, viewGroup, false);
            ViewHolder viewHolder = new ViewHolder();
            this.holder = viewHolder;
            viewHolder.relBismillah = (RelativeLayout) view.findViewById(R.id.relBismillah);
            this.holder.relativeLayout = (RelativeLayout) view.findViewById(R.id.listLinear);
            this.holder.linLout = (LinearLayout) view.findViewById(R.id.linLout);
            this.holder.ivBismillah = (ImageView) view.findViewById(R.id.ivBismillah);
            this.holder.tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            this.holder.tvTransliteration = (TextView) view.findViewById(R.id.tvTransliteration);
            this.holder.tvSource = (TextView) view.findViewById(R.id.tvSource);
            this.holder.viewLast = view.findViewById(R.id.viewLast);
            view.setTag(this.holder);
        } else {
            this.holder = (ViewHolder) view.getTag();
        }
        if (i == 0 && !this.sura_id.equals("114")) {
            if (this.sura_id.equals("106")) {
                this.holder.relBismillah.setVisibility(8);
                this.holder.ivBismillah.setVisibility(8);
            } else {
                this.holder.relBismillah.setVisibility(0);
                this.holder.ivBismillah.setBackgroundResource(R.drawable.bismillah);
                this.holder.ivBismillah.setVisibility(0);
            }
        } else if (i == 0 && this.sura_id.equals("114")) {
            this.holder.relBismillah.setVisibility(0);
            this.holder.ivBismillah.setVisibility(0);
            this.holder.ivBismillah.setBackgroundResource(R.drawable.auzubillah);
        } else {
            this.holder.relBismillah.setVisibility(8);
            this.holder.ivBismillah.setVisibility(8);
        }
        if (i == this.quranDetails.size() - 1) {
            this.holder.viewLast.setVisibility(0);
        } else {
            this.holder.viewLast.setVisibility(8);
        }
        if (Utils.getString((Activity) context, "normal").equals("")) {
            this.holder.relBismillah.setBackgroundColor(context.getResources().getColor(R.color.relBismillah_attract));
            if (!Constants.isFirst) {
                if (i == Constants.SCROLL_TO) {
                    if (Constants.IS_BISMILLAH) {
                        this.holder.relBismillah.setBackgroundResource(R.color.listColorSelect);
                        this.holder.linLout.setBackgroundResource(R.drawable.list_bg2);
                    } else {
                        this.holder.linLout.setBackgroundResource(R.color.listColorSelect);
                    }
                } else if (i % 2 == 0) {
                    this.holder.linLout.setBackgroundResource(R.drawable.list_bg2);
                } else {
                    this.holder.linLout.setBackgroundResource(R.drawable.list_bg1);
                }
            } else if (i % 2 == 0) {
                this.holder.linLout.setBackgroundResource(R.drawable.list_bg2);
            } else {
                this.holder.linLout.setBackgroundResource(R.drawable.list_bg1);
            }
        } else {
            this.holder.relBismillah.setBackgroundColor(context.getResources().getColor(R.color.relBismillah_normal));
            if (!Constants.isFirst) {
                if (i == Constants.SCROLL_TO) {
                    if (Constants.IS_BISMILLAH) {
                        this.holder.relBismillah.setBackgroundResource(R.color.listColorSelect);
                        this.holder.linLout.setBackgroundResource(R.drawable.normal_bg);
                    } else {
                        this.holder.linLout.setBackgroundResource(R.color.listColorSelect);
                    }
                } else if (i % 2 == 0) {
                    this.holder.linLout.setBackgroundResource(R.drawable.normal_bg);
                } else {
                    this.holder.linLout.setBackgroundResource(R.drawable.normal_bg1);
                }
            } else if (i % 2 == 0) {
                this.holder.linLout.setBackgroundResource(R.drawable.normal_bg);
            } else {
                this.holder.linLout.setBackgroundResource(R.drawable.normal_bg1);
            }
        }
        int i2 = i + 1;
        Log.d("DREG", "posBN");
        if (Utils.getString((Activity) context, Constants.KEY_TRANSLATOR).equals(Constants.TRANS_INTERNATIONAL)) {
            str = i2 + ". " + this.quranDetails.get(i).getContent();
        } else {
            str = Utils.getBanglaNumber(i2) + ". " + this.quranDetails.get(i).getContent();
        }
        Utils.setTransliterationText((Activity) context, this.holder.tvTransliteration, i2 + ". " + this.quranDetails.get(i).getTrans().trim());
        Utils.setBanglaText((Activity) context, this.holder.tvSource, str.trim());
        String trim = this.quranDetails.get(i).getModified_content().trim();
        if (Utils.getString((Activity) context, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_UTHMANI_HAFS9)) {
            trim = Utils.replaceUthmaniArabic(trim);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            Utils.setArabicText((Activity) context, this.holder.tvTitle, trim, i2);
        } else if (!Utils.getString((Activity) context, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIDAYAT) && !Utils.getString((Activity) context, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HUDA) && (this.sura_id.equals("1") || this.sura_id.equals("2") || this.sura_id.equals("3"))) {
            Utils.setArabicText((Activity) context, this.holder.tvTitle, Grammer.arabic(context, trim).trim(), true);
        } else {
            Utils.setArabicText((Activity) context, this.holder.tvTitle, trim, false);
        }
        return view;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.quranDetails.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.quranDetails.get(i);
    }

    
    class ViewHolder {
        ImageView ivBismillah;
        LinearLayout linLout;
        RelativeLayout relBismillah;
        RelativeLayout relativeLayout;
        TextView tvSource;
        TextView tvTitle;
        public TextView tvTransliteration;
        View viewLast;

        ViewHolder() {
        }
    }
}
