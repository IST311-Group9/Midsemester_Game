/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.*;
/**
 *
 * @author Adam
 */
public class IntroController {

    private IntroPanel view;
    private IntroModel model;
    //private Person Player;
    private
    IntroController(IntroPanel view, IntroModel model){
        this.view =view;
        this.model = model;
        //this.Player = Player;
        view.addStartGameListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Person Player = model.createPlayer(view.getName(), view.getGender(), true);
                
            }
            });
    }


}
