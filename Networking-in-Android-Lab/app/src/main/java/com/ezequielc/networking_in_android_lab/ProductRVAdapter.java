package com.ezequielc.networking_in_android_lab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by student on 11/17/16.
 */

public class ProductRVAdapter extends RecyclerView.Adapter<ProductViewHolder> {
    private List<Products> mProductsList;

    public ProductRVAdapter(List<Products> productsList) {
        mProductsList = productsList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ProductViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_list_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        holder.mProducts.setText(mProductsList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mProductsList.size();
    }
}
