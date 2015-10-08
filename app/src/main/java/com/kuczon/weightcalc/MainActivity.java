package com.kuczon.weightcalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;


public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addListenerOnButton() {

       Button radiogains =(Button) findViewById(R.id.buttongain);
    }

        @Override
        public void onClick (View v){

        }


    public void buttongain(View view) {
        Intent I = new Intent(this,WeightGain.class);
        startActivity(I);

    }

    public void buttonLoss(View view) {
        Intent I = new Intent(this,WeightLoss.class);
        startActivity(I);
    }
}
