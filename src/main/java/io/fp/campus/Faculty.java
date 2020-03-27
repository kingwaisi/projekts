package io.fp.campus;

import java.util.ArrayList;
/**
 * Faculty
 */
public class Faculty {

    private String name;
    private ArrayList<Professor> profs;
    private ArrayList<Assistent> assis;

    public Faculty(String name) {
        this.name=name;
        this.assis=new ArrayList<Assistent>();
        this.profs=new ArrayList<Professor>();
    }

    public String getName() {
        return name;
    }

    public void addProfessor(Professor professor) {
        profs.add(professor);
    }

    public void addAssistent(Assistent assistent) {
        assis.add(assistent);
    }

    public ArrayList<Professor> getProfs() {
        return profs;
    }

    public ArrayList<Assistent> getAssis() {
        return assis;
    }

    public ArrayList<Assistent> getAssisOfProf(Professor professor) {

        ArrayList<Assistent> profassis = new ArrayList<>();

        if (!profs.contains(professor)) return profassis;

        for (Assistent assi : assis) {
            Professor p = assi.getBoss();
            if (p!=null&&p.equals(professor)) {
                profassis.add(assi);
            }
        }
        return profassis;
    }

}