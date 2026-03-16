package com.muslim.Search;

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
import android.text.Html;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SectionIndexer;
import android.widget.TextView;
import android.widget.Toast;
import com.muslim.Search.model.SearchQuranDetails;
import com.muslim.necessary.db.DatabaseAccessor;
import com.muslim.necessary.utils.ArabicFarsiUrduGlyphUtils;
import com.muslim.necessary.utils.Constants;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.R;
import com.muslim.quran_hindi.model.QuranDetails;
import com.muslim.quran_hindi.model.QuranSuras;
import java.io.File;
import java.util.ArrayList;

public class SearchDetailsListAdapter extends BaseAdapter implements SectionIndexer {
    private static Dialog alertDialog;
    private static String audioFile;
    private static String audioFolder;
    protected static Dialog dialog;
    public static MediaPlayer mp;
    private static String verse_id;
    private Context context;
    ViewHolder holder;
    private LayoutInflater mInflater;
    private ArrayList<String> mSelections;
    private String newText;
    private ArrayList<SearchQuranDetails> quranDetails;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public SearchDetailsListAdapter(Context context, ArrayList<SearchQuranDetails> arrayList, ArrayList<String> arrayList2, String str) {
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        this.quranDetails = arrayList;
        this.mSelections = arrayList2;
        this.newText = str;
        System.out.println(arrayList.size());
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
            AlertDialog.Builder negativeButton = builder.setTitle(activity.getResources().getString(R.string.sura) + " " + str).setMessage(activity.getResources().getString(R.string.download_audio)).setPositiveButton(activity.getResources().getString(R.string.download), new DialogInterface.OnClickListener() { // from class: com.muslim.Search.SearchDetailsListAdapter.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (Utils.isNetworkAvailable(activity)) {
                        Constants.SINGLE_PLAY = true;
                        Constants.IS_FROM = 0;
                        new Utils.DownloadAudio(activity, str2, Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(activity, Constants.KEY_RECEITER) + "/" + str4 + "/" + str4 + ".zip", Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(activity, Constants.KEY_RECEITER) + "/" + str4 + "/").executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                        return;
                    }
                    Toast.makeText(activity, "Please Check Your Internet Connection.", 1).show();
                }
            }).setNegativeButton(activity.getResources().getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: com.muslim.Search.SearchDetailsListAdapter.1
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
        MediaPlayer mediaPlayer = mp;
        if (mediaPlayer != null && mediaPlayer.isPlaying() && !Constants.SINGLE_PLAY) {
            Constants.INITIAL_SELECTION = Integer.parseInt(verse_id) - 1;
            Constants.FROM_RESUME = true;
            Constants.isFirst = true;
        }
        stopPlaying();
        Constants.SINGLE_PLAY = true;
        MediaPlayer create = MediaPlayer.create(activity, Uri.parse(Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Audio/" + Utils.getString(activity, Constants.KEY_RECEITER) + "/" + audioFolder + "/" + audioFolder + audioFile + ".mp3/"));
        mp = create;
        create.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.muslim.Search.SearchDetailsListAdapter.3
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

    private void CustomDialog(final Context context, final String str) {
        float abs;
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
                abs = Math.abs(TypedValue.applyDimension(1, 92, resources.getDisplayMetrics()));
            } else {
                abs = Math.abs(TypedValue.applyDimension(1, 70, resources.getDisplayMetrics()));
            }
        } else if (Utils.getWidth(context) >= 600.0f) {
            if (Build.VERSION.SDK_INT < 21 && parseDouble >= 4.0d) {
                abs = Math.abs(TypedValue.applyDimension(1, 90, resources.getDisplayMetrics()));
            } else {
                abs = Math.abs(TypedValue.applyDimension(1, 68, resources.getDisplayMetrics()));
            }
        } else if (Build.VERSION.SDK_INT < 21 && parseDouble >= 4.0d) {
            abs = Math.abs(TypedValue.applyDimension(1, 82, resources.getDisplayMetrics()));
        } else {
            abs = Math.abs(TypedValue.applyDimension(1, 60, resources.getDisplayMetrics()));
        }
        int i = (int) abs;
        verse_id = str.split("_")[1];
        attributes.y = SearchQuranActivity.new_top + i;
        RelativeLayout relativeLayout = (RelativeLayout) dialog.findViewById(R.id.relBookmark);
        final ImageView imageView = (ImageView) dialog.findViewById(R.id.bookmark);
        RelativeLayout relativeLayout2 = (RelativeLayout) dialog.findViewById(R.id.relPlay);
        ((RelativeLayout) dialog.findViewById(R.id.relShare)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Search.SearchDetailsListAdapter.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                QuranDetails versesByVersesId;
                new DatabaseAccessor();
                QuranSuras suraById = DatabaseAccessor.getSuraById(str.split("_")[0]);
                String str2 = context.getResources().getString(R.string.sura) + " " + suraById.getSuraName() + " (" + suraById.getSura_name_ar() + ")" + context.getResources().getString(R.string.verse) + " " + Utils.getBanglaNumber(versesByVersesId.getVerse_id()) + "\n\n" + versesByVersesId.getModified_content() + "\n\n" + DatabaseAccessor.getVersesByVersesId(str.split("_")[1]).getContent();
                Utils.sendViaIntent((Activity) context, context.getResources().getString(R.string.sura) + " " + suraById.getSuraName() + "(" + suraById.getSura_name_ar() + ")" + context.getResources().getString(R.string.tvVerse) + " " + Utils.getBanglaNumber(versesByVersesId.getVerse_id()), str2 + ("\n\nPlaystore Link: \nhttps://play.google.com/store/apps/details?id=" + context.getPackageName()));
                SearchDetailsListAdapter.dialog.dismiss();
            }
        });
        ((RelativeLayout) dialog.findViewById(R.id.relCopy)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Search.SearchDetailsListAdapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                QuranDetails versesByVersesId;
                new DatabaseAccessor();
                QuranSuras suraById = DatabaseAccessor.getSuraById(str.split("_")[0]);
                String str2 = context.getResources().getString(R.string.sura) + " " + suraById.getSuraName() + " (" + suraById.getSura_name_ar() + ")" + context.getResources().getString(R.string.verse) + " " + Utils.getBanglaNumber(versesByVersesId.getVerse_id()) + "\n\n" + versesByVersesId.getModified_content() + "\n\n" + DatabaseAccessor.getVersesByVersesId(str.split("_")[1]).getContent();
                ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(context.getResources().getString(R.string.sura) + " " + suraById.getSuraName() + "(" + suraById.getSura_name_ar() + ")" + context.getResources().getString(R.string.tvVerse) + " " + Utils.getBanglaNumber(versesByVersesId.getVerse_id()), str2 + ("\n\nPlaystore Link: \nhttps://play.google.com/store/apps/details?id=" + context.getPackageName())));
                Toast.makeText(context, "Copied", 0).show();
                SearchDetailsListAdapter.dialog.dismiss();
            }
        });
        if (Utils.getString(activity, "bookmark_remove" + str).equals("")) {
            imageView.setImageResource(R.drawable.ic_star_bookmark_remove);
        } else {
            imageView.setImageResource(R.drawable.ic_star_bookmark);
        }
        final String str2 = str.split("_")[0];
        final String str3 = str.split("_")[1];
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Search.SearchDetailsListAdapter.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
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
                new Handler().postDelayed(new Runnable() { // from class: com.muslim.Search.SearchDetailsListAdapter.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SearchDetailsListAdapter.dialog.dismiss();
                    }
                }, 10L);
            }
        });
        relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Search.-$$Lambda$SearchDetailsListAdapter$OU_NgUgLId9__L73aJgEiyA-z4s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchDetailsListAdapter.lambda$CustomDialog$0(str2, context, view);
            }
        });
        dialog.show();
    }

    
    public static /* synthetic */ void lambda$CustomDialog$0(String str, Context context, View view) {
        dialog.dismiss();
        playAudio((Activity) context, DatabaseAccessor.getSuraById(str).getSuraName(), Utils.getAudioLink(str), str);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.mInflater.inflate(R.layout.search_listview_details, viewGroup, false);
            ViewHolder viewHolder = new ViewHolder();
            this.holder = viewHolder;
            viewHolder.linearLayout = (LinearLayout) view.findViewById(R.id.listLinear);
            this.holder.tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            this.holder.tvTag = (TextView) view.findViewById(R.id.tvTag);
            this.holder.tvVerse = (TextView) view.findViewById(R.id.txtVerse);
            this.holder.tvTransliteration = (TextView) view.findViewById(R.id.tvTransliteration);
            this.holder.tvSource = (TextView) view.findViewById(R.id.tvSource);
            view.setTag(this.holder);
        } else {
            this.holder = (ViewHolder) view.getTag();
        }
        if (!Constants.isArabicFontSupported) {
            this.holder.tvTitle.setTextSize(22.0f);
        }
        if (Utils.getString((Activity) this.context, "normal").equals("")) {
            if (i % 2 == 0) {
                this.holder.linearLayout.setBackgroundResource(R.drawable.list_bg2);
            } else {
                this.holder.linearLayout.setBackgroundResource(R.drawable.list_bg1);
            }
        } else if (i % 2 == 0) {
            this.holder.linearLayout.setBackgroundResource(R.drawable.normal_bg);
        } else {
            this.holder.linearLayout.setBackgroundResource(R.drawable.normal_bg1);
        }
        String sura_id = this.quranDetails.get(i).getSura_id();
        String verses_id = this.quranDetails.get(i).getVerses_id();
        String modified_content = this.quranDetails.get(i).getModified_content();
        Utils.setArabicTypeface((Activity) this.context, this.holder.tvTitle);
        if (Utils.getString((Activity) this.context, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_UTHMANI_HAFS9)) {
            modified_content = Utils.replaceUthmaniArabic(modified_content);
        }
        if (this.newText.isEmpty()) {
            if (!Constants.isArabicFontSupported || Utils.getString((Activity) this.context, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_DROID_NASKH)) {
                this.holder.tvTitle.setText(ArabicFarsiUrduGlyphUtils.formatToDisplay(modified_content.trim().trim()));
            } else {
                this.holder.tvTitle.setText(modified_content.trim());
            }
        } else if (!Constants.isArabicFontSupported || Utils.getString((Activity) this.context, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_DROID_NASKH)) {
            TextView textView = this.holder.tvTitle;
            String trim = modified_content.trim();
            String str = this.newText;
            textView.setText(Html.fromHtml(ArabicFarsiUrduGlyphUtils.formatToDisplay(trim.replace(str, "<big><b><font color='red'>" + this.newText + "</font></b></big>"))), TextView.BufferType.SPANNABLE);
        } else {
            TextView textView2 = this.holder.tvTitle;
            String trim2 = modified_content.trim();
            String str2 = this.newText;
            textView2.setText(Html.fromHtml(trim2.replace(str2, "<big><b><font color='red'>" + this.newText + "</font></b></big>")), TextView.BufferType.SPANNABLE);
        }
        String content = this.quranDetails.get(i).getContent();
        if (Utils.getString((Activity) this.context, Constants.KEY_TRANSLITERATION_MOOD).equals(Constants.TRANSLITERATION_MOOD_ON)) {
            this.holder.tvTransliteration.setVisibility(0);
            this.holder.tvTransliteration.setTypeface(null, 2);
            this.holder.tvTransliteration.setText(Html.fromHtml(this.quranDetails.get(i).getTrans().trim()), TextView.BufferType.SPANNABLE);
        } else {
            this.holder.tvTransliteration.setVisibility(8);
        }
        if (this.newText.isEmpty()) {
            Utils.setMyBanglaText(this.holder.tvSource, content.trim());
        } else {
            TextView textView3 = this.holder.tvSource;
            String trim3 = content.trim();
            String str3 = this.newText;
            Utils.setMyBanglaTextHtml(textView3, trim3.replace(str3, "<big><b><font color='" + this.context.getResources().getColor(R.color.iqlab) + "'>" + this.newText + "</font></b></big>"));
        }
        TextView textView4 = this.holder.tvVerse;
        Utils.setMyBanglaText(textView4, sura_id + ". " + DatabaseAccessor.getSuraById(String.valueOf(sura_id)).getSuraName() + this.context.getResources().getString(R.string.tvVerse) + Utils.getBanglaNumber(verses_id));
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

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int i) {
        String str;
        if (i <= 0) {
            str = "0";
        } else if (this.quranDetails.size() - 1 <= i) {
            str = String.valueOf(this.quranDetails.size() - 1);
        } else {
            str = this.mSelections.get(i - 1);
        }
        int parseInt = Integer.parseInt(str);
        return parseInt > 0 ? parseInt - 1 : parseInt;
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int i) {
        Log.i("DREG", "Selection = " + i);
        return Integer.parseInt(this.mSelections.get(i));
    }

    @Override // android.widget.SectionIndexer
    public Object[] getSections() {
        ArrayList<String> arrayList = this.mSelections;
        return arrayList.toArray(new String[arrayList.size()]);
    }

    
    class ViewHolder {
        LinearLayout linearLayout;
        TextView tvSource;
        TextView tvTag;
        TextView tvTitle;
        TextView tvTransliteration;
        TextView tvVerse;

        ViewHolder() {
        }
    }
}
