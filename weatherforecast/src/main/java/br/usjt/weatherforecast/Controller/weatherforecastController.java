package br.usjt.weatherforecast.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import br.usjt.weatherforecast.Model.weatherforecastModel;
import br.usjt.weatherforecast.Repository.weatherforecastRepository;

@Controller
public class weatherforecastController {
	@Autowired
	private weatherforecastRepository weatherRepo;
	
	@GetMapping("/previsoes")
	public ModelAndView listarPrevisoes() {
		ModelAndView mv = new ModelAndView("lista_previsoes");	
		
		List<weatherforecastModel> previsoes = weatherRepo.findAll();
		mv.addObject("previsoes", previsoes);
		mv.addObject(new weatherforecastModel());
		return mv;
	}
	
	@PostMapping("/previsoes")
	public String salvar(weatherforecastModel previsao) {
		weatherRepo.save(previsao);
	return "redirect:/previsoes";
	}
}