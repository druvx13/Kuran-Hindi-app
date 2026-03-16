package com.muslim.Bookmark.Sura;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
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
import com.muslim.Bookmark.Sura.model.SuraBookmarkQuranDetails;
import com.muslim.necessary.db.DatabaseAccessor;
import com.muslim.necessary.utils.Constants;
import com.muslim.necessary.utils.Grammer;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.R;
import com.muslim.quran_hindi.model.QuranDetails;
import com.muslim.quran_hindi.model.QuranSuras;
import java.io.File;
import java.util.ArrayList;

public class SuraBookmarkDetailsListAdapter extends BaseAdapter {
    private static AlertDialog alertDialog;
    private static String audioFile;
    private static String audioFolder;
    protected static Dialog dialog;
    public static MediaPlayer mp;
    private static String verse_id;
    private Context context;
    ViewHolder holder;
    private LayoutInflater mInflater;
    private ArrayList<SuraBookmarkQuranDetails> quranDetails;
    private String sura_id;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public SuraBookmarkDetailsListAdapter(Context context, String str, ArrayList<SuraBookmarkQuranDetails> arrayList) {
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        this.sura_id = str;
        this.quranDetails = arrayList;
        System.out.println(arrayList.size());
    }

    public static void CustomDialog(final Context context, View view, final String str, AdapterView<?> adapterView) {
        int abs;
        float abs2;
        Dialog dialog2 = new Dialog(context, R.style.PauseDialog);
        dialog = dialog2;
        dialog2.requestWindowFeature(1);
        dialog.setContentView(R.layout.dialogbox);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        Window window = dialog.getWindow();
        window.getAttributes().dimAmount = 0.0f;
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 51;
        dialog.setCanceledOnTouchOutside(true);
        Resources resources = context.getResources();
        Activity activity = (Activity) context;
        double parseDouble = Double.parseDouble(Utils.getString(activity, "device_height"));
        if (Utils.getWidth(context) >= 720.0f) {
            if (Build.VERSION.SDK_INT < 21 && parseDouble >= 4.0d) {
                abs = (int) Math.abs(TypedValue.applyDimension(1, 92.0f, resources.getDisplayMetrics()));
                abs2 = Math.abs(TypedValue.applyDimension(1, 142.0f, resources.getDisplayMetrics()));
            } else {
                abs = (int) Math.abs(TypedValue.applyDimension(1, 70.0f, resources.getDisplayMetrics()));
                abs2 = Math.abs(TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()));
            }
        } else if (Utils.getWidth(context) >= 600.0f) {
            if (Build.VERSION.SDK_INT < 21 && parseDouble >= 4.0d) {
                abs = (int) Math.abs(TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()));
                abs2 = Math.abs(TypedValue.applyDimension(1, 140.0f, resources.getDisplayMetrics()));
            } else {
                abs = (int) Math.abs(TypedValue.applyDimension(1, 68.0f, resources.getDisplayMetrics()));
                abs2 = Math.abs(TypedValue.applyDimension(1, 118.0f, resources.getDisplayMetrics()));
            }
        } else if (Build.VERSION.SDK_INT < 21 && parseDouble >= 4.0d) {
            abs = (int) Math.abs(TypedValue.applyDimension(1, 82.0f, resources.getDisplayMetrics()));
            abs2 = Math.abs(TypedValue.applyDimension(1, 132.0f, resources.getDisplayMetrics()));
        } else {
            abs = (int) Math.abs(TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()));
            abs2 = Math.abs(TypedValue.applyDimension(1, 110.0f, resources.getDisplayMetrics()));
        }
        int i = (int) abs2;
        String verse_id2 = DatabaseAccessor.getVersesIdById(str.split("_")[1]).getVerse_id();
        verse_id = verse_id2;
        if (verse_id2.equals("1")) {
            attributes.y = SuraBookmarkViewPagerAdapter.new_top + i;
            adapterView.setSelection(0);
        } else {
            attributes.y = SuraBookmarkViewPagerAdapter.new_top + abs;
        }
        final ImageView imageView = (ImageView) dialog.findViewById(R.id.bookmark);
        ImageView imageView2 = (ImageView) dialog.findViewById(R.id.play);
        ((ImageView) dialog.findViewById(R.id.copy)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Bookmark.Sura.SuraBookmarkDetailsListAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                QuranDetails versesByVersesId;
                new DatabaseAccessor();
                QuranSuras suraById = DatabaseAccessor.getSuraById(str.split("_")[0]);
                ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(context.getResources().getString(R.string.sura) + " " + suraById.getSuraName() + "(" + suraById.getSura_name_ar() + ")" + context.getResources().getString(R.string.tvVerse) + Utils.getBanglaNumber(versesByVersesId.getVerse_id()), context.getResources().getString(R.string.sura) + " " + suraById.getSuraName() + " (" + suraById.getSura_name_ar() + ")" + context.getResources().getString(R.string.verse) + Utils.getBanglaNumber(versesByVersesId.getVerse_id()) + "\n\n" + versesByVersesId.getModified_content() + "\n\n" + DatabaseAccessor.getVersesByVersesId(str.split("_")[1]).getContent()));
                Toast.makeText(context, "Copied", 0).show();
                SuraBookmarkDetailsListAdapter.dialog.dismiss();
            }
        });
        ((ImageView) dialog.findViewById(R.id.share)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Bookmark.Sura.SuraBookmarkDetailsListAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                QuranDetails versesByVersesId;
                new DatabaseAccessor();
                QuranSuras suraById = DatabaseAccessor.getSuraById(str.split("_")[0]);
                Utils.sendViaIntent((Activity) context, context.getResources().getString(R.string.sura) + " " + suraById.getSuraName() + "(" + suraById.getSura_name_ar() + ")" + context.getResources().getString(R.string.tvVerse) + versesByVersesId.getVerse_id(), context.getResources().getString(R.string.sura) + " " + suraById.getSuraName() + " (" + suraById.getSura_name_ar() + ")" + context.getResources().getString(R.string.verse) + versesByVersesId.getVerse_id() + "\n\n" + versesByVersesId.getModified_content() + "\n\n" + DatabaseAccessor.getVersesByVersesId(str.split("_")[1]).getContent());
                SuraBookmarkDetailsListAdapter.dialog.dismiss();
            }
        });
        if (Utils.getString(activity, "bookmark_remove" + str).equals("")) {
            imageView.setImageResource(R.drawable.ic_star_bookmark_remove);
        } else {
            imageView.setImageResource(R.drawable.ic_star_bookmark);
        }
        final String str2 = str.split("_")[0];
        final String str3 = str.split("_")[1];
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Bookmark.Sura.SuraBookmarkDetailsListAdapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (Utils.getString((Activity) context, "bookmark_remove" + str).equals("")) {
                    imageView.setImageResource(R.drawable.ic_star_bookmark);
                    Context context2 = context;
                    Utils.putString(context2, "bookmark_remove" + str, str);
                    Context context3 = context;
                    Utils.putString(context3, "bookmark_verse" + str3, str3);
                    Toast.makeText(context, "Bookmarked", 0).show();
                } else {
                    imageView.setImageResource(R.drawable.ic_star_bookmark_remove);
                    Context context4 = context;
                    Utils.putString(context4, "bookmark_remove" + str, "");
                    Context context5 = context;
                    Utils.putString(context5, "bookmark_verse" + str3, "");
                    Toast.makeText(context, "Bookmark Removed", 0).show();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(Utils.getString((Activity) context, "bookmark_verse" + str3));
                sb.append(" ");
                sb.append(Utils.getString((Activity) context, "bookmark_remove" + str));
                Log.d("COW", sb.toString());
                new Handler().postDelayed(new Runnable() { // from class: com.muslim.Bookmark.Sura.SuraBookmarkDetailsListAdapter.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SuraBookmarkDetailsListAdapter.dialog.dismiss();
                    }
                }, 50L);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Bookmark.Sura.-$$Lambda$SuraBookmarkDetailsListAdapter$RGNBr38xa03P4ywKFAlRSq4e_dM
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SuraBookmarkDetailsListAdapter.lambda$CustomDialog$0(str2, context, view2);
            }
        });
        dialog.show();
    }

    
    public static /* synthetic */ void lambda$CustomDialog$0(String str, Context context, View view) {
        dialog.dismiss();
        playAudio((Activity) context, DatabaseAccessor.getSuraById(str).getSuraName(), Utils.getAudioLink(str), str);
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
        File file = new File(Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(activity, Constants.KEY_RECEITER) + "/" + audioFolder + "/");
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!new File(Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(activity, Constants.KEY_RECEITER) + "/" + audioFolder + "/" + audioFolder + audioFile + ".mp3/").exists()) {
            File file2 = new File(Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(activity, Constants.KEY_RECEITER) + "/" + audioFolder + "/" + audioFolder + ".zip/");
            if (file2.exists()) {
                file2.delete();
            }
            if (file2.exists()) {
                return;
            }
            final String str4 = audioFolder;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            AlertDialog.Builder negativeButton = builder.setTitle(activity.getResources().getString(R.string.sura) + " " + str).setMessage(activity.getResources().getString(R.string.download_audio)).setPositiveButton(activity.getResources().getString(R.string.download), new DialogInterface.OnClickListener() { // from class: com.muslim.Bookmark.Sura.SuraBookmarkDetailsListAdapter.5
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (Utils.isNetworkAvailable(activity)) {
                        Constants.SINGLE_PLAY = true;
                        Constants.IS_FROM = 1;
                        new Utils.DownloadAudio(activity, str2, Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(activity, Constants.KEY_RECEITER) + "/" + str4 + "/" + str4 + ".zip", Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(activity, Constants.KEY_RECEITER) + "/" + str4 + "/").executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                        return;
                    }
                    Toast.makeText(activity, "Please Check Your Internet Connection.", 1).show();
                }
            }).setNegativeButton(activity.getResources().getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: com.muslim.Bookmark.Sura.SuraBookmarkDetailsListAdapter.4
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            AlertDialog alertDialog2 = alertDialog;
            if (alertDialog2 != null && alertDialog2.isShowing()) {
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
        stopPlaying();
        Constants.SINGLE_PLAY = true;
        MediaPlayer create = MediaPlayer.create(activity, Uri.parse(Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(activity, Constants.KEY_RECEITER) + "/" + audioFolder + "/" + audioFolder + audioFile + ".mp3/"));
        mp = create;
        create.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.muslim.Bookmark.Sura.SuraBookmarkDetailsListAdapter.6
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                Constants.SINGLE_PLAY = false;
            }
        });
    }

    private static void stopPlaying() {
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
        if (view == null) {
            view = this.mInflater.inflate(R.layout.listview_details, viewGroup, false);
            ViewHolder viewHolder = new ViewHolder();
            this.holder = viewHolder;
            viewHolder.relBismillah = (RelativeLayout) view.findViewById(R.id.relBismillah);
            this.holder.ivBismillah = (ImageView) view.findViewById(R.id.ivBismillah);
            this.holder.tvBismillahBelow = view.findViewById(R.id.tvBismillahBelow);
            this.holder.linLout = (LinearLayout) view.findViewById(R.id.linLout);
            this.holder.tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            this.holder.tvTransliteration = (TextView) view.findViewById(R.id.tvTransliteration);
            this.holder.tvSource = (TextView) view.findViewById(R.id.tvSource);
            view.setTag(this.holder);
        } else {
            this.holder = (ViewHolder) view.getTag();
        }
        if (Utils.getString((Activity) this.context, "normal").equals("")) {
            this.holder.relBismillah.setBackgroundColor(Color.parseColor("#fff7f3"));
            this.holder.rel.setBackgroundResource(R.color.red_light);
            if (i % 2 == 0) {
                this.holder.linLout.setBackgroundResource(R.drawable.list_bg2);
            } else {
                this.holder.linLout.setBackgroundResource(R.drawable.list_bg1);
            }
        } else {
            this.holder.relBismillah.setBackgroundColor(Color.parseColor("#f5f5f5"));
            this.holder.rel.setBackgroundResource(R.color.whitePressed);
            if (i % 2 == 0) {
                this.holder.linLout.setBackgroundResource(R.drawable.normal_bg);
            } else {
                this.holder.linLout.setBackgroundResource(R.drawable.normal_bg1);
            }
        }
        if (i == 0 && !this.sura_id.equals("1")) {
            this.holder.relBismillah.setVisibility(0);
            this.holder.ivBismillah.setBackgroundResource(R.drawable.bismillah);
            this.holder.ivBismillah.setVisibility(0);
            this.holder.tvBismillahBelow.setVisibility(0);
        } else if (i == 0 && this.sura_id.equals("1")) {
            this.holder.relBismillah.setVisibility(0);
            this.holder.ivBismillah.setVisibility(0);
            this.holder.tvBismillahBelow.setVisibility(0);
            this.holder.ivBismillah.setBackgroundResource(R.drawable.auzubillah);
        } else {
            this.holder.relBismillah.setVisibility(8);
            this.holder.ivBismillah.setVisibility(8);
            this.holder.tvBismillahBelow.setVisibility(8);
        }
        String content = this.quranDetails.get(i).getContent();
        Utils.setTransliterationText((Activity) this.context, this.holder.tvTransliteration, this.quranDetails.get(i).getTrans().trim());
        Utils.setBanglaText((Activity) this.context, this.holder.tvSource, content.trim());
        String trim = this.quranDetails.get(i).getModified_content().trim();
        if (Utils.getString((Activity) this.context, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_UTHMANI_HAFS9)) {
            trim = Utils.replaceUthmaniArabic(trim);
        }
        if (!Utils.getString((Activity) this.context, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIDAYAT) && !Utils.getString((Activity) this.context, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HUDA) && !Utils.getString((Activity) this.context, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIRA) && (this.sura_id.equals("112") || this.sura_id.equals("113") || this.sura_id.equals("114"))) {
            Utils.setArabicText((Activity) this.context, this.holder.tvTitle, Grammer.arabic(this.context, trim).trim(), true);
        } else {
            Utils.setArabicText((Activity) this.context, this.holder.tvTitle, trim, false);
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
        ImageView menuOverflow;
        RelativeLayout rel;
        RelativeLayout relBismillah;
        View tvBismillahBelow;
        TextView tvSource;
        TextView tvTitle;
        TextView tvTransliteration;

        ViewHolder() {
        }
    }
}
