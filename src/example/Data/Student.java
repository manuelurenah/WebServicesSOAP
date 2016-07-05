package example.Data;

import java.util.List;

/**
 * Created by MEUrena on 7/4/16.
 * All rights reserved.
 */
public class Student {

    private int id;
    private String name;
    private String career;
    private List<Subject> subjects;

    public Student() { }

    public Student(int id, String name, String career) {
        this.id = id;
        this.name = name;
        this.career = career;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

}
