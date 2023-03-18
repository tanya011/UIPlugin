package actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;
import windows.ButtonsWindow;

public class WindowButtonsAction extends AnAction {

  @Override
  public void actionPerformed(@NotNull AnActionEvent e) {
    new ButtonsWindow().setVisible(true);
  }
}
