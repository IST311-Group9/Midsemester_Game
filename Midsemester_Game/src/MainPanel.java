
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
    ButtonPanel button;
    IntroPanel intro;
    GamePanel game;
    int PaneDisplayed;
    Person Player;
    private Room Lobby;
    private Room IST208;
    private Room IST210;
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
            Room roomToGoTo = currentRoom.getSingleRoom(userSelection);
            Player.setLocation(roomToGoTo);
            currentRoom = Player.getLocation();
            printLocation();
            game.PrintToGameText(printLocation());
            game.PrintToGameText(PrintNeighboringRooms(currentRoom.getNeighboringRooms()));
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(PaneDisplayed == 1){
            Lobby = new Room("Lobby", 0);
            IST208 = new Room("IST208", 208);
            IST210 = new Room("IST210", 210);
            Lobby.addRoom(IST208);
            Lobby.addRoom(IST210);
            IST210.addRoom(Lobby);
            IST208.addRoom(Lobby);
            //Lobby.addPerson(Player);
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
