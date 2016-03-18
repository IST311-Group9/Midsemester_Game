/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author az060_001
 */
public class Player extends Person {
    
    private boolean isPlayer;

    public Player(String name, String gender, boolean isPlayer, Room location) {
        super(name, gender, location);
        isPlayer = true;
    }

    /**
     * @return the hasHomework
     */
    public boolean isPlayer() {
        return isPlayer;
    }

    /**
     * @param hasHomework the hasHomework to set
     */
    public void setisPlayer(boolean isPlayer) {
        this.isPlayer = isPlayer;
    }
    
    public String getPersonInfo()
    {
        super.getPersonInfo();
        return ", Is Player: "+isPlayer;
    }
}