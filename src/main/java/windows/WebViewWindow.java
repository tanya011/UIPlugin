package windows;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class WebViewWindow extends JFrame {

  public WebViewWindow(JComponent component) {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    setSize(new Dimension(screenSize.width / 2, screenSize.height / 2));
    getContentPane().add(component, BorderLayout.CENTER);
    setLocationRelativeTo(null);
  }

  public void showWindow() {
    setVisible(true);
  }
}
