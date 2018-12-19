package telusko.com.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class RatingBaar extends AppCompatActivity {

    RatingBar rb;
    TextView value;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_baar);

        rb= (RatingBar) findViewById(R.id.ratingBar);
        value = (TextView) findViewById(R.id.value);

        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                value.setText("Value is:" + rating);

            }
        });


        }

    }
