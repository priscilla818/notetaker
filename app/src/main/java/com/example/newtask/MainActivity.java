package com.example.newtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editusername, editpassword;
    private Button btnlogin;

    private String username="abc",password="12345";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListeners();
    }

    private void findViews(){
        editusername = findViewById(R.id.edit_username);
        editpassword = findViewById(R.id.edit_password);
        btnlogin = findViewById(R.id.btn_login);
    }

    private void setListeners(){
        btnlogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String inputUsername = editusername.getText().toString();
                String inputPassword = editpassword.getText().toString();

                if (inputUsername.equals(username) && inputPassword.equals(password)){
                    Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Login fail", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
