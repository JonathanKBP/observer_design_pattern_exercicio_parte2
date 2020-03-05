import java.util.ArrayList;
import java.util.List;

public class MostrarTemperaturaDisplay implements Observer, DisplayElement{
	private List <Double> temps = new ArrayList <> ();
	private int cont=0;
	
	@Override
	public void display(double t, double h, double p) {
		mostrarTemperatura();
		
	}

	@Override
	public void update(double temp, double humidity, double pressure) {		
		if(cont==10) {
			display(temp, humidity, pressure);
			cont=0;	
			temps.clear();
		}	
		temps.add(temp);
		cont++;
	}

	public void mostrarTemperatura() {
		System.out.println("As dez ultimas temperaturas registradas: ");
		for(Double t: temps) {
			System.out.printf("%.2f\n",t);
		}
	}
}
