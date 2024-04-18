package mx.utng.sesion06;

import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea que tabla deceas: ");
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= 10; i++) {
            //System.out.println("5x"+i+"="+5*i);
            System.out.printf("%dx%d=%d\n" ,n,i,n*i);
            
        }

        short[] valores = {1,2,5,6,8,9};
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%dx%d=%d\n" ,n,valores[i],n*valores[i]);
        }
        for (short s : valores) {
            System.out.println(s+",");
        }
        System.out.println("");

        //While
        short i = 0;
        while (++i<=10) {
            System.out.println(i);
        }

        //Do-While

        i = 1;
        do{
            System.out.println(i);
        }while(i++ <10);
        }

}
