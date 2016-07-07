package com.example.user.testdb;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<CardsModel> mCardsModelList;

    public RecyclerAdapter(List<CardsModel> mCardsModelList) {
        this.mCardsModelList = mCardsModelList;
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view, parent, false);

        return new ViewHolder(view);
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        //CardView mCardView;
        TextView mIDTitle;
        TextView mTitle;
        TextView mBody;
        TextView mCreateDate;
        TextView mStartDate;
        TextView mDeadline;
        TextView mLikes;


        private ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            //mCardView = (CardView) itemLayoutView.findViewById(R.id.card_view);
            mIDTitle = (TextView) itemLayoutView.findViewById(R.id.id_title);
            mTitle = (TextView) itemLayoutView.findViewById(R.id.title);
            mBody = (TextView) itemLayoutView.findViewById(R.id.body);
            mCreateDate = (TextView) itemLayoutView.findViewById(R.id.create_date);
            mStartDate = (TextView) itemLayoutView.findViewById(R.id.start_date);
            mDeadline = (TextView) itemLayoutView.findViewById(R.id.deadline);
            mLikes = (TextView) itemLayoutView.findViewById(R.id.likes);
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mIDTitle.setText(mCardsModelList.get(position).getIdTitle());
        holder.mTitle.setText(mCardsModelList.get(position).getTitle());
        holder.mBody.setText(mCardsModelList.get(position).getBody());
        holder.mCreateDate.setText(mCardsModelList.get(position).getCreateDate());
        holder.mStartDate.setText(mCardsModelList.get(position).getStartDate());
        holder.mDeadline.setText(mCardsModelList.get(position).getDeadline());
        holder.mLikes.setText(mCardsModelList.get(position).getLikes());
    }


    @Override
    public int getItemCount() {
        return mCardsModelList.size();
    }
}
