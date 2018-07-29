package com.milimeter.uasv7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.milimeter.uasv7.course.Course1Activity;
import com.milimeter.uasv7.course.Course2Activity;
import com.milimeter.uasv7.course.Course3Activity;
import com.milimeter.uasv7.course.Course4Activity;
import com.milimeter.uasv7.course.Course5Activity;
import com.milimeter.uasv7.course.Course6Activity;

public class MycourseActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnCourse1;
    private Button btnCourse2;
    private Button btnCourse3;
    private Button btnCourse4;
    private Button btnCourse5;
    private Button btnCourse6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mycourse);

        btnCourse1 = (Button) findViewById(R.id.course1);
        btnCourse1.setOnClickListener(this);

        btnCourse2 = (Button) findViewById(R.id.course2);
        btnCourse2.setOnClickListener(this);

        btnCourse3 = (Button) findViewById(R.id.course3);
        btnCourse3.setOnClickListener(this);

        btnCourse4 = (Button) findViewById(R.id.course4);
        btnCourse4.setOnClickListener(this);

        btnCourse5 = (Button) findViewById(R.id.course5);
        btnCourse5.setOnClickListener(this);

        btnCourse6 = (Button) findViewById(R.id.course6);
        btnCourse6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.course1:
                Intent moveIntent = new Intent(MycourseActivity.this, Course1Activity.class);
                startActivity(moveIntent);
                break;
        }
        switch (v.getId()) {
            case R.id.course2:
                Intent moveIntent = new Intent(MycourseActivity.this, Course2Activity.class);
                startActivity(moveIntent);
                break;
        }
        switch (v.getId()) {
            case R.id.course3:
                Intent moveIntent = new Intent(MycourseActivity.this, Course3Activity.class);
                startActivity(moveIntent);
                break;
        }
        switch (v.getId()) {
            case R.id.course4:
                Intent moveIntent = new Intent(MycourseActivity.this, Course4Activity.class);
                startActivity(moveIntent);
                break;
        }
        switch (v.getId()) {
            case R.id.course5:
                Intent moveIntent = new Intent(MycourseActivity.this, Course5Activity.class);
                startActivity(moveIntent);
                break;
        }
        switch (v.getId()) {
            case R.id.course6:
                Intent moveIntent = new Intent(MycourseActivity.this, Course6Activity.class);
                startActivity(moveIntent);
                break;
        }
    }
}
