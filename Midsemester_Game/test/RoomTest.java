/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
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
public class RoomTest {
    
    public RoomTest() {
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
     * Test of getName method, of class Room.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Room instance = new Room("IST",210);
        String expResult = "IST";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    public void testGetRoomNumber() {
        System.out.println("getRoomNumber");
        Room instance = new Room("IST",210);
        int expResult = 210;
        int result = instance.getRoomNumber();
        assertEquals(expResult, result);
    }
    @Test
    /**
     * Test of getPeopleInRoom method, of class Room.
     */
    public void testGetPeopleInRoom() {
        System.out.println("getPeopleInRoom");
        Room instance = new Room("IST",210);
        Person Joe = new Person("Joe","Schmoe",false,instance);
        Person Arthur = new Person("Arthur","Zhang",true,instance);
        ArrayList<Person> expResult;
        expResult.add(Joe);
        expResult.add(Arthur);
        ArrayList<Person> result = instance.getPeopleInRoom();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetNeighboringRooms() {
        System.out.println("getNeighboringRooms");
        Room instance = null;
        ArrayList<Room> expResult = null;
        ArrayList<Room> result = instance.getNeighboringRooms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
