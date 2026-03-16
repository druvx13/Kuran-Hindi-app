package com.muslim;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import com.muslim.necessary.db.DatabaseAccessor;
import com.muslim.necessary.db.DatabaseHelper;
import com.muslim.quran_hindi.QuranActivity;
import com.muslim.quran_hindi.R;
/* loaded from: classes.dex */
public class Splash extends Activity {
    private ProgressDialog pDialog;

    /* JADX WARN: Type inference failed for: r3v4, types: [com.muslim.Splash$1] */
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.splash);
        try {
            new AsyncTask<String, String, String>() { // from class: com.muslim.Splash.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                public String doInBackground(String... strArr) {
                    try {
                        DatabaseAccessor.initDB(Splash.this);
                        DatabaseHelper.manageDatabase(Splash.this);
                        return null;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                public void onPostExecute(String str) {
                    new Handler().postDelayed(new Runnable() { // from class: com.muslim.Splash.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Splash.this.startActivity(new Intent(Splash.this, QuranActivity.class));
                        }
                    }, 500L);
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } catch (Exception e) {
            e.printStackTrace();
            startActivity(new Intent(this, QuranActivity.class));
        }
    }
}
