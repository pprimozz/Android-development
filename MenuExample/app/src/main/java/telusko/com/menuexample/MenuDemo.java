package telusko.com.menuexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

public class MenuDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_demo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.settings:
                Toast.makeText(this,"Now you can configure",Toast.LENGTH_LONG).show();
                return true;
            case R.id.about:
                Toast.makeText(this,"My name is Primož",Toast.LENGTH_LONG).show();
            case R.id.contact:
                Toast.makeText(this,"www.telusko.com",Toast.LENGTH_LONG).show();

        }

        return super.onOptionsItemSelected(item);
    }
}
