package com.muslim.home;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.muslim.quran_hindi.QuranActivity;
import android.content.Intent;

/**
 * Stub activity — class was not present in the decompiled output.
 * Redirects immediately to QuranActivity.
 */
public class HomeActivityNew extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, QuranActivity.class));
        finish();
    }
}
