package com.example.android.reportcard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tit0 on 04.06.2017.
 */

public class ReportCard {
    private int mStudentId;
    final private String universityName = "University of Economics";
    private List<String> mSubjects;
    private List<Integer> mGrades;


    public ReportCard(int studentId){
        this.mStudentId = studentId;
        this.mSubjects = new ArrayList<>();
        this.mGrades = new ArrayList<>();
    }
    public int getStudentId(){
        return mStudentId;
    }
    public String getUniversityName() {
        return universityName;
    }

    public List<String> getSubjects() {
        return mSubjects;
    }
    public void setmSubjects(List<String> subjects){
        this.mSubjects = subjects;
    }

    public List<Integer> getGrades() {
        return mGrades;
    }
    public void setmGrades(List<Integer> grades){
        this.mGrades = grades;
    }
    public double getAverageGrade(){
        int sum =0;

        for(int i = 0; i < mGrades.size(); i++){
            sum += mGrades.get(i);

        }
        double averageGrade = sum / mGrades.size();
        return averageGrade;
    }
    public String getSubjectsWithGrades(int index){
        List<String> subjects = getSubjects();
        List<Integer> grades = getGrades();

        String subjectsWithGrades = subjects.get(index) + " grade: "+
                Integer.toString(grades.get(index));
        return subjectsWithGrades;
    }

    @Override
    public String toString() {
        String reportCard = "University: " +getUniversityName() + "\n" + "Student ID: " + Integer.toString(getStudentId())+"\n" +
                "Average grade: " + getAverageGrade() + "\n";
        return reportCard;

    }
}

