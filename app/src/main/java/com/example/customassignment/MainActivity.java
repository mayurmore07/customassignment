package com.example.customassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edittxt;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraintlayout);

        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new btn1ClickListener());

    }

    class btn1ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Dialog dialog = new Dialog(MainActivity.this);
            dialog.setContentView(R.layout.activity);
            dialog.show();
        }
    }

}