package br.usjt.weatherforecast.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.weatherforecast.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User findOneByLoginAndPassword (String login, String password);
}
