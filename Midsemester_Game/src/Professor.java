/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class Professor extends Person {
    
    private boolean hasHomework;


    public Professor(String name, String gender, boolean isPlayer, Room location, boolean hasHomework) {
        super(name, gender, isPlayer, location);
        this.hasHomework = hasHomework;
        
        
    }

    /**
     * @return the hasHomework
     */
    public boolean isHasHomework() {
        return hasHomework;
    }

    /**
     * @param hasHomework the hasHomework to set
     */
    public void setHasHomework(boolean hasHomework) {
        this.hasHomework = hasHomework;
    }

}