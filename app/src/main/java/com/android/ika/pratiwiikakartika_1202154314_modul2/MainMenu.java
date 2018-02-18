package com.android.ika.pratiwiikakartika_1202154314_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Toast.makeText(getApplicationContext(),"Pratiwi Ika Kartika_1202154314",Toast.LENGTH_LONG).show();
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.takeaway:
                if (checked)
                    displayToast(getString(R.string.take_away));
                break;
            case R.id.dinein:
                if (checked)
                    displayToast(getString(R.string.dine_in));
                break;
        }
    }

    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message , Toast.LENGTH_SHORT).show();
    }

    public void pesan(View view) {
        if (((RadioButton)findViewById(R.id.dinein)).isChecked()){
            Intent intent = new Intent(this, DineIn.class);
            startActivity(intent); //radio button untuk Dine In
        }else if (((RadioButton)findViewById(R.id.takeaway)).isChecked()){
            Intent intent = new Intent(this, TakeAway.class);
            startActivity(intent); //radio button untuk Take away
        }else{
            Toast.makeText(this,"Pilih salah satu terlebih dahulu",Toast.LENGTH_SHORT).show();
        }

    }

    public void processDatePickerResult(int year, int month, int day) {
        // The month integer returned by the date picker starts counting at 0
        // for January, so you need to add 1 to show months starting at 1.
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        // Assign the concatenated strings to dateMessage.
        String dateMessage = (month_string + "/" + day_string + "/" + year_string);
        Toast.makeText(this, getString(R.string.date) + dateMessage, Toast.LENGTH_SHORT).show();
    }

    public void processTimePickerResult(int hourOfDay, int minute) {
        // Convert time elements into strings.
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);
        // Assign the concatenated strings to timeMessage.
        String timeMessage = (hour_string + ":" + minute_string);
        Toast.makeText(this, getString(R.string.time) + timeMessage, Toast.LENGTH_SHORT).show();
    }
}

