
package codigoDeOtros7;
import java.util.Scanner;
//Añadir import java.util.Scanner; y import java.util.HashMap; para poder utilizar la clase Scanner y HashMap respectivamente.
import java.util.HashMap;
public class CodigoDeOtros7 {

	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
//Cambiar HashMap<Byte, Double> a HashMap<String, String> ya que se trata de una estructura que relaciona países con sus capitales, y no de un mapa de bytes y doubles.
	        HashMap<String, String> capitales = new HashMap<>();
//Corregir los nombres de las ciudades capitales, ya que algunos estaban mal escritos.
	        capitales.put("Canadá", "Ottawa");
	        capitales.put("Estados Unidos", "Washington DC");
	        capitales.put("México", "México DF");
	        capitales.put("Belice", "Belmopán");
	        capitales.put("Costa Rica", "San José");
	        capitales.put("El Salvador", "San Salvador");
	        capitales.put("Guatemala", "Ciudad de Guatemala");
	        capitales.put("Honduras", "Tegucigalpa");
	        capitales.put("Nicaragua", "Managua");
	        capitales.put("Panamá", "Panamá");
//Se cambia 'Sting c' a 'String c.'
	        String c = "";

	        do {
	            System.out.print("Escribe el nombre de un país y te diré su capital (escribele bien): ");
//Se cambia s.nextDouble() a s.nextLine() para leer la entrada del usuario como una cadena de texto en lugar de un número.
	            c = s.nextLine();
//se corrige la condición en el if que verifica si la capital de un país está en el mapa.
	            if (!c.equals("salir")) {
	                if (capitales.containsKey(c)) {
//se Cambia System.print() a System.out.print() y System.println() a System.out.println().
	                    System.out.println("La capital de " + c + " es " + capitales.get(c));
	                } else {
	                    System.out.print("No conozco la respuesta ");
	                    System.out.print("¿Cuál es la capital de " + c + "?: ");
//Se Cambi String ca = s.nextLine(); a String capital = s.nextLine(); para evitar la confusión con la variable ca que se utiliza para el mapa de capitales.
	           
	                    String capital = s.nextLine();
// se Cambia ca.put(c, ca); a capitales.put(c, capital); para agregar la nueva capital al mapa de capitales. Además, cambiar el nombre de la variable a capital para que sea más descriptivo.
	                    capitales.put(c, capital);
	                    System.out.println("Gracias por enseñarme nuevas capitales");
	                }
	            }
//Se Corrige la palabra while que estaba escrita como wile.
	        } while (!c.equals("salir"));
	    }
	}
