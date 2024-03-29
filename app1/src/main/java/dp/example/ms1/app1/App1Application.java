package dp.example.ms1.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class App1Application {

	public static void main(String[] args) {
		SpringApplication.run(App1Application.class, args);
	}
}