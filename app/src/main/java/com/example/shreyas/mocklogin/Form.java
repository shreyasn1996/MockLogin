package com.example.shreyas.mocklogin;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Form extends AppCompatActivity {
    public static final String TAG =Form.class.getSimpleName();
    private TextView fnameTextView;
    private TextView lnameTextView;
    private TextView genderTextView;
    private TextView dobTextView;
    private Button anotherFormButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        Toast.makeText(Form.this,"Welcome", Toast.LENGTH_LONG).show();
        fnameTextView=(TextView)findViewById(R.id.fnameTextView);
        lnameTextView=(TextView)findViewById(R.id.lnameTextView);
        genderTextView=(TextView)findViewById(R.id.genderTextView);
        dobTextView=(TextView)findViewById(R.id.dobTextView);
        anotherFormButton=(Button)findViewById(R.id.fillAnotherFormButton);
        Intent intent = getIntent();
        String fname=intent.getStringExtra(getString(R.string.key_fname));
        String lname=intent.getStringExtra(getString(R.string.key_lname));
        String gender=intent.getStringExtra(getString(R.string.key_gender));
        String dob=intent.getStringExtra(getString(R.string.key_dob));
        if(fname == null|| fname.isEmpty())
        {
            fname="friend";
        }
        if(lname == null|| lname.isEmpty())
        {
            lname="friend";
        }
        if(gender == null|| gender.isEmpty())
        {
            gender="friend";
        }
        if(dob == null|| dob.isEmpty())
        {
            dob="friend";
        }
        //Resources res=getResources();
        fnameTextView.setText(getString(R.string.val1,fname));
        lnameTextView.setText(getString(R.string.val2,lname));
        genderTextView.setText(getString(R.string.val3,gender));
        dobTextView.setText(getString(R.string.val4,dob));
        //String.format(fname,lname,gender,dob);
        Log.d(TAG,""+ fname);
        Log.d(TAG,""+ lname);
        Log.d(TAG,""+ gender);
        Log.d(TAG,""+dob);
       // fnameTextView.set
        anotherFormButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }
}
