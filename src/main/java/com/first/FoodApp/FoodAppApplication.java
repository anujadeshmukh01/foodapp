package com.first.FoodApp;

import com.first.FoodApp.auth_users.entity.User;
import com.first.FoodApp.auth_users.repository.UserRepository;
import com.first.FoodApp.email_notification.dtos.NotificationDTO;
import com.first.FoodApp.email_notification.services.NotificationService;
import com.first.FoodApp.enums.NotificationType;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@EnableAsync
//@RequiredArgsConstructor

public class FoodAppApplication {

//	private final NotificationService notificationService;
	public static void main(String[] args) {
		SpringApplication.run(FoodAppApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(){
//		return  args -> {
//			NotificationDTO notificationDTO = NotificationDTO.builder()
//					.recipient("anujad5100@gmail.com")
//					.subject("Hello Dennis")
//					.body("Hey this is a test email")
//					.type(NotificationType.EMAIL)
//					.build();
//			notificationService.sendEmail(notificationDTO);
//		};

	//}

//	@Bean
//	CommandLineRunner resetAdminPassword(
//			UserRepository userRepository,
//			PasswordEncoder passwordEncoder) {
//
//		return args -> {
//			User user = userRepository
//					.findByEmail("anujad5100@gmail.com")
//					.orElseThrow(() -> new RuntimeException("User not found"));
//
//			user.setPassword(passwordEncoder.encode("Admin@12345"));
//			userRepository.save(user);
//
//			System.out.println("Password reset successful!");
//		};
//	}




}
