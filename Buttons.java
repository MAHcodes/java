import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Buttons extends Applet implements ActionListener {
  Label l1;
  Button b1, b2, b3, b4;

  public void init() {
    super.init();
    l1 = new Label();
    b1 = new Button();
    b2 = new Button();
    b3 = new Button();
    b4 = new Button();

    b1.setLabel("BT");
    b2.setLabel("TS");
    b3.setLabel("LT");
    b4.setLabel("BP");

    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(l1);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    l1.setText("you pressed: " + e.getSource().getLabel());
  }
}
