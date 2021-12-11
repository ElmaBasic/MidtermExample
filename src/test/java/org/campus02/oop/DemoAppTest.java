package org.campus02.oop;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;



class DemoAppTest
{
    Person Elma;



    @BeforeEach
    void setUp()
    {
        Elma = new Person("Elma", "Basic",170, (byte)2);
    }



    @Test
    void rechneBMITest()
    {
        assertEquals("Uebergewicht", Elma.rechneBMI(75));
    }
}