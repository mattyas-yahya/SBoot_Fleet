package com.matt.templateQ.TemplateSpringBoot2;

import java.text.SimpleDateFormat;
import java.util.UUID;

import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.DataIntegrityViolationException;

import com.matt.templateQ.TemplateSpringBoot2.model.Users;
import com.matt.templateQ.TemplateSpringBoot2.model.vehicles;
import com.matt.templateQ.TemplateSpringBoot2.repo.*;

import net.datafaker.Faker;



@SpringBootApplication
public class BasicApplication {
	@Autowired
	UsersRepository urepository;
	@Autowired
	repo_vehicles rv;
	public static void main(String[] args)
	{
		SpringApplication.run(BasicApplication.class, args);

	}
	@Bean
	public CommandLineRunner AddNew()
	{
		return (args) ->
		{
			        Faker f = new Faker();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            vehicles v = new vehicles();
			Users u1 = new Users();
			Users u2 = new Users();
			Users u3 = new Users();

			u1.setId(1);
			u1.setEmail("matt@gmail.com");
			u1.setPassword("$2a$10$AWNF6r2.v8B/5tdcEjQDAOGa5NteluxbwGhcrHlxyhZw3q3EhikFC");
			u1.setName("mattyas");
			u1.setLastName("mattyas");
			u1.setActive(1);
			u1.setRole("ROLE_USER");
			u1.setLink("");

			u2.setId(2);
			u2.setEmail("vanilla@gmail.com");
			u2.setPassword("$2a$10$LuJTXLNBA93v8LTuio63l.0J07dCxqJtc3Tf2/Hct1dhat5UX4C5K");
			u2.setName("vanilla");
			u2.setLastName("vanilla");
			u2.setActive(1);
			u2.setRole("ROLE_ACTUATOR");
			u2.setLink("");

			u3.setId(3);
			u3.setEmail("jasperadmin@gmail.com");
			u3.setPassword("$2a$10$rh98R7rcaIsC6ATP9ldzhuLpk9uiQv/DRxItISCSoQAvaTZziDQFm");
			u3.setName("jasperadmin");
			u3.setLastName("jasperadmin");
			u3.setActive(1);
			u3.setRole("ROLE_ADMIN");
			u3.setLink("");
			urepository.save(u1);
			urepository.save(u2);
			urepository.save(u3);

			
		};
	}
}
