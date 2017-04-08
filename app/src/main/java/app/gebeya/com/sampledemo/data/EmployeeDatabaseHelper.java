package app.gebeya.com.sampledemo.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.R.attr.version;

/**
 * Created by gebeya-admin on 4/8/17.
 */

public class EmployeeDatabaseHelper extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "employee.db";
    private static final int DATABASE_VERSION = 1;


    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + EmployeeContract.EmployeeEntry.TABLE_NAME + " (" +
                    EmployeeContract.EmployeeEntry._ID + " INTEGER PRIMARY KEY," +
                    EmployeeContract.EmployeeEntry.COLUMN_EMP_NAME + " TEXT," +
                    EmployeeContract.EmployeeEntry.COLUMN_AGE + " INTEGER)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + EmployeeContract.EmployeeEntry.TABLE_NAME;

    public EmployeeDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
       db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
}
