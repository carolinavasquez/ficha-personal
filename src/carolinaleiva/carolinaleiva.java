package carolinaleiva;

import java.util.Scanner;

public class carolinaleiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("escriba nombre:");
Scanner Scanner1 = new Scanner (System.in);
String nombre1=Scanner1.next();

System.out.println("escriba la edad:");
Scanner Scanner2 = new Scanner (System.in);
int edad1=Scanner2.nextInt();

System.out.println("escriba el sexo:");
Scanner Scanner3 = new Scanner (System.in);
char sexo1=Scanner3.next().charAt(0);

System.out.println("Ingrese casado:");
Scanner Scanner4 = new Scanner (System.in);
boolean casado1=Scanner4.nextBoolean();
System.out.println("Ficha personal");
System.out.println("nombre:"+nombre1); 
System.out.println("Edad:"+ edad1); 
System.out.println("Sexo:"+sexo1);
System.out.println("Casado:"+casado1);


	}

}
