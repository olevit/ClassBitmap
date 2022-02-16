package com.example.classbitmap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static com.example.classbitmap.R.drawable.ic_launcher_background;
import static com.example.classbitmap.R.drawable.leg;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imageView1);

        //BitmapDrawable bitmapDrawable = (BitmapDrawable) imageView.getDrawable();
        //Bitmap bitmap = bitmapDrawable.getBitmap();


        //imageView.setImageBitmap(bitmap);
    }


}