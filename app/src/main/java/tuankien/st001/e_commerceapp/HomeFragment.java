package tuankien.st001.e_commerceapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;

import java.util.ArrayList;

import tuankien.st001.e_commerceapp.Category.Category;
import tuankien.st001.e_commerceapp.Category.CategoryAdapter;
import tuankien.st001.e_commerceapp.Product.Product;
import tuankien.st001.e_commerceapp.Product.ProductAdapter;


public class HomeFragment extends Fragment {
    private ViewFlipper viewFlipper;
    private RecyclerView recyclerView1 , recyclerView2;
    private CategoryAdapter adapter1 ;
    private ProductAdapter adapter2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //==================== View Flipper
        viewFlipper = view.findViewById(R.id.viewflipper);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.setAutoStart(true);
        viewFlipper.startFlipping();

        //===================== Rv_category

        recyclerView1 = view.findViewById(R.id.rv_category);
        adapter1 = new CategoryAdapter(getActivity().getBaseContext());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity().getBaseContext(),RecyclerView.HORIZONTAL,false);
        recyclerView1.setLayoutManager(linearLayoutManager);

        ArrayList<Category> categorys = new ArrayList<>();
        categorys.add(new Category(R.drawable.cat_1,"Áo"));
        categorys.add(new Category(R.drawable.cat_2,"Áo"));
        categorys.add(new Category(R.drawable.cat_3,"Áo"));
        categorys.add(new Category(R.drawable.cat_4,"Áo"));
        categorys.add(new Category(R.drawable.cat_5,"Áo"));
        adapter1.setData(categorys);

        recyclerView1.setAdapter(adapter1);

        //===================== Rv_bestseller
        recyclerView2 = view.findViewById(R.id.rv_bestseller);
        adapter2 = new ProductAdapter(getActivity().getBaseContext());

        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getActivity().getBaseContext(),RecyclerView.HORIZONTAL,false);
        recyclerView2.setLayoutManager(linearLayoutManager1);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(R.drawable.pro_1,"Áo"));
        products.add(new Product(R.drawable.pro_2,"Áo"));
        products.add(new Product(R.drawable.pro_3,"Áo"));
        products.add(new Product(R.drawable.pro_4,"Áo"));
        products.add(new Product(R.drawable.pro_5,"Áo"));
        products.add(new Product(R.drawable.pro_6,"Áo"));

        adapter2.setData(products);

        recyclerView2.setAdapter(adapter2);

    }


}