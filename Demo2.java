import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Demo2 extends Applet implements ActionListener {
  Label l1, l2, l3;
  TextField t1, t2, t3;
  Button b1;

  public void init() {
    super.init();
    l1 = new Label();
    l1.setText("first number");
    l2 = new Label();
    l2.setText("Second number");
    l3 = new Label(" the result is:");
    t1 = new TextField();
    t2 = new TextField();
    t3 = new TextField();
    b1 = new Button();
    b1.setLabel("Calculate");
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(l3);
    add(t3);
    add(b1);
    b1.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    /* if( e.getSource()== b1) */
    int val1 = Integer.parseInt(t1.getText());
    int val2 = Integer.parseInt(t2.getText());
    int result = val1 + val2;
    t3.setText(String.valueOf(result));
  }
}
