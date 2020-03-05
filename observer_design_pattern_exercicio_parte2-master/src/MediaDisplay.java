public class MediaDisplay implements Observer, DisplayElement {
	private int cont =0 ;
	private double media = 0;
	
	public double media(){
		return this.media = media/10;		
	}

	@Override
	public void display(double t, double h, double p) {
		System.out.printf("A media das temperaturas: %.2f\n", media());
	}

	@Override
	public void update(double temp, double humidity, double pressure) {
		if(this.cont == 10) {
			display(temp, humidity, pressure);
			this.media = 0;
			this.cont = 0;
			
		}
		this.media += temp;	
		this.cont++;
	}

}
