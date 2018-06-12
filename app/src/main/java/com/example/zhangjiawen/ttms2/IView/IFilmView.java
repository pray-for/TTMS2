package com.example.zhangjiawen.ttms2.IView;

import com.example.zhangjiawen.ttms2.Entity.FilmEntity;

import java.util.List;

/**
 * Created by zhangjiawen on 2018/6/6.
 */

public interface IFilmView  extends BaseView{
    void initListView(List<FilmEntity.MDetail> mFilmEntityList);
    void refreshView();
    void refreshListView(List<FilmEntity.MDetail>  mDetails);

}
