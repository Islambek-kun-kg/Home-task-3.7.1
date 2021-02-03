package io.geektech.myapplicationfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class TExtFragment extends Fragment {
    private static final String KEY1 = "key1";
    private static final String KEY2 = "key2";
    private static final String KEY3 = "key3";
    private String txt;
    private String txtSub;
    private int img;
    private TextView tExtView, txtSubTitle;
    private ImageView imageView;

    public TExtFragment() {
    }

    public static TExtFragment newInstance(String param1, String param2, int param3) {
        TExtFragment fragment = new TExtFragment();
        Bundle args = new Bundle();
        args.putString(KEY1, param1);
        args.putString(KEY2, param2);
        args.putInt(KEY3, param3);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            txt = getArguments().getString(KEY1);
            txtSub = getArguments().getString(KEY2);
            img = getArguments().getInt(KEY3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_t_ext, container, false);
        tExtView = view.findViewById(R.id.txtView);
        txtSubTitle = view.findViewById(R.id.txtSubTitle);
        imageView = view.findViewById(R.id.imageView);
        tExtView.setText(txt);
        txtSubTitle.setText(txtSub);
        imageView.setImageResource(img);
        return view;
    }

    public void showText(String title, String subTitle, int imageView) {
        tExtView.setText(title);
        txtSubTitle.setText(subTitle);
        this.imageView.setImageResource(imageView);
    }
}