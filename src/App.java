import java.util.Scanner;

public class App {

        public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        float num1 = 0, num2 = 0, num3 = 0;
        boolean num1ok = false; 
        boolean num2ok = false; 
        boolean num3ok = false;
        System.out.println("Introduce 3 numeros (si son decimales, pon una coma) en orden: ");
        while(!num1ok)
        try {
            num1 = scanner.nextFloat();
            num1ok = true;
        } catch (Exception e) {
            System.out.println("Introduzca un número de la forma correcta");
            scanner.next();
        }

        try {
            num2 = scanner.nextFloat() ;
            num2ok = true;
        } catch (Exception e) {
            System.out.println("Introduzca un número de la forma correcta");
            scanner.next();
        }
        try {
            num3 = scanner.nextFloat() ;
            num3ok = true;
        } catch (Exception e) {
            System.out.println("Introduzca un número de la forma correcta");
            scanner.next();
        }
        
        if (num1>num2 && num1 > num3) {
        System.out.println("El número mayor es " + num1);
        }
        else if(num2>num1 && num2 > num3){
            System.out.println("El número mayor es " + num2);
        }
        else if(num3>num1 && num3 > num2){
            System.out.println("El número mayor es " + num3);

            scanner.close();
        }
    }
}
