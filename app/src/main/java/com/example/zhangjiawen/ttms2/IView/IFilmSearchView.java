package com.example.zhangjiawen.ttms2.IView;

import com.example.zhangjiawen.ttms2.Entity.FilmEntity;

import java.util.List;

/**
 * Created by zhangjiawen on 2018/6/6.
 */

public interface IFilmSearchView extends BaseView {
    void initSearchView();
    void updateView(List<FilmEntity.MDetail> details);
}