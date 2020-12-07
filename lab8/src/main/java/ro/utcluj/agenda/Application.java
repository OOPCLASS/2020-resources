package ro.utcluj.agenda;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import ro.utcluj.agenda.view.Dashboard;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
    builder.headless(false);
    ConfigurableApplicationContext context = builder.run(args);

    Dashboard dashboard = context.getBean(Dashboard.class);
    dashboard.initialize();
  }
}
