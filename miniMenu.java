import java.util.Scanner;
public class miniMenu {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
     int a;
     System.out.println("¿Que desea hacer hoy?\n1) jugar.\n2)calculadora\n3)salir");

     a = Integer.parseInt(teclado.nextLine());

     switch (a){
         case 1:
             int b;
             System.out.println("¿Que desea jugar?\n 4) Gato\n 5) Ajedrez");
             b = Integer.parseInt(teclado.nextLine());
             switch (b){
                 case 4:
                     System.out.println("Usted esta jugando gato #");
                     break;
                 case 5:
                     System.out.println("Usted esta juando ajedrez");
                     break;
             }
         case 2:
             int c;
             System.out.println("Operacion a realizar\n6) suma\n7) resta");
             c = Integer.parseInt(teclado.nextLine());
             switch (c){
                 case 6:
                     float cs1,cs2,csr;
                     System.out.println("Digite una valor a sumar:");
                     cs1 = Float.parseFloat(teclado.nextLine());
                     System.out.println("Digite otro valor a sumar:");
                     cs2 = Float.parseFloat(teclado.nextLine());

                     csr = cs1+cs2;
                     System.out.println("El resultado es: " + csr);
                     break;
                 case 7:
                     float cr1,cr2,crr;
                     System.out.println("Digite una valor a restar:");
                     cr1 = Float.parseFloat(teclado.nextLine());
                     System.out.println("Digite otro valor a resta:");
                     cr2 = Float.parseFloat(teclado.nextLine());

                     crr = cr1+cr2;
                     System.out.println("El resultado es: " + crr);
                     break;
             }
         case 3:
             System.out.println("Programa cerrado.");
     }

    }
}
