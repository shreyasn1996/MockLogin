package com.example.shreyas.mocklogin;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText fnameField;
    private EditText lnameField;
    private EditText genderField;
    private EditText dobField;
    private EditText passwordField;
    private Button submitButton;
    private CharSequence infoText="Wrong Password!";
    public final String TAG=MainActivity.class.getSimpleName();
    private final String nama = "Password";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fnameField = (EditText)findViewById(R.id.fnameEditText);
        lnameField =  (EditText)findViewById(R.id.lnameEditText);
        genderField = (EditText)findViewById(R.id.genderEditText);
        dobField = (EditText)findViewById(R.id.dobEditText);
        passwordField = (EditText)findViewById(R.id.passwordEditText);
        submitButton = (Button)findViewById(R.id.submitButton);
        Log.d(TAG,"this is msg");



            submitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String fname = fnameField.getText().toString();
                    String lname = lnameField.getText().toString();
                    String gender = genderField.getText().toString();
                    String dob = dobField.getText().toString();
                    String password = passwordField.getText().toString();

                    enterform(fname,lname,gender,dob,password);

                }
            });



    }
    protected  void onResume(){
        super.onResume();
        fnameField.setText("");
        lnameField.setText("");
        genderField.setText("");
        dobField.setText("");
        passwordField.setText("");


    }

    private void enterform(String fname, String lname, String gender, String dob,String password) {
        Intent intent=new Intent(MainActivity.this,Form.class);
        Resources resources=getResources();
        String k_fname=resources.getString(R.string.key_fname);
        String k_lname=resources.getString(R.string.key_lname);
        String k_gender=resources.getString(R.string.key_gender);
        String k_dob=resources.getString(R.string.key_dob);

        intent.putExtra(k_fname,fname);
        intent.putExtra(k_lname,lname);
        intent.putExtra(k_gender,gender);
        intent.putExtra(k_dob,dob);
        //String.format(fname,lname,gender,dob);
        if(password.equals(getString(R.string.shreyas))) {
            startActivity(intent);
        }
        else {
            Toast.makeText(MainActivity.this,"WRONG password",Toast.LENGTH_LONG).show();
        }



    }
}
