/**
 * 
 */
package RelacionCom;

import java.util.Scanner;

/**
 * @author gagal
 *
 */
public class Main {
	public void menu() {
	Scanner sc = new Scanner(System.in);
	Planes plan = new Planes();
    plan.to_assign();
    System.out.println("Ingrese su nombre");
    String name = sc.next();
    System.out.println("Ingrese su cedula");
    String identification = sc.next();
    System.out.println("¿En qué clase le gustaria viajar?");
    System.out.println("Ejecutiva");
    System.out.println("Economica");
    String clas = sc.next();
    System.out.println("¿En qué ibicacion desea su asciento?");
    System.out.println("----------------");
    System.out.println("Ejecutiva:");
    System.out.println("Ventana" + "Pasillo" + "\n");
    System.out.println("----------------");
    System.out.println(" ");
    System.out.println("----------------");
    System.out.println("Economica:");
    System.out.println("Ventana" + "Pasillo" + "Centro" + "\n");
    System.out.println("----------------");
    String location = sc.next();
    /**
	 * Se leen los parametros para asignarle el aciento de acuerdo a lo que se halla leido por teclado
	 * @param name, identification, clas, location
	 */
    plan.sign_on(name, identification, clas, location);
    
}
}
