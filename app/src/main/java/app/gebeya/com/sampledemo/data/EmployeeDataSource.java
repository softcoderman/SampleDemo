package app.gebeya.com.sampledemo.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by gebeya-admin on 4/8/17.
 */

public class EmployeeDataSource {
    EmployeeDatabaseHelper helper;
    SQLiteDatabase db;


    public EmployeeDataSource(Context context){
        helper = new EmployeeDatabaseHelper(context);

    }


    public void close(){
        db.close();
    }

    public Employee insertData(Employee employee){

        db = helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(EmployeeContract.EmployeeEntry.COLUMN_EMP_NAME, employee.getEmp_name());
        contentValues.put(EmployeeContract.EmployeeEntry.COLUMN_AGE, employee.getAge());
        long id  = db.insert(EmployeeContract.EmployeeEntry.TABLE_NAME, null, contentValues);
        employee.setId(id);

        return  employee;
    }

    public Cursor filterEmployees(String selection,
                                  String[] selectionArgs ,
                                  String sortOrder){

        String[] projection = {
                EmployeeContract.EmployeeEntry._ID,
                EmployeeContract.EmployeeEntry.COLUMN_EMP_NAME,
                EmployeeContract.EmployeeEntry.COLUMN_AGE
        };

        db = helper.getReadableDatabase();

       return db.query(EmployeeContract.EmployeeEntry.TABLE_NAME,
               projection,selection,selectionArgs, null, null, sortOrder);

    }

    public Cursor getAllEmployees(){

        String[] projection = {
                EmployeeContract.EmployeeEntry._ID,
                EmployeeContract.EmployeeEntry.COLUMN_EMP_NAME,
                EmployeeContract.EmployeeEntry.COLUMN_AGE
        };

        db = helper.getReadableDatabase();

        return db.query(EmployeeContract.EmployeeEntry.TABLE_NAME,
                projection,null, null, null, null, null);

    }




}
