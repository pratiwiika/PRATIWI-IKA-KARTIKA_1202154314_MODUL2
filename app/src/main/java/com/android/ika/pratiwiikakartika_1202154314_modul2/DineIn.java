package com.android.ika.pratiwiikakartika_1202154314_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

    }

    public void pilih(View view) {
        EditText editText = (EditText) findViewById(R.id.editText6);
        if (editText!= null){
            String showString = editText.getText().toString();
            Toast.makeText(this, showString,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, com.android.ika.pratiwiikakartika_1202154314_modul2.Menu.class);
            startActivity(intent);
        }
    }


}

