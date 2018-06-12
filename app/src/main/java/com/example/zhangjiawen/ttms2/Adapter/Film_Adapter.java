package com.example.zhangjiawen.ttms2.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zhangjiawen.ttms2.Entity.FilmEntity;
import com.example.zhangjiawen.ttms2.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangjiawen on 2018/6/6.
 */

public class Film_Adapter extends BaseAdapter {
    private static Context mContext;
    public static List<FilmEntity.MDetail> mMDetails;
    private LayoutInflater mLayoutInflater;
    public static List<Integer> sIntegers=new ArrayList<>();
    MyViewHolder mViewHolder=null;
    public Film_Adapter(Context context,List<FilmEntity.MDetail> mDetails) {
        this.mContext=context;
        this.mMDetails=mDetails;
        mLayoutInflater=LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return mMDetails.size();
    }

    @Override
    public Object getItem(int position) {
        return mMDetails.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            mViewHolder=new MyViewHolder();
            convertView=mLayoutInflater.inflate(R.layout.item_film,null);
            mViewHolder.mName=(TextView)convertView.findViewById(R.id.name);
            mViewHolder.mTostar=(TextView)convertView.findViewById(R.id.tostar);
            mViewHolder.mId=(TextView)convertView.findViewById(R.id.film_id);
            mViewHolder.mType=(TextView)convertView.findViewById(R.id.type);
            mViewHolder.mHour=(TextView)convertView.findViewById(R.id.hourlong);
            mViewHolder.mImageView=(ImageView)convertView.findViewById(R.id.image);
            mViewHolder.mCheckBox=(CheckBox)convertView.findViewById(R.id.checkbox);
            convertView.setTag(mViewHolder);
        }else {
            mViewHolder=(MyViewHolder) convertView.getTag();
        }
        mViewHolder.mName.setText(mMDetails.get(position).getFilm_name());
        mViewHolder.mTostar.setText(mMDetails.get(position).getFilm_tostar());
        mViewHolder.mId.setText(String.valueOf(mMDetails.get(position).getFilm_id()));
        mViewHolder.mType.setText(mMDetails.get(position).getFilm_type());
        mViewHolder.mHour.setText(String.valueOf(mMDetails.get(position).getFilm_hourlong()));
        if(mMDetails.get(position).getFilm_img()!=null){
            //mViewHolder.mImageView.setImageResource(R.mipmap.icon_loading);
            loadImage(mMDetails.get(position).getFilm_img());
        }
        mViewHolder.mCheckBox.setChecked(false);
        mViewHolder.mCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    sIntegers.add(position);
                }else{
                    sIntegers.remove(Integer.valueOf(position));
                }
            }
        });
        return convertView;
    }
    private  class  MyViewHolder{
        public TextView mName;
        public TextView mTostar;
        public TextView mType;
        public TextView mHour;
        public TextView mId;
        public ImageView mImageView;
        public CheckBox mCheckBox;

    }
    private  void loadImage(String path){
        Picasso.with(mContext).invalidate(path);
        Picasso.with(mContext)
                .load(path)
                .placeholder(R.mipmap.icon_loading)
                .error(R.mipmap.icon_error)
                .into(mViewHolder.mImageView);


    }
}

