package com.example.gridview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    String [] list={"Dhaka","Khulna","Rajshahi","Sylet","Rangpur"};
    String [] images={"R.drawable."};
    Integer [] image={R.drawable.pic2,R.drawable.img2,R.drawable.img3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        gridView=findViewById(R.id.mygrid);
//        ArrayAdapter adapter=new ArrayAdapter<>(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item,list);
//        ArrayAdapter adapter=new ArrayAdapter<>(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item,image);
        gridView.setAdapter(new ImageAd);
    }
}