package br.com.alura.ScreenMatch;

// import org.junit.jupiter.api.Test;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.test.context.SpringBootTest;

@SpringBootApplication
public class ScreenMatchApplicationTests implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("First project spring with not web");
	}

}
