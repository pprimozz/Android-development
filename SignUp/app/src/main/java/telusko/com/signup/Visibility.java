package telusko.com.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Visibility extends AppCompatActivity {

    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visibility);
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);

    }

    public void b1Clicked(View v){
        b1.setVisibility(View.INVISIBLE);
        b2.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
    }
    public void b2Clicked(View v){
        b2.setVisibility(View.INVISIBLE);
        b1.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
    }

    public void b3Clicked(View v){
        b3.setVisibility(View.INVISIBLE);
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
    }
}
