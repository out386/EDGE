package com.edge.starringharsh.EDGE.adapter;

import android.app.Activity;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.edge.starringharsh.EDGE.R;
import com.edge.starringharsh.EDGE.model.SnakesElement;
import com.edge.starringharsh.EDGE.utils.SquareLinearLayout;

import java.util.List;

/**
 * Created by user2 on 28-08-2017.
 */

public class SnakesElementAdapter extends RecyclerView.Adapter<SnakesElementAdapter.MyViewHolder> {

    private List<SnakesElement> snakesElementList;
    private Activity activity;

    public SnakesElementAdapter(Activity activity, List<SnakesElement> snakesElementList) {
        this.activity = activity;
        this.snakesElementList = snakesElementList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.snake_element, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        SnakesElement snakesElement = snakesElementList.get(position);
        if (snakesElement.property==0) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                holder.llElement.setBackgroundColor(activity.getResources().getColor(R.color.elementBackground, null));
            } else {
                holder.llElement.setBackgroundColor(activity.getResources().getColor(R.color.elementBackground));
            }
        }
        else if (snakesElement.property==1){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                holder.llElement.setBackground(activity.getResources().getDrawable(R.drawable.body, null));
            } else {
                holder.llElement.setBackground(activity.getResources().getDrawable(R.drawable.body));
            }
        }
        else if (snakesElement.property==2){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                holder.llElement.setBackground(activity.getResources().getDrawable(R.drawable.coin, null));
            } else {
                holder.llElement.setBackground(activity.getResources().getDrawable(R.drawable.coin));
            }

            holder.llElement.animate()
                    .rotationY(0)
                    .rotationYBy(359)
                    .setDuration(400)
                    .start();

        }
    }


    @Override
    public int getItemCount() {
        return snakesElementList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        SquareLinearLayout llElement;
        MyViewHolder(View view){
            super(view);
            llElement = (SquareLinearLayout) view.findViewById(R.id.llElement);
        }

    }
}
