/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
/**
 *
 * @author Adam
 */
public class MainPanel extends JPanel {
    private IntroPanel intro;
    private GamePanel game;
    
    MainPanel(){
        super();
        intro = new IntroPanel();
        game = new GamePanel();
        
        add(intro);
    }
    
    public void Removeintro(){
        remove(getIntro());
    }
    public void AddGame(){
        add(getGame());
    }

    /**
     * @return the intro
     */
    public IntroPanel getIntro() {
        return intro;
    }

    /**
     * @param intro the intro to set
     */
    public void setIntro(IntroPanel intro) {
        this.intro = intro;
    }

    /**
     * @return the game
     */
    public GamePanel getGame() {
        return game;
    }

    /**
     * @param game the game to set
     */
    public void setGame(GamePanel game) {
        this.game = game;
    }
    
}
