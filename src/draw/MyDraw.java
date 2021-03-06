package draw;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MyDraw {

  public void showWelcome() {
    System.out.println("欢迎来到这里！");
  }

  public static void main(String[] args) {
    MyDraw o = new MyDraw();
    o.showWelcome();

    JPanel panel = new JPanel();
    panel.add(new JButton("Mars"));
    panel.add(new JButton("Jupiter"));

    JFrame frame = new JFrame();
    frame.add(new JButton("Venus"), BorderLayout.NORTH);
    frame.add(panel, BorderLayout.CENTER);
    frame.add(new JButton("Pluto"), BorderLayout.SOUTH);
    frame.add(new JButton("Mercury"), BorderLayout.EAST);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("练习使用JFrame");
    frame.pack();
    frame.setVisible(true);
    //frame.repaint();
  }

}
