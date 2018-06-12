package com.example.zhangjiawen.ttms2.IView;

import android.widget.EditText;

/**
 * Created by zhangjiawen on 2018/6/6.
 */

public interface IStudioAddView extends BaseView {
    boolean isEmpty(EditText editText);
    void setSpinner();
    void setNetCompleted();
}
