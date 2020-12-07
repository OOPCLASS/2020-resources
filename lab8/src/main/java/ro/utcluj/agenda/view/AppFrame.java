package ro.utcluj.agenda.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.StringUtils;

public abstract class AppFrame extends JFrame {

  public abstract void initialize();

  public void displayErrorMessage(Exception exception) {
    if (exception != null) {
      String message = exception.getMessage();
      JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
  }

  public void displayInformationMessage(String message) {
    if (!StringUtils.isBlank(message)) {
      JOptionPane.showMessageDialog(this, message, "Info", JOptionPane.INFORMATION_MESSAGE);
    }
  }
}
