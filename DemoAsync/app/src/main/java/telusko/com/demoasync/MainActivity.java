package telusko.com.demoasync;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button btn;
    String strUrl;
    String result="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        btn = (Button) findViewById(R.id.btnAdd);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 int i = Integer.parseInt(num1.getText().toString());
                 int j = Integer.parseInt(num2.getText().toString());
                 strUrl ="http://192.168.1.114:8080/sendRedirect_URLRewritting/sq?i="+i+"&j="+j;
                 new MultiplyTask().execute();  //pokliče AsyncTask !
            }
        });
    }

    public class MultiplyTask extends AsyncTask<String,String,String>{
       @Override
       protected void onPreExecute(){

           Toast.makeText(MainActivity.this,"The output is "+result,Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onPostExecute(String s) {

           // make TOAST of result
        }

        @Override
        protected String doInBackground(String... params) {
         try {
             URL url = new URL(strUrl);
             HttpURLConnection con = (HttpURLConnection) url.openConnection();
             con.setRequestMethod("GET");
             con.connect();

             BufferedReader bf = new BufferedReader(new InputStreamReader(con.getInputStream()));
             String value = bf.readLine();
             result=value;
             System.out.println("result is: "+ value);
            // num2.setText(value+" ");

         } catch(Exception e){
             System.out.println(e);
         }
            return null;
        }
    }


}
