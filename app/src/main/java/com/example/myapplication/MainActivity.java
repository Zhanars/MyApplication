package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton btnService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClickBtnService(View view){
        Intent intent = new Intent(view.getContext(), activity_service.class);
        startActivity(intent);
    }

    public void onClickBtnHome(View view){
        Intent intent = new Intent(view.getContext(), MainActivity.class);
        startActivity(intent);
    }

    public void onClickBtnDocument(View view){
        Intent intent = new Intent(view.getContext(), activity_document.class);
        startActivity(intent);
    }

    public void onClickBtnInfo(View view){
        Intent intent = new Intent(view.getContext(), activity_info.class);
        startActivity(intent);
    }

    public void onClickBtnProfile(View view){
        Intent intent = new Intent(view.getContext(), activity_profile.class);
        startActivity(intent);
    }

    public void onClickBtnNotification(View view){
        Intent intent = new Intent(view.getContext(), activity_notification.class);
        startActivity(intent);
    }

}