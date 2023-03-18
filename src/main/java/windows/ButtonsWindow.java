package windows;

import com.intellij.ui.jcef.JBCefBrowser;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonsWindow extends JFrame {

  private static final String GOOGLE_URL = "https://www.google.com/";
  private static final String YANDEX_URL = "https://yandex.ru/";

  public ButtonsWindow() {
    JLabel label = new JLabel("Click on one of two buttons: ");
    JButton button1 = createButtonWithUrl("Google", GOOGLE_URL);
    JButton button2 = createButtonWithUrl("Yandex", YANDEX_URL);

    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setAutoCreateGaps(true);
    layout.setAutoCreateContainerGaps(true);

    layout.setHorizontalGroup(
        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(label)
            .addComponent(button1)
            .addComponent(button2)
    );

    layout.setVerticalGroup(layout.createSequentialGroup()
        .addComponent(label)
        .addComponent(button1)
        .addComponent(button2)
    );

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    setSize(new Dimension(screenSize.width / 2, screenSize.height / 2));
    setLocationRelativeTo(null);
    setTitle("Window with 2 buttons");
  }

  private static JButton createButtonWithUrl(String text, String url) {
    JButton button = new JButton(text);
    button.addActionListener((ActionEvent e) -> {
      JBCefBrowser browser = new JBCefBrowser();
      browser.loadURL(url);
      JComponent browserComponent = browser.getComponent();
      WebViewWindow webViewWindow = new WebViewWindow(browserComponent);
      webViewWindow.showWindow();
    });
    return button;
  }

  public static void main(String[] args) {
    new ButtonsWindow().setVisible(true);
  }
}
