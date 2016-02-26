/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author az060_001
 */
public class PersonTest {
    
    public PersonTest() {
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
     * Test of getName method, of class Person.
     */
    @Test
//    public void testGetName() {
//        System.out.println("getName");
//        Person instance = null;
//        String expResult = "";
//        String result = instance.getName();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setName method, of class Person.
//     */
//    @Test
//    public void testSetName() {
//        System.out.println("setName");
//        String name = "";
//        Person instance = null;
//        instance.setName(name);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getGender method, of class Person.
//     */
//    @Test
//    public void testGetGender() {
//        System.out.println("getGender");
//        Person instance = null;
//        String expResult = "";
//        String result = instance.getGender();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setGender method, of class Person.
//     */
//    @Test
//    public void testSetGender() {
//        System.out.println("setGender");
//        String gender = "";
//        Person instance = null;
//        instance.setGender(gender);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isIsPlayer method, of class Person.
//     */
//    @Test
//    public void testIsIsPlayer() {
//        System.out.println("isIsPlayer");
//        Person instance = null;
//        boolean expResult = false;
//        boolean result = instance.isIsPlayer();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setIsPlayer method, of class Person.
//     */
//    @Test
//    public void testSetIsPlayer() {
//        System.out.println("setIsPlayer");
//        boolean isPlayer = false;
//        Person instance = null;
//        instance.setIsPlayer(isPlayer);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLocation method, of class Person.
//     */
//    @Test
//    public void testGetLocation() {
//        System.out.println("getLocation");
//        Person instance = null;
//        String expResult = "";
//        String result = instance.getLocation();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setLocation method, of class Person.
//     */
//    @Test
//    public void testSetLocation() {
//        System.out.println("setLocation");
//        String location = "";
//        Person instance = null;
//        instance.setLocation(location);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getPersonInfo method, of class Person.
     */
//    @Test
    public void testGetPersonInfo() {
        System.out.println("getPersonInfo");
        String name = "Arthur Zhang";
        String gender = "Male";
        boolean isPlayer = true;
        Room location = new Room("IST",210);
        Person instance = new Person(name, gender, isPlayer, location);
        String expResult = "Name: Arthur Zhang, Gender: Male, Is Player: true, Location: IST 210";
        String result = instance.getPersonInfo(name, gender, isPlayer, location);
        assertEquals(expResult, result);
    }
//
//    /**
//     * Test of getName method, of class Person.
//     */
//    @Test
//    public void testGetName() {
//        System.out.println("getName");
//        Person instance = null;
//        String expResult = "";
//        String result = instance.getName();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setName method, of class Person.
//     */
//    @Test
//    public void testSetName() {
//        System.out.println("setName");
//        String name = "";
//        Person instance = null;
//        instance.setName(name);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getGender method, of class Person.
//     */
//    @Test
//    public void testGetGender() {
//        System.out.println("getGender");
//        Person instance = null;
//        String expResult = "";
//        String result = instance.getGender();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setGender method, of class Person.
//     */
//    @Test
//    public void testSetGender() {
//        System.out.println("setGender");
//        String gender = "";
//        Person instance = null;
//        instance.setGender(gender);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isIsPlayer method, of class Person.
//     */
//    @Test
//    public void testIsIsPlayer() {
//        System.out.println("isIsPlayer");
//        Person instance = null;
//        boolean expResult = false;
//        boolean result = instance.isIsPlayer();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setIsPlayer method, of class Person.
//     */
//    @Test
//    public void testSetIsPlayer() {
//        System.out.println("setIsPlayer");
//        boolean isPlayer = false;
//        Person instance = null;
//        instance.setIsPlayer(isPlayer);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLocation method, of class Person.
//     */
//    @Test
//    public void testGetLocation() {
//        System.out.println("getLocation");
//        Person instance = null;
//        Room expResult = null;
//        Room result = instance.getLocation();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setLocation method, of class Person.
//     */
//    @Test
//    public void testSetLocation() {
//        System.out.println("setLocation");
//        Room location = null;
//        Person instance = null;
//        instance.setLocation(location);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
