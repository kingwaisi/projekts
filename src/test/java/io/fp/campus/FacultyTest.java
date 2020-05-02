package io.fp.campus;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacultyTest {

    Faculty inf;

    @BeforeEach
    void setUp() {
        inf = new Faculty("INF");
        Professor schmolli = new Professor("Schmollinger", 77, "BPM", inf);
        schmolli.setTalking(false);
        
        Assistent kevin = new Assistent("Jovanovic", 26, inf);
        kevin.setBoss(schmolli);

        Assistent juergen = new Assistent("Krauß", 30, inf);
        juergen.setBoss(schmolli);

        Assistent backe = new Assistent("Backe", 50, inf);
        
        inf.addProfessor(schmolli);
        inf.addAssistent(kevin);
        inf.addAssistent(juergen);
        inf.addAssistent(backe);
    }
    @Test
    void testGetProfWithAssis() {
        ArrayList<Professor> profs = inf.getProfs();
        ArrayList<Professor> profsWithAssis = inf.getProfWithAssis();
        assertEquals(profs, profsWithAssis);
    }
}