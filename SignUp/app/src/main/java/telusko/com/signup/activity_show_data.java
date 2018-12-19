package telusko.com.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activity_show_data extends AppCompatActivity {

    private TextView name,gender,email,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        Intent intent = getIntent();

        String sname= intent.getStringExtra("name");
        String sgender= intent.getStringExtra("gender");
        String semail= intent.getStringExtra("email");
        String spass= intent.getStringExtra("pass");

        name = (TextView) findViewById(R.id.textView);
        gender = (TextView) findViewById(R.id.textView2);
        email = (TextView) findViewById(R.id.textView3);
        pass = (TextView) findViewById(R.id.textView5);

        name.setText(sname);
        gender.setText(sgender);
        email.setText(semail);
        pass.setText(spass);
    }
}
