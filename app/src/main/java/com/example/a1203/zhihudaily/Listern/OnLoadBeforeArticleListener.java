package com.example.a1203.zhihudaily.Listern;

import com.example.a1203.zhihudaily.Bean.ArticleBefore;
import com.example.a1203.zhihudaily.Bean.ArticleLatest;

/**
 * @author littlecorgi
 * @Date 2018-11-07 19:57
 * @email a1203991686@126.com
 */
public interface OnLoadBeforeArticleListener {

    void   onSuccess(ArticleBefore articleBefore);

    void onFailure();
}
