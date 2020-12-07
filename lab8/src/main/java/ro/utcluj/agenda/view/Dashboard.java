package ro.utcluj.agenda.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.utcluj.agenda.controller.PersonController;
import ro.utcluj.agenda.exception.ValidationFailedException;
import ro.utcluj.agenda.model.Person;

@Component
public class Dashboard extends AppFrame {

  @Autowired
  private PersonController personController;

  @Autowired
  private DummyView dummyView;

  private JButton savePersonButton;
  private JTextField personFullNameTextField;
  private JTextField personPhoneTextField;

  public Dashboard() {
  }

  public void initialize() {
    this.setTitle("Agenda");
    this.setSize(400, 400);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLayout(null);

    JPanel panel = new JPanel();
    panel.setLayout(null);

    initializeForm(panel);
    initializeListeners();

    JButton dummyButton = new JButton("Show dummy");
    dummyButton.setBounds(10, 200, 120, 30);
    dummyButton.addActionListener(e -> {
      dummyView.initialize();
      dummyView.setVisible(true);
    });
    panel.add(dummyButton);

    this.setContentPane(panel);
    this.setVisible(true);
  }

  private void initializeForm(JPanel panel) {
    JLabel personFullNameLabel = new JLabel("Full name:");
    personFullNameLabel.setBounds(10, 10, 200, 30);

    personFullNameTextField = new JTextField();
    personFullNameTextField.setBounds(10, 40, 200, 30);

    JLabel personPhoneLabel = new JLabel("Phone:");
    personPhoneLabel.setBounds(10, 80, 200, 30);

    personPhoneTextField = new JTextField();
    personPhoneTextField.setBounds(10, 110, 200, 30);

    savePersonButton = new JButton("Save");
    savePersonButton.setBounds(220, 10, 100, 30);

    panel.add(savePersonButton);
    panel.add(personFullNameLabel);
    panel.add(personFullNameTextField);
    panel.add(personPhoneLabel);
    panel.add(personPhoneTextField);
  }

  private void initializeListeners() {
    savePersonButton.addActionListener(e -> {
      Person person = createPerson(personFullNameTextField.getText(), personPhoneTextField.getText());
      try {
        personController.save(person);
        displayInformationMessage("Person successfully saved");
      } catch (ValidationFailedException exception) {
        displayErrorMessage(exception);
      }
    });
  }

  private Person createPerson(String fullName, String phone) {
    Person person = new Person();
    person.setFullName(fullName);
    person.setPhoneNumber(phone);
    return person;
  }
}
