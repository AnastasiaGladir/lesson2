package ru.mirea.gladirap.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Second_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            String data  = bundle.getString("key");
            Log.d(Second_activity.class.getSimpleName().toString(),data);
            TextView tv = findViewById(R.id.textView);
            tv.setText(data);
        }

    }

}