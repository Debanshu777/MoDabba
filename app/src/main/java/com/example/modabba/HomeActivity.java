package com.example.modabba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class HomeActivity extends AppCompatActivity {

    CardView card;
    ViewFlipper flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        card= findViewById(R.id.card);
        card.setBackgroundResource(R.drawable.cardcorner);
        int images[]={R.drawable.food1,R.drawable.food2,R.drawable.food3};
        flipper=findViewById(R.id.flipper);
        for (int image:images)
        {
            flipperImage(image);
        }
    }
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
