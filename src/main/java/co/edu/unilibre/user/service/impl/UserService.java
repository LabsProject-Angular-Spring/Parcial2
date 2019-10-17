package co.edu.unilibre.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unilibre.user.entity.User;
import co.edu.unilibre.user.repository.IUserRepository;
import co.edu.unilibre.user.service.IUserService;

@Service
public class UserService implements IUserService{

	@Autowired
	private IUserRepository productRepository;
	
	@Override
	public List<User> getAllList() {
		return productRepository.findAll();
	}


	
}
