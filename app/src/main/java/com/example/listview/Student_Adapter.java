package com.example.listview;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
public class Student_Adapter extends BaseAdapter {
    Context context;
    private ArrayList <Student> item;

    public Student_Adapter( Context context, ArrayList<Student> item) {
        this.context = context;
        this.item = item;
    }

    @Override
    public int getCount() {
        return item.size();
    }

    @Override
    public Object getItem(int i) {
        return item.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        if (v == null)
        {
            v = LayoutInflater.from(context).inflate(R.layout.activity_student_details, viewGroup, false);

            //anh xâ dư lieu
            Student student = item.get(i);
            TextView tvName = v.findViewById(R.id.tvName);
            TextView tvDateOfBirth = v.findViewById(R.id.tvDob);
            TextView tvClass = v.findViewById(R.id.tvClass);
            ImageView imageView = v.findViewById(R.id.image);
            //TextView tvSubjects = v.findViewById(R.id.lvSubjects);

            tvName.setText(student.getName());
            tvDateOfBirth.setText(student.getDob().toString());
            tvClass.setText(student.GetClass());
            imageView.setImageResource(student.getImage());
           //tvSubjects.setText(TextUtils.join(", ", student.getSubject()));
        }
        return v;
    }
}
