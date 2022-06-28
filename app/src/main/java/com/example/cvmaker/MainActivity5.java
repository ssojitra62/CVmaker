package com.example.cvmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity5 extends AppCompatActivity {
    ImageButton cv1,cv2,cv3,cv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        cv1 = findViewById(R.id.cv1);
        cv2 = findViewById(R.id.cv2);
        cv3 = findViewById(R.id.cv3);
        cv4 = findViewById(R.id.cv4);



        //recived intent data of mainactivity.java
        Intent intent1 = getIntent();
        String name = intent1.getStringExtra("name");
        String surname = intent1.getStringExtra("surname");
        String dob = intent1.getStringExtra("dob");
        String email = intent1.getStringExtra("address");
        String address = intent1.getStringExtra("mno");
        String mno = intent1.getStringExtra("email");
        String hobby = intent1.getStringExtra("hobby");
        String radiobutten = intent1.getStringExtra("radio");

        //recived intent of mainactivity2.java
        String u_name = intent1.getStringExtra("u_name");
        String c_name = intent1.getStringExtra("c_name");
        String d_name = intent1.getStringExtra("d_name");
        String m_degree = intent1.getStringExtra("m_degree");
        String s_other = intent1.getStringExtra("s_other");
        String s_other2 = intent1.getStringExtra("s_other2");
        String a_sport = intent1.getStringExtra("a_sport");

        //recived intent of mainactivity3.java
        String compnay = intent1.getStringExtra("compnay");
        String experiance = intent1.getStringExtra("experiance");

        //recived intent of mainactivity.4.java
        String disc = intent1.getStringExtra("disc1");
        String skils = intent1.getStringExtra("skils1");
        String specialization = intent1.getStringExtra("specialization1");

//########################################################################################################################################
//########################################################################################################################################
//                      CV1 butten on click

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



//             ###########################################################################################################################
//                reciving intent



                //recived intent data of mainactivity.java
                Intent intent2 = getIntent();
                String name = intent2.getStringExtra("name");
                String surname = intent2.getStringExtra("surname");
                String dob = intent2.getStringExtra("dob");
                String email = intent2.getStringExtra("address");
                String address = intent2.getStringExtra("mno");
                String mno = intent2.getStringExtra("email");
                String hobby = intent2.getStringExtra("hobby");
                String radiobutten = intent2.getStringExtra("radio");


                //recived intent of mainactivity2.java
                String u_name = intent2.getStringExtra("u_name");
                String c_name = intent2.getStringExtra("c_name");
                String d_name = intent2.getStringExtra("d_name");
                String m_degree = intent2.getStringExtra("m_degree");
                String s_other = intent2.getStringExtra("s_other");
                String s_other2 = intent2.getStringExtra("s_other2");
                String a_sport = intent2.getStringExtra("a_sport");

                //recived intent of mainactivity3.java
                String compnay = intent2.getStringExtra("compnay");
                String experiance = intent2.getStringExtra("experiance");

                //recived intent of mainactivity.4.java
                String disc = intent2.getStringExtra("disc1");
                String skils = intent2.getStringExtra("skils1");
                String specialization = intent2.getStringExtra("specialization1");


//                ##########################################################################################################################
//                                sending intent

                //intent of mainactivity.java sending to mainactivity5.java
                Intent intent = new Intent(MainActivity5.this,template1.class);
                intent.putExtra("name",name);
                intent.putExtra("surname",surname);
                intent.putExtra("dob",dob);
                intent.putExtra("address",address);
                intent.putExtra("mno",mno);
                intent.putExtra("email",email);
                intent.putExtra("hobby",hobby);
                intent.putExtra("radio",radiobutten);

//                intent of mainactivity2.java sending to mainactivity5.java
                intent.putExtra("name",u_name);
                intent.putExtra("surname",c_name);
                intent.putExtra("dob",d_name);
                intent.putExtra("address",m_degree);
                intent.putExtra("mno",s_other);
                intent.putExtra("email",s_other2);
                intent.putExtra("hobby",a_sport);

//                 intent of mainactivity3.java sending to mainactivity5.java
                intent.putExtra("compnay",compnay);
                intent.putExtra("experiance",experiance);

                //       intent of mainactivity4.java sending to mainactivity5.java
                intent.putExtra("disc",disc);
                intent.putExtra("skils",skils);
                intent.putExtra("specialization",specialization);

                startActivity(intent);

//                intent over
//########################################################################################

            }
        });



















//############################################################################################################################################
//############################################################################################################################################
//                  CV2 butten onclick

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity5.this,template2.class);



//          ###########################################################################################################################
//                reciving intent






//          ##########################################################################################################################
//                                sending intent

                //intent of mainactivity.java sending to mainactivity5.java
                intent.putExtra("name",name);
                intent.putExtra("surname",surname);
                intent.putExtra("dob",dob);
                intent.putExtra("address",address);
                intent.putExtra("mno",mno);
                intent.putExtra("email",email);
                intent.putExtra("hobby",hobby);
                intent.putExtra("radio",radiobutten);

//                intent of mainactivity2.java sending to mainactivity5.java
                intent.putExtra("name",u_name);
                intent.putExtra("surname",c_name);
                intent.putExtra("dob",d_name);
                intent.putExtra("address",m_degree);
                intent.putExtra("mno",s_other);
                intent.putExtra("email",s_other2);
                intent.putExtra("hobby",a_sport);

