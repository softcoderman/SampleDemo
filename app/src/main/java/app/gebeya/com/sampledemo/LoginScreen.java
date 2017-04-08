package app.gebeya.com.sampledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class LoginScreen extends AppCompatActivity {

    private EditText emailAdressTextEdit;
    private EditText passwordTextEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        emailAdressTextEdit  = (EditText) findViewById(R.id.textEmail);
        passwordTextEdit  = (EditText) findViewById(R.id.textPassword);

    }
}
