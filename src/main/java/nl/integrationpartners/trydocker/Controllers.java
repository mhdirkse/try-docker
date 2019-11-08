package nl.integrationpartners.trydocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {
	@Autowired
	ItemRepository repository;
	
	@GetMapping(value = "/item/{id}", produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public Item getItem(@PathVariable("id") int id) {
		System.out.println(String.format("GET /item/{%d}", id));
		return repository.findById(id).orElse(new Item());
	}

	@PostMapping(value = "/item", consumes = MediaType.APPLICATION_XML_VALUE)
	public void postItem(@RequestBody Item item) {
		System.out.println("POST /item: received: " + item.toString());
		repository.save(item);
	}

	@DeleteMapping(value = "/item/{id}")
	public void deleteItem(@PathVariable("id") int id) {
		System.out.println(String.format("DELETE /item/{%d}", id));
		repository.deleteById(id);
	}
}
