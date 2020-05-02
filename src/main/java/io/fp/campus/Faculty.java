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
        if (!profs.contains(professor))
            profs.add(professor);
    }

    public void addAssistent(Assistent assistent) {
        if (!assis.contains(assistent))
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

        if (!profs.contains(professor)){

            return profassis;
        }

        for (Assistent assi : assis) {
            Professor p = assi.getBoss();
            if (p!=null&&p.equals(professor)) {
                profassis.add(assi);
            }
        }
        return profassis;
    }

    public ArrayList<Professor> getProfsWithAssis(){

        ArrayList<Professor> profsWithAssis = new ArrayList<>();

        for(Assistent assi : assis){

            Professor p = assi.getBoss();

            if(p != null && !profsWithAssis.contains(p)){
               
                profsWithAssis.add(p);
            }
        }

        return profsWithAssis;
    }

    public int getAmountProfs(){

        return profs.size();
    }

    public int getAmountAssis(){

        return assis.size();
    }
}