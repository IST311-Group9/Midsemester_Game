/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awz5082
 */
public class Person {
    private String name;
    private String gender;
    private boolean isPlayer;
    public Person (String name, String gender, boolean isPlayer)
    {
        this.name = name;
        this.gender = gender;
        this.isPlayer = isPlayer;
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
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the isPlayer
     */
    public boolean isIsPlayer() {
        return isPlayer;
    }

    /**
     * @param isPlayer the isPlayer to set
     */
    public void setIsPlayer(boolean isPlayer) {
        this.isPlayer = isPlayer;
    }
    
}