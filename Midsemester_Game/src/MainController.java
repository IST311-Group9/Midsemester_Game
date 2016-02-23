/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class MainController {
   MainPanel Panel;
   GameFrame Frame;
   IntroController introC;
   IntroModel IntroModel;
   MainController(GameFrame Frame){
       this.Frame = Frame;
       IntroModel = new IntroModel
       Panel = Frame.getMainPanel();
       IntroModel = new IntroModel();
       introC = new IntroController(Panel.getIntro(), IntroModel);
       
   }
   
   
}
