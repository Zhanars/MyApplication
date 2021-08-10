package com.example.myapplication;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.util.Pair;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class menu_onclick extends AppCompatActivity {

    public void onClickBtnHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickBtnService(View view){
        Intent intent = new Intent(this, activity_service.class);
        startActivity(intent);
    }

    public void onClickBtnDocument(View view){
        Intent intent = new Intent(this, activity_document.class);
        startActivity(intent);
    }

    public void onClickBtnInfo(View view){
        Intent intent = new Intent(this, activity_info.class);
        startActivity(intent);
    }

    public void onClickBtnNotification(View view){
        Intent intent = new Intent(this, activity_notification.class);
        startActivity(intent);
    }

    public void onClickBtnProfile(View view){
        Intent intent = new Intent(this, activity_profile.class);
        startActivity(intent);
    }
}
