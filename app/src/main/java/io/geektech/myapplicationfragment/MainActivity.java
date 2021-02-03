package io.geektech.myapplicationfragment;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements IFragments {
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.fragment_first, new ChangeFragment());
        transaction.commit();
    }

    @Override
    public void displayDetails(String title, String subTitle, int imageView) {
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            fragmentManager = getSupportFragmentManager();
            transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.fragment_second, TExtFragment.newInstance(title, subTitle, imageView));
            transaction.commit();

        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("key", title);
            intent.putExtra("keyDesc", subTitle);
            intent.putExtra("keyImage", imageView);
            startActivity(intent);
        }
    }
}