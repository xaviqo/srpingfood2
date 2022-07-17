package xavi.tech.springfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import xavi.tech.springfood.model.Role;
import xavi.tech.springfood.model.Worker;
import xavi.tech.springfood.repository.WorkerRepository;

@RestController
public class MainController {
	
	@Autowired
	WorkerRepository workerRepo;
	
	@GetMapping(path="/")
    @ResponseBody
	public String test() {
		
		Worker persona = new Worker(
				"hola@hola.net",
				"pass123",
				Role.ADMIN,
				"xavi",
				"654932871"
				);
		
		workerRepo.save(persona);
		
		return "hey, it's working!";
	}

}