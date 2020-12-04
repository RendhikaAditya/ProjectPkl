package com.example.projectpkl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class detail_phone extends AppCompatActivity {
ImageView dimage;
TextView dtipe, ram, internal, layar, batre, chip, kamera;
Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_phone);

        dimage = findViewById(R.id.dimg);
        dtipe = findViewById(R.id.dtipe);
        ram = findViewById(R.id.Ram);
        internal = findViewById(R.id.Internal);
        layar = findViewById(R.id.Display);
        batre = findViewById(R.id.Battery);
        chip = findViewById(R.id.Chips);
        kamera = findViewById(R.id.Kamera);

        intent = getIntent();
        dimage.setImageResource(intent.getIntExtra("IMAGE", 0));
        dtipe.setText(intent.getStringExtra("TIPE"));
        ram.setText(intent.getStringExtra("RAM"));
        internal.setText(intent.getStringExtra("INTERNAL"));
        layar.setText(intent.getStringExtra("LAYAR"));
        chip.setText(intent.getStringExtra("CHIP"));
        batre.setText(intent.getStringExtra("BATRE"));
        kamera.setText(intent.getStringExtra("KAMERA"));

    }



    public void back(View view) {
        Intent intent2 = new Intent(detail_phone.this, MainActivity.class);
        startActivity(intent2);
    }
}
