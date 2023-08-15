package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    ProgressBar pb;
    Switch sw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pb = findViewById(R.id.pb);
        sw = findViewById(R.id.sw);

sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                  @Override
                                  public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                      if (isChecked){
pb.setVisibility(View.INVISIBLE);
                                      }else{
                                          pb.setVisibility(View.GONE);
                                      }
                                  }


        });



    }
}