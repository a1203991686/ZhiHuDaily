package com.example.a1203.zhihudaily.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.a1203.zhihudaily.Banner.Banner;
import com.example.a1203.zhihudaily.R;

/**
 * @author littlecorgi
 * @Date 2018-11-04 15:52
 * @email a1203991686@126.com
 */

public class ArticleListTopHolder extends RecyclerView.ViewHolder{

    public Banner banner;

    public ArticleListTopHolder(View itemView){
        super(itemView);
        banner = itemView.findViewById(R.id.banner);
    }
}
