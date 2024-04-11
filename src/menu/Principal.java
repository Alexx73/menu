package menu;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerarLista generarLista = new GenerarLista();
		String opcion;

		do {
			opcion = JOptionPane.showInputDialog(null,
					"Selecciona una opción:\n\n" + "1- Borrar Alumno \n" + "2- Ver Lista ordenada por apellido alf\n"
							+ "3- Ver Lista ordenada por apellido inv\n " + "5- Salir\n\n");
			switch (opcion) {
			case "1":
				generarLista.borrarAlumno();
				break;

			case "2":
				generarLista.ordenarAlfaticamente();

				break;

			case "3":
				generarLista.ordenarInvertido();
				break;

			case "5":
				generarLista.Mostrar(opcion.concat("\n\nEl Programa se cerrara\n "));
				System.exit(0);
				break;

			default:
				JOptionPane.showMessageDialog(null, opcion + " NO es una opcion valida");
				break;
			}
		} while (opcion != "5");
	}

}
