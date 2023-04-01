package ru.mirea.gladirap.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.icu.util.Output;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.editTextTextPersonName);
    }
    public void count (View view) {
        String str = text.getText().toString();
        int res = str.length();
        Toast toast = Toast.makeText(getApplicationContext(), "СТУДЕНТ №3 ГРУППА БСБО - 06 - 21 Количество символов -  " + res, Toast.LENGTH_LONG);
        toast.show();
    }


}