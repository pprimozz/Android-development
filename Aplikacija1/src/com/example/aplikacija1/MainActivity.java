package com.example.aplikacija1;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.example.aplikacija1.R;
import com.example.aplikacija1.showpage.AsyncTaskParseJson;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button btnum1, btnum2, btnum3, btnum4, btnum5, btnum6, btnum7, btnum8,
			btnum9, btnumhash, btnum0, btnumdel, btnOK;
	TextView txtView, txtViewPin;
	static int stevec = 0;
	static int uidS;
	static int pincodeS;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		btnum1 = (Button) findViewById(R.id.buttonNum1);
		btnum2 = (Button) findViewById(R.id.buttonNum2);
		btnum3 = (Button) findViewById(R.id.buttonNum3);
		btnum4 = (Button) findViewById(R.id.buttonNum4);
		btnum5 = (Button) findViewById(R.id.buttonNum5);
		btnum6 = (Button) findViewById(R.id.buttonNum6);
		btnum7 = (Button) findViewById(R.id.buttonNum7);
		btnum8 = (Button) findViewById(R.id.buttonNum8);
		btnum9 = (Button) findViewById(R.id.buttonNum9);
		btnumhash = (Button) findViewById(R.id.buttonNumHash);
		btnum0 = (Button) findViewById(R.id.buttonNum0);
		btnumdel = (Button) findViewById(R.id.buttonNumdel);
		btnOK = (Button) findViewById(R.id.buttonOK);
		txtView = (TextView) findViewById(R.id.textView1);
		txtViewPin = (TextView) findViewById(R.id.textView2);

		Toast.makeText(getApplicationContext(), "Vnesite User ID",
				Toast.LENGTH_SHORT).show(); // popup ki opozori uporabnika da
											// vnese uid

		btnum1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				if (stevec == 0) {
					txtView.setText(txtView.getText() + "1");

				} else if (stevec == 1) {

					// TODO Auto-generated method stub
					txtViewPin.setText(txtViewPin.getText() + "1");
				}
			}
		});

		btnum2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (stevec == 0) {
					txtView.setText(txtView.getText() + "2");

				} else if (stevec == 1) {

					// TODO Auto-generated method stub
					txtViewPin.setText(txtViewPin.getText() + "2");
				}

			}
		});
		btnum3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (stevec == 0) {
					txtView.setText(txtView.getText() + "3");

				} else if (stevec == 1) {

					// TODO Auto-generated method stub
					txtViewPin.setText(txtViewPin.getText() + "3");
				}
			}
		});

		btnum4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (stevec == 0) {
					txtView.setText(txtView.getText() + "4");

				} else if (stevec == 1) {

					// TODO Auto-generated method stub
					txtViewPin.setText(txtViewPin.getText() + "4");
				}
			}
		});

		btnum5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (stevec == 0) {
					txtView.setText(txtView.getText() + "5");

				} else if (stevec == 1) {

					// TODO Auto-generated method stub
					txtViewPin.setText(txtViewPin.getText() + "5");
				}
			}
		});

		btnum6.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (stevec == 0) {
					txtView.setText(txtView.getText() + "6");

				} else if (stevec == 1) {

					// TODO Auto-generated method stub
					txtViewPin.setText(txtViewPin.getText() + "6");
				}
			}
		});

		btnum7.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (stevec == 0) {
					txtView.setText(txtView.getText() + "7");

				} else if (stevec == 1) {

					// TODO Auto-generated method stub
					txtViewPin.setText(txtViewPin.getText() + "7");
				}
			}
		});

		btnum8.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (stevec == 0) {
					txtView.setText(txtView.getText() + "8");

				} else if (stevec == 1) {

					// TODO Auto-generated method stub
					txtViewPin.setText(txtViewPin.getText() + "8");
				}
			}
		});

		btnum9.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (stevec == 0) {
					txtView.setText(txtView.getText() + "9");

				} else if (stevec == 1) {

					// TODO Auto-generated method stub
					txtViewPin.setText(txtViewPin.getText() + "9");
				}
			}
		});

		btnumhash.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (stevec == 0) {
					txtView.setText(txtView.getText() + "#");

				} else if (stevec == 1) {

					// TODO Auto-generated method stub
					txtViewPin.setText(txtViewPin.getText() + "#");
				}
			}
		});

		btnum0.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (stevec == 0) {
					txtView.setText(txtView.getText() + "0");

				} else if (stevec == 1) {

					// TODO Auto-generated method stub
					txtViewPin.setText(txtViewPin.getText() + "0");
				}
			}
		});

		btnumdel.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				txtView.setText("");
				txtViewPin.setText("");

			}
		});

		btnOK.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				if (stevec == 1) {

					int uid = Integer.parseInt(txtView.getText().toString());
					int ppin = Integer
							.parseInt(txtViewPin.getText().toString());
					uidS = uid;
					pincodeS = ppin;

					int pin = 1234;
					if (ppin == pin) {
						Intent openStartingPoint = new Intent(
								"com.example.aplikacija1.mainwindow");
						startActivity(openStartingPoint);

					} else {
						Toast.makeText(getApplicationContext(),
								"Napacen UID ali koda", Toast.LENGTH_SHORT)
								.show();
						txtView.setText("");
						txtViewPin.setText("");
						stevec = 0;

						Toast.makeText(getApplicationContext(),
								"Ponovno vnesite User ID", Toast.LENGTH_SHORT)
								.show();
					}

				} else if (stevec == 0) {
					stevec = 1;
					Toast.makeText(getApplicationContext(), "Vnesite PIN",
							Toast.LENGTH_SHORT).show(); // popup ki opozori
														// uporabnika da vnese
														// uid
				}
			}
		});

	}

}