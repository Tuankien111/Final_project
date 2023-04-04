package tuankien.st001.e_commerceapp.Product;

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
import tuankien.st001.e_commerceapp.Category.CategoryAdapter;
import tuankien.st001.e_commerceapp.R;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>  {
    private Context context;
    ArrayList<Product> products;

    public ProductAdapter(Context context) {
        this.context = context;
    }
    public void setData(ArrayList<Product> products) {
        this.products = products;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_item,parent,false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = products.get(position);
        if (product == null) {
            return;
        }

        holder.img.setImageResource(product.getProduct_img());
        holder.name.setText(product.getProduct_name());

    }

    @Override
    public int getItemCount() {
        if(products != null) {
            return products.size();
        }
        return 0;
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private ImageView img;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.tv_product);
            img= itemView.findViewById(R.id.iv_product);
        }
    }
}
