package org.campus02.collection.articleapp;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import java.util.ArrayList;
import java.util.HashSet;



import static org.junit.jupiter.api.Assertions.*;



class EinkaufsListenAppTest
{
    ArrayList<Einkauf> einkaufsliste;
    HashSet<Einkauf> hashSetEinkaufsliste;



    @BeforeEach
    void setUp()
    {
        einkaufsliste = new ArrayList<>();
        einkaufsliste.add(new Einkauf("Milch", 2.00));
        einkaufsliste.add(new Einkauf("Zucker", 3.50));
        einkaufsliste.add(new Einkauf("Brot", 1.50));



        hashSetEinkaufsliste = new HashSet<>();
        hashSetEinkaufsliste.add(new Einkauf("Milch", 2.00));
        hashSetEinkaufsliste.add(new Einkauf("Zucker", 3.50));
        hashSetEinkaufsliste.add(new Einkauf("Brot", 1.50));
    }



    @Test
    void SumArrayList()
    {
        assertEquals(7.0, EinkaufsListenApp.sum(einkaufsliste));
    }



    @Test
    void SumHastSet()
    {
        assertEquals(7.0, EinkaufsListenApp.sum(hashSetEinkaufsliste));
    }
}