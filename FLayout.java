import java.awt.*;

public class FLayout {
  Button btn1, btn2, btn3;

  public static void main(String[] args) {
    Frame frm = new Frame();
    frm.setTitle("FlowLayout Application");

    frm.setBackground(Color.lightGray);

    Button btn1 = new Button("A");

    Button btn2 = new Button("B");

    Button btn3 = new Button("C");

    frm.setSize(400, 400);

    frm.setVisible(true);

    frm.setLayout(new FlowLayout(FlowLayout.CENTER));

    // frm.setLayout(new FlowLayout(FlowLayout.LEFT));
    // frm.setLayout(new FlowLayout(FlowLayout.RIGHT));

    frm.add(btn1);

    frm.add(btn2);

    frm.add(btn3);

  }
}
