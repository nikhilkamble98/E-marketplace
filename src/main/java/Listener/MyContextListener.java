package Listener;

import org.flywaydb.core.Flyway;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.Console;
import java.util.logging.Logger;

public class MyContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        String url = "jdbc:mysql://localhost:3306/resell";
        String user = "root";
        String password = "q1w2e3r4";

        Flyway flyway = Flyway.configure()
                .dataSource(url, user, password)
                .locations("classpath:db/migration") // Path to your migration scripts
                .load();

        System.out.println("called on start");
        // Perform the database migration
        flyway.migrate();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        // Clean up resources if needed
    }
}
