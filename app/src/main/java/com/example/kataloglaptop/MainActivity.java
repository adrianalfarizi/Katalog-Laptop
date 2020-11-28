package com.example.kataloglaptop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnAsus,btnAcer,btnHP;
    public static final String SERIES_GALERI_KEY = "SERIES_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnAsus = findViewById(R.id.btn_buka_type_asus);
        btnAcer = findViewById(R.id.btn_buka_type_acer);
        btnHP= findViewById(R.id.btn_buka_type_HP);
        btnAsus.setOnClickListener(view -> bukaGaleri("Asus"));
        btnAcer.setOnClickListener(view -> bukaGaleri("Acer"));
        btnHP.setOnClickListener(view -> bukaGaleri("HP"));
    }

    private void bukaGaleri(String merkLaptop) {
        Log.d("MAIN","Buka activity Acer");
        Intent intent = new Intent(this,GaleryActivity.class);
        intent.putExtra(SERIES_GALERI_KEY, merkLaptop);
        startActivity(intent);
    }
}