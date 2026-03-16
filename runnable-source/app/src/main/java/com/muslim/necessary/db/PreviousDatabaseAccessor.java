package com.muslim.necessary.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.muslim.Bookmark.Sura.model.SuraBookmarkQuranSuras;
import com.muslim.Bookmark.Verses.model.VersesBookmarkQuranSuras;
import com.muslim.QuranApplication;
import com.muslim.necessary.utils.Constants;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.model.QuranSuras;
import java.util.ArrayList;

public class PreviousDatabaseAccessor {
    public static DatabaseHelper myDbHelper;
    public static SQLiteDatabase rdb;
    public static SQLiteDatabase wdb;

    public static final synchronized void initDB(Context context) throws Exception {
        synchronized (PreviousDatabaseAccessor.class) {
            if (myDbHelper == null) {
                DatabaseHelper databaseHelper = new DatabaseHelper(context);
                myDbHelper = databaseHelper;
                databaseHelper.openDataBase();
                rdb = myDbHelper.getReadableDatabase();
                wdb = myDbHelper.getWritableDatabase();
            }
        }
    }

    public static final synchronized void closeDB() {
        synchronized (PreviousDatabaseAccessor.class) {
            if (myDbHelper != null) {
                myDbHelper.close();
                rdb.close();
                wdb.close();
                myDbHelper = null;
                rdb = null;
                wdb = null;
            }
        }
    }

