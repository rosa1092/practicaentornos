package DuenosVehiculos;



public class Coche extends Vehiculo{

	

	private String color;
	private int numeroPuertas;
	
	
	//Construcor
	
	public Coche(){
		super();
		this.setColor("");
		this.setNumeroPuertas(0);
	}
	
	//COnstrucotr
	
	public Coche(String matricula, String marca, String modelo, String color, int numeroPuertas) {
		super(matricula, marca, modelo);
		this.setColor(color);
		this.setNumeroPuertas(numeroPuertas);
	}



	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumeroPuertas() {
		return numeroPuertas;
	}
	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
}
	