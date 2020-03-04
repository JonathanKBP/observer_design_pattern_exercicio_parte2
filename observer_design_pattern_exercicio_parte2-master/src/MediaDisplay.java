import java.util.ArrayList;
import java.util.List;

public class MediaDisplay implements Observer, DisplayElement {
	private List <Double> temps = new ArrayList <> ();
	private int cont =0 ;

	public void registerTemperature(double temp) {
		
		if(cont==11) {
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
	
	public void media(){
		double media = 0;
		for(Double t: temps) {
			media += t;
		}
		System.out.printf("A media das temperaturas: %.2f\n", media/10);
	}

	@Override
	public void display(double t, double h, double p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(double temp, double humidity, double pressure) {
		// TODO Auto-generated method stub
		
	}

}
