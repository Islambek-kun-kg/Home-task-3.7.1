package io.geektech.myapplicationfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChangeFragment extends Fragment implements IFragments {
    private ArrayList<MainModel> list;
    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;

    public ChangeFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_change, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        setupRecyclerView();
        return view;
    }

    private void setupRecyclerView() {
        list = new ArrayList<>();
        list.add(new MainModel("Hello Islam", "Привет Ислам", R.drawable.ic_launcher_background));
        list.add(new MainModel("Hello Aidar", "Привет Айдар", R.drawable.ic_launcher_foreground));
        list.add(new MainModel("Hello Alisa", "Привет Алиса", R.drawable.ic_launcher_background));
        list.add(new MainModel("Hello Aida", "Привет Аида", R.drawable.ic_launcher_foreground));
        list.add(new MainModel("Hello Altynai", "Привет Алтынай", R.drawable.ic_launcher_background));
        list.add(new MainModel("Hello Alina", "Привет Алина", R.drawable.ic_launcher_foreground));
        list.add(new MainModel("Hello Aikeldi", "Привет Айкелди", R.drawable.ic_launcher_background));
        list.add(new MainModel("Hello Aidin", "Привет Айдин", R.drawable.ic_launcher_foreground));
        list.add(new MainModel("Hello Nurumbet", "Привет Нурумбет", R.drawable.ic_launcher_background));
        list.add(new MainModel("Hello Nurbek", "Привет Нурбек", R.drawable.ic_launcher_foreground));
        list.add(new MainModel("Hello Rustam", "Привет Рустам", R.drawable.ic_launcher_background));
        list.add(new MainModel("Hello Meerim", "Привет Мээрим", R.drawable.ic_launcher_foreground));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new RecyclerAdapter(list, getActivity());
        adapter.setOnClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void displayDetails(String title, String subTitle, int imageView) {
        MainActivity activity = (MainActivity) getActivity();
        activity.displayDetails(title, subTitle, imageView);
    }
}