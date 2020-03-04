import java.util.ArrayList;
import java.util.List;

public class HistoricoDisplay implements Observer, DisplayElement {
	private List <Double> temps = new ArrayList <> ();
	
	@Override
	public void display(double t, double h, double p) {
		historico();
	}

	@Override
	public void update(double temp, double humidity, double pressure) {
		temps.add(temp);
		display (temp, humidity, pressure);
	}
	
	private void historico() {
		int j = 0, i = temps.size();
		while(j!=10) {
			System.out.println(temps.get(i));
			i--;
			j++;
		}		
	}
	
}
