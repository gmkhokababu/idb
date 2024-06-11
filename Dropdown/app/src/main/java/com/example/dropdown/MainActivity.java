package com.example.dropdown;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner;
    Button button;
    TextView textView;
    TextView textView2;
    TextView textView3;

    int result=0;
    int num1;
    int num2;
    String [] dropdownList ={"add","sub","mul","div"};
    String selctedItem;
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
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        num1=Integer.parseInt(textView.getText().toString());
        num2=Integer.parseInt(textView2.getText().toString());
        spinner=findViewById(R.id.spinner);
        button=findViewById(R.id.button);
        ArrayAdapter arrayAdapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,dropdownList);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(this);
//        button.setOnClickListener((View.OnClickListener) this);



    }
    public void show(View v){
//        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
        if (selctedItem=="add"){
            result=num1+num2;
            textView3.setText(String.valueOf(result));
        }else if (selctedItem=="sub"){
//            Toast.makeText(getApplicationContext(), "Bangladesh", Toast.LENGTH_LONG).show();
            result=num1-num2;
            textView3.setText(String.valueOf(result));
        }else if (selctedItem=="mul"){
//            Toast.makeText(getApplicationContext(), "Canada", Toast.LENGTH_LONG).show();
            result=num1*num2;
            textView3.setText(String.valueOf(result));
        }else if (selctedItem=="div"){
            result=num1/num2;
            textView3.setText(String.valueOf(result));
//            Toast.makeText(getApplicationContext(), "Canada", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        selctedItem=dropdownList[position];
//        if (dropdownList[position]=="A"){
//            Toast.makeText(getApplicationContext(), "America", Toast.LENGTH_LONG).show();
//        }else if (dropdownList[position]=="B"){
//            Toast.makeText(getApplicationContext(), "Bangladesh", Toast.LENGTH_LONG).show();
//        }else if (dropdownList[position]=="C"){
//            Toast.makeText(getApplicationContext(), "Canada", Toast.LENGTH_LONG).show();
//        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    
}