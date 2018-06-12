package com.example.zhangjiawen.ttms2.Entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhangjiawen on 2018/6/6.
 */

public class PlayEntity {

    private boolean Result;
    private List<MDetail> Detail;

    public boolean isResult() {
        return Result;
    }

    public void setResult(boolean result) {
        Result = result;
    }

    public List<PlayEntity.MDetail> getDetail() {
        return Detail;
    }

    public void setDetail(List<PlayEntity.MDetail> detail) {
        Detail = detail;
    }

    public static class MDetail implements Serializable {
        private String play_start;
        private String play_end;
        private String  studio_id;
        private String film_id;
        private String film_name;
        private String play_id;
        private String studio_name;

        public String getStudio_name() {
            return studio_name;
        }

        public void setStudio_name(String studio_name) {
            this.studio_name = studio_name;
        }

        public String getPlay_id() {
            return play_id;
        }

        public void setPlay_id(String play_id) {
            this.play_id = play_id;
        }

        public String getPlay_start() {
            return play_start;
        }

        public void setPlay_start(String play_start) {
            this.play_start = play_start;
        }

        public String getPlay_end() {
            return play_end;
        }

        public void setPlay_end(String play_end) {
            this.play_end = play_end;
        }

        public String getStudio_id() {
            return studio_id;
        }

        public String getFilm_id() {
            return film_id;
        }

        public void setStudio_id(String studio_id) {
            this.studio_id = studio_id;
        }

        public void setFilm_id(String film_id) {
            this.film_id = film_id;
        }

        public String getFilm_name() {
            return film_name;
        }

        public void setFilm_name(String film_name) {
            this.film_name = film_name;
        }
    }
}
