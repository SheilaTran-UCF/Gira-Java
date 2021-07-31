package java.backend.giraJava.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // return Json
public class WelcomeController {
	@GetMapping("/welcome") // retrun to object
	public Object welcome() {
		return "welcome to Gira Application"; 
	}
}


