package com.android.ika.pratiwiikakartika_1202154314_modul2;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

    }

    public void pilih(View view) {
        Intent intent = new Intent(this, com.android.ika.pratiwiikakartika_1202154314_modul2.Menu.class);
        startActivity(intent);
    }


    public void showTimePickerDialog(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.time));
    }

    public void showDatePickerDialog(View view) {

        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.date));

    }

}

