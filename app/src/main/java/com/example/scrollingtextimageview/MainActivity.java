package com.example.scrollingtextimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG ="MainActivity" ;
    private boolean isVisible = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showHideImage(View view){
        Log.d(TAG,"inside showHideImage method");
        ImageView imageView = findViewById(R.id.image_hap);
        ImageView imageView2 = findViewById(R.id.image_hap1);

        if(isVisible){
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            Log.d(TAG, "hid the image");
        }else{
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.VISIBLE);
            Log.d(TAG, "image is visible");

        }

        isVisible =  !isVisible;
    }
}