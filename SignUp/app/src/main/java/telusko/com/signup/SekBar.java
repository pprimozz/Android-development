package telusko.com.signup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class SekBar extends AppCompatActivity {

    TextView tv,tv1;
    SeekBar sb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);

        sb = (SeekBar) findViewById(R.id.seekBar);
        tv = (TextView) findViewById(R.id.value);
        tv1 = (TextView) findViewById(R.id.v);

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv.setTextSize(progress);
                tv1.setText(progress+" ");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

                Toast.makeText(SekBar.this,"started",Toast.LENGTH_SHORT);
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
