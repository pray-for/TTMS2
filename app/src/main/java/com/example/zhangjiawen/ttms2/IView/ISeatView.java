package com.example.zhangjiawen.ttms2.IView;

import com.example.zhangjiawen.ttms2.Entity.SeatAllStatusEntity;

/**
 * Created by zhangjiawen on 2018/6/6.
 */

public interface ISeatView  extends BaseView{
    void getIntentData();
    void initGridView();
    void initSeatView();
    void intoTicket();

    void  getSeatSold(String studio_id);

    void setSeatStatus(SeatAllStatusEntity seatAllStatusEntity);
    void startLoadView();
    void endLoadView();
}