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
public class ManifestTest {
    
    public ManifestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addProduct method, of class Manifest.
     */
    @Test
    public void testAddProduct_Product() {
        System.out.println("addProduct");
        Product p = null;
        Manifest instance = new Manifest();
        instance.addProduct(p);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of addProduct method, of class Manifest.
     */
    @Test
    public void testAddProduct_Product_int() {
        System.out.println("addProduct");
        Product p = null;
        int quantity = 0;
        Manifest instance = new Manifest();
        instance.addProduct(p, quantity);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of removeProduct method, of class Manifest.
     */
    @Test
    public void testRemoveProduct() {
        System.out.println("removeProduct");
        Product p = null;
        Manifest instance = new Manifest();
        instance.removeProduct(p);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getTotalWeight method, of class Manifest.
     */
    @Test
    public void testGetTotalWeight() {
        System.out.println("getTotalWeight");
        //MANIFEST1
        Manifest manifest1 = new Manifest();
        manifest1.addProduct(new Product("Hammer", 3, false, false), 1);
        //MANIFEST2
        Manifest manifest2 = new Manifest();
        manifest2.addProduct(new Product("Hammer", 4, false, false), 3);
        //MANIFEST3
        Manifest manifest3 = new Manifest();
        manifest3.addProduct(new Product("Hammer", 3, false, false), 5);
         
        //TEST1
        double expResult1 = 3;
        double result1 = manifest1.getTotalWeight();
        assertEquals(expResult1, result1, 0.0);
        //TEST2
        double expResult2 = 12;
        double result2 = manifest2.getTotalWeight();
        assertEquals(expResult2, result2, 0.0);
        //TEST3
        double expResult3 = 15;
        double result3 = manifest3.getTotalWeight();
        assertEquals(expResult3, result3, 0.0);
    }

    /**
     * Test of getHeaviestUnder method, of class Manifest.
     */
    @Test
    public void testGetHeaviestUnder() {
        System.out.println("getHeaviestUnder");
        //TEST DATA1
        Manifest manifest1 = new Manifest();
        manifest1.addProduct(new Product("Hammer", 3, false, false), 1);
        manifest1.addProduct(new Product("Nails", 1, false, false), 12);
        //TEST DATA2
        Manifest manifest2 = new Manifest();
        manifest2.addProduct(new Product("Hammer", 3, false, false), 1);
        manifest2.addProduct(new Product("Nails", 1, false, false), 12);
        //TEST DATA3
        Manifest manifest3 = new Manifest();
        manifest3.addProduct(new Product("Hammer", 3, false, false), 1);
        manifest3.addProduct(new Product("Nails", 1, false, false), 12);
      
        Product expResult = manifest1.getHeaviestUnder(10);
        Product result = manifest1.getHeaviestUnder(10);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of isEmpty method, of class Manifest.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        //MANIFEST1
        Manifest manifest1 = new Manifest();
        //MANIFEST2
        Manifest manifest2 = new Manifest();
        manifest2.addProduct(new Product("Hammer", 3, false, false), 1);
        //MANIFEST3
        Manifest manifest3 = new Manifest();
        
       //TEST1
        boolean expResult1 = true;
        boolean result1 = manifest1.isEmpty();
        assertEquals(expResult1, result1);
        //TEST2
        boolean expResult2 = false;
        boolean result2 = manifest2.isEmpty();
        assertEquals(expResult2, result2);
        //TEST2
        boolean expResult3 = true;
        boolean result3 = manifest3.isEmpty();
        assertEquals(expResult3, result3);
  
  
      
    }

    /**
     * Test of containsProduct method, of class Manifest.
     */
    @Test
    public void testContainsProduct() {
        System.out.println("containsProduct");
        //TEST DATA SET1
        Manifest manifest1 = new Manifest();
        manifest1.addProduct(new Product("Hammer", 3, false, false), 1);
        Product p1 = new Product("x1", 4, true, true);
        ////TEST DATA SET2
        Manifest manifest2 = new Manifest();
        manifest2.addProduct(new Product("HammerHead", 4, true, true), 12);
        Product p2 = new Product("x2", 4, true, false);
        ////TEST DATA SET3
        Manifest manifest3 = new Manifest();
        manifest3.addProduct(new Product("Net", 5, true, false), 1);
        Product p3 = new Product("x1", 4, false, false);
        
        //TEST1
        boolean expResult1 = false;
        boolean result1 = manifest1.containsProduct(p1);
        assertEquals(expResult1, result1);
        //TEST2
        boolean expResult2 = false;
        boolean result2 = manifest2.containsProduct(p2);
        assertEquals(expResult2, result2);
        //TEST3
        boolean expResult3 = false;
        boolean result3 = manifest3.containsProduct(p3);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of toString method, of class Manifest.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        //MANIFEST1
        Manifest manifest1 = new Manifest();
        manifest1.addProduct(new Product("Hammer", 3, false, false));
        //MANIFEST2
        Manifest manifest2 = new Manifest();
        manifest2.addProduct(new Product("Hammer", 3, false, false));
        //MANIFEST3
        Manifest manifest3 = new Manifest();
        manifest3.addProduct(new Product("Hammer", 3, false, false));
        //TEST1
        String expResult1 = manifest1.toString();
        String result1 = manifest2.toString();
        assertEquals(expResult1, result1);
        //TEST2
        String expResult2 = manifest3.toString();
        String result2 = manifest2.toString();
        assertEquals(expResult2, result2);
        //TEST3
        String expResult3 = manifest1.toString();
        String result3 = manifest3.toString();
        assertEquals(expResult3, result3);
        
        
    }

    /**
     * Test of hasFragileItems method, of class Manifest.
     */
    @Test
    public void testHasFragileItems() {
        System.out.println("hasFragileItems");
        //MANIFEST1
        Manifest manifest1 = new Manifest();
        manifest1.addProduct(new Product("Hammer", 3, false, false), 1);
        //MANIFEST2
        Manifest manifest2 = new Manifest();
        manifest2.addProduct(new Product("Hammer", 3, false, false), 1);
        //MANIFEST3
        Manifest manifest3 = new Manifest();
        manifest3.addProduct(new Product("Hammer", 3, false, false), 1);
        
        //TEST1
        boolean expResult1 = false;
        boolean result1 = manifest1.hasFragileItems();
        assertEquals(expResult1, result1);
        //TEST2
        boolean expResult2 = false;
        boolean result2 = manifest2.hasFragileItems();
        assertEquals(expResult2, result2);
        //TEST3
        boolean expResult3 = false;
        boolean result3 = manifest3.hasFragileItems();
        assertEquals(expResult3, result3);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
