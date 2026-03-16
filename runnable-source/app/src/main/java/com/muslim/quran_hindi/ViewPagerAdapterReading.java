package com.muslim.quran_hindi;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.muslim.necessary.db.DatabaseAccessor;
import com.muslim.necessary.utils.Constants;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.model.QuranDetails;
import com.muslim.quran_hindi.model.QuranSuras;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class ViewPagerAdapterReading extends PagerAdapter {
    public static int backwardTime = 1000;
    public static double finalTime = 0.0d;
    public static int forwardTime = 1000;
    public static boolean isFinished;
    public static boolean isPaused;
    private static ImageView ivClose;
    private static ImageView ivOpen;
    public static MediaPlayer mediaPlayer;
    public static ImageView playImageView;
    public static LinearLayout playerLayout;
    public static SeekBar seekBar;
    public static int soundId;
    public static double timeElapsed;
    public static TextView tvDuration;
    public static TextView tvTime;
    private Activity context;
    private LayoutInflater inflater;
    private ImageView ivBismillah;
    private String msura_id;
    private ArrayList<QuranSuras> quranSurasArrayList;
    private RelativeLayout relBismillah;
    private TextView tvAyats;
    public static Handler durationHandler = new Handler();
    public static double startTime = 0.0d;
    public static Handler myHandler = new Handler();
    public static int oneTimeOnly = 0;
    public static boolean fromBackButton = false;
    public static boolean isPlaying = true;
    public static float leftVolume = 1.0f;
    public static float rightVolume = 1.0f;
    public static int forwardPosition = -2;
    public static int backwardPosition = -2;
    public static Runnable updateSeekBarTime = new Runnable() { // from class: com.muslim.quran_hindi.ViewPagerAdapterReading.1
        @Override // java.lang.Runnable
        public void run() {
            ViewPagerAdapterReading.timeElapsed = ViewPagerAdapterReading.mediaPlayer.getCurrentPosition();
            ViewPagerAdapterReading.seekBar.setProgress((int) ViewPagerAdapterReading.timeElapsed);
            double d = ViewPagerAdapterReading.finalTime - ViewPagerAdapterReading.timeElapsed;
            if (Build.VERSION.SDK_INT >= 9) {
                long j = (long) d;
                String valueOf = String.valueOf(TimeUnit.MILLISECONDS.toMinutes(j));
                String valueOf2 = String.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)));
                TextView textView = ViewPagerAdapterReading.tvDuration;
                Object[] objArr = new Object[2];
                if (valueOf.length() <= 1) {
                    valueOf = "0" + valueOf;
                }
                objArr[0] = valueOf;
                if (valueOf2.length() <= 1) {
                    valueOf2 = "0" + valueOf2;
                }
                objArr[1] = valueOf2;
                textView.setText(String.format("%s:%s", objArr));
            }
            ViewPagerAdapterReading.durationHandler.postDelayed(this, 100L);
        }
    };
    public static Runnable UpdateSongTime = new Runnable() { // from class: com.muslim.quran_hindi.ViewPagerAdapterReading.2
        @Override // java.lang.Runnable
        public void run() {
            ViewPagerAdapterReading.startTime = ViewPagerAdapterReading.mediaPlayer.getCurrentPosition();
            ViewPagerAdapterReading.seekBar.setProgress((int) ViewPagerAdapterReading.startTime);
            ViewPagerAdapterReading.myHandler.postDelayed(this, 100L);
        }
    };

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return null;
    }

    public ViewPagerAdapterReading(Activity activity, ArrayList<QuranSuras> arrayList) {
        this.context = activity;
        this.quranSurasArrayList = arrayList;
    }

    private static void initializePlayer(View view) {
        playerLayout = (LinearLayout) view.findViewById(R.id.player_layout);
        ImageView imageView = (ImageView) view.findViewById(R.id.ivOpen);
        ivOpen = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.ViewPagerAdapterReading.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ViewPagerAdapterReading.ivOpen.setVisibility(8);
                ViewPagerAdapterReading.playerLayout.setVisibility(0);
            }
        });
        ImageView imageView2 = (ImageView) view.findViewById(R.id.ivClose);
        ivClose = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.ViewPagerAdapterReading.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ViewPagerAdapterReading.playerLayout.setVisibility(8);
                ViewPagerAdapterReading.ivOpen.setVisibility(0);
            }
        });
    }

    public static void initialize(final Context context, final View view, int i, boolean z) {
        String str;
        String str2;
        initializePlayer(view);
        ImageView imageView = (ImageView) view.findViewById(R.id.play);
        playImageView = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.ViewPagerAdapterReading.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ViewPagerAdapterReading.timeElapsed = ViewPagerAdapterReading.mediaPlayer.getCurrentPosition();
                ViewPagerAdapterReading.seekBar.setProgress((int) ViewPagerAdapterReading.timeElapsed);
                ViewPagerAdapterReading.durationHandler.postDelayed(ViewPagerAdapterReading.updateSeekBarTime, 100L);
                if (ViewPagerAdapterReading.isPlaying) {
                    ViewPagerAdapterReading.isPlaying = false;
                    ViewPagerAdapterReading.mediaPlayer.pause();
                    ViewPagerAdapterReading.isPaused = true;
                    ViewPagerAdapterReading.playImageView.setImageResource(R.mipmap.ic_play);
                    Utils.putString(context, "playpause", "1");
                    return;
                }
                Utils.putString(context, "playpause", "");
                ViewPagerAdapterReading.playImageView.setImageResource(R.mipmap.ic_pause);
                ViewPagerAdapterReading.isPlaying = true;
                ViewPagerAdapterReading.isPaused = false;
                ViewPagerAdapterReading.playerLayout.setVisibility(0);
                ViewPagerAdapterReading.mediaPlayer.start();
                ViewPagerAdapterReading.finalTime = ViewPagerAdapterReading.mediaPlayer.getDuration();
                ViewPagerAdapterReading.startTime = ViewPagerAdapterReading.mediaPlayer.getCurrentPosition();
                if (ViewPagerAdapterReading.oneTimeOnly == 0) {
                    ViewPagerAdapterReading.seekBar.setMax((int) ViewPagerAdapterReading.finalTime);
                    ViewPagerAdapterReading.oneTimeOnly = 1;
                }
                ViewPagerAdapterReading.seekBar.setProgress((int) ViewPagerAdapterReading.startTime);
                ViewPagerAdapterReading.myHandler.postDelayed(ViewPagerAdapterReading.UpdateSongTime, 100L);
            }
        });
        if (i < 10) {
            str = "quran_00" + i + ".mp3";
        } else if (i < 100) {
            str = "quran_0" + i + ".mp3";
        } else {
            str = "quran_" + i + ".mp3";
        }
        MediaPlayer mediaPlayer2 = mediaPlayer;
        if (mediaPlayer2 != null && mediaPlayer2.isPlaying()) {
            mediaPlayer.stop();
        }
        isPlaying = true;
        isPaused = false;
        startTime = 0.0d;
        finalTime = 0.0d;
        oneTimeOnly = 0;
        leftVolume = 1.0f;
        rightVolume = 1.0f;
        fromBackButton = false;
        seekBar = (SeekBar) view.findViewById(R.id.seekBar1);
        mediaPlayer.setVolume(leftVolume, rightVolume);
        seekBar.setClickable(false);
        try {
            new File(Utils.getRoot() + "/QuranIDEA/audio/" + str);
            mediaPlayer.setDataSource(Utils.getRoot() + "/QuranIDEA/audio/" + str);
            mediaPlayer.prepare();
            finalTime = (double) mediaPlayer.getDuration();
            tvTime = (TextView) view.findViewById(R.id.tv_time);
            String str3 = null;
            if (Build.VERSION.SDK_INT >= 9) {
                str3 = String.valueOf(TimeUnit.MILLISECONDS.toMinutes((long) finalTime));
                str2 = String.valueOf(TimeUnit.MILLISECONDS.toSeconds((long) finalTime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) finalTime)));
            } else {
                str2 = null;
            }
            TextView textView = tvTime;
            Object[] objArr = new Object[2];
            if (str3.length() <= 1) {
                str3 = "0" + str3;
            }
            objArr[0] = str3;
            if (str2.length() <= 1) {
                str2 = "0" + str2;
            }
            objArr[1] = str2;
            textView.setText(String.format("%s:%s", objArr));
            tvDuration = (TextView) view.findViewById(R.id.tv_time_duration);
            seekBar.setMax((int) finalTime);
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.muslim.quran_hindi.ViewPagerAdapterReading.6
                @Override // android.media.MediaPlayer.OnPreparedListener
                public void onPrepared(MediaPlayer mediaPlayer3) {
                    ViewPagerAdapterReading.playerLayout.setVisibility(0);
                    mediaPlayer3.start();
                    ViewPagerAdapterReading.timeElapsed = ViewPagerAdapterReading.mediaPlayer.getCurrentPosition();
                    ViewPagerAdapterReading.seekBar.setProgress((int) ViewPagerAdapterReading.timeElapsed);
                    ViewPagerAdapterReading.durationHandler.postDelayed(ViewPagerAdapterReading.updateSeekBarTime, 100L);
                }
            });
            mediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        } catch (IllegalStateException e3) {
            e3.printStackTrace();
        } catch (SecurityException e4) {
            e4.printStackTrace();
        }
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.muslim.quran_hindi.ViewPagerAdapterReading.7
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar2) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar2) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar2, int i2, boolean z2) {
                if (z2) {
                    ViewPagerAdapterReading.mediaPlayer.seekTo(i2);
                }
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.muslim.quran_hindi.ViewPagerAdapterReading.8
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer3) {
                ViewPagerAdapterReading.backwardPosition = ViewPagerAdapterReading.forwardPosition - 1;
                if (ViewPagerAdapterReading.forwardPosition == 28 || ViewPagerAdapterReading.forwardPosition == 29) {
                    ViewPagerAdapterReading.isPlaying = false;
                    ViewPagerAdapterReading.playImageView.setImageResource(R.mipmap.ic_play);
                    ViewPagerAdapterReading.playerLayout.setVisibility(8);
                    return;
                }
                Context context2 = context;
                View view2 = view;
                int i2 = ViewPagerAdapterReading.forwardPosition;
                ViewPagerAdapterReading.forwardPosition = i2 + 1;
                ViewPagerAdapterReading.initialize(context2, view2, i2, true);
            }
        });
        playFirst();
    }

    public static void playFirst() {
        playImageView.setImageResource(R.mipmap.ic_pause);
        isPlaying = true;
        isPaused = false;
        playerLayout.setVisibility(0);
        mediaPlayer.start();
        finalTime = mediaPlayer.getDuration();
        startTime = mediaPlayer.getCurrentPosition();
        if (oneTimeOnly == 0) {
            seekBar.setMax((int) finalTime);
            oneTimeOnly = 1;
        }
        seekBar.setProgress((int) startTime);
        myHandler.postDelayed(UpdateSongTime, 100L);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.quranSurasArrayList.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = (LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater");
        this.inflater = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.pager_container_reading, viewGroup, false);
        mediaPlayer = new MediaPlayer();
        String sura_reverse_id = this.quranSurasArrayList.get(i).getSura_reverse_id();
        this.quranSurasArrayList.get(i).getSura_id();
        this.msura_id = sura_reverse_id;
        getReading(inflate);
        ((ImageView) inflate.findViewById(R.id.backward)).setOnTouchListener(new View.OnTouchListener() { // from class: com.muslim.quran_hindi.ViewPagerAdapterReading.9
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                new Handler().postDelayed(new Runnable() { // from class: com.muslim.quran_hindi.ViewPagerAdapterReading.9.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((int) ViewPagerAdapterReading.startTime) - ViewPagerAdapterReading.backwardTime > 0) {
                            double d = ViewPagerAdapterReading.startTime;
                            double d2 = ViewPagerAdapterReading.backwardTime;
                            Double.isNaN(d2);
                            ViewPagerAdapterReading.startTime = d - d2;
                            ViewPagerAdapterReading.mediaPlayer.seekTo((int) ViewPagerAdapterReading.startTime);
                        }
                    }
                }, 50L);
                return false;
            }
        });
        ((ImageView) inflate.findViewById(R.id.forward)).setOnTouchListener(new View.OnTouchListener() { // from class: com.muslim.quran_hindi.ViewPagerAdapterReading.10
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                new Handler().postDelayed(new Runnable() { // from class: com.muslim.quran_hindi.ViewPagerAdapterReading.10.1
                    @Override // java.lang.Runnable
                    public void run() {
                        double d = ViewPagerAdapterReading.timeElapsed;
                        double d2 = ViewPagerAdapterReading.forwardTime;
                        Double.isNaN(d2);
                        if (d + d2 <= ViewPagerAdapterReading.finalTime) {
                            double d3 = ViewPagerAdapterReading.timeElapsed;
                            double d4 = ViewPagerAdapterReading.forwardTime;
                            Double.isNaN(d4);
                            ViewPagerAdapterReading.timeElapsed = d3 + d4;
                            ViewPagerAdapterReading.mediaPlayer.seekTo((int) ViewPagerAdapterReading.timeElapsed);
                        }
                    }
                }, 50L);
                return false;
            }
        });
        ((ViewPager) viewGroup).addView(inflate);
        return inflate;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(View view, int i, Object obj) {
        ((ViewPager) view).removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == ((View) obj);
    }

    public void onBackPressed() {
        MediaPlayer mediaPlayer2 = mediaPlayer;
        if (mediaPlayer2 != null && mediaPlayer2.isPlaying()) {
            playerLayout.setVisibility(8);
            mediaPlayer.stop();
            playImageView.setClickable(true);
            fromBackButton = true;
            playerLayout.setVisibility(8);
        } else if (mediaPlayer == null || !isPaused) {
        } else {
            isPaused = false;
            playerLayout.setVisibility(8);
        }
    }

    private void getReading(View view) {
        String str;
        View findViewById = view.findViewById(R.id.listview_reading);
        this.ivBismillah = (ImageView) findViewById.findViewById(R.id.ivBismillah);
        this.tvAyats = (TextView) findViewById.findViewById(R.id.tvAyats);
        String str2 = "";
        ArrayList<QuranDetails> allVersesBySuraId = DatabaseAccessor.getAllVersesBySuraId(this.msura_id, "");
        this.relBismillah = (RelativeLayout) findViewById.findViewById(R.id.relBismillah);
        if (this.msura_id.equals("106")) {
            this.relBismillah.setVisibility(8);
        } else {
            this.relBismillah.setVisibility(0);
        }
        if (this.msura_id.equals("114")) {
            this.ivBismillah.setBackgroundResource(R.drawable.auzubillah);
        } else {
            this.ivBismillah.setBackgroundResource(R.drawable.bismillah);
        }
        for (int i = 0; i < allVersesBySuraId.size(); i++) {
            if (Utils.getString(this.context, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_UTHMANI_HAFS9)) {
                str = str2 + allVersesBySuraId.get(i).getModified_content().trim() + " ﴿" + Utils.getArabicNumber(i + 1) + "﴾ ";
            } else if (Utils.getString(this.context, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_QALAM_MAJEED) || Utils.getString(this.context, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_AL_MUSHAF)) {
                str = str2 + allVersesBySuraId.get(i).getModified_content().trim() + " ﴿" + Utils.getArabicNumber(i + 1) + "﴾  ";
            } else if (Utils.getString(this.context, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_ME_QURAN)) {
                str = str2 + allVersesBySuraId.get(i).getModified_content().trim() + "   ﴿" + Utils.getArabicNumber(i + 1) + "﴾     ";
            } else if (Utils.getString(this.context, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIDAYAT) || Utils.getString(this.context, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HUDA) || Utils.getString(this.context, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIRA)) {
                str = str2 + allVersesBySuraId.get(i).getModified_content().trim() + "  ";
            } else if (Constants.isArabicFontSupported) {
                str = str2 + allVersesBySuraId.get(i).getModified_content().trim() + " ﴿" + Utils.getArabicNumber(i + 1) + "﴾ ";
            } else {
                str = str2 + allVersesBySuraId.get(i).getModified_content().trim() + "{" + Utils.getArabicNumber(i + 1) + "} ";
            }
            str2 = str;
        }
        if (Utils.getString(this.context, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_UTHMANI_HAFS9)) {
            str2 = Utils.replaceUthmaniArabic(str2);
        }
        Utils.setArabicTextReading(this.context, this.tvAyats, str2, allVersesBySuraId.size());
    }
}
