package cc.somkiat.basicunittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String username = "", email = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSaveClick(View view) {
        EditText textName = findViewById(R.id.userNameInput);
        EditText textEmail = findViewById(R.id.emailInput);
        UsernameValidation usernameValidation = new UsernameValidation();
        EmailValidation EmailValidation = new EmailValidation();
        //if (){
        //
        //}
        username = textName.getText().toString();
        email = textEmail.getText().toString();
    }

    public void onRevertClick(View view) {
        EditText textName = findViewById(R.id.userNameInput);
        EditText textEmail = findViewById(R.id.emailInput);
        textName.setText(username);
        textEmail.setText(email);
    }
}
