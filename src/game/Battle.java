package game;

import javax.swing.*;


public class Battle extends JFrame{
  public Spirit spirit1;
  public Spirit spirit2;
  
  public Battle(){
    initUI();
  }
  public void initUI(){
setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

}
