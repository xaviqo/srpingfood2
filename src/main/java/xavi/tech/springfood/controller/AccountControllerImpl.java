package xavi.tech.springfood.controller;

import java.util.logging.Logger;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import xavi.tech.springfood.model.Account;

@RestController
public class AccountControllerImpl implements AccountController{
	
    public static Logger logger = Logger.getLogger("xavi.tech.springfood.controller");

	@Override
	public ResponseEntity<?> createAccount(Account account) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}