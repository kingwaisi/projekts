/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.fp.campus;

public class App {

    public static void main(String[] args) {
        Faculty inf = new Faculty("INF");
        Professor schmolli = new Professor("Schmollinger", 77, "BPM", inf);
        System.out.println(schmolli.getName());
        System.out.println("Hält er Vorlesung? "+schmolli.isTalking());
        schmolli.setTalking(true);
        System.out.println("Hält er Vorlesung? "+schmolli.isTalking());

        Assistent kevin = new Assistent("Jovanovic", 26, inf);
        kevin.setBoss(schmolli);
        System.out.println(kevin.getName());
        System.out.println(kevin.getBoss().getName());

        Assistent juergen = new Assistent("Krauß", 30, inf);
        juergen.setBoss(schmolli);

        Assistent backe = new Assistent("Backe", 50, inf);
        
        inf.addProfessor(schmolli);
        inf.addAssistent(kevin);
        inf.addAssistent(juergen);
        inf.addAssistent(backe);

        System.out.println("Fakultät "+ inf.getName());
        System.out.println(inf.getProfs().toString());
        System.out.println(inf.getAssis().toString());

        System.out.println(inf.getAssisOfProf(schmolli));

    }
}
