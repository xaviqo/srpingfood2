package xavi.tech.springfood.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xavi.tech.springfood.model.Account;

@RestController
@RequestMapping(path="/api/account")
public interface AccountController {

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<?> createAccount(@RequestBody Account account); 
}
