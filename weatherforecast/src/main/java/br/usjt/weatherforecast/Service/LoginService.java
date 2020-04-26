package br.usjt.weatherforecast.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.weatherforecast.Model.User;
import br.usjt.weatherforecast.Repository.UserRepository;



@Service
public class LoginService {
	@Autowired
	UserRepository userRepo;
	
	public boolean logar (User user) {
		return userRepo.findOneByLoginAndPassword(user.getLogin(), user.getPassword()) != null;
	}
}

