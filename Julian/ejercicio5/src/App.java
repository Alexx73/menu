import java.util.*;

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>(Arrays.asList(1,2,2,2,2,2,2,3,4,5,5,6,7,7,7,7,7,10,10,10,10,10));
		Busco5Max(listaNumeros);
	}
	  public static /* ArrayList<Integer> */ void Busco5Max(ArrayList<Integer> listaOriginal){
		HashMap<Integer, Integer> valoresCantidad = new HashMap<>();
		for (Integer numeroInteger : listaOriginal)
		{
			valoresCantidad.put(numeroInteger, valoresCantidad.getOrDefault(numeroInteger, 0) + 1);
		}
		List<Map.Entry<Integer, Integer>> listaOrdenada = new ArrayList<>(valoresCantidad.entrySet());
        listaOrdenada.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        System.out.println("Los 5 números que más se repiten son:");
        for (int i = 0; i < 5 && i < listaOrdenada.size(); i++) {
            System.out.println(listaOrdenada.get(i).getKey() + " - " + listaOrdenada.get(i).getValue() + " veces");
        }
	}
}