package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentDetails extends AppCompatActivity {
    private TextView tvName;
    private TextView tvDob;
    private TextView tvClass;
    private ListView lvSubject;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);

        //Ánh xạ UI
        tvName = findViewById(R.id.tvName);
        tvDob= findViewById(R.id.tvDob);
        tvClass = findViewById(R.id.tvClass);
        imageView = findViewById(R.id.image);
        lvSubject = findViewById(R.id.lvSubject);

        //lấy thông tin

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String dob = intent.getStringExtra("dob");
        String studentClass = intent.getStringExtra("class");
        int sourceImage = intent.getIntExtra("srcImage", -1);
        ArrayList<String> subjects = intent.getStringArrayListExtra("subjects");

        //truyền dữu leieiuj
        tvName.setText(name);
        tvDob.setText(dob);
        tvClass.setText(studentClass);
        if (sourceImage != -1) {
            imageView.setImageResource(sourceImage);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, subjects);
        lvSubject.setAdapter(adapter);
    }
}