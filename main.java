package com.example.myexpintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void googlepage(View view) {
        Uri u = Uri.parse("https://github.com");
        Intent i = new Intent(Intent.ACTION_VIEW, u);
        startActivity(i);
    }

    public void dailpage(View view) {
        Uri u = Uri.parse("tel:123456789");
        Intent i1 = new Intent(Intent.ACTION_DIAL, u);
        startActivity(i1);
    }


    public void campage(View view) {
        Intent i2 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(i2);
    }
}
