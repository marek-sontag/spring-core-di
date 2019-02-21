package pl.sda.spring.coredi;

import java.util.logging.Logger;

import pl.sda.spring.coredi.beans.Philosopher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    private static final Logger logger = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"services.xml"});

        Philosopher bean1 = context.getBean(Philosopher.class);

        logger.info(bean1.getName());
        logger.info(bean1.getMostImportantQuestion().getQuestion());

    }

}
