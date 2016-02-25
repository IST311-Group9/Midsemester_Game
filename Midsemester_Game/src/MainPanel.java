
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
            return("You are in the " + currentRoom.getName());
        }else{
        return ("You are in " + currentRoom.getName());
            }
    }
    public Person CreatePlayer(String Name, String Gender, Boolean isPlayer,Room StartingLocation){
        return new Person(Name, Gender, isPlayer, StartingLocation);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(PaneDisplayed == 1){
            Lobby = new Room("Lobby", 0);
            Player = CreatePlayer(intro.getName(), intro.getGender(), true, Lobby);
            
            clearPanel();
            add(game);
            game.PrintToGameText(printLocation());
            button.setTextEnter();
            PaneDisplayed = 2;
        }else{
            //Enter function of button in game
        }
    }
    }