    public static final boolean doesExistsTable(String str) {
        boolean z = false;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT COUNT(*) FROM sqlite_master WHERE (type='table') AND (name='" + str + "')ORDER BY name;", null);
            boolean z2 = false;
            while (rawQuery.moveToNext()) {
                try {
                    if (Integer.parseInt(rawQuery.getString(0)) > 0) {
                        z2 = true;
                    }
                } catch (Exception e) {
                    e = e;
                    z = z2;
                    e.printStackTrace();
                    return z;
                }
            }
            rawQuery.close();
            return z2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static ArrayList<QuranSuras> getAllSuras() {
        ArrayList<QuranSuras> arrayList = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM sura", null);
            ArrayList<QuranSuras> arrayList2 = new ArrayList<>();
            while (rawQuery.moveToNext()) {
                try {
                    QuranSuras quranSuras = new QuranSuras();
                    String str = "";
                    quranSuras.setSura_id(!rawQuery.isNull(rawQuery.getColumnIndex("id")) ? rawQuery.getString(rawQuery.getColumnIndex("id")) : "");
                    quranSuras.setSura_reverse_id(!rawQuery.isNull(rawQuery.getColumnIndex("reverse_id")) ? rawQuery.getString(rawQuery.getColumnIndex("reverse_id")) : "");
                    quranSuras.setSura_name_ar(!rawQuery.isNull(rawQuery.getColumnIndex("name_ar")) ? rawQuery.getString(rawQuery.getColumnIndex("name_ar")) : "");
                    quranSuras.setSuraName(!rawQuery.isNull(rawQuery.getColumnIndex("name_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("name_indo")).replace("Surah ", "") : "");
                    quranSuras.setSuraMeaning(!rawQuery.isNull(rawQuery.getColumnIndex("meaning_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("meaning_indo")) : "");
                    quranSuras.setPage(!rawQuery.isNull(rawQuery.getColumnIndex("page_of_hafezi")) ? rawQuery.getString(rawQuery.getColumnIndex("page_of_hafezi")) : "");
                    if (!rawQuery.isNull(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)))) {
                        str = rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)));
                    }
                    quranSuras.setAudioLink(str);
                    arrayList2.add(quranSuras);
                } catch (Exception e) {
                    e = e;
                    arrayList = arrayList2;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            rawQuery.close();
            return arrayList2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static ArrayList<QuranSuras> getAllSurasReverse() {
        ArrayList<QuranSuras> arrayList = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM sura order by reverse_id asc", null);
            ArrayList<QuranSuras> arrayList2 = new ArrayList<>();
            while (rawQuery.moveToNext()) {
                try {
                    QuranSuras quranSuras = new QuranSuras();
                    String str = "";
                    quranSuras.setSura_id(!rawQuery.isNull(rawQuery.getColumnIndex("id")) ? rawQuery.getString(rawQuery.getColumnIndex("id")) : "");
                    quranSuras.setSura_reverse_id(!rawQuery.isNull(rawQuery.getColumnIndex("reverse_id")) ? rawQuery.getString(rawQuery.getColumnIndex("reverse_id")) : "");
                    quranSuras.setSura_name_ar(!rawQuery.isNull(rawQuery.getColumnIndex("name_ar")) ? rawQuery.getString(rawQuery.getColumnIndex("name_ar")) : "");
                    quranSuras.setSuraName(!rawQuery.isNull(rawQuery.getColumnIndex("name_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("name_indo")).replace("Surah ", "") : "");
                    quranSuras.setSuraMeaning(!rawQuery.isNull(rawQuery.getColumnIndex("meaning_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("meaning_indo")) : "");
                    if (!rawQuery.isNull(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)))) {
                        str = rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)));
                    }
                    quranSuras.setAudioLink(str);
                    arrayList2.add(quranSuras);
                } catch (Exception e) {
                    e = e;
                    arrayList = arrayList2;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            rawQuery.close();
            return arrayList2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static ArrayList<SuraBookmarkQuranSuras> getAllSuraBookmarkSuras() {
        ArrayList<SuraBookmarkQuranSuras> arrayList = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM sura", null);
            ArrayList<SuraBookmarkQuranSuras> arrayList2 = new ArrayList<>();
            while (rawQuery.moveToNext()) {
                try {
                    SuraBookmarkQuranSuras suraBookmarkQuranSuras = new SuraBookmarkQuranSuras();
                    String str = "";
                    suraBookmarkQuranSuras.setSura_id(!rawQuery.isNull(rawQuery.getColumnIndex("id")) ? rawQuery.getString(rawQuery.getColumnIndex("id")) : "");
                    suraBookmarkQuranSuras.setReverse_id(!rawQuery.isNull(rawQuery.getColumnIndex("reverse_id")) ? rawQuery.getString(rawQuery.getColumnIndex("reverse_id")) : "");
                    suraBookmarkQuranSuras.setSura_name_ar(!rawQuery.isNull(rawQuery.getColumnIndex("name_ar")) ? rawQuery.getString(rawQuery.getColumnIndex("name_ar")) : "");
                    suraBookmarkQuranSuras.setSuraName(!rawQuery.isNull(rawQuery.getColumnIndex("name_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("name_indo")).replace("Surah ", "") : "");
                    suraBookmarkQuranSuras.setSuraMeaning(!rawQuery.isNull(rawQuery.getColumnIndex("meaning_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("meaning_indo")) : "");
                    if (!rawQuery.isNull(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)))) {
                        str = rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)));
                    }
                    suraBookmarkQuranSuras.setAudioLink(str);
                    arrayList2.add(suraBookmarkQuranSuras);
                } catch (Exception e) {
                    e = e;
                    arrayList = arrayList2;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            rawQuery.close();
            return arrayList2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static ArrayList<VersesBookmarkQuranSuras> getAllVersesBookmarkSuras() {
        ArrayList<VersesBookmarkQuranSuras> arrayList = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM sura", null);
            ArrayList<VersesBookmarkQuranSuras> arrayList2 = new ArrayList<>();
            while (rawQuery.moveToNext()) {
                try {
                    VersesBookmarkQuranSuras versesBookmarkQuranSuras = new VersesBookmarkQuranSuras();
                    String str = "";
                    versesBookmarkQuranSuras.setSura_id(!rawQuery.isNull(rawQuery.getColumnIndex("id")) ? rawQuery.getString(rawQuery.getColumnIndex("id")) : "");
                    versesBookmarkQuranSuras.setSura_name_ar(!rawQuery.isNull(rawQuery.getColumnIndex("name_ar")) ? rawQuery.getString(rawQuery.getColumnIndex("name_ar")) : "");
                    versesBookmarkQuranSuras.setSuraName(!rawQuery.isNull(rawQuery.getColumnIndex("name_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("name_indo")).replace("Surah ", "") : "");
                    versesBookmarkQuranSuras.setSuraMeaning(!rawQuery.isNull(rawQuery.getColumnIndex("meaning_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("meaning_indo")) : "");
                    if (!rawQuery.isNull(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)))) {
                        str = rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)));
                    }
                    versesBookmarkQuranSuras.setAudioLink(str);
                    arrayList2.add(versesBookmarkQuranSuras);
                } catch (Exception e) {
                    e = e;
                    arrayList = arrayList2;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            rawQuery.close();
            return arrayList2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static QuranSuras getSuraById(String str) {
        QuranSuras quranSuras = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM sura where id = '" + str + "'", null);
            QuranSuras quranSuras2 = new QuranSuras();
            while (rawQuery.moveToNext()) {
                try {
                    String str2 = "";
                    quranSuras2.setSura_id(!rawQuery.isNull(rawQuery.getColumnIndex("id")) ? rawQuery.getString(rawQuery.getColumnIndex("id")) : "");
                    quranSuras2.setSura_name_ar(!rawQuery.isNull(rawQuery.getColumnIndex("name_ar")) ? rawQuery.getString(rawQuery.getColumnIndex("name_ar")) : "");
                    quranSuras2.setSuraName(!rawQuery.isNull(rawQuery.getColumnIndex("name_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("name_indo")).replace("Surah ", "") : "");
                    quranSuras2.setSuraMeaning(!rawQuery.isNull(rawQuery.getColumnIndex("meaning_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("meaning_indo")) : "");
                    quranSuras2.setPage(!rawQuery.isNull(rawQuery.getColumnIndex("page_of_hafezi")) ? rawQuery.getString(rawQuery.getColumnIndex("page_of_hafezi")) : "");
                    if (!rawQuery.isNull(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)))) {
                        str2 = rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)));
                    }
                    quranSuras2.setAudioLink(str2);
                } catch (Exception e) {
                    e = e;
                    quranSuras = quranSuras2;
                    e.printStackTrace();
                    return quranSuras;
                }
            }
            rawQuery.close();
            return quranSuras2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static QuranSuras getSuraByIdHafezi(String str) {
        QuranSuras quranSuras = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM sura where id = '" + str + "' order by reverse_id", null);
            QuranSuras quranSuras2 = new QuranSuras();
            while (rawQuery.moveToNext()) {
                try {
                    String str2 = "";
                    quranSuras2.setSura_id(!rawQuery.isNull(rawQuery.getColumnIndex("id")) ? rawQuery.getString(rawQuery.getColumnIndex("id")) : "");
                    quranSuras2.setSura_name_ar(!rawQuery.isNull(rawQuery.getColumnIndex("name_ar")) ? rawQuery.getString(rawQuery.getColumnIndex("name_ar")) : "");
                    quranSuras2.setSuraName(!rawQuery.isNull(rawQuery.getColumnIndex("name_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("name_indo")).replace("Surah ", "") : "");
                    quranSuras2.setSuraMeaning(!rawQuery.isNull(rawQuery.getColumnIndex("meaning_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("meaning_indo")) : "");
                    quranSuras2.setPage(!rawQuery.isNull(rawQuery.getColumnIndex("page_of_hafezi")) ? rawQuery.getString(rawQuery.getColumnIndex("page_of_hafezi")) : "");
                    if (!rawQuery.isNull(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)))) {
                        str2 = rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)));
                    }
                    quranSuras2.setAudioLink(str2);
                } catch (Exception e) {
                    e = e;
                    quranSuras = quranSuras2;
                    e.printStackTrace();
                    return quranSuras;
                }
            }
            rawQuery.close();
            return quranSuras2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static QuranSuras getSuraByPages(String str) {
        QuranSuras quranSuras = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM sura where pages like '%" + str + "%' order by reverse_id", null);
            QuranSuras quranSuras2 = new QuranSuras();
            while (rawQuery.moveToNext()) {
                try {
                    String str2 = "";
                    quranSuras2.setSura_id(!rawQuery.isNull(rawQuery.getColumnIndex("id")) ? rawQuery.getString(rawQuery.getColumnIndex("id")) : "");
                    quranSuras2.setSura_name_ar(!rawQuery.isNull(rawQuery.getColumnIndex("name_ar")) ? rawQuery.getString(rawQuery.getColumnIndex("name_ar")) : "");
                    quranSuras2.setSuraName(!rawQuery.isNull(rawQuery.getColumnIndex("name_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("name_indo")).replace("Surah ", "") : "");
                    quranSuras2.setSuraMeaning(!rawQuery.isNull(rawQuery.getColumnIndex("meaning_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("meaning_indo")) : "");
                    if (!rawQuery.isNull(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)))) {
                        str2 = rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)));
                    }
                    quranSuras2.setAudioLink(str2);
                } catch (Exception e) {
                    e = e;
                    quranSuras = quranSuras2;
                    e.printStackTrace();
                    return quranSuras;
                }
            }
            rawQuery.close();
            return quranSuras2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static ArrayList<QuranSuras> getAllSurasByPages(String str) {
        ArrayList<QuranSuras> arrayList = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM sura where pages like '%" + str + "%'", null);
            ArrayList<QuranSuras> arrayList2 = new ArrayList<>();
            while (rawQuery.moveToNext()) {
                try {
                    QuranSuras quranSuras = new QuranSuras();
                    String str2 = "";
                    quranSuras.setSura_id(!rawQuery.isNull(rawQuery.getColumnIndex("id")) ? rawQuery.getString(rawQuery.getColumnIndex("id")) : "");
                    quranSuras.setSura_reverse_id(!rawQuery.isNull(rawQuery.getColumnIndex("reverse_id")) ? rawQuery.getString(rawQuery.getColumnIndex("reverse_id")) : "");
                    quranSuras.setSura_name_ar(!rawQuery.isNull(rawQuery.getColumnIndex("name_ar")) ? rawQuery.getString(rawQuery.getColumnIndex("name_ar")) : "");
                    quranSuras.setSuraName(!rawQuery.isNull(rawQuery.getColumnIndex("name_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("name_indo")).replace("Surah ", "") : "");
                    quranSuras.setSuraMeaning(!rawQuery.isNull(rawQuery.getColumnIndex("meaning_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("meaning_indo")) : "");
                    if (!rawQuery.isNull(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)))) {
                        str2 = rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)));
                    }
                    quranSuras.setAudioLink(str2);
                    arrayList2.add(quranSuras);
                } catch (Exception e) {
                    e = e;
                    arrayList = arrayList2;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            rawQuery.close();
            return arrayList2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static SuraBookmarkQuranSuras getSuraBookmarkSuraById(String str) {
        SuraBookmarkQuranSuras suraBookmarkQuranSuras = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM sura where id = '" + str + "'", null);
            SuraBookmarkQuranSuras suraBookmarkQuranSuras2 = new SuraBookmarkQuranSuras();
            while (rawQuery.moveToNext()) {
                try {
                    String str2 = "";
                    suraBookmarkQuranSuras2.setSura_id(!rawQuery.isNull(rawQuery.getColumnIndex("id")) ? rawQuery.getString(rawQuery.getColumnIndex("id")) : "");
                    suraBookmarkQuranSuras2.setSura_name_ar(!rawQuery.isNull(rawQuery.getColumnIndex("name_ar")) ? rawQuery.getString(rawQuery.getColumnIndex("name_ar")) : "");
                    suraBookmarkQuranSuras2.setSuraName(!rawQuery.isNull(rawQuery.getColumnIndex("name_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("name_indo")).replace("Surah ", "") : "");
                    suraBookmarkQuranSuras2.setSuraMeaning(!rawQuery.isNull(rawQuery.getColumnIndex("meaning_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("meaning_indo")) : "");
                    if (!rawQuery.isNull(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)))) {
                        str2 = rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)));
                    }
                    suraBookmarkQuranSuras2.setAudioLink(str2);
                } catch (Exception e) {
                    e = e;
                    suraBookmarkQuranSuras = suraBookmarkQuranSuras2;
                    e.printStackTrace();
                    return suraBookmarkQuranSuras;
                }
            }
            rawQuery.close();
            return suraBookmarkQuranSuras2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static VersesBookmarkQuranSuras getVerseBookmarkSuraById(String str) {
        VersesBookmarkQuranSuras versesBookmarkQuranSuras = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM sura where id = '" + str + "'", null);
            VersesBookmarkQuranSuras versesBookmarkQuranSuras2 = new VersesBookmarkQuranSuras();
            while (rawQuery.moveToNext()) {
                try {
                    String str2 = "";
                    versesBookmarkQuranSuras2.setSura_id(!rawQuery.isNull(rawQuery.getColumnIndex("id")) ? rawQuery.getString(rawQuery.getColumnIndex("id")) : "");
                    versesBookmarkQuranSuras2.setSura_name_ar(!rawQuery.isNull(rawQuery.getColumnIndex("name_ar")) ? rawQuery.getString(rawQuery.getColumnIndex("name_ar")) : "");
                    versesBookmarkQuranSuras2.setSuraName(!rawQuery.isNull(rawQuery.getColumnIndex("name_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("name_indo")).replace("Surah ", "") : "");
                    versesBookmarkQuranSuras2.setSuraMeaning(!rawQuery.isNull(rawQuery.getColumnIndex("meaning_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("meaning_indo")) : "");
                    if (!rawQuery.isNull(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)))) {
                        str2 = rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)));
                    }
                    versesBookmarkQuranSuras2.setAudioLink(str2);
                } catch (Exception e) {
                    e = e;
                    versesBookmarkQuranSuras = versesBookmarkQuranSuras2;
                    e.printStackTrace();
                    return versesBookmarkQuranSuras;
                }
            }
            rawQuery.close();
            return versesBookmarkQuranSuras2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static ArrayList<SuraBookmarkQuranSuras> getSurasByBookmarkId(String str) {
        ArrayList<SuraBookmarkQuranSuras> arrayList = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM sura " + str, null);
            ArrayList<SuraBookmarkQuranSuras> arrayList2 = new ArrayList<>();
            while (rawQuery.moveToNext()) {
                try {
                    SuraBookmarkQuranSuras suraBookmarkQuranSuras = new SuraBookmarkQuranSuras();
                    String str2 = "";
                    suraBookmarkQuranSuras.setSura_id(!rawQuery.isNull(rawQuery.getColumnIndex("id")) ? rawQuery.getString(rawQuery.getColumnIndex("id")) : "");
                    suraBookmarkQuranSuras.setSura_name_ar(!rawQuery.isNull(rawQuery.getColumnIndex("name_ar")) ? rawQuery.getString(rawQuery.getColumnIndex("name_ar")) : "");
                    suraBookmarkQuranSuras.setSuraName(!rawQuery.isNull(rawQuery.getColumnIndex("name_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("name_indo")).replace("Surah ", "") : "");
                    suraBookmarkQuranSuras.setSuraMeaning(!rawQuery.isNull(rawQuery.getColumnIndex("meaning_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("meaning_indo")) : "");
                    if (!rawQuery.isNull(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)))) {
                        str2 = rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)));
                    }
                    suraBookmarkQuranSuras.setAudioLink(str2);
                    arrayList2.add(suraBookmarkQuranSuras);
                } catch (Exception e) {
                    e = e;
                    arrayList = arrayList2;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            rawQuery.close();
            return arrayList2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static ArrayList<VersesBookmarkQuranSuras> getVersesByBookmarkId(String str) {
        ArrayList<VersesBookmarkQuranSuras> arrayList = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM sura " + str, null);
            ArrayList<VersesBookmarkQuranSuras> arrayList2 = new ArrayList<>();
            while (rawQuery.moveToNext()) {
                try {
                    VersesBookmarkQuranSuras versesBookmarkQuranSuras = new VersesBookmarkQuranSuras();
                    String str2 = "";
                    versesBookmarkQuranSuras.setSura_id(!rawQuery.isNull(rawQuery.getColumnIndex("id")) ? rawQuery.getString(rawQuery.getColumnIndex("id")) : "");
                    versesBookmarkQuranSuras.setSura_name_ar(!rawQuery.isNull(rawQuery.getColumnIndex("name_ar")) ? rawQuery.getString(rawQuery.getColumnIndex("name_ar")) : "");
                    versesBookmarkQuranSuras.setSuraName(!rawQuery.isNull(rawQuery.getColumnIndex("name_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("name_indo")).replace("Surah ", "") : "");
                    versesBookmarkQuranSuras.setSuraMeaning(!rawQuery.isNull(rawQuery.getColumnIndex("meaning_indo")) ? rawQuery.getString(rawQuery.getColumnIndex("meaning_indo")) : "");
                    if (!rawQuery.isNull(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)))) {
                        str2 = rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER)));
                    }
                    versesBookmarkQuranSuras.setAudioLink(str2);
                    arrayList2.add(versesBookmarkQuranSuras);
                } catch (Exception e) {
                    e = e;
                    arrayList = arrayList2;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            rawQuery.close();
            return arrayList2;
        } catch (Exception e2) {
            e = e2;
        }
    }
}
