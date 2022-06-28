package com.example.cvmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    EditText skil1_txt,skil2_txt,skil3_txt,skil4_txt;
    Button next4;
    public  static String skil_txt1,skils_txt2,skil_txt3,skil_txt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        skil1_txt = findViewById(R.id.skil1_txt);
        skil2_txt = findViewById(R.id.skil2_txt);
        skil3_txt = findViewById(R.id.skil3_txt);
        skil4_txt = findViewById(R.id.skil4_txt);
        next4 = findViewById(R.id.next4);






        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity4.this, ""+name, Toast.LENGTH_SHORT).show();

                skil_txt1 = skil1_txt.getText().toString();
                skils_txt2 = skil2_txt.getText().toString();
                skil_txt3 = skil3_txt.getText().toString();
                skil_txt4 = skil4_txt.getText().toString();


                Intent intent= new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(intent);








            }
        });



    }
}

















































//########################################################################################################################################
//########################################################################################################################################
//                INTENT reciving







//intent of mainactivity.java sending to mainactivity5.java
//                Intent intent1= new Intent(MainActivity4.this,MainActivity5.class);
//                intent1.putExtra("name",name);
//                intent1.putExtra("surname",surname);
//                intent1.putExtra("dob",dob);
//                intent1.putExtra("address",address);
//                intent1.putExtra("mno",mno);
//                intent1.putExtra("email",email);
//                intent1.putExtra("hobby",hobby);
//                intent1.putExtra("radio",radiobutten);
//
////                intent of mainactivity2.java sending to mainactivity5.java
//                intent1.putExtra("name",u_name);
//                intent1.putExtra("surname",c_name);
//                intent1.putExtra("dob",d_name);
//                intent1.putExtra("address",m_degree);
//                intent1.putExtra("mno",s_other);
//                intent1.putExtra("email",s_other2);
//                intent1.putExtra("hobby",a_sport);
//
////                 intent of mainactivity3.java sending to mainactivity5.java
//                intent1.putExtra("compnay",compnay);
//                intent1.putExtra("experiance",experiance);
//
//         //       intent of mainactivity4.java sending to mainactivity5.java
//                intent1.putExtra("disc",disc1);
//                intent1.putExtra("skils",skils1);
//                intent1.putExtra("specialization",specialization1);





//                startActivity(intent);