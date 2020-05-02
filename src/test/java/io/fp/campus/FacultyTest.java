package io.fp.campus;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacultyTest {

    Faculty hogwarts;

    @BeforeEach
    void setUp() {
        hogwarts = new Faculty("Hogwarts");
        Professor dumbledore = new Professor("Dumbledore", 77, "BPM", hogwarts);
        dumbledore.setTalking(false);
        
        Assistent hagrid = new Assistent("Hagrid", 26, hogwarts);
        hagrid.setBoss(dumbledore);

        Assistent dobby = new Assistent("Dobby", 130, hogwarts);
        dobby.setBoss(dumbledore);

        Assistent pince = new Assistent("Madam Pince", 40, hogwarts);
        
        hogwarts.addProfessor(dumbledore);
        hogwarts.addAssistent(hagrid);
        hogwarts.addAssistent(dobby);
        hogwarts.addAssistent(pince);
    }
    @Test
    void testGetProfsWithAssis() {
        ArrayList<Professor> profs = hogwarts.getProfs();
        ArrayList<Professor> profsWithAssis = hogwarts.getProfsWithAssis();
        assertEquals(profs, profsWithAssis);
    }
}