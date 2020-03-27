package io.fp.campus;

/**
 * Assistent
 */
public class Assistent {

    private String name;
    private int age;
    private Professor boss;
    private Faculty faculty;

    public Assistent(String name, int age, Faculty faculty) {
        this.name=name;
        this.age=age;
        this.faculty = faculty;
    }

    public void setBoss(Professor boss) {
        this.boss=boss;
    }

    public Professor getBoss() {
        return boss;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Faculty getFaculty() {
        return this.faculty;
    }
}