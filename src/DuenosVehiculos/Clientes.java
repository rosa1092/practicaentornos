package DuenosVehiculos;

public class Clientes {

	private NIF dni;
	private String nombre;
	private String apellido;
	private String direccion;
	private double saldo;
	private Vehiculo []v;
	

	
	
	//Constructor sin parametros
	
	public Clientes(NIF dni, String nombre, String apellido, String direccion, double saldo, Vehiculo[] v) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.saldo = saldo;
		this.v = v;
	}


	private void setV(String string) {
		// TODO Auto-generated method stub
		
	}
	//Getters and Setters
	
	
	public NIF getDni() {
		return dni;
	}
	public void setDni(NIF dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Clientes [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", saldo=" + saldo + "]";
	}
	
	//Constructor
	
}
