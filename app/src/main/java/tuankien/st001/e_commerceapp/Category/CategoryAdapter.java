package tuankien.st001.e_commerceapp.Category;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import tuankien.st001.e_commerceapp.Category.Category;
import tuankien.st001.e_commerceapp.R;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    private Context context;
    ArrayList<Category> categorys;

    public CategoryAdapter(Context context) {
        this.context = context;
    }
    public void setData(ArrayList<Category> data) {
        this.categorys = data ;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Category category = categorys.get(position);
        if (category == null) {
            return;
        }

        holder.iv_card.setImageResource(category.getImg_id());
        holder.tv_card.setText(category.getCategory_name());
    }

    @Override
    public int getItemCount() {
        if(categorys != null) {
            return categorys.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView iv_card ;
        TextView tv_card;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_card = itemView.findViewById(R.id.iv_card);
            tv_card = itemView.findViewById(R.id.tv_card);
        }
    }
}
