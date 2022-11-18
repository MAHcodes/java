import java.awt.*;

public class GLayout {

  public static void main(String[] args) {
    Frame frm = new Frame();

    for (int i = 65; i <= 70; i++) {
      Button b = new Button(Character.toString(i));
      frm.add(b);
    }

    Button btn1 = new Button("A2");
    Button btn2 = new Button("B2");
    Button btn3 = new Button("C2");
    Button btn4 = new Button("D2");
    Button btn5 = new Button("E2");
    Button btn6 = new Button("F2");

    frm.add(btn1);
    frm.add(btn2);
    frm.add(btn3);
    frm.add(btn4);
    frm.add(btn5);
    frm.add(btn6);

    // define the disposition in grid of 3 rows and 2 columns and gaps = 10 (hgap, vgap)
    frm.setLayout(new GridLayout(3, 2, 10, 10));
    frm.setTitle("GridLayout application");
    frm.setVisible(true);
  }
}
