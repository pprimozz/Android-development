package com.example.aplikacija1;

import java.util.ArrayList;

import com.example.aplikacija1.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

	public class mainwindow extends Activity{
		
		Button getUrl, settingss, testt;		// MAIN ACTIVITY
		EditText edt_enterUrl;
		CheckBox chk1;
		RadioButton radio_btn1, radio_btn2;
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        getUrl = (Button) findViewById(R.id.btn_getWeb); 
        settingss = (Button) findViewById(R.id.btn_settings); 
        
        
        
        
        getUrl.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent openStartingPoint = new Intent("com.example.aplikacija1.showpage");
				startActivity(openStartingPoint);
			}
        });
        
        settingss.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent openStaringPoint2 = new Intent("com.example.aplikacija1.settings");
				startActivity(openStaringPoint2);
			}
		});
       
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
