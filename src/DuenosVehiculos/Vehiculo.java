package DuenosVehiculos;



public abstract class Vehiculo {

	protected String matricula;
	protected String marca;
	protected String modelo;
	
	
	
	
	public Vehiculo(String matricula, String marca, String modelo) {
		this.setMarca(marca);
		this.setMatricula(matricula);
		this.setModelo(modelo);
	}
	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	
	
	
	
	
	
	
	//Getter and Setters
	
	
}
