package com.muslim.necessary.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.muslim.Bookmark.Sura.model.SuraBookmarkQuranDetails;
import com.muslim.Bookmark.Sura.model.SuraBookmarkQuranSuras;
import com.muslim.Bookmark.Verses.model.VersesBookmarkQuranDetails;
import com.muslim.Bookmark.Verses.model.VersesBookmarkQuranSuras;
import com.muslim.QuranApplication;
import com.muslim.Search.model.SearchQuranDetails;
import com.muslim.hafizi.QuranJuzs;
import com.muslim.necessary.utils.Constants;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.model.QuranDetails;
import com.muslim.quran_hindi.model.QuranSuras;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class DatabaseAccessor {
    public static DatabaseHelper myDbHelper;
    public static SQLiteDatabase rdb;
    public static SQLiteDatabase wdb;

    public static final synchronized void initDB(Context context) throws Exception {
        synchronized (DatabaseAccessor.class) {
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
        synchronized (DatabaseAccessor.class) {
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
        ArrayList<QuranSuras> arrayList;
        Exception e;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM sura", null);
            arrayList = new ArrayList<>();
            while (rawQuery.moveToNext()) {
                try {
                    QuranSuras quranSuras = new QuranSuras();
                    quranSuras.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    quranSuras.setSura_reverse_id(rawQuery.getString(rawQuery.getColumnIndex("reverse_id")));
                    quranSuras.setSura_name_ar(rawQuery.getString(rawQuery.getColumnIndex("name_ar")));
                    quranSuras.setSuraName(rawQuery.getString(rawQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME)));
                    quranSuras.setSuraMeaning(rawQuery.getString(rawQuery.getColumnIndex("meaning")));
                    quranSuras.setPage(rawQuery.getString(rawQuery.getColumnIndex("page_of_hafezi")));
                    quranSuras.setAudioLink(rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER))));
                    quranSuras.setVersesId(Utils.getMyEnglishNumber(rawQuery.getString(rawQuery.getColumnIndex("ayat"))));
                    arrayList.add(quranSuras);
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            rawQuery.close();
        } catch (Exception e3) {
            arrayList = null;
            e = e3;
        }
        return arrayList;
    }

    public static ArrayList<QuranSuras> getAllSurasReverse() {
        ArrayList<QuranSuras> arrayList;
        Exception e;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM sura order by reverse_id asc", null);
            arrayList = new ArrayList<>();
            while (rawQuery.moveToNext()) {
                try {
                    QuranSuras quranSuras = new QuranSuras();
                    quranSuras.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    quranSuras.setSura_reverse_id(rawQuery.getString(rawQuery.getColumnIndex("reverse_id")));
                    quranSuras.setSura_name_ar(rawQuery.getString(rawQuery.getColumnIndex("name_ar")));
                    quranSuras.setSuraName(rawQuery.getString(rawQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME)));
                    quranSuras.setSuraMeaning(rawQuery.getString(rawQuery.getColumnIndex("meaning")));
                    quranSuras.setPage(rawQuery.getString(rawQuery.getColumnIndex("page_of_hafezi")));
                    quranSuras.setAudioLink(rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER))));
                    arrayList.add(quranSuras);
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            rawQuery.close();
        } catch (Exception e3) {
            arrayList = null;
            e = e3;
        }
        return arrayList;
    }

    public static ArrayList<SuraBookmarkQuranSuras> getAllSuraBookmarkSuras() {
        ArrayList<SuraBookmarkQuranSuras> arrayList;
        Exception e;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM sura", null);
            arrayList = new ArrayList<>();
            while (rawQuery.moveToNext()) {
                try {
                    SuraBookmarkQuranSuras suraBookmarkQuranSuras = new SuraBookmarkQuranSuras();
                    suraBookmarkQuranSuras.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    suraBookmarkQuranSuras.setReverse_id(rawQuery.getString(rawQuery.getColumnIndex("reverse_id")));
                    suraBookmarkQuranSuras.setSura_name_ar(rawQuery.getString(rawQuery.getColumnIndex("name_ar")));
                    suraBookmarkQuranSuras.setSuraName(rawQuery.getString(rawQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME)));
                    suraBookmarkQuranSuras.setSuraMeaning(rawQuery.getString(rawQuery.getColumnIndex("meaning")));
                    suraBookmarkQuranSuras.setAudioLink(rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER))));
                    arrayList.add(suraBookmarkQuranSuras);
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            rawQuery.close();
        } catch (Exception e3) {
            arrayList = null;
            e = e3;
        }
        return arrayList;
    }

    public static QuranSuras getSuraById(String str) {
        QuranSuras quranSuras = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM sura where id = '" + str + "'", null);
            QuranSuras quranSuras2 = new QuranSuras();
            while (rawQuery.moveToNext()) {
                try {
                    quranSuras2.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    quranSuras2.setSura_name_ar(rawQuery.getString(rawQuery.getColumnIndex("name_ar")));
                    quranSuras2.setSuraName(rawQuery.getString(rawQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME)));
                    quranSuras2.setSuraMeaning(rawQuery.getString(rawQuery.getColumnIndex("meaning")));
                    quranSuras2.setPage(rawQuery.getString(rawQuery.getColumnIndex("page_of_hafezi")));
                    quranSuras2.setAudioLink(rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER))));
                    quranSuras2.setVersesId(Utils.getMyEnglishNumber(rawQuery.getString(rawQuery.getColumnIndex("ayat"))));
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

    public static QuranSuras getSuraNameById(String str) {
        QuranSuras quranSuras = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM sura where id = '" + str + "'", null);
            QuranSuras quranSuras2 = new QuranSuras();
            while (rawQuery.moveToNext()) {
                try {
                    quranSuras2.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    quranSuras2.setSuraName(rawQuery.getString(rawQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME)));
                    quranSuras2.setAudioLink(rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER))));
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
                    quranSuras2.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    quranSuras2.setSura_name_ar(rawQuery.getString(rawQuery.getColumnIndex("name_ar")));
                    quranSuras2.setSuraName(rawQuery.getString(rawQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME)));
                    quranSuras2.setSuraMeaning(rawQuery.getString(rawQuery.getColumnIndex("meaning")));
                    quranSuras2.setPage(rawQuery.getString(rawQuery.getColumnIndex("page_of_hafezi")));
                    quranSuras2.setAudioLink(rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER))));
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
                    quranSuras2.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    quranSuras2.setSura_name_ar(rawQuery.getString(rawQuery.getColumnIndex("name_ar")));
                    quranSuras2.setSuraName(rawQuery.getString(rawQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME)));
                    quranSuras2.setSuraMeaning(rawQuery.getString(rawQuery.getColumnIndex("meaning")));
                    quranSuras2.setAudioLink(rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER))));
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
                    quranSuras.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    quranSuras.setSura_reverse_id(rawQuery.getString(rawQuery.getColumnIndex("reverse_id")));
                    quranSuras.setSura_name_ar(rawQuery.getString(rawQuery.getColumnIndex("name_ar")));
                    quranSuras.setSuraName(rawQuery.getString(rawQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME)));
                    quranSuras.setSuraMeaning(rawQuery.getString(rawQuery.getColumnIndex("meaning")));
                    quranSuras.setAudioLink(rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER))));
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
                    suraBookmarkQuranSuras2.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    suraBookmarkQuranSuras2.setSura_name_ar(rawQuery.getString(rawQuery.getColumnIndex("name_ar")));
                    suraBookmarkQuranSuras2.setSuraName(rawQuery.getString(rawQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME)));
                    suraBookmarkQuranSuras2.setSuraMeaning(rawQuery.getString(rawQuery.getColumnIndex("meaning")));
                    suraBookmarkQuranSuras2.setAudioLink(rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER))));
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
                    versesBookmarkQuranSuras2.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    versesBookmarkQuranSuras2.setSura_name_ar(rawQuery.getString(rawQuery.getColumnIndex("name_ar")));
                    versesBookmarkQuranSuras2.setSuraName(rawQuery.getString(rawQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME)));
                    versesBookmarkQuranSuras2.setSuraMeaning(rawQuery.getString(rawQuery.getColumnIndex("meaning")));
                    versesBookmarkQuranSuras2.setAudioLink(rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER))));
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
                    suraBookmarkQuranSuras.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    suraBookmarkQuranSuras.setSura_name_ar(rawQuery.getString(rawQuery.getColumnIndex("name_ar")));
                    suraBookmarkQuranSuras.setSuraName(rawQuery.getString(rawQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME)));
                    suraBookmarkQuranSuras.setSuraMeaning(rawQuery.getString(rawQuery.getColumnIndex("meaning")));
                    suraBookmarkQuranSuras.setAudioLink(rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER))));
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
                    versesBookmarkQuranSuras.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    versesBookmarkQuranSuras.setSura_name_ar(rawQuery.getString(rawQuery.getColumnIndex("name_ar")));
                    versesBookmarkQuranSuras.setSuraName(rawQuery.getString(rawQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME)));
                    versesBookmarkQuranSuras.setSuraMeaning(rawQuery.getString(rawQuery.getColumnIndex("meaning")));
                    versesBookmarkQuranSuras.setAudioLink(rawQuery.getString(rawQuery.getColumnIndex("audio" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_RECEITER))));
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

    public static ArrayList<QuranDetails> getAllVerses() {
        ArrayList<QuranDetails> arrayList;
        Exception e;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM quran_verses", null);
            arrayList = new ArrayList<>();
            while (rawQuery.moveToNext()) {
                try {
                    QuranDetails quranDetails = new QuranDetails();
                    quranDetails.setId(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    quranDetails.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("sura_id")));
                    quranDetails.setModified_content(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_ARABIC_TEXT))));
                    quranDetails.setContent(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_TRANSLATOR))).replace("$$", "\""));
                    quranDetails.setTrans(rawQuery.getString(rawQuery.getColumnIndex("trans")));
                    arrayList.add(quranDetails);
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            rawQuery.close();
        } catch (Exception e3) {
            arrayList = null;
            e = e3;
        }
        return arrayList;
    }

    public static QuranDetails getVersesIdById(String str) {
        QuranDetails quranDetails = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM quran_verses where id = '" + str + "'", null);
            QuranDetails quranDetails2 = new QuranDetails();
            while (rawQuery.moveToNext()) {
                try {
                    quranDetails2.setId(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    quranDetails2.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("sura_id")));
                    quranDetails2.setVerse_id(rawQuery.getString(rawQuery.getColumnIndex("verse_id")));
                    quranDetails2.setModified_content(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_ARABIC_TEXT))));
                    quranDetails2.setContent(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_TRANSLATOR))).replace("$$", "\""));
                    quranDetails2.setTrans(rawQuery.getString(rawQuery.getColumnIndex("trans")));
                } catch (Exception e) {
                    e = e;
                    quranDetails = quranDetails2;
                    e.printStackTrace();
                    return quranDetails;
                }
            }
            rawQuery.close();
            return quranDetails2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static QuranDetails getVersesIdBySuraId(String str) {
        QuranDetails quranDetails = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM quran_verses where sura_id = '" + str + "'", null);
            QuranDetails quranDetails2 = new QuranDetails();
            while (rawQuery.moveToNext()) {
                try {
                    quranDetails2.setVerse_id(rawQuery.getString(rawQuery.getColumnIndex("verse_id")));
                } catch (Exception e) {
                    e = e;
                    quranDetails = quranDetails2;
                    e.printStackTrace();
                    return quranDetails;
                }
            }
            rawQuery.close();
            return quranDetails2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static VersesBookmarkQuranDetails getV_B_VersesIdById(String str) {
        VersesBookmarkQuranDetails versesBookmarkQuranDetails = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM quran_verses where id = '" + str + "'", null);
            VersesBookmarkQuranDetails versesBookmarkQuranDetails2 = new VersesBookmarkQuranDetails();
            while (rawQuery.moveToNext()) {
                try {
                    versesBookmarkQuranDetails2.setId(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    versesBookmarkQuranDetails2.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("sura_id")));
                    versesBookmarkQuranDetails2.setVerse_id(rawQuery.getString(rawQuery.getColumnIndex("verse_id")));
                    versesBookmarkQuranDetails2.setModified_content(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_ARABIC_TEXT))));
                    versesBookmarkQuranDetails2.setContent(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_TRANSLATOR))).replace("$$", "\""));
                    versesBookmarkQuranDetails2.setTrans(rawQuery.getString(rawQuery.getColumnIndex("trans")));
                } catch (Exception e) {
                    e = e;
                    versesBookmarkQuranDetails = versesBookmarkQuranDetails2;
                    e.printStackTrace();
                    return versesBookmarkQuranDetails;
                }
            }
            rawQuery.close();
            return versesBookmarkQuranDetails2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static QuranDetails getVersesByVersesId(String str) {
        QuranDetails quranDetails = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM quran_verses where id = '" + str + "'", null);
            QuranDetails quranDetails2 = new QuranDetails();
            while (rawQuery.moveToNext()) {
                try {
                    quranDetails2.setId(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    quranDetails2.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("sura_id")));
                    quranDetails2.setVerse_id(rawQuery.getString(rawQuery.getColumnIndex("verse_id")));
                    quranDetails2.setModified_content(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_ARABIC_TEXT))));
                    quranDetails2.setContent(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_TRANSLATOR))).replace("$$", "\""));
                    quranDetails2.setTrans(rawQuery.getString(rawQuery.getColumnIndex("trans")));
                } catch (Exception e) {
                    e = e;
                    quranDetails = quranDetails2;
                    e.printStackTrace();
                    return quranDetails;
                }
            }
            rawQuery.close();
            return quranDetails2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static ArrayList<SearchQuranDetails> getAllVersesForSearch(String str, String str2, boolean z) {
        String str3;
        ArrayList<SearchQuranDetails> arrayList = null;
        try {
            String str4 = "SELECT * FROM quran_verses where (" + Utils.getString(QuranApplication.quranApplication, Constants.KEY_ARABIC_TEXT) + " like '%" + str + "%' or " + str2 + " like '%" + str + "%' ";
            if (z) {
                str3 = str4 + " or trans like '%" + str + "%' )";
            } else {
                str3 = str4 + ")";
            }
            Cursor rawQuery = rdb.rawQuery(str3, null);
            ArrayList<SearchQuranDetails> arrayList2 = new ArrayList<>();
            while (rawQuery.moveToNext()) {
                try {
                    SearchQuranDetails searchQuranDetails = new SearchQuranDetails();
                    searchQuranDetails.setId(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    searchQuranDetails.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("sura_id")));
                    searchQuranDetails.setVerses_id(rawQuery.getString(rawQuery.getColumnIndex("verse_id")));
                    searchQuranDetails.setModified_content(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_ARABIC_TEXT))));
                    searchQuranDetails.setContent(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_TRANSLATOR))).replace("$$", "\""));
                    searchQuranDetails.setTrans(rawQuery.getString(rawQuery.getColumnIndex("trans")));
                    arrayList2.add(searchQuranDetails);
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

    public static ArrayList<SearchQuranDetails> getAllArabicVerses() {
        ArrayList<SearchQuranDetails> arrayList;
        Exception e;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM quran_verses", null);
            arrayList = new ArrayList<>();
            while (rawQuery.moveToNext()) {
                try {
                    SearchQuranDetails searchQuranDetails = new SearchQuranDetails();
                    searchQuranDetails.setId(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    searchQuranDetails.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("sura_id")));
                    searchQuranDetails.setVerses_id(rawQuery.getString(rawQuery.getColumnIndex("verse_id")));
                    searchQuranDetails.setModified_content(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_ARABIC_TEXT))));
                    searchQuranDetails.setContent(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_TRANSLATOR))).replace("$$", "\""));
                    searchQuranDetails.setTrans(rawQuery.getString(rawQuery.getColumnIndex("trans")));
                    arrayList.add(searchQuranDetails);
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            rawQuery.close();
        } catch (Exception e3) {
            arrayList = null;
            e = e3;
        }
        return arrayList;
    }

    public static VersesBookmarkQuranDetails getBookmarkSuraIdByVersesId(String str) {
        VersesBookmarkQuranDetails versesBookmarkQuranDetails = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM quran_verses where id = '" + str + "'", null);
            VersesBookmarkQuranDetails versesBookmarkQuranDetails2 = new VersesBookmarkQuranDetails();
            while (rawQuery.moveToNext()) {
                try {
                    versesBookmarkQuranDetails2.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("sura_id")));
                } catch (Exception e) {
                    e = e;
                    versesBookmarkQuranDetails = versesBookmarkQuranDetails2;
                    e.printStackTrace();
                    return versesBookmarkQuranDetails;
                }
            }
            rawQuery.close();
            return versesBookmarkQuranDetails2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static VersesBookmarkQuranDetails getBookmarkVersesIdByVersesId(String str) {
        VersesBookmarkQuranDetails versesBookmarkQuranDetails = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM quran_verses where id = '" + str + "'", null);
            VersesBookmarkQuranDetails versesBookmarkQuranDetails2 = new VersesBookmarkQuranDetails();
            while (rawQuery.moveToNext()) {
                try {
                    versesBookmarkQuranDetails2.setId(rawQuery.getString(rawQuery.getColumnIndex("id")));
                } catch (Exception e) {
                    e = e;
                    versesBookmarkQuranDetails = versesBookmarkQuranDetails2;
                    e.printStackTrace();
                    return versesBookmarkQuranDetails;
                }
            }
            rawQuery.close();
            return versesBookmarkQuranDetails2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static ArrayList<SuraBookmarkQuranDetails> getAllSuraBookmarkVerses() {
        ArrayList<SuraBookmarkQuranDetails> arrayList;
        Exception e;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM quran_verses", null);
            arrayList = new ArrayList<>();
            while (rawQuery.moveToNext()) {
                try {
                    SuraBookmarkQuranDetails suraBookmarkQuranDetails = new SuraBookmarkQuranDetails();
                    suraBookmarkQuranDetails.setId(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    suraBookmarkQuranDetails.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("sura_id")));
                    suraBookmarkQuranDetails.setModified_content(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_ARABIC_TEXT))));
                    suraBookmarkQuranDetails.setContent(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_TRANSLATOR))).replace("$$", "\""));
                    suraBookmarkQuranDetails.setTrans(rawQuery.getString(rawQuery.getColumnIndex("trans")));
                    arrayList.add(suraBookmarkQuranDetails);
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            rawQuery.close();
        } catch (Exception e3) {
            arrayList = null;
            e = e3;
        }
        return arrayList;
    }

    public static ArrayList<QuranDetails> getAllVersesBySuraId(String str, String str2) {
        ArrayList<QuranDetails> arrayList = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM quran_verses where reverse_id = '" + str + "'", null);
            ArrayList<QuranDetails> arrayList2 = new ArrayList<>();
            while (rawQuery.moveToNext()) {
                try {
                    QuranDetails quranDetails = new QuranDetails();
                    quranDetails.setId(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    quranDetails.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("sura_id")));
                    quranDetails.setVerse_id(rawQuery.getString(rawQuery.getColumnIndex("verse_id")));
                    quranDetails.setModified_content(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_ARABIC_TEXT))));
                    quranDetails.setContent(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_TRANSLATOR))).replace("$$", "\""));
                    quranDetails.setTrans(rawQuery.getString(rawQuery.getColumnIndex("trans")));
                    arrayList2.add(quranDetails);
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

    public static ArrayList<VersesBookmarkQuranDetails> getAllArabicVersesBySuraId(String str) {
        ArrayList<VersesBookmarkQuranDetails> arrayList = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM quran_verses where sura_id = '" + str + "'", null);
            ArrayList<VersesBookmarkQuranDetails> arrayList2 = new ArrayList<>();
            while (rawQuery.moveToNext()) {
                try {
                    VersesBookmarkQuranDetails versesBookmarkQuranDetails = new VersesBookmarkQuranDetails();
                    versesBookmarkQuranDetails.setId(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    versesBookmarkQuranDetails.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("sura_id")));
                    versesBookmarkQuranDetails.setVerse_id(rawQuery.getString(rawQuery.getColumnIndex("verse_id")));
                    versesBookmarkQuranDetails.setModified_content(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_ARABIC_TEXT))));
                    versesBookmarkQuranDetails.setContent(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_TRANSLATOR))).replace("$$", "\""));
                    versesBookmarkQuranDetails.setTrans(rawQuery.getString(rawQuery.getColumnIndex("trans")));
                    arrayList2.add(versesBookmarkQuranDetails);
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

    public static ArrayList<SuraBookmarkQuranDetails> getAllSuraBookmarkVersesBySuraId(String str) {
        ArrayList<SuraBookmarkQuranDetails> arrayList = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM quran_verses where sura_id = '" + str + "'", null);
            ArrayList<SuraBookmarkQuranDetails> arrayList2 = new ArrayList<>();
            while (rawQuery.moveToNext()) {
                try {
                    SuraBookmarkQuranDetails suraBookmarkQuranDetails = new SuraBookmarkQuranDetails();
                    suraBookmarkQuranDetails.setId(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    suraBookmarkQuranDetails.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("sura_id")));
                    suraBookmarkQuranDetails.setModified_content(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_ARABIC_TEXT))));
                    suraBookmarkQuranDetails.setContent(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_TRANSLATOR))).replace("$$", "\""));
                    suraBookmarkQuranDetails.setTrans(rawQuery.getString(rawQuery.getColumnIndex("trans")));
                    arrayList2.add(suraBookmarkQuranDetails);
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

    public static VersesBookmarkQuranDetails getBookmarkVersesIdBySuraId(String str) {
        VersesBookmarkQuranDetails versesBookmarkQuranDetails = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM quran_verses where sura_id = '" + str + "'", null);
            VersesBookmarkQuranDetails versesBookmarkQuranDetails2 = new VersesBookmarkQuranDetails();
            while (rawQuery.moveToNext()) {
                try {
                    versesBookmarkQuranDetails2.setId(rawQuery.getString(rawQuery.getColumnIndex("id")));
                } catch (Exception e) {
                    e = e;
                    versesBookmarkQuranDetails = versesBookmarkQuranDetails2;
                    e.printStackTrace();
                    return versesBookmarkQuranDetails;
                }
            }
            rawQuery.close();
            return versesBookmarkQuranDetails2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static ArrayList<VersesBookmarkQuranDetails> getAllVerseBookmarkVersesBySuraIdAndVersesId(String str, String str2) {
        ArrayList<VersesBookmarkQuranDetails> arrayList = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM quran_verses where sura_id = '" + str + "' and (" + str2 + ")", null);
            ArrayList<VersesBookmarkQuranDetails> arrayList2 = new ArrayList<>();
            while (rawQuery.moveToNext()) {
                try {
                    VersesBookmarkQuranDetails versesBookmarkQuranDetails = new VersesBookmarkQuranDetails();
                    versesBookmarkQuranDetails.setId(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    versesBookmarkQuranDetails.setSura_id(rawQuery.getString(rawQuery.getColumnIndex("sura_id")));
                    versesBookmarkQuranDetails.setModified_content(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_ARABIC_TEXT))));
                    versesBookmarkQuranDetails.setContent(rawQuery.getString(rawQuery.getColumnIndex(Utils.getString(QuranApplication.quranApplication, Constants.KEY_TRANSLATOR))).replace("$$", "\""));
                    versesBookmarkQuranDetails.setTrans(rawQuery.getString(rawQuery.getColumnIndex("trans")));
                    arrayList2.add(versesBookmarkQuranDetails);
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

    public static void addWord_ar(String str) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(Utils.getString(QuranApplication.quranApplication, Constants.KEY_ARABIC_TEXT), str);
            wdb.insertOrThrow("words_ar", null, contentValues);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addWord_indo(String str) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("bangla", str);
            wdb.insertOrThrow("words_indo", null, contentValues);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getCount(String str, String str2, String str3) {
        Cursor cursor = null;
        try {
            cursor = rdb.rawQuery("select count(*) from " + str + " where " + str2 + " = ?", new String[]{str3});
            if (cursor.moveToFirst()) {
                return cursor.getInt(0);
            }
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public static ArrayList<QuranJuzs> getAllJuz() {
        ArrayList<QuranJuzs> arrayList;
        Exception e;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM para", null);
            arrayList = new ArrayList<>();
            while (rawQuery.moveToNext()) {
                try {
                    QuranJuzs quranJuzs = new QuranJuzs();
                    quranJuzs.setId(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    quranJuzs.setPara_name(rawQuery.getString(rawQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME)));
                    quranJuzs.setPara_name_ar(rawQuery.getString(rawQuery.getColumnIndex("name_ar")));
                    quranJuzs.setStartPage(rawQuery.getString(rawQuery.getColumnIndex("start_page")));
                    quranJuzs.setEndPage(rawQuery.getString(rawQuery.getColumnIndex("end_page")));
                    quranJuzs.setPages(rawQuery.getString(rawQuery.getColumnIndex("pages")));
                    arrayList.add(quranJuzs);
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            rawQuery.close();
        } catch (Exception e3) {
            arrayList = null;
            e = e3;
        }
        return arrayList;
    }

    public static QuranJuzs getParaByPages(String str) {
        QuranJuzs quranJuzs = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM para where pages like '%" + str + "%'", null);
            QuranJuzs quranJuzs2 = new QuranJuzs();
            while (rawQuery.moveToNext()) {
                try {
                    quranJuzs2.setId(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    quranJuzs2.setPara_name(rawQuery.getString(rawQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME)));
                    quranJuzs2.setPara_name_ar(rawQuery.getString(rawQuery.getColumnIndex("name_ar")));
                } catch (Exception e) {
                    e = e;
                    quranJuzs = quranJuzs2;
                    e.printStackTrace();
                    return quranJuzs;
                }
            }
            rawQuery.close();
            return quranJuzs2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static QuranJuzs getParaById(String str) {
        QuranJuzs quranJuzs = null;
        try {
            Cursor rawQuery = rdb.rawQuery("SELECT * FROM para where id = '" + str + "'", null);
            QuranJuzs quranJuzs2 = new QuranJuzs();
            while (rawQuery.moveToNext()) {
                try {
                    quranJuzs2.setId(rawQuery.getString(rawQuery.getColumnIndex("id")));
                    quranJuzs2.setPara_name_ar(rawQuery.getString(rawQuery.getColumnIndex("name_ar")));
                    quranJuzs2.setPara_name(rawQuery.getString(rawQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME)));
                    quranJuzs2.setStartPage(rawQuery.getString(rawQuery.getColumnIndex("start_page")));
                } catch (Exception e) {
                    e = e;
                    quranJuzs = quranJuzs2;
                    e.printStackTrace();
                    return quranJuzs;
                }
            }
            rawQuery.close();
            return quranJuzs2;
        } catch (Exception e2) {
            e = e2;
        }
    }
}
