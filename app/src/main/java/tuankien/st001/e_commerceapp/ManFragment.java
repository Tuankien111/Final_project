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

import java.util.ArrayList;

import tuankien.st001.e_commerceapp.Product.ManAdapter;
import tuankien.st001.e_commerceapp.Product.Product;
import tuankien.st001.e_commerceapp.Product.ProductAdapter;

public class ManFragment extends Fragment {

    private RecyclerView rv_man;
    private ManAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_man, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv_man = view.findViewById(R.id.rv_manproduct);
        adapter = new ManAdapter(getActivity().getBaseContext());

        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getActivity().getBaseContext(),RecyclerView.HORIZONTAL,false);
        rv_man.setLayoutManager(linearLayoutManager1);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(R.drawable.pro_1,"Áo"));
        products.add(new Product(R.drawable.pro_2,"Áo"));
        products.add(new Product(R.drawable.pro_3,"Áo"));
        products.add(new Product(R.drawable.pro_4,"Áo"));
        products.add(new Product(R.drawable.pro_5,"Áo"));
        products.add(new Product(R.drawable.pro_6,"Áo"));

        adapter.setData(products);

        rv_man.setAdapter(adapter);
    }
}