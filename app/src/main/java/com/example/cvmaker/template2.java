package com.example.cvmaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class template2 extends AppCompatActivity {
    TextView name1,spelization,desc,hobby_txt,dob_txt,gender_txt,phone_txt,email_txt,skil1,skil2,skil3,skil4,experiance,experiance2,position1,position2,disc2,disc3,degree,collage,master,degree2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template2);

        name1 = findViewById(R.id.name1);
        name1.setText(""+MainActivity.name1);

        spelization = findViewById(R.id.spelization);
        spelization.setText(""+MainActivity.spelization1);

        desc = findViewById(R.id.desc);
        desc.setText(""+MainActivity.desc1);

        hobby_txt=findViewById(R.id.hobby_txt);
        hobby_txt.setText(""+MainActivity.hobby1);

        dob_txt = findViewById(R.id.dob_txt);
        dob_txt.setText(""+MainActivity.dob1);

        gender_txt = findViewById(R.id.gender_txt);
        gender_txt.setText(""+MainActivity.radiobutten1);

        phone_txt = findViewById(R.id.phone_txt);
        phone_txt.setText(""+MainActivity.mno1);

        email_txt = findViewById(R.id.email_txt);
        email_txt.setText(""+MainActivity.email1);

        skil1 = findViewById(R.id.skil1);
        skil1.setText(""+MainActivity4.skil_txt1);

        skil2 = findViewById(R.id.skil2);
        skil2.setText(""+MainActivity4.skils_txt2);

        skil3 = findViewById(R.id.skil3);
        skil3.setText(""+MainActivity4.skil_txt3);

        skil4 = findViewById(R.id.skil4);
        skil4.setText(""+MainActivity4.skil_txt4);

        experiance = findViewById(R.id.experiance);
        experiance.setText(""+MainActivity3.experiance1);

        experiance2 = findViewById(R.id.experiance2);
        experiance2.setText(""+MainActivity3.experiance0);

        position1 = findViewById(R.id.position1);
        position1.setText(""+MainActivity3.p_txt1);

        position2 = findViewById(R.id.position2);
        position2.setText(""+MainActivity3.p_txt0);

        disc2 = findViewById(R.id.disc2);
        disc2.setText(""+MainActivity3.j_desc1);

        disc3 = findViewById(R.id.disc3);
        disc3.setText(""+MainActivity3.j_desc0);

        degree = findViewById(R.id.degree);
        degree.setText(""+MainActivity2.d_name1);

        collage = findViewById(R.id.collage);
        collage.setText(""+MainActivity2.u_name1);

        master = findViewById(R.id.master);
        master.setText(""+MainActivity2.m_degree1);

        degree2 = findViewById(R.id.degree2);
        degree2.setText(""+MainActivity2.m_degree1);


















    }
}