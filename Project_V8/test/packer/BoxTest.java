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
public class BoxTest {
    
    public BoxTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addProduct method, of class Box.
     */
    @Test
    public void testAddProduct_Product() {
        System.out.println("addProduct");
        Product product = null;
        Box instance = null;
        instance.addProduct(product);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of addProduct method, of class Box.
     */
    @Test
    public void testAddProduct_Product_int() {
        System.out.println("addProduct");
        Product product = null;
        int quantity = 0;
        Box instance = null;
        instance.addProduct(product, quantity);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getLabel method, of class Box.
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        Box instance = null;
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of toString method, of class Box.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Box instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getWeight method, of class Box.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Box instance = null;
        double expResult = 0.0;
        double result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of canFit method, of class Box.
     */
    @Test
    public void testCanFit_Product() {
        System.out.println("canFit");
        Product p = null;
        Box instance = null;
        boolean expResult = false;
        boolean result = instance.canFit(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of canFit method, of class Box.
     */
    @Test
    public void testCanFit_Product_int() {
        System.out.println("canFit");
        Product p = null;
        int quantity = 0;
        Box instance = null;
        boolean expResult = false;
        boolean result = instance.canFit(p, quantity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of remainingCapacity method, of class Box.
     */
    @Test
    public void testRemainingCapacity() {
        System.out.println("remainingCapacity");
      
        Box instance = null;
        double expResult = 0.0;
        double result = instance.remainingCapacity();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of isFragile method, of class Box.
     */
    @Test
    public void testIsFragile() {
        //----------------------Test1-----------------------//
        //PRODUCT1
        Product p1 = new Product("Scissors", 4, true, false);
        //ADDRESS1
        Coordinates testCoordinates1 = new Coordinates(3,4);
        Address testAddress1 = new Address("1 First St", "Aplace", "Citadel City", "A111", testCoordinates1);
        //CUSTOMER1
        Customer c1 = new Customer("C1",testAddress1);
        //DEPOT
        Coordinates testCoordinates0 = new Coordinates(0,0);
        Address testAddress0 = new Address("111 Emerge Rd", "Really", "Inn Town", "D444", testCoordinates0);
        Depot d = new Depot("Test Depot", testAddress0);
        //BOX1
        Box b1 = new Box(c1,d);      
        
        System.out.println("isFragile");
        Box instance = null;
        boolean expResult = false;
        boolean result = b1.isFragile();
        assertEquals(expResult, result);
        //----------------------Test1-----------------------//
        //----------------------Test2-----------------------//
         //PRODUCT2
        Product p2 = new Product("Phone", 3, false, false);
        //ADDRESS2
        Coordinates testCoordinates4 = new Coordinates(3000, 4000);
        Address testAddress4 = new Address("55 Some St", "Somewhere", "Elsewhere", "E555", testCoordinates4);
         //CUSTOMER2
        Customer c2 = new Customer("C1",testAddress4);
        //DEPO2
        Coordinates testCoordinates3 = new Coordinates(300, 400);
        Address testAddress3 = new Address("321 Back St", "Christly", "Holly Oaks", "C333", testCoordinates3);
        Depot d2 = new Depot("Test Depot", testAddress3);
        //BOX2
        Box b2 = new Box(c2,d2);      
        
        System.out.println("isFragile");

        boolean expResult2 = false;
        boolean result2 = b2.isFragile();
        assertEquals(expResult, result);
      
        //----------------------Test2-----------------------//
        //----------------------Test3-----------------------//
        //PRODUCT3
        Product p3 = new Product("Paper", 3, false, false);
        //ADDRESS3
        Coordinates testCoordinates7 = new Coordinates(30000, 40000);
        Address testAddress7 = new Address("555 Some St", "Somewhere", "Elsewhere", "E555", testCoordinates7);
         //CUSTOMER3
        Customer c3 = new Customer("C3",testAddress7);
        //DEPO3
        Coordinates testCoordinates8 = new Coordinates(300000, 400000);
        Address testAddress8 = new Address("321 Back St", "Christly", "Holly Oaks", "C333", testCoordinates8);
        Depot d3 = new Depot("Test Depot", testAddress8);
        //BOX3
        Box b3 = new Box(c3,d3);      
        
        System.out.println("isFragile");

        boolean expResult3 = false;
        boolean result3 = b2.isFragile();
        assertEquals(expResult, result);
        //----------------------Test3-----------------------//
    }
    
    
    
    
    
    
    
    
    
    
    
    


    /**
     * Test of isHazardous method, of class Box.
     */
    @Test
    public void testIsHazardous() {
        //----------------------Test-----------------------//
        //ADDRESS1
        Coordinates testCoordinates1 = new Coordinates(3,4);
        Address testAddress1 = new Address("1 First St", "Aplace", "Citadel City", "A111", testCoordinates1);
        //CUSTOMER1
        Customer c1 = new Customer("C1",testAddress1);
        //DEPOT
        Coordinates testCoordinates0 = new Coordinates(0,0);
        Address testAddress0 = new Address("111 Emerge Rd", "Really", "Inn Town", "D444", testCoordinates0);
        Depot d = new Depot("Test Depot", testAddress0);
        //BOX1
        //PRODUCT1
        Product p1 = new Product("Scissors", 4, true, false);
        Box b1 = new Box(c1,d);   
        //---------------------
        System.out.println("isHazardous");
        boolean expResult = false;
        //result should be true because it is hazardous
        boolean result = b1.isFragile();
        assertEquals(expResult, result);
        //----------------------Test 1-----------------------//
        //----------------------Test 2-----------------------//
        //ADDRESS2
        Coordinates testCoordinates2 = new Coordinates(30,40);
        Address testAddress2 = new Address("123 Count St", "Brooklyn", "Welling Town", "B222", testCoordinates2);
        //CUSTOMER1
        Customer c2 = new Customer("C2",testAddress2);
        //DEPOT
        Coordinates testCoordinates5 = new Coordinates(3000,4000);
        Address testAddress3 = new Address("321 Back St", "Christly", "Holly Oaks", "C333", testCoordinates5);
        Depot d2 = new Depot("Test Depot", testAddress3);
        //BOX1
        //PRODUCT1
        Product p2 = new Product("Pins", 4, true, true);
        Box b2 = new Box(c2,d2);   
        //---------------------
        System.out.println("isHazardous");
        boolean expResult2 = true;
        //result should be true because it is hazardous
        boolean result2 = b2.isFragile();
        assertEquals(expResult, result);
        //----------------------Test 2-----------------------//
        
        //----------------------Test 3-----------------------//
        //ADDRESS3
        Coordinates testCoordinates7 = new Coordinates(30,40);
        Address testAddress7 = new Address("321 Back St", "Christly", "Holly Oaks", "C333", testCoordinates7);
     //CUSTOMER3
        Customer c7 = new Customer("C7",testAddress7);
        //DEPOT3
        Coordinates testCoordinates8 = new Coordinates(3000,4000);
        Address testAddress4 = new Address("321 Back St", "Christly", "Holly Oaks", "C333", testCoordinates8);
        Depot d3 = new Depot("Test Depot", testAddress4);
        
        //PRODUCT3
        Product p3 = new Product("Pen", 4, true, true);
        //BOX3
        Box b3 = new Box(c2,d2);   
        //---------------------
        System.out.println("isHazardous");
        boolean expResult3 = true;
        //result should be true because it is hazardous
        boolean result3 = b3.isFragile();
        assertEquals(expResult, result);
        //----------------------Test 3-----------------------//
        
       
    }
    
}
