package ua.edu.ucu.demo;

import java.util.List;
import ua.edu.ucu.demo.flowers.Flower;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/flowers/")
public class Application {
    @GetMapping("list/")
	public List<Flower> hello(){
		return List.of(new Flower());
	}
}
