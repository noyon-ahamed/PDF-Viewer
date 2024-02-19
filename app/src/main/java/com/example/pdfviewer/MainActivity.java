package com.example.pdfviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;

public class MainActivity extends AppCompatActivity {

    PDFView pdfView;
    LottieAnimationView mylottie;

    public static String asset="";


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       pdfView=findViewById(R.id.pdfView);
       mylottie=findViewById(R.id.mylottie);

       pdfView.setVisibility(View.INVISIBLE);
       mylottie.setVisibility(View.VISIBLE);

       pdfView.fromAsset(asset)
               .onLoad(new OnLoadCompleteListener() {
                   @Override
                   public void loadComplete(int nbPages) {
                       pdfView.setVisibility(View.VISIBLE);
                       mylottie.setVisibility(View.GONE);
                   }
               })
               .load();
    }
}