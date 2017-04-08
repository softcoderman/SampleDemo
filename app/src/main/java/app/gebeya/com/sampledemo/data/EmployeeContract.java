package app.gebeya.com.sampledemo.data;

import android.provider.BaseColumns;

/**
 * Created by gebeya-admin on 4/8/17.
 */

public class EmployeeContract {

    public static class EmployeeEntry implements BaseColumns{

        public static final String TABLE_NAME = "Employees";
        public static final String COLUMN_EMP_NAME = "employee_name";
        public static final String COLUMN_AGE = "age";
    }

}
