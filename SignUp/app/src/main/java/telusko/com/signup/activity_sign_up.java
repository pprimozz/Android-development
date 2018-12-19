package telusko.com.signup;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class activity_sign_up extends AppCompatActivity {
    EditText etName;
    EditText etEmail;
    EditText etPass;

    RadioButton r1;
    RadioButton r2;
    RadioGroup rg;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

       b = (Button) findViewById(R.id.btn_signup);
       etEmail = (EditText) findViewById(R.id.input_email);
       etPass = (EditText) findViewById(R.id.password);
       etName = (EditText) findViewById(R.id.input_name);

       r1 =(RadioButton) findViewById(R.id.f);
       r2 =(RadioButton) findViewById(R.id.m);

       rg = (RadioGroup) findViewById(R.id.radioGroup);



       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String salute="";
                if(r1.isChecked()){
                    salute="Ms";
                } else {
                    salute="Mr";
                }

               final  String name = etName.getText().toString();
               final String email = etEmail.getText().toString();
               final String pass = etPass.getText().toString();
               Toast.makeText(activity_sign_up.this,name +" "+ salute,Toast.LENGTH_LONG).show();

             //  System.out.println(salute+" "+"Name: "+name+" Email: "+email+" Password: " +pass);
            Intent intent = new Intent(activity_sign_up.this,activity_show_data.class);
            intent.putExtra("name", name);
            intent.putExtra("gender", salute);
            intent.putExtra("email", email);
            intent.putExtra("pass", pass);

            startActivity(intent);

           }
       });
    }
}
