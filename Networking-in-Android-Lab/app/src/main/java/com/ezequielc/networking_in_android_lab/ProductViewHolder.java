package com.ezequielc.networking_in_android_lab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by student on 11/17/16.
 */

public class ProductViewHolder extends RecyclerView.ViewHolder {
    public TextView mProducts;

    public ProductViewHolder(View itemView) {
        super(itemView);

        mProducts = (TextView) itemView.findViewById(R.id.product_list);
    }
}
