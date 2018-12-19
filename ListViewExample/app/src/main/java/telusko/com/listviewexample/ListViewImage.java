package telusko.com.listviewexample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewImage extends AppCompatActivity {

    ListView lv;
    Context context;
    ArrayList progList;

    public static Integer [] progImages = {
            R.drawable.one,R.drawable.two,R.drawable.three,
            R.drawable.one,R.drawable.two,R.drawable.three,
            R.drawable.one,R.drawable.two,R.drawable.three
    };

    public static String [] progNames = {
            "Object", "Class", "Polymorphism", "Inheritance", "JDBC", "Abstract", "Constructor", "Android", "Swing"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_image);

        MyListAdapter adapter = new MyListAdapter(this,progNames, progImages);
        lv = (ListView) findViewById(R.id.ListView2);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewImage.this,"You clicked at: "+ progNames[position], Toast.LENGTH_LONG).show();
            }
        });


    }
}
