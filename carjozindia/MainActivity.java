package com.anveshthangalapalli.carjozindia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
private CheckedTextView food,sports,entertainment,retail,travel;
private TextView foodtv,traveltv,sportstv,entertainmenttv,retailtv;
private Button nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        food=findViewById(R.id.Foodctb);
        foodtv=findViewById(R.id.Foodtext);
        sports=findViewById(R.id.sportsctv);
        sportstv=findViewById(R.id.Sportstv);
        entertainment=findViewById(R.id.entertainmentctv);
        entertainmenttv=findViewById(R.id.entertaimentctv);
        retail=findViewById(R.id.Retailctc);
        retailtv=findViewById(R.id.textView11);
        travel=findViewById(R.id.travelctv);
        traveltv=findViewById(R.id.traveltxt);
        nextBtn=findViewById(R.id.button);


        food.setOnClickListener(new View.OnClickListener() {
            Drawable background= food.getBackground();
            @Override
            public void onClick(View view) {
            if(food.isChecked()){
                food.setChecked(false);
                foodtv.setTextColor(Color.BLACK);
            }
            else
            {
                food.setChecked(true);
                foodtv.setTextColor(Color.WHITE);
            }
            }
        });
        sports.setOnClickListener(new View.OnClickListener() {
            Drawable background= sports.getBackground();
            @Override
            public void onClick(View view) {
                if(sports.isChecked()){
                    sports.setChecked(false);
                    sportstv.setTextColor(Color.BLACK);
                }
                else
                {
                    sports.setChecked(true);
                    sportstv.setTextColor(Color.WHITE);
                }
            }
        });
        entertainment.setOnClickListener(new View.OnClickListener() {
            Drawable background= entertainment.getBackground();
            @Override
            public void onClick(View view) {
                if(entertainment.isChecked()){
                    entertainment.setChecked(false);
                    entertainmenttv.setTextColor(Color.BLACK);
                }
                else
                {
                    entertainment.setChecked(true);
                    entertainmenttv.setTextColor(Color.WHITE);
                }
            }
        });
        retail.setOnClickListener(new View.OnClickListener() {
            Drawable background= retail.getBackground();
            @Override
            public void onClick(View view) {
                if(retail.isChecked()){
                    retail.setChecked(false);
                    retailtv.setTextColor(Color.BLACK);
                }
                else
                {
                    retail.setChecked(true);
                    retailtv.setTextColor(Color.WHITE);
                }
            }
        });
        travel.setOnClickListener(new View.OnClickListener() {
            Drawable background= travel.getBackground();
            @Override
            public void onClick(View view) {
                if(travel.isChecked()){
                    travel.setChecked(false);
                    traveltv.setTextColor(Color.BLACK);
                }
                else
                {
                    travel.setChecked(true);
                    traveltv.setTextColor(Color.WHITE);
                }
            }
        });

    }
    public void openSecondActivity(View view){
        Intent intent = new Intent(this, Second.class);
        startActivity(intent);
    }
}