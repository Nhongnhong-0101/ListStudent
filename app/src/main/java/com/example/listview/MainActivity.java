package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    Student_Adapter adapter;
    private ArrayList<Student> students;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //khởi tạo danh sách sv
        students = new ArrayList<>();
        students.add(new Student("Huynh Ngoc Y Nhi1","15-09-2003","KTPM2021", new ArrayList<>(Arrays.asList("IS0123","SS003","IT007","IT012")),R.drawable.avatar));
        students.add(new Student("Huynh Ngoc Y Nhi2","16-09-2003","KTPM2022", new ArrayList<>(Arrays.asList("IS0123","SS003","IT007","IT013")),R.drawable.avatar2));
        students.add(new Student("Huynh Ngoc Y Nhi3","17-09-2003","KTPM2023", new ArrayList<>(Arrays.asList("IS0123","SS003","IT007","IT014")),R.drawable.avatar));
        students.add(new Student("Huynh Ngoc Y Nhi4","18-09-2003","KTPM2024", new ArrayList<>(Arrays.asList("IS0123","SS003","IT007","IT015")),R.drawable.avatar2));

        //
        listView = (ListView) findViewById(R.id.lvStudent);
        adapter = new Student_Adapter(this, students);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Lấy thông tin chi tiết của sinh viên được chọn
                Student selectedStudent = students.get(position);

                // Chuyển sang màn hình chi tiết của sinh viên được chọn
                Intent intent = new Intent(MainActivity.this, StudentDetails.class);
                intent.putExtra("name", selectedStudent.getName());
                intent.putExtra("dob", selectedStudent.getDob());
                intent.putExtra("class", selectedStudent.GetClass());
                intent.putExtra("subjects", selectedStudent.getSubject());
                intent.putExtra("srcImage", selectedStudent.getImage());
                startActivity(intent);
            }
        });
    }
}
