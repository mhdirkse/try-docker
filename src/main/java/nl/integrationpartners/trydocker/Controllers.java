package nl.integrationpartners.trydocker;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class Controllers {
	@PostMapping("/item")
	public String postItem() {
		return "Item posted";
	}
}