//                 intent of mainactivity3.java sending to mainactivity5.java
                intent.putExtra("compnay",compnay);
                intent.putExtra("experiance",experiance);

                //       intent of mainactivity4.java sending to mainactivity5.java
                intent.putExtra("disc",disc);
                intent.putExtra("skils",skils);
                intent.putExtra("specialization",specialization);

                startActivity(intent);

//                intent over
//########################################################################################


            }
        });


















//############################################################################################################################################
//############################################################################################################################################
//                  CV3 butten onclick

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this,template3.class);



//             ###########################################################################################################################
//                reciving intent



                //recived intent data of mainactivity.java
                Intent intent2 = getIntent();
                String name = intent.getStringExtra("name");
                String surname = intent.getStringExtra("surname");
                String dob = intent.getStringExtra("dob");
                String email = intent.getStringExtra("address");
                String address = intent.getStringExtra("mno");
                String mno = intent.getStringExtra("email");
                String hobby = intent.getStringExtra("hobby");
                String radiobutten = intent.getStringExtra("radio");

                //recived intent of mainactivity2.java
                String u_name = intent.getStringExtra("u_name");
                String c_name = intent.getStringExtra("c_name");
                String d_name = intent.getStringExtra("d_name");
                String m_degree = intent.getStringExtra("m_degree");
                String s_other = intent.getStringExtra("s_other");
                String s_other2 = intent.getStringExtra("s_other2");
                String a_sport = intent.getStringExtra("a_sport");

                //recived intent of mainactivity3.java
                String compnay = intent.getStringExtra("compnay");
                String experiance = intent.getStringExtra("experiance");

                //recived intent of mainactivity.4.java
                String disc = intent.getStringExtra("disc1");
                String skils = intent.getStringExtra("skils1");
                String specialization = intent.getStringExtra("specialization1");


//                ##########################################################################################################################
//                                sending intent

                //intent of mainactivity.java sending to mainactivity5.java
                intent.putExtra("name",name);
                intent.putExtra("surname",surname);
                intent.putExtra("dob",dob);
                intent.putExtra("address",address);
                intent.putExtra("mno",mno);
                intent.putExtra("email",email);
                intent.putExtra("hobby",hobby);
                intent.putExtra("radio",radiobutten);

//                intent of mainactivity2.java sending to mainactivity5.java
                intent.putExtra("name",u_name);
                intent.putExtra("surname",c_name);
                intent.putExtra("dob",d_name);
                intent.putExtra("address",m_degree);
                intent.putExtra("mno",s_other);
                intent.putExtra("email",s_other2);
                intent.putExtra("hobby",a_sport);

//                 intent of mainactivity3.java sending to mainactivity5.java
                intent.putExtra("compnay",compnay);
                intent.putExtra("experiance",experiance);

                //       intent of mainactivity4.java sending to mainactivity5.java
                intent.putExtra("disc",disc);
                intent.putExtra("skils",skils);
                intent.putExtra("specialization",specialization);

                startActivity(intent);

//                intent over
//########################################################################################


            }
        });





















//############################################################################################################################################
//############################################################################################################################################
//        CV4 butten onclick


        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this,template4.class);



//             ###########################################################################################################################
//                reciving intent



                //recived intent data of mainactivity.java
                Intent intent2 = getIntent();
                String name = intent.getStringExtra("name");
                String surname = intent.getStringExtra("surname");
                String dob = intent.getStringExtra("dob");
                String email = intent.getStringExtra("address");
                String address = intent.getStringExtra("mno");
                String mno = intent.getStringExtra("email");
                String hobby = intent.getStringExtra("hobby");
                String radiobutten = intent.getStringExtra("radio");

                //recived intent of mainactivity2.java
                String u_name = intent.getStringExtra("u_name");
                String c_name = intent.getStringExtra("c_name");
                String d_name = intent.getStringExtra("d_name");
                String m_degree = intent.getStringExtra("m_degree");
                String s_other = intent.getStringExtra("s_other");
                String s_other2 = intent.getStringExtra("s_other2");
                String a_sport = intent.getStringExtra("a_sport");

                //recived intent of mainactivity3.java
                String compnay = intent.getStringExtra("compnay");
                String experiance = intent.getStringExtra("experiance");

                //recived intent of mainactivity.4.java
                String disc = intent.getStringExtra("disc1");
                String skils = intent.getStringExtra("skils1");
                String specialization = intent.getStringExtra("specialization1");


//                ##########################################################################################################################
//                                sending intent

                //intent of mainactivity.java sending to mainactivity5.java
                intent.putExtra("name",name);
                intent.putExtra("surname",surname);
                intent.putExtra("dob",dob);
                intent.putExtra("address",address);
                intent.putExtra("mno",mno);
                intent.putExtra("email",email);
                intent.putExtra("hobby",hobby);
                intent.putExtra("radio",radiobutten);

//                intent of mainactivity2.java sending to mainactivity5.java
                intent.putExtra("name",u_name);
                intent.putExtra("surname",c_name);
                intent.putExtra("dob",d_name);
                intent.putExtra("address",m_degree);
                intent.putExtra("mno",s_other);
                intent.putExtra("email",s_other2);
                intent.putExtra("hobby",a_sport);

//                 intent of mainactivity3.java sending to mainactivity5.java
                intent.putExtra("compnay",compnay);
                intent.putExtra("experiance",experiance);

                //       intent of mainactivity4.java sending to mainactivity5.java
                intent.putExtra("disc",disc);
                intent.putExtra("skils",skils);
                intent.putExtra("specialization",specialization);

                startActivity(intent);

//                intent over
//########################################################################################

            }
        });






    }
}