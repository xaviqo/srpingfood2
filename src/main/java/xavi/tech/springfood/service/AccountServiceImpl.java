package xavi.tech.springfood.service;

import org.springframework.beans.factory.annotation.Autowired;

import xavi.tech.springfood.repository.ClientRepository;
import xavi.tech.springfood.repository.WorkerRepository;

public class AccountServiceImpl implements AccountService{

	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private WorkerRepository workerRepository;
	
	
}
