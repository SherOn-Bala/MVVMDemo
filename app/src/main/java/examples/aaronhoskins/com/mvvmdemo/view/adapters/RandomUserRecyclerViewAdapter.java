package examples.aaronhoskins.com.mvvmdemo.view.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import examples.aaronhoskins.com.mvvmdemo.R;
import examples.aaronhoskins.com.mvvmdemo.model.randomuser.Result;

public class RandomUserRecyclerViewAdapter extends RecyclerView.Adapter<RandomUserRecyclerViewAdapter.ViewHolder> {
    List<Result> resultList;

    public RandomUserRecyclerViewAdapter(List<Result> resultList) {
        this.resultList = resultList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(
                R.layout.user_item,
                parent,
                false
        ));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(resultList.get(position));
    }

    @Override
    public int getItemCount() {
        return resultList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvEmail;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvEmail = itemView.findViewById(R.id.tvEmail);
        }

        void bindData(Result result) {
            tvEmail.setText(result.getEmail());
        }
    }
}
