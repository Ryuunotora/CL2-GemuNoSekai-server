package pe.edu.cibertec.CL2_GemuNoSekai_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Cl2GemuNoSekaiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cl2GemuNoSekaiServerApplication.class, args);
	}

}
