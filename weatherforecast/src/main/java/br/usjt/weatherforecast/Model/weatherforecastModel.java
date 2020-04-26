package br.usjt.weatherforecast.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class weatherforecastModel implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long id;
	private String DayInTheWeek;
	private double TemperatureMinimum;
	private double TemperatureMaximum;	
	private int RelativeHumidity;
	private String Description;
	
	
	public long getId() {
		return id;
	}
	public void setId(long Id) {
		id = Id;
	}	
	public String getDayInTheWeek() {
		return DayInTheWeek;
	}
	public void setDayInTheWeek(String dayInTheWeek) {
		DayInTheWeek = dayInTheWeek;
	}
	public double getTemperatureMinimum() {
		return TemperatureMinimum;
	}
	public void setTemperatureMinimum(double temperatureMinimum) {
		TemperatureMinimum = temperatureMinimum;
	}
	public double getTemperatureMaximum() {
		return TemperatureMaximum;
	}
	public void setTemperatureMaximum(double temperatureMaximum) {
		TemperatureMaximum = temperatureMaximum;
	}
	public int getRelativeHumidity() {
		return RelativeHumidity;
	}
	public void setRelativeHumidity(int relativeHumidity) {
		RelativeHumidity = relativeHumidity;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	} 
}
