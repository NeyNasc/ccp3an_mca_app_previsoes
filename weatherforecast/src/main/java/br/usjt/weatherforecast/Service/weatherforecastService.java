package br.usjt.weatherforecast.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.weatherforecast.Model.weatherforecastModel;
import br.usjt.weatherforecast.Repository.weatherforecastRepository;

public class weatherforecastService {
	
	@Autowired
	private weatherforecastRepository weatherRepo;
	
	public void salvar (weatherforecastModel weather) {
		weatherRepo.save(weather);
		}

	public List<weatherforecastModel> listarPrevisoes(){
		List<weatherforecastModel> previsoes = weatherRepo.findAll();
		return previsoes;
	}	
}
