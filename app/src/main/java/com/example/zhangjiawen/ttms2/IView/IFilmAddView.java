package com.example.zhangjiawen.ttms2.IView;

import android.net.Uri;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.File;

/**
 * Created by zhangjiawen on 2018/6/6.
 */

public interface IFilmAddView extends BaseView {
    void setFile(File file);
    void setSelect_album();
    void setImageView(Uri uri);
    void backFragment();
    void getModifyData();
    boolean isEmpty(EditText editText);
    boolean isChoiceImage(ImageView imageView);



}
