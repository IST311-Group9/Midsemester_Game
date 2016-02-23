/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JFrame;
/**
 *
 * @author Adam
 */
public class GameFrame extends JFrame  {
    GameFrame(){
        super ("IST Adventure");
        setSize (600, 400);
        IntroPanel intro = new IntroPanel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        add(intro);
    }
}
