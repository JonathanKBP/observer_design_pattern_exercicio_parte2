
public class Teste {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay();
		ForecastDisplay forecastDisplay = new ForecastDisplay();
		StatsDisplay statsDisplay = new StatsDisplay();
		MediaDisplay mediaDisplay = new MediaDisplay();
		MostrarTemperaturaDisplay mostrarTemperaturaDisplay = new MostrarTemperaturaDisplay();
		wd.registerObserver(conditionsDisplay);
		wd.registerObserver(forecastDisplay);
		wd.registerObserver(statsDisplay);
		wd.registerObserver(mediaDisplay);
		wd.registerObserver(mostrarTemperaturaDisplay);
		wd.iniciar();

	}

}
