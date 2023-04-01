package ru.mirea.gladirap.dialog;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import ru.mirea.gladirap.multiactivity.MyDateDialogFragment;
import ru.mirea.gladirap.multiactivity.MyDialogFragment;
import ru.mirea.gladirap.multiactivity.R;


public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener, DatePickerDialog.OnDateSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDialog( View view){
       MyDialogFragment dialogFragment =  new MyDialogFragment();
       dialogFragment.show(getSupportFragmentManager(), "mirea");
    }
    public void onOkClicked(){
        Toast.makeText( getApplicationContext(), "Вы выбрали кнопку\"Иду дальше\"!", Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked(){
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку\"Нет\"!", Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked(){
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку\"На паузе\"!", Toast.LENGTH_LONG).show();
    }
    public void onClickShowTimeDialog(View view) {
        MyTimeDialogFragment timePicker = new MyTimeDialogFragment();
        timePicker.show(getSupportFragmentManager(), "time");
    }

    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        TextView textView = (TextView) findViewById(R.id.editTextTextTime);
        textView.setText( "Time:  "+hourOfDay + ":" + minute);
    }
    public void onClickShowDateDialog(View view) {
        MyDateDialogFragment myDateDialogFragment = new MyDateDialogFragment();
        myDateDialogFragment.show(getSupportFragmentManager(), "date");
    }

    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        TextView textView = (TextView) findViewById(R.id.editTextDate);
        textView.setText( "Date:  "+dayOfMonth + "." + (month+1)+ "."+ year);
    }

    public void onClickShowProgress(View view){
        MyProgressDialogFragment progressDialogFragment = new MyProgressDialogFragment();
        progressDialogFragment.show(getSupportFragmentManager(), "progress");
    }
}