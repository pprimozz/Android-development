package telusko.com.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    Button b;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        b = (Button) findViewById(R.id.btn1);
        res = (TextView) findViewById(R.id.res);

    }


    public void calc(View V){

        int i = Integer.parseInt(et1.getText().toString());
        int j = Integer.parseInt(et2.getText().toString());


       int k = i+j;

        res.setText("Result is :"+k);
        System.out.println(k);

    }
}
