package com.android.ika.pratiwiikakartika_1202154314_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void food1 (View view) {
        Intent i = new Intent(Menu.this, DetailMenu.class);
        startActivity(i);
    }


    public void drink1 (View view) {
    }

    public void drink2 (View view) {
    }

    public void drink3 (View view) {
    }
}
