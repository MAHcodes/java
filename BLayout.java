import java.awt.*;

public class BLayout {
  public static void main(String[] args) {
    Frame frm = new Frame();

    Button btn1 = new Button("Nord");
    Button btn2 = new Button("Sud");
    Button btn4 = new Button("Ouest");
    Button btn3 = new Button("Est"); 
    Button btn5 = new Button("Centre");

    frm.add(btn1, BorderLayout.NORTH);
    frm.add(btn2, BorderLayout.SOUTH);
    frm.add(btn3, BorderLayout.EAST);
    frm.add(btn4, BorderLayout.WEST);
    frm.add(btn5, BorderLayout.CENTER);

    frm.setTitle("BorderLayout application");
    frm.setSize(300, 300);
    frm.setVisible(true);
  }
}
