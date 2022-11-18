import java.awt.*;
import java.awt.event.*;

public class Buttons {
  Buttons() {
    Panel p = new Panel();
    Frame f = new Frame("Title");
    Checkbox c = new Checkbox("C++", true);
    Label l = new Label("C++ Checkbox");

    c.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        l.setText(e.getStateChange() == 1 ? "checked" : "uschecked");
      }
    });

    l.setAlignment(Label.CENTER);
    p.setSize(500, 500);
    p.add(l);
    p.add(c);
    f.add(p);

    f.setLayout(null);
    f.setVisible(true);
  }

  public static void main(String[] args) {
    new Buttons();
  }
}
