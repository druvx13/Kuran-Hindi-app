package com.muslim.necessary.db;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
/* loaded from: classes.dex */
public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "Quran4.db";
    private static final int DB_VERSION = 4;
    private static final String[] FILE_PARTS = {"db/Quran.db"};
    private final String DB_PATH;
    private Context context;
    private SQLiteDatabase myDataBase;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, (SQLiteDatabase.CursorFactory) null, 4);
        this.context = context;
        this.DB_PATH = getDatabasePath(context);
    }

    private static String getDatabasePath(Context context) {
        return "/data/data/" + context.getPackageName() + "/databases/";
    }

    public static void manageDatabase(Context context) {
        try {
            File file = new File(getDatabasePath(context));
            if (file.exists()) {
                if (file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null && listFiles.length > 0) {
                        for (int i = 0; i < listFiles.length; i++) {
                            if (listFiles[i].isFile() && !listFiles[i].getName().equals(DB_NAME)) {
                                listFiles[i].delete();
                            }
                        }
                    }
                } else {
                    file.delete();
                    file.mkdirs();
                }
            } else {
                file.mkdirs();
            }
            File file2 = new File(file, DB_NAME);
            if (file2.exists()) {
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            for (int i2 = 0; i2 < FILE_PARTS.length; i2++) {
                InputStream open = context.getAssets().open(FILE_PARTS[i2]);
                while (true) {
                    int read = open.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    }
                }
                open.close();
            }
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void openDataBase() throws SQLException {
        if (databaseExist()) {
            return;
        }
        manageDatabase(this.context);
    }

    public boolean databaseExist() {
        try {
            SQLiteDatabase.openDatabase(this.DB_PATH + DB_NAME, null, 0).close();
            return true;
        } catch (SQLiteException unused) {
            return false;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.myDataBase != null) {
            this.myDataBase.close();
        }
        super.close();
    }
}
