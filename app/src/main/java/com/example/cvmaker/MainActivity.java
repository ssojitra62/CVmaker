package com.example.cvmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {






    EditText name,desc,dob,address,mno,email,hobby,spelization;
    Button next;
    RadioGroup radio;
    public static String name1,desc1,dob1,mno1,email1,hobby1,radio1,radiobutten1,spelization1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        desc = findViewById(R.id.desc);
        dob = findViewById(R.id.dob);
        mno = findViewById(R.id.mno);
        email = findViewById(R.id.email);
        hobby = findViewById(R.id.hobby);
        radio = findViewById(R.id.radio);
        next = findViewById(R.id.next);
        spelization = findViewById(R.id.spelization);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name1 = name.getText().toString();
                desc1 = desc.getText().toString();
                dob1 = dob.getText().toString();
                mno1 = mno.getText().toString();
                email1 = email.getText().toString();
                hobby1 = hobby.getText().toString();
                int radio1 = radio.getCheckedRadioButtonId();
                RadioButton radioButton = findViewById(radio1);
                radiobutten1 = radioButton.getText().toString();
                spelization1 = spelization.getText().toString();

                Intent intent= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);


            }
        });



    }
}



























//########################################################################################################################################
//########################################################################################################################################
//                intent sending


//    //sending intent to mainActivity2.java
//    Intent intent= new Intent(MainActivity.this,MainActivity2.class);
//                intent.putExtra("name",name1);
//                        intent.putExtra("surname",surname1);
//                        intent.putExtra("dob",dob1);
//                        intent.putExtra("address",address1);
//                        intent.putExtra("mno",mno1);
//                        intent.putExtra("email",email1);
//                        intent.putExtra("hobby",hobby1);
//                        intent.putExtra("radio",radiobutten1);
//
//                        startActivity(intent);