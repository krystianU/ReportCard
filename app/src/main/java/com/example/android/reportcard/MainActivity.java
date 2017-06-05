package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard studentOne = new ReportCard(0001);

        List<String> subjectsList = new ArrayList<>();
        subjectsList.add("Programming basics");
        subjectsList.add("JAVA programming for Android");
        subjectsList.add("Math");
        subjectsList.add("Economics");
        subjectsList.add("English");

        studentOne.setmSubjects(subjectsList);

        List<Integer> gradesList = new ArrayList<>();
        gradesList.add(5);
        gradesList.add(4);
        gradesList.add(3);
        gradesList.add(4);
        gradesList.add(5);

        studentOne.setmGrades(gradesList);
    }

}
