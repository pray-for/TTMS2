package com.example.zhangjiawen.ttms2.IView;

import com.example.zhangjiawen.ttms2.Entity.StudioEntity;

import java.util.List;

/**
 * Created by zhangjiawen on 2018/6/6.
 */

public interface IStudioView extends BaseView {
    void setListView(List<StudioEntity.MDetail> list);
}