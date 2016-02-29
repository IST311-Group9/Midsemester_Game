
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author az060_001
 */
public class Room {
    private String name;
    private int roomNumber;
    private ArrayList<Person> PeopleInRoom;
    private ArrayList<Room> NeighboringRooms;
    
    Room(String name, int number){
        this.name = name;
        this.roomNumber = number;
        PeopleInRoom = new ArrayList();
        NeighboringRooms = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the roomNumber
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * @param roomNumber the roomNumber to set
     */
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public void addPerson(Person personToAdd){
        PeopleInRoom.add(personToAdd);
    }
    public ArrayList<Person> getPeopleInRoom(){
        
       return PeopleInRoom;
       
    }
   public void addRoom(Room roomToAdd){
        NeighboringRooms.add(roomToAdd);
    }
    public ArrayList<Room> getNeighboringRooms(){

         return NeighboringRooms;
        
    }
    public Room getSingleRoom(int userSelection){
        return NeighboringRooms.get(userSelection);
    }
    public void removePerson()
    {
        PeopleInRoom.remove(PeopleInRoom.size()-1);
    }
}
