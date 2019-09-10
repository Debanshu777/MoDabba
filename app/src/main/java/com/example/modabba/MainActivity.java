package com.example.modabba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import com.kofigyan.stateprogressbar.StateProgressBar;

public class MainActivity extends AppCompatActivity {

    CardView card;
    ViewFlipper flipper;
    ImageButton back;
    TabLayout tabLayout;
    MyAdapter adapter;
    ViewPager viewPager;
    BottomNavigationView bottom_nav;
    String[] descriptionData = {"Preparing", "On Way", "Delivered"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int images[] = {R.drawable.food1, R.drawable.food2, R.drawable.food3};
        StateProgressBar stateProgressBar = (StateProgressBar) findViewById(R.id.your_state_progress_bar_id);
        stateProgressBar.setStateDescriptionData(descriptionData);
        //flipper = findViewById(R.id.flipper);
        //back = findViewById(R.id.back);
       // for (int image : images) {
            //flipperImage(image);
        //}

    }

   /* public void flipperImage(int image)
    {
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);
        flipper.addView(imageView);
        flipper.setFlipInterval(2000);
        flipper.setAutoStart(true);
        flipper.setInAnimation(this,android.R.anim.slide_in_left);
        flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }*/
}
