package com.example.aplikacija1;

import com.example.aplikacija1.R;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

@SuppressLint("NewApi") public class settings extends Activity {
	
	EditText edt_enterUrl;
	CheckBox chk1;
	RadioButton radio_btn1, radio_btn2;
	RadioGroup radioGrp;
	Button saveSett;
	public static String filename = "MySharedString";
	public SharedPreferences someData;
	
	
    @SuppressLint("NewApi") @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
       
         edt_enterUrl = (EditText) findViewById(R.id.editTxt_URL); 
         radio_btn1 = (RadioButton) findViewById(R.id.radio1); 
         radio_btn2 = (RadioButton) findViewById(R.id.radio2);
         radioGrp = (RadioGroup) findViewById(R.id.radioGroup1);
         chk1 = (CheckBox) findViewById(R.id.checkBox1);
         saveSett = (Button) findViewById(R.id.saveSettings);
         someData = getSharedPreferences(filename, 0);
         
         String urlAddress = someData.getString("url", "Error");
         String chkk = someData.getString("chk", "Error");
         String Rbtn = someData.getString("Rbtn", "Error");
         String url = urlAddress+"/?Chk="+chkk+"&R="+Rbtn;
         
         int rrbtn = Integer.parseInt(Rbtn);
         int chkk2 = Integer.parseInt(chkk);
         
         if (urlAddress != "Error"){
         edt_enterUrl.setText(urlAddress);
         } 
    
         	if (chkk2==1){
         			chk1.setChecked(true);
         		} else if (chkk2==0){
         			chk1.setChecked(false);
         			}
         	if (rrbtn==2){
        				radio_btn2.setChecked(true);
         		} 
         
         	
         
         
         saveSett.setOnClickListener(new View.OnClickListener(){		//on click listener
         @SuppressLint("NewApi") @Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
        	 String x = (chk1.isChecked())?"1":"0";
        	 String y= (radio_btn1.isChecked()?"1":"2");	 	  		 
        	 
        	 
			    String textVal = edt_enterUrl.getText().toString();
				SharedPreferences.Editor editor = someData.edit();
				editor.putString("url", textVal);
				editor.putString("chk", x);
				editor.putString("Rbtn", y);
				editor.commit();
			} 
        	 
         } );
         
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
