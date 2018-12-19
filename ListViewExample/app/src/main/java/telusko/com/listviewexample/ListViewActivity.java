package telusko.com.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lv = (ListView) findViewById(R.id.progList);

       final String values[] = {"C", "C++", "Java", "Android", "C#", "Assembly", "Python", "Ruby","VB", "Scala"};

        //Adapter -> ArrayAdapter, SimpleCursorAdapter

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Arrays.asList(values));

        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this,"U clicked :"+ values[position],Toast.LENGTH_LONG).show();
            }
        });
    }
}
