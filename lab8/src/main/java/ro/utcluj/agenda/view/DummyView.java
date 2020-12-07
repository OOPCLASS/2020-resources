package ro.utcluj.agenda.view;

import org.springframework.stereotype.Component;

@Component
public class DummyView extends AppFrame {

  public DummyView() {
  }

  @Override
  public void initialize() {
    this.setSize(500, 500);
    this.setTitle("Dummy");
  }
}
