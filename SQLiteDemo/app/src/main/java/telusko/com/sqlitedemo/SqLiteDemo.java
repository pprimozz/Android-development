package telusko.com.sqlitedemo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SqLiteDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sq_lite_demo);

        StudentDbHelper dbHelper = new StudentDbHelper(this);
       /*
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("sid",2);
        values.put("sname","Navin");
        values.put("marks","30");

        long row = db.insert("student",null,values);

        System.out.print("row number is "+row);
        */

        SQLiteDatabase db = dbHelper.getReadableDatabase();

        String projection[] = {"sid","name","marks"};
        Cursor c = db.query("student",projection,null,null,null,null,null);

            c.moveToFirst();
          //  c.moveToPosition(1);
        // z while zanko fetchas vse podatke!
            System.out.println("Name is:" + c.getString(1));

    }
}
