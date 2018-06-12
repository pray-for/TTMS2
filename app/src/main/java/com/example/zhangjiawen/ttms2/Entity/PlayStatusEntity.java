package com.example.zhangjiawen.ttms2.Entity;

/**
 * Created by zhangjiawen on 2018/6/6.
 */

public class PlayStatusEntity {

    private boolean Result;
    private MDetail  Detail;


    public  class MDetail {

        private int status;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }

    public MDetail getDetail() {
        return Detail;
    }

    public void setDetail(MDetail detail) {
        Detail = detail;
    }

    public boolean isResult() {
        return Result;
    }

    public void setResult(boolean result) {
        Result = result;
    }
}
