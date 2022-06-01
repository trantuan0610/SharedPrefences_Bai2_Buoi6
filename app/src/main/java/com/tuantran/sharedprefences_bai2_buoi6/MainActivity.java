package com.tuantran.sharedprefences_bai2_buoi6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.edt_data);
        TextView textView = findViewById(R.id.tv_read_data);
        Button luu = findViewById(R.id.btnLuu);
        Button doc = findViewById(R.id.btnDoc);


        luu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            DataLocalManager.setStringValue(editText.getText().toString());
                Toast.makeText(MainActivity.this, editText.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(DataLocalManager.getStringValue());
            }
        });

    }
}