/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class IntroModel {
   
    public Person createPlayer(String Name, String Gender, boolean isPlayer){
        
        return new Person(Name, Gender, isPlayer);
    }
   
}
