package br.usjt.weatherforecast.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.weatherforecast.Model.User;
import br.usjt.weatherforecast.Service.LoginService;


public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@GetMapping (value = {"/login", "/"})
	public ModelAndView login () {
		
		ModelAndView mv = new ModelAndView ("login");
		mv.addObject(new User());
		return mv;
	}
	
	
	@PostMapping ("/fazerLogin")
	public String fazerLogin (HttpServletRequest request, User user) {
		if (loginService.logar(user)) {
			request.getSession().setAttribute("usuarioLogado",	user);
	
			return "redirect:alunos";
		}
		else {
			return "login";
		}
	}	
}