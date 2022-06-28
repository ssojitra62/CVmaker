package com.example.cvmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    TextView p_txt,experiance,j_desc,p_txt2,experiance2,j_desc2;
    Button next3;
    public static String p_txt1,experiance1,j_desc1,p_txt0,experiance0,j_desc0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        p_txt = findViewById(R.id.p_txt);
        experiance = findViewById(R.id.experiance);
        j_desc = findViewById(R.id.j_desc);
        p_txt = findViewById(R.id.p_txt);
        experiance2 = findViewById(R.id.experiance2);
        j_desc2 = findViewById(R.id.j_desc2);
        next3 = findViewById(R.id.next3);







        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a = " Year";



                p_txt1= p_txt.getText().toString();
                experiance1= experiance.getText().toString();
                j_desc1= j_desc.getText().toString();
                p_txt0= p_txt.getText().toString();
                experiance0= experiance2.getText().toString();
                j_desc0= j_desc2.getText().toString();
                experiance1 = experiance1 + a ;
                experiance0 = experiance0 + a ;



                Intent intent= new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intent);


            }
        });


    }
}




































//    //recived intent data of mainactivity.java
//    Intent intent1 = getIntent();
//    String name = intent1.getStringExtra("name");
//    String surname = intent1.getStringExtra("surname");
//    String dob = intent1.getStringExtra("dob");
//    String email = intent1.getStringExtra("address");
//    String address = intent1.getStringExtra("mno");
//    String mno = intent1.getStringExtra("email");
//    String hobby = intent1.getStringExtra("hobby");
//    String radiobutten = intent1.getStringExtra("radio");
//
////        head.setText(""+name);
//
//    //recived intent of mainactivity2.java
//    String u_name = intent1.getStringExtra("u_name");
//    String c_name = intent1.getStringExtra("c_name");
//    String d_name = intent1.getStringExtra("d_name");
//    String m_degree = intent1.getStringExtra("m_degree");
//    String s_other = intent1.getStringExtra("s_other");
//    String s_other2 = intent1.getStringExtra("s_other2");
//    String a_sport = intent1.getStringExtra("a_sport");
















//    //#########################################################################################################################################
////########################################################################################################################################
////                intent sending
//    Intent intent= new Intent(MainActivity3.this,MainActivity4.class);
//
////intent of mainactivity.java sending to mainactivity4.java
//                intent.putExtra("name",name);
//                        intent.putExtra("surname",surname);
//                        intent.putExtra("dob",dob);
//                        intent.putExtra("address",address);
//                        intent.putExtra("mno",mno);
//                        intent.putExtra("email",email);
//                        intent.putExtra("hobby",hobby);
//                        intent.putExtra("radio",radiobutten);
//
////                intent of mainactivity2.java sending to mainactivity4.java
//                        intent.putExtra("name",u_name);
//                        intent.putExtra("surname",c_name);
//                        intent.putExtra("dob",d_name);
//                        intent.putExtra("address",m_degree);
//                        intent.putExtra("mno",s_other);
//                        intent.putExtra("email",s_other2);
//                        intent.putExtra("hobby",a_sport);
//
////                 intent od mainactivity3.java sending to mainactivity4.java
//                        intent.putExtra("compnay",compnay1);
//                        intent.putExtra("experiance",experiance1);
//                        startActivity(intent);