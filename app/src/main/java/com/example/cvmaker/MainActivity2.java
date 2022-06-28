package com.example.cvmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

   TextView u_name,c_name,d_name,m_degree,s_other,s_other2,a_sport;
   Button next2;

public static String u_name1,c_name1,d_name1,m_degree1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        u_name = findViewById(R.id.u_name);
        c_name = findViewById(R.id.c_name);
        d_name = findViewById(R.id.d_name);
        m_degree = findViewById(R.id.m_degree);

        next2 = findViewById(R.id.next2);


        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                u_name1 = u_name.getText().toString();
                c_name1 = c_name.getText().toString();
                d_name1 = d_name.getText().toString();
                m_degree1 = m_degree.getText().toString();


                Intent intent= new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);




            }
        });






    }
}





















// intent reciving
//
//        //intent recived from mainactivity.java
//        Intent intent1 = getIntent();
//        String name = intent1.getStringExtra("name");
//        String surname = intent1.getStringExtra("surname");
//        String dob = intent1.getStringExtra("dob");
//        String email = intent1.getStringExtra("address");
//        String address = intent1.getStringExtra("mno");
//        String mno = intent1.getStringExtra("email");
//        String hobby = intent1.getStringExtra("hobby");
//        String radiobutten = intent1.getStringExtra("radio");






////######################################################################################################################################
////########################################################################################################################################
////                                intent sending
//
//
//
//    //sendign intent to mainActivity3.java
//    Intent intent= new Intent(MainActivity2.this,MainActivity3.class);
//                intent.putExtra("u_name",u_name1);
//                        intent.putExtra("c_surname",c_name1);
//                        intent.putExtra("d_name",d_name1);
//                        intent.putExtra("m_degree",m_degree1);
//                        intent.putExtra("s_other",s_other1);
//                        intent.putExtra("s_other2",s_other21);
//                        intent.putExtra("a_sport",a_sport1);
//
//
//
////########################################################################################################################################
////########################################################################################################################################
//
//                        //intent of mainactivity.java sending to mainactivity3.java
//                        intent.putExtra("name",name);
//                        intent.putExtra("surname",surname);
//                        intent.putExtra("dob",dob);
//                        intent.putExtra("address",address);
//                        intent.putExtra("mno",mno);
//                        intent.putExtra("email",email);
//                        intent.putExtra("hobby",hobby);
//                        intent.putExtra("radio",radiobutten);
//                        startActivity(intent);