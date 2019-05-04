/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author X
 */
public class ProductWeightComparatorTest {
    
    public ProductWeightComparatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of compare method, of class ProductWeightComparator.
     */
    @Test
    public void testCompare() {
        //----------------------Test1-----------------------//
        System.out.println("compare");
        Product a = new Product("Compass", 4, true, false);
        Product b = new Product("Compass", 4, true, false);
     
        ProductWeightComparator instance = new ProductWeightComparator();
        int expResult = 0;
        int result = instance.compare(a, b);
        assertEquals(expResult, result);
        //----------------------Test1-----------------------//
        
        //----------------------Test2-----------------------//
        System.out.println("compare");
        Product a2 = new Product("Compass", 4, true, false);
        Product b2 = new Product("Compass", 4, true, false);
     
        ProductWeightComparator instance2 = new ProductWeightComparator();
        int expResult2 = 0;
        int result2 = instance.compare(a2, b2);
        assertEquals(expResult2, result2);
        //----------------------Test2-----------------------//
        //----------------------Test3-----------------------//
        System.out.println("compare");
        Product a3 = new Product("Compass", 4, true, false);
        Product b3 = new Product("Compass", 4, true, false);
     
        ProductWeightComparator instance3 = new ProductWeightComparator();
        int expResult3 = 0;
        int result3 = instance.compare(a3, b3);
        assertEquals(expResult3, result3);
        //----------------------Test3-----------------------//
       
    }
    
}
