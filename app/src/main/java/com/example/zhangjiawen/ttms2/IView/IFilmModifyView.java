package com.example.zhangjiawen.ttms2.IView;

import android.net.Uri;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.zhangjiawen.ttms2.Entity.PlayEntity;

import java.io.File;
import java.util.List;

/**
 * Created by zhangjiawen on 2018/6/6.
 */

public interface IFilmModifyView extends BaseView{
    void getIntentData() ;
    void setFile(File file);
    void setSelect_album();
    void setImageView(Uri uri);
    void backFragment();
    void getModifyData();
    boolean isEmpty(EditText editText);
    boolean isChoiceImage(ImageView imageView);

    void setRecyclerView(List<PlayEntity.MDetail> filmPlayEntities);
    void initRecyclerView();
    void initRecyclerViewData(String film_id);
    void refreshView();
    void startLoadView();
    void endLoadView();
}

