/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variant7;

import java.util.HashSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rusin
 */
public class VCaller7Test {
    
    public VCaller7Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of union method, of class VCaller7.
     */
    @Test
    public void testUnion() {
        System.out.println("union");
        HashSet<String> add = new HashSet<String>();
        add.add("new strings");
        add.add("again new strings");
        VCaller7 instance = new VCaller7();
        boolean expResult = false;
        boolean result = instance.union(add);//не проходит тест из-за NullPointerException, не смог найти к этому решение
       assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of diff method, of class VCaller7.
     */
   /* @Test
    public void testDiff() {
        System.out.println("diff");
        HashSet<String> in = null;
        VCaller7 instance = new VCaller7();
        HashSet<String> expResult = null;
        HashSet<String> result = instance.diff(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
