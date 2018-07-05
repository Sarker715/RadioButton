package com.sakiboolean.radiobuttondemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoOtherActivity(android.view.View view) {

        Intent k = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(k);
    }

    public void onRadioButtonClick(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        //check which radio button was clicked

        switch (view.getId()) {

            case R.id.radioButton1:
                if (checked)
                    //str='Lenovo"
                    Toast.makeText(MainActivity.this, "Lenovo Choosed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton2:
                if (checked)
                    //str='HP"
                    Toast.makeText(MainActivity.this, "HP Choosed", Toast.LENGTH_SHORT).show();
                break;

            case R.id.radioButton3:
                if (checked)
                    //str='Asus"
                    Toast.makeText(MainActivity.this, "Asus Choosed", Toast.LENGTH_SHORT).show();
                break;
        }
    }


}
