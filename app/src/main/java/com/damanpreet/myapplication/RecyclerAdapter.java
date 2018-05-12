package com.damanpreet.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends SectionedRecyclerViewAdapter<RecyclerView.ViewHolder> {

    private List<CheckoutHistory> checkoutHistories;

    private Context mContext;

    public RecyclerAdapter(List<CheckoutHistory> checkoutHistories, Context mContext) {
        this.checkoutHistories = checkoutHistories;
        this.mContext = mContext;
    }

    @Override
    public int getSectionCount() {
        return checkoutHistories.size();
    }

    @Override
    public int getItemCount(int section) {
        return checkoutHistories.get(section).getOrders().size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, boolean header) {
        if (header)

        {
            View view = LayoutInflater.from(mContext)
                    .inflate(R.layout.item_recycler_section, parent, false);
            return new SectionViewHolder(view);
        } else {
            View view = LayoutInflater.from(mContext)
                    .inflate(R.layout.item_recycler_list, parent, false);
            return new ViewHolder(view);
        }
    }

    @Override
    public void onBindHeaderViewHolder(RecyclerView.ViewHolder holder, int section) {

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int section, int relativePosition, int absolutePosition) {

    }

    // SectionViewHolder Class for Sections
    public static class SectionViewHolder extends RecyclerView.ViewHolder {


        final TextView txtHeader;

        public SectionViewHolder(View itemView) {
            super(itemView);

            txtHeader = (TextView) itemView.findViewById(R.id.txt_header);


        }
    }

    // ItemViewHolder Class for Items in each Section
    public static class ViewHolder extends RecyclerView.ViewHolder {

        final TextView itemTxtMessage;


        public ViewHolder(View itemView) {
            super(itemView);
            itemTxtMessage = (TextView) itemView.findViewById(R.id.item_txt_message);
        }
    }
}
