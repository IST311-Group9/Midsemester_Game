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

    /**
     * Test of setName method, of class Room.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Room instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomNumber method, of class Room.
     */
    @Test
    public void testGetRoomNumber() {
        System.out.println("getRoomNumber");
        Room instance = null;
        int expResult = 0;
        int result = instance.getRoomNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoomNumber method, of class Room.
     */
    @Test
    public void testSetRoomNumber() {
        System.out.println("setRoomNumber");
        int roomNumber = 0;
        Room instance = null;
        instance.setRoomNumber(roomNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPerson method, of class Room.
     */
    @Test
    public void testAddPerson() {
        System.out.println("addPerson");
        Person personToAdd = null;
        Room instance = null;
        instance.addPerson(personToAdd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPeopleInRoom method, of class Room.
     */
    @Test
    public void testGetPeopleInRoom() {
        System.out.println("getPeopleInRoom");
        Room instance = null;
        ArrayList<Person> expResult = null;
        ArrayList<Person> result = instance.getPeopleInRoom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRoom method, of class Room.
     */
    @Test
    public void testAddRoom() {
        System.out.println("addRoom");
        Room roomToAdd = null;
        Room instance = null;
        instance.addRoom(roomToAdd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNeighboringRooms method, of class Room.
     */
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

    /**
     * Test of getSingleRoom method, of class Room.
     */
    @Test
    public void testGetSingleRoom() {
        System.out.println("getSingleRoom");
        int userSelection = 0;
        Room instance = null;
        Room expResult = null;
        Room result = instance.getSingleRoom(userSelection);
        assertEquals(expResult, result);
    }
    
}
