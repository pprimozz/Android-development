package telusko.com.sqlitedemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class StudentDbHelper extends SQLiteOpenHelper {

    public StudentDbHelper(Context context) {
        super(context,"stud.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table student (sid text, sname text, marks text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table if exists student");
        onCreate(db);
    }
}
