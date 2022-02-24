package DuenosVehiculos;

public class Programa {
public static void manin(String[]args) {
	NIF dni=new NIF("11111111H");
	
	Coche c=new Coche("1234GGG","Alfa","Rojo",null, 3);
	
	Moto m=new Moto("4444","Ducati","Monster",300);
	Vehiculo[]v=new Vehiculo[2];
	v[0]=c;
	v[1]=m;
	Clientes cliente=new Clientes(dni, "Lucía", "Pachecho", "Plaza del Pan",200,v);
	
	System.out.println(c);
	
}
}
