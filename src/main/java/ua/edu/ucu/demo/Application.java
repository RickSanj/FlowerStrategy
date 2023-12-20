package ua.edu.ucu.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/flowers/")
public class Application {
	@GetMapping("list/")
	public String hello() {
		return "Smile";
	}
}
