package telusko.com.signup;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class alertDialoog extends AppCompatActivity {
TextView txtName,txtAcc,txtBalance;
Button btnName, btnAcc, btnBalance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialoog);

        txtName = (TextView) findViewById(R.id.txtName);
        txtAcc = (TextView) findViewById(R.id.txtAcc);
        txtBalance = (TextView) findViewById(R.id.txtBalance);

        btnName = (Button) findViewById(R.id.btnName);
        btnAcc = (Button) findViewById(R.id.btnAcc);
        btnBalance = (Button) findViewById(R.id.btnBalance);

        btnName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtName.setText("Navin");
            }
        });

        btnAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             txtAcc.setText("NLB SI56");


            }
        });

        btnBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(alertDialoog.this);
                builder.setMessage("Are you sure?").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        txtBalance.setText("5000");
                    }
                }).setNegativeButton("Cancel",null);

                AlertDialog alert = builder.create();
                alert.show();

            }
        });
    }
    @Override
    public void onBackPressed()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(alertDialoog.this);
        builder.setTitle("Really Exit?")
                .setMessage("Are you sure?").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                alertDialoog.super.onBackPressed();
            }
        }).setNegativeButton("Cancel",null).setCancelable(false);

        AlertDialog alert = builder.create();
        alert.show();

    }
}
