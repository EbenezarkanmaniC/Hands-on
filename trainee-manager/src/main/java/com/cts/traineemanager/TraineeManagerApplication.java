package com.cts.traineemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TraineeManagerApplication {
	
	
	public interface InterfaceApp{
		default double square(int a) {
			return a*a;
		}
		void show(int a);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TraineeManagerApplication.class, args);
	}

}
