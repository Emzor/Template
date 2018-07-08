package home.mf.testing.template;

import home.mf.testing.template.lombok.Mountain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class TemplateApplication {

	Logger logger = LoggerFactory.getLogger(TemplateApplication.class);
    Mountain mountain;

	public static void main(String[] args) {
		SpringApplication.run(TemplateApplication.class, args);
	}

	public TemplateApplication(Mountain mountain) {
	    this.mountain = mountain;
    }

	@EventListener(ApplicationReadyEvent.class)
	private void test() {

	}
}
