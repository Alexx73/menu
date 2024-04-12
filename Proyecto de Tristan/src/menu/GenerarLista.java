package menu;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import java.util.Iterator;

public class GenerarLista {
	ArrayList<Alumno> listaAlumnos;

	public GenerarLista() {
		listaAlumnos = new ArrayList<Alumno>();
		agregarAlumno(new Alumno("Diego", "Luna", 20, 20333222));
		agregarAlumno(new Alumno("Javi", "Alba", 30, 33333333));
		agregarAlumno(new Alumno("Jorge", "Benitez", 40, 44444444));
	}

	public void Mostrar(String o) {
		JOptionPane.showMessageDialog(null, "Opcion Ingresada: " + o);
	}

	public void agregarAlumno(Alumno unAlumno) {
		listaAlumnos.add(unAlumno);
	}

	public void borrarAlumno() {
		String apellidoABorrar = JOptionPane.showInputDialog(null, "Ingrese el Apellido del alumno a borrar");
		boolean encontrado = false;
		int i = 0;
		while (i < listaAlumnos.size() && !encontrado) {
			if (listaAlumnos.get(i).getApellido().equals(apellidoABorrar)) {
				int indice = i;
				Mostrar(apellidoABorrar + " se borrara de la lista");
				listaAlumnos.remove(indice);
				encontrado = true;
			} else
				i++;
		}
		if (encontrado == false)
			Mostrar(apellidoABorrar + " NO esta en la lista");
	}
	
	
	
	public void buscarAlumno2(String nombreBuscado)
	{
		Iterator<Alumno> iterator = listaAlumnos.iterator();
		boolean encontrado = false;
		// Iteramos sobre la lista usando el Iterator
        while (iterator.hasNext() && !encontrado ) 
        {
        	if ( iterator.next().getNombre().equals(nombreBuscado) )
        	{
        		encontrado = true;
        	}  else { Alumno elemento = iterator.next();}
        	
        	
           // System.out.println(elemento);
        }
       
	}

	public void ordenarAlfaticamente() {
		Collections.sort(listaAlumnos);
		listarAlumnos();
	}

	public void ordenarInvertido() {
		Collections.reverse(listaAlumnos);
		listarAlumnos();
	}

	public void listarAlumnos() {
		String datos = "";
		for (int i = 0; i < listaAlumnos.size(); i++) {
			datos += (i + 1) + String.format(" Nombre: %-12s | Apellido: %-12s | Edad: %2d | Dni: %8d",
					listaAlumnos.get(i).getNombre(), listaAlumnos.get(i).getApellido(), listaAlumnos.get(i).getEdad(),
					listaAlumnos.get(i).getDni()) + "\n";
		}
		JOptionPane.showMessageDialog(null, datos);
	}

}
