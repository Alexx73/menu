package menu;

public class Alumno implements Comparable<Alumno> {
	
	private String nombre;
	private String apellido;
	private int edad;
	private int dni;
		
	public Alumno(String nombre, String apellido, int edad, int dni) 
	{	
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return " nombre: " + nombre + ", Apellido: " + apellido + ", edad: " + edad + ", dni: " + dni + "\n" ;
	}

	@Override
	public int compareTo(Alumno o) {
		// TODO Auto-generated method stub
		return this.apellido.compareTo(o.apellido);
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public int getDni() {
		return dni;
	}

}
