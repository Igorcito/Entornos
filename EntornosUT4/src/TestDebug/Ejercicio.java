/**
 * 
 */
package TestDebug;

/**
 * @author IGOR
 *
 */
public class Ejercicio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Llamada a constructor vacío.
		Nif unnif = new Nif();
		
		//LLamada a constructor con valores.
		Nif minif = new Nif(73117309, 'X');
		
		//Acceso a los atributos privados mediante métodos "get..." que son públicos.
		System.out.println(minif.getDni()+ "-"+minif.getLetra());
		
		minif.setLetra('X');
		System.out.println(minif.getDni()+ "-"+minif.getLetra());

		minif.setLetra('D');
		System.out.println(minif.getDni()+ "-"+minif.getLetra());
	}

}
