package com.example.modabba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.modabba.fragments.HomeFragment;
import com.example.modabba.fragments.ProfileFragment;
import com.example.modabba.fragments.SubscriptionFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    CardView card;
    ViewFlipper flipper;
    ImageButton back,drop;
    Fragment selctedfragment=null;
    BottomNavigationView bottom_nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        card= findViewById(R.id.card);
        card.setBackgroundResource(R.drawable.cardcorner);
        int images[]={R.drawable.food1,R.drawable.food2,R.drawable.food3};
        flipper=findViewById(R.id.flipper);
        bottom_nav=findViewById(R.id.bottom_nav);
        bottom_nav.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
        back=findViewById(R.id.back);
        drop=findViewById(R.id.drop);
        drop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MapActivity.class));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
        for (int image:images)
        {
            flipperImage(image);
        }
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener=
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    switch (menuItem.getItemId())
                    {
                        case R.id.home:
                            selctedfragment=new HomeFragment();
                            break;

                        case R.id.subscribe:
                            selctedfragment=new SubscriptionFragment();
                            break;

                        case R.id.profile:
                                    selctedfragment=new ProfileFragment();
                            break;
                    }
                    if(selctedfragment!=null)
                    {
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selctedfragment).commit();
                    }
                    return true;
                }
            };

    public void flipperImage(int image)
    {
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);
        flipper.addView(imageView);
        flipper.setFlipInterval(2000);
        /*MotionEvent event = ;
        flipper.onHoverEvent(event);*/
        flipper.setAutoStart(true);
        flipper.setInAnimation(this,android.R.anim.slide_in_left);
        flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}
