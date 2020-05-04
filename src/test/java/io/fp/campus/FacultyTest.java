package io.fp.campus;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FacultyTest {

    Faculty hogwarts;

    @BeforeEach
    void setUp() {
        hogwarts = new Faculty("Hogwarts");
        Professor dumbledore = new Professor("Dumbledore", 77, "Dragons", hogwarts);
                
        Assistent hagrid = new Assistent("Hagrid", 26, hogwarts);
        hagrid.setBoss(dumbledore);
        Assistent dobby = new Assistent("Dobby", 130, hogwarts);
        dobby.setBoss(dumbledore);
       
        hogwarts.addProfessor(dumbledore);
        hogwarts.addAssistent(hagrid);
        hogwarts.addAssistent(dobby);
    }
    @Test
    void testGetProfsWithAssis() {
        ArrayList<Professor> profs = hogwarts.getProfs();
        ArrayList<Professor> profsWithAssis = hogwarts.getProfsWithAssis();
        assertEquals(profs, profsWithAssis);
    }

    @Test
    void testAddProfessor() {
      ArrayList<Professor> profs = hogwarts.getProfs();
      Professor prof1 = profs.get(0);
      assertThrows(RuntimeException.class,
          ()->{hogwarts.addProfessor(prof1);}
      );  
    }
}