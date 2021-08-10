package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.adapter.ServiceAdapter;
import com.example.myapplication.models.Service;

import java.util.ArrayList;
import java.util.List;

public class activity_service extends menu_onclick {

    RecyclerView serviceRecycler;
    ServiceAdapter serviceAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        List<Service> serviceList = new ArrayList<>();
        serviceList.add(new Service(1, "Получение обходного листа", "",0,"https://bps.atu.kz/getBPS.html"));
        serviceList.add(new Service(2, "Заявление на присуждение гранта", "",0,"https://bps.atu.kz/getBPS.html"));
        serviceList.add(new Service(3, "Заявление о заселении в общежитие", "",0,"https://bps.atu.kz/getBPS.html"));
        
        setServiceRecycler(serviceList);
    }

    private void setServiceRecycler(List<Service> serviceList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        serviceRecycler = findViewById(R.id.serviceRecycler);
        serviceRecycler.setLayoutManager(layoutManager);

        serviceAdapter = new ServiceAdapter(this, serviceList);
        serviceRecycler.setAdapter(serviceAdapter);

    }
}