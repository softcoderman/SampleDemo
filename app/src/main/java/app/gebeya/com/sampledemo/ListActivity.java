package app.gebeya.com.sampledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class ListActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    EmployeeAdapter employeeAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employees_layout);

       recyclerView = (RecyclerView) findViewById(R.id.recylerview_employee);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);



    }
}
