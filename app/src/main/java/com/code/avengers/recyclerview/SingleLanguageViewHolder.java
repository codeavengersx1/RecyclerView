package com.code.avengers.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SingleLanguageViewHolder extends RecyclerView.ViewHolder
{
    @BindView(R.id.txt_lang_title_single_language_view)
    TextView txtLanguageName;

    @BindView(R.id.img_check_single_language_view)
    ImageView imgCheck;

    /* Define Other Views Here */

    /*
    * Constructor
    * */
    public SingleLanguageViewHolder(@NonNull View itemView)
    {
        super(itemView);

        /*
        * ButterKnife in ViewHolder
        * */
        ButterKnife.bind(this, itemView);
    }
}
