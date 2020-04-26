package br.usjt.weatherforecast.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.weatherforecast.Model.weatherforecastModel;

public interface weatherforecastRepository extends JpaRepository<weatherforecastModel, Long> {

}
