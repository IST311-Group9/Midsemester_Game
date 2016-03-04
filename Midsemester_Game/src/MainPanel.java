
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class MainPanel extends JPanel implements ActionListener{
    
    private ButtonPanel button;
    private IntroPanel intro;
    private GamePanel game;
    private int PaneDisplayed;
    private Person Player;
    private Room Lobby;
    private Room IST201;
    private Room IST202;
    private Room IST203;
    private Room IST205;
    private Room IST206;
    private Room IST208;
    private Room IST210;
    private Professor professor;
    
    MainPanel(){
        super();
        setBackground(Color.gray);		
        setLayout(new BorderLayout());
        
        intro = new IntroPanel();
        game = new GamePanel();
        button = new ButtonPanel();
        
        add(intro, BorderLayout.CENTER);
        PaneDisplayed = 1;
        
        add(button, BorderLayout.SOUTH);
        button.ActionButton.addActionListener(this);
}
    public void clearPanel(){
        remove(intro);
        remove(game);
        revalidate();
        repaint();
        }
    public String printLocation(){
        Room currentRoom = Player.getLocation();
        if(currentRoom.getName().equals("Lobby")){
            return("You are in the " + currentRoom.getName() + System.lineSeparator());
        }else{
        return ("You are in " + currentRoom.getName() + System.lineSeparator());
            }
    }
    public Person CreatePlayer(String Name, String Gender, Boolean isPlayer,Room StartingLocation){
        return new Person(Name, Gender, isPlayer, StartingLocation);
    }
    public String PrintNeighboringRooms(ArrayList<Room> NeighboringRooms){
        String stringToPrint = ("WHAT ROOM WOULD YOU LIKE TO MOVE TO?" + System.lineSeparator());
            for(int i = 0; i < NeighboringRooms.size(); i++){
                Room tempRoom = NeighboringRooms.get(i);
                int displayNumber = i + 1;
                stringToPrint = (stringToPrint + displayNumber + (".)") + tempRoom.getName() + System.lineSeparator());
            }
        
             return stringToPrint;   
    }
    public void changeRooms(int userSelection){
            Room currentRoom = Player.getLocation();
            currentRoom.removePerson();
            Room roomToGoTo = currentRoom.getSingleRoom(userSelection);
            Player.setLocation(roomToGoTo);
            currentRoom = Player.getLocation();
            currentRoom.addPerson(Player);
            printLocation();
            game.PrintToGameText(printLocation());
            game.PrintToGameText(PrintNeighboringRooms(currentRoom.getNeighboringRooms()));
    }
    
    public void addProfessorToRandomRoom()
    {
        int[] roomNums = {201,202,203,205,206,208,210};
        Random rand = new Random();
        int randomRoom = roomNums[rand.nextInt(roomNums.length)];
        
        if (randomRoom == 201)
        {
            IST201.addProfessor(professor);
            professor.setLocation(IST201);
        }
        else if (randomRoom == 202)
        {
            IST202.addProfessor(professor);
            professor.setLocation(IST202);
        }
        else if (randomRoom == 203)
        {
            IST203.addProfessor(professor);
            professor.setLocation(IST203);
        }
        else if (randomRoom == 205)
        {
            IST205.addProfessor(professor);
            professor.setLocation(IST205);
        }
        else if (randomRoom == 206)
        {
            IST206.addProfessor(professor);
            professor.setLocation(IST206);
        }
        else if (randomRoom == 208)
        {
            IST208.addProfessor(professor);
            professor.setLocation(IST208);
        }
        else if (randomRoom == 210)
        {
            IST210.addProfessor(professor);
            professor.setLocation(IST210);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(PaneDisplayed == 1){
            Lobby = new Room("Lobby", 0);
            IST201 = new Room("IST201", 201);
            IST202 = new Room("IST202", 202);
            IST203 = new Room("IST203", 203);
            IST205 = new Room("IST205", 205);
            IST206 = new Room("IST206", 206);
            IST208 = new Room("IST208", 208);
            IST210 = new Room("IST210", 210);
            Lobby.addRoom(IST201);
            Lobby.addRoom(IST202);
            Lobby.addRoom(IST203);
            Lobby.addRoom(IST205);
            Lobby.addRoom(IST206);
            Lobby.addRoom(IST208);
            Lobby.addRoom(IST210);
            IST210.addRoom(Lobby);
            IST208.addRoom(Lobby);
            IST201.addRoom(Lobby);
            IST202.addRoom(Lobby);
            IST203.addRoom(Lobby);
            IST205.addRoom(Lobby);
            IST206.addRoom(Lobby);
            
            Player = CreatePlayer(intro.getName(), intro.getGender(), true, Lobby);
            
            clearPanel();
            add(game);
            game.PrintToGameText(printLocation());
            button.setTextEnter();
            game.PrintToGameText(PrintNeighboringRooms(Lobby.getNeighboringRooms()));
            PaneDisplayed = 2;
            
        }else{
            int userSelection = game.getUserSelectionNumber() - 1;
            changeRooms(userSelection);
        }
    }
    }
