package com.example.noealcantar.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void btnFrameLayoutOnClick(View v){

        Intent intent;

        System.out.println(v.getId());

        switch (v.getId()){
            case R.id.btnFrameLayout:
                intent = new Intent(this, EjemploFrameLayout.class);
                break;

            case R.id.btnLinearLayout1:
                intent = new Intent(this, EjemploLinearLayout1.class);
                break;

            case R.id.btnLinearLayout2:
                intent = new Intent(this, EjemploLinearLayout2.class);
                break;

            case R.id.btnRelativeLayout:
                intent = new Intent(this, EjemploRelativeLayout.class);
                break;

            case R.id.btnTableLayout:
                intent = new Intent(this, EjemploTableLayout.class);
                break;

            case R.id.btnGridLayout:
                intent = new Intent(this, EjemploGridLayout.class);
                break;

            default:
                intent = new Intent(this, MainActivity.class);
                break;
        }

        startActivity(intent);

    }
}
