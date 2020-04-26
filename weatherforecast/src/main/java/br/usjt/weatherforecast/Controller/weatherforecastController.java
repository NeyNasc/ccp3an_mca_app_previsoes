package br.usjt.weatherforecast.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import br.usjt.weatherforecast.Model.weatherforecastModel;
import br.usjt.weatherforecast.Service.weatherforecastService;

@Controller
public class weatherforecastController {
	@Autowired
	private weatherforecastService weatherService;
	
	@GetMapping("/previsoes")
	public ModelAndView listarPrevisoes() {
		ModelAndView mv = new ModelAndView("lista_previsoes");	
		
		List<weatherforecastModel> previsoes = weatherService.listarPrevisoes();
		mv.addObject("previsoes", previsoes);
		mv.addObject(new weatherforecastModel());
		return mv;
	}
	
	@PostMapping("/previsoes")
	public String salvar(weatherforecastModel previsao) {
		weatherService.salvar(previsao);
	return "redirect:/previsoes";
	}
}