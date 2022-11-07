package com.springexample.servermanager;

import com.springexample.servermanager.enumeration.Status;
import com.springexample.servermanager.model.Server;
import com.springexample.servermanager.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServermanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServermanagerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo){
		return args -> {
			serverRepo.save(new Server(null, "192.168.1.12","Unbuntu Linux", "32 GB", "PC",
					"http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.80","Fedora Linux", "16 GB", "Dell Tower",
					"http://localhost:8080/server/image/server2.png", Status.SERVER_DOWN));
			serverRepo.save(new Server(null, "192.168.1.42","MS 2009 Linux", "32 GB", "Web Server",
					"http://localhost:8080/server/image/server3.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.18","Red Hat Enterprise Linux", "62 GB", "Mail Server",
					"http://localhost:8080/server/image/server4.png", Status.SERVER_UP));
		};
	}

}
