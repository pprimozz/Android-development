package com.example.aplikacija1;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.example.aplikacija1.JsonParser;
import com.example.aplikacija1.R;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class showpage extends settings {
	
	TextView ttView;	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.webpage);
        someData = getSharedPreferences(filename, 0);
        ttView = (TextView) findViewById(R.id.ttview);

        new AsyncTaskParseJson().execute();
        
        
       // Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
       // startActivity(browserIntent);
    }
     
    public class AsyncTaskParseJson extends AsyncTask<String, String, JSONObject> {
    	 
        final String TAG = "AsyncTaskParseJson.java";
        
        String urlAddress = someData.getString("url", "Error");
        String chkk = someData.getString("chk", "Error");
        String Rbtn = someData.getString("Rbtn", "Error");
        
        String url = urlAddress+"/?Chk="+chkk+"&R="+Rbtn;
        
        // url
        String urladdr = url;
 
        // data JSONArray
        JSONArray dataJsonArr = null;
 
        @Override
        protected void onPreExecute() {}
 
        @Override
        protected JSONObject doInBackground(String... arg0) {
 
            try {
 
                // json parser
                JsonParser jParser = new JsonParser();
 
                // get json string from url 
              JSONObject json = jParser.getJSONFromUrl(urladdr); //--> objekt iz classa JSONObject-> funkcija getJSONFromUrl                
 
                    // Storing data
                    String test1 = json.getString("test");
                    String test2 = json.getString("a");
                    String test3 = json.getString("array");
                   
 
                    // logcat show
                    Log.e(TAG, "testJSON: " + test1 + " " +test2 + " "+ test3);        
                       
 
            } catch (JSONException e) {
                e.printStackTrace();
            }
            JsonParser jParser = new JsonParser();
            JSONObject json = jParser.getJSONFromUrl(urladdr);
            return json;
        }
 
        @Override
        protected void onPostExecute(JSONObject strFromDoInBg) {
        	try{
        	ttView.setText(strFromDoInBg.getString("test"));
        	} catch (JSONException e) {
                e.printStackTrace();
            }
        	
        	}
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
