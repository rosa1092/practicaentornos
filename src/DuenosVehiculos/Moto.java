package DuenosVehiculos;

public class Moto extends Vehiculo {
double cilindrada;

public double getCilindrada() {
	return cilindrada;
}

public void setCilindrada(double cilindrada) {
	this.cilindrada = cilindrada;
}

@Override

public String toString() {
	return "Moto [cilindrada=" + cilindrada + "]";
}

public Moto(String matricula, String marca, String modelo, double cilindrada) {
	super(matricula, marca, modelo);
	this.setCilindrada (cilindrada);
}

public double getCilindrada1() {
	return cilindrada;
	
}

}
