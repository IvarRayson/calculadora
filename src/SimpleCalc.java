
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ivar
 */
public class SimpleCalc {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String entrada;
        do{
            System.out.println("Escoja una operación o pulse 0 para salir.");
            System.out.println("Operaciones: + - x /");
            System.out.print("> ");
            entrada = sc.nextLine();
            int n1 = 0, n2 = 0;
            switch(entrada){
            case "+":
                System.out.print("Operando 1 > ");
                n1 = sc.nextInt();
                System.out.print("Operando 2 > ");
                n2 = sc.nextInt();
                System.out.println("%d+%d=%d".formatted(n1,n2,n1+n2));
                break;
            case "-":
                System.out.print("Operando 1 > ");
                n1 = sc.nextInt();
                System.out.print("Operando 2 > ");
                n2 = sc.nextInt();
                System.out.println("%d-%d=%d".formatted(n1,n2,n1-n2));
                break;
            case "x":
                System.out.print("Operando 1 > ");
                n1 = sc.nextInt();
                System.out.print("Operando 2 > ");
                n2 = sc.nextInt();
                System.out.println("%dx%d=%d".formatted(n1,n2,n1*n2));
                break;
            case "/":
                System.out.print("Operando 1 > ");
                n1 = sc.nextInt();
                System.out.print("Operando 2 > ");
                n2 = sc.nextInt();
                System.out.println("%d/%d=%d".formatted(n1,n2,n1/n2));
                break;
            default:
                System.out.println("Operación incorrecta!");
            }
            sc.nextLine();
        }while(!entrada.equals(""));
    }
}