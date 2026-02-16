package br.edu.infnet.tp1java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp1javaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp1javaApplication.class, args);
        ScientificCalculator calculator = new ScientificCalculator();

        System.out.println(calculator.log(10));
	}

}
