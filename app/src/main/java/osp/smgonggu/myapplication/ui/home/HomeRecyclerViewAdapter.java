package osp.smgonggu.myapplication.ui.home;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import osp.smgonggu.myapplication.ItemDetailActivity;
import osp.smgonggu.myapplication.databinding.FragmentItemBinding;
import osp.smgonggu.myapplication.ui.home.placeholder.PlaceholderContent.PlaceholderItem;


import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class HomeRecyclerViewAdapter extends RecyclerView.Adapter<HomeRecyclerViewAdapter.ViewHolder> {

    private final List<PlaceholderItem> mValues;

    public HomeRecyclerViewAdapter(List<PlaceholderItem> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mIdView.setText("아이템");
        holder.mContentView.setText("아이템 정보");
        holder.mPrice.setText("가격: 3000won");
        holder.mLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ItemDetailActivity.class);
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mIdView;
        public final LinearLayout mLinearLayout;
        public final TextView mContentView;
        public final TextView mPrice;
        public final ImageView mImageView;
        public PlaceholderItem mItem;

        public ViewHolder(FragmentItemBinding binding) {
            super(binding.getRoot());
            mIdView = binding.itemTitle;
            mPrice = binding.itemPrice;
            mContentView = binding.itemCategory;
            mImageView = binding.itemImage;
            mLinearLayout = binding.book;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}