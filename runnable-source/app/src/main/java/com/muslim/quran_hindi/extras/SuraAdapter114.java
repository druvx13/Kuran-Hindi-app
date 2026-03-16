package com.muslim.quran_hindi.extras;

import android.app.Activity;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.futuremind.recyclerviewfastscroll.SectionTitleProvider;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.R;
import java.util.List;

public class SuraAdapter114 extends RecyclerView.Adapter<MyViewHolder> implements SectionTitleProvider {
    private Activity activity;
    private List<Num114> list;

    public SuraAdapter114(Activity activity, List<Num114> list) {
        this.activity = activity;
        this.list = list;
    }

    @Override // com.futuremind.recyclerviewfastscroll.SectionTitleProvider
    public String getSectionTitle(int i) {
        if (Build.VERSION.SDK_INT >= 14) {
            return Utils.getBanglaNumber(114 - i);
        }
        return String.valueOf(114 - i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sura_list_row, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        myViewHolder.textView.setText(String.valueOf(i + 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public MyViewHolder(View view) {
            super(view);
            this.textView = (TextView) view.findViewById(R.id.textView);
        }
    }
}
