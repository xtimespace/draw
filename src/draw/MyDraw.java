package draw;

import javax.swing.JFrame;

public class MyDraw {

  public void showWelcome() {
    System.out.println("欢迎来到这里！");
  }

  public static void main(String[] args) {
    MyDraw o = new MyDraw();
    o.showWelcome();

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("练习使用JFrame");
    frame.pack();
    frame.setVisible(true);
    frame.repaint();
  }

}
