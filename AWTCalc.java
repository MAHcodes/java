import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AWTCalc extends Applet implements ActionListener {
  Label l1, l2, l3, l4;
  TextField t1, t2;
  Button b1, b2, b3, b4;

  public void init() {
    super.init();
    l1 = new Label();
    l1.setText("N1");
    l2 = new Label();
    l2.setText("N2");
    l3 = new Label("Result: ");
    l4 = new Label();
    t1 = new TextField();
    t2 = new TextField();
    b1 = new Button();
    b2 = new Button();
    b3 = new Button();
    b4 = new Button();
    b1.setLabel("+");
    b2.setLabel("-");
    b3.setLabel("/");
    b4.setLabel("*");

    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(l3);
    add(l4);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    int result;
    int val1 = Integer.parseInt(t1.getText());
    int val2 = Integer.parseInt(t2.getText());

    if (e.getSource() == b1) {
      result = val1 + val2;
    } else if (e.getSource() == b2) {
      result = val1 - val2;
    } else if (e.getSource() == b3) {
      result = val1 / val2;
    } else {
      result = val1 * val2;
    }
    l4.setText(String.valueOf(result));
  }
}
