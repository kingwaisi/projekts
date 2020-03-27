package io.fp.campus;

public class Professor {

    private String name;
    private int age;
    private boolean isTalking=false;
    private String researchArea=null;
    private Faculty faculty;

    public Professor(String name, int age, String researchArea, Faculty faculty) {
        this.name=name;
        this.age=age;
        this.researchArea=researchArea;
        this.faculty=faculty;
    }

    public void setTalking(boolean isTalking) {
        this.isTalking=isTalking;
    }

    public boolean isTalking() {
        return isTalking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea=researchArea;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Faculty getFaculty() {
        return this.faculty;
    }

    public String toString() {
        return name;
    }
}