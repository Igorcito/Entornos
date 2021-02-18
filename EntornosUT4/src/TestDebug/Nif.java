/**
 * 
 */
package TestDebug;

/**
 * @author IGOR
 *
 */
public class Nif {
	//Atributos de la clase, son privados (
    private int dni;
    private char letra;

    //Construstor vacio.
    public Nif() {
    }
    
    //Constructor con valores.
    public Nif(int dni, char letra) {
        this.dni = dni;
        if (letra == calcularLetra())
            this.letra = letra;
        else{
            this.letra = '?';
        }     
    }
    
    //Damos valor al DNI.
    public void setDni(int dni) {
        this.dni = dni;
    }
    
    //Obtener el valor al dni.
    public int getDni() {
        return dni;
    }
    public void setLetra(char letra) {
        if (letra == calcularLetra())
            this.letra = letra;
        else{
            this.letra = '?';
        }     
    }
    public char getLetra() {
        return letra;
    }
    private char calcularLetra() {
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return letras[dni % 23];
    }

}
