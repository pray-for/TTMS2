package com.example.zhangjiawen.ttms2.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zhangjiawen.ttms2.Entity.StudioEntity;
import com.example.zhangjiawen.ttms2.R;

/**
 * Created by zhangjiawen on 2018/6/11.
 */

public class StudioFragment extends Fragment {

    StudioEntity datas = new StudioEntity();

    RecyclerView list;
    RecyclerView.Adapter mAdapter = new RecyclerView.Adapter() {
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new H(LayoutInflater.from(parent.getContext()).inflate( R.layout.item_studio,parent, false));
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            H h = (H) holder;
            h.name.setText(datas.getDetail().get(position).getStudio_name());
            h.id.setText(datas.getDetail().get(position).getStudio_id());
            h.row.setText(datas.getDetail().get(position).getStudio_row_count() +"");
            h.colum.setText(datas.getDetail().get(position).getStudio_col_count()+"");
        }

        @Override
        public int getItemCount() {
            return datas.getDetail().size();
        }
    };

    class H extends RecyclerView.ViewHolder {

        TextView id,name,row,colum;

        public H(View itemView) {
            super(itemView);

            id = (TextView) itemView.findViewById(R.id.ID);
            name = (TextView) itemView.findViewById(R.id.name);
            row = (TextView) itemView.findViewById(R.id.row);
            colum = (TextView) itemView.findViewById(R.id.col);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_studio, container, false);

        list = (RecyclerView)view.findViewById(R.id.listView);
        list.setLayoutManager(new LinearLayoutManager(getContext()));
        list.setAdapter(mAdapter);

        init();
        return view;
    }

    private void init(){
        StudioEntity.MDetail d = new StudioEntity.MDetail();
        d.setStudio_name("一号演出厅");
        d.setStudio_id("1");
        d.setStudio_row_count(8);
        d.setStudio_col_count(10);
        StudioEntity.MDetail d1 = new StudioEntity.MDetail();
        d.setStudio_name("三号演出厅");
        d.setStudio_id("3");
        d.setStudio_row_count(10);
        d.setStudio_col_count(12);
        datas.getDetail().add(d);
        datas.getDetail().add(d1);
        mAdapter.notifyDataSetChanged();
//        mAdapter.notifyItemRangeInserted(0 , datas.getDetail().size());
        Log.d("**************" , datas.getDetail().size()+"");
    }

}
