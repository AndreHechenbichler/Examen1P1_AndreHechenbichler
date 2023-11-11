/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_andrehechenbichler;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author andre
 */
public class Examen1P1_AndreHechenbichler {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        Random rand=new Random();
        int max=30;
        int min=15;
        int max1=100;
        int min1=1;
        int max2=7;
        int min2=1;
        int max3=5;
        int min3=3;

        System.out.println("**********MENU**********");
        System.out.println("1. Para fight or flight");
        System.out.println("2. Para Tri fuerza");
        System.out.println("3. Para salir");
        int opcion=leer.nextInt();
        while(opcion>0&&opcion<3){
            switch(opcion){
                case 1:{
                    System.out.println("Ingrese Maestria");
                    System.out.println("1. Principiante (0% de hit extra + extra damage)");
                    System.out.println("2. Intermedio (5% de hit extra + extra damage");
                    System.out.println("3. Experto (15% de hit extra + extra damage");
                    int opcion2=leer.nextInt();
                    int probda=65;
                    if(opcion2==1){
                        probda=65;
                    }
                    else if(opcion2==2){
                        probda=70;
                    }
                    else if(opcion2==3){
                        probda=80;
                    }else{
                        System.out.println("Ingresse una maestria");
                    }
                    int zhp=25;
                    int balas=25;
                    int dist=rand.nextInt((max-min)+1)+min;
                    char resp='s';
                    while(zhp>0||dist<1){
                        while(resp=='s'||resp=='S'){
                            int tirar=rand.nextInt((max1-min1)+1)+min1;
                            int dano=rand.nextInt((max2-min2)+1)+min2;
                            int avanze=rand.nextInt((max3-min3))+min3;
                            System.out.println("El zombie esta a "+dist+" metros");
                            System.out.println("");
                            System.out.println("El jugador tiene "+balas+" balas");
                            System.out.println("");
                            System.out.println("");
                            if(tirar<=probda){
                                System.out.println("Hit! el tiro a reducido el hp de el zombie por un total de "+dano);
                                System.out.println("");
                                zhp=zhp-dano;
                                if(zhp>0){
                                System.out.println("Vida restante del zombie: "+zhp);
                                System.out.println("");
                                }else{
                                    System.out.println("Vida restante del zombie: 0");
                                System.out.println("");
                                }
                                if(dist>0){
                                    System.out.println("El zombie se encuentra a: "+dist+" metros");
                                }else{
                                    System.out.println("El zombie se encuentra a: 0 metros");
                                }
                                balas=balas-1;
                                System.out.println("");
                                System.out.println("");
                            }
                            else if(tirar>probda){
                                dist=dist-avanze;
                                System.out.println("Ha fallado! El zombie se encuentra a "+dist+" metros");
                                System.out.println("");
                                balas=balas-1;
                            }
                            if(zhp==0||zhp<0){
                                System.out.println("You Win, as logrado vencer al zombie");
                                resp='n';
                            }
                            else if(dist==0|dist<0){
                                System.out.println("GAME OVER, la distancia se redujon a 0");
                                resp='n';
                            }
                            else if(balas==0){
                                System.out.println("GAME OVER, ya no hay balas");
                            }
                            else{
                                System.out.println("Listo para la siguiente ronda[S/N]");
                                resp=leer.next().charAt(0);
                            }
                        }
                        zhp=0;
                    }
                }break;
                case 2:{
                    tri();
                    System.out.println("");
                }break;
            }
            System.out.println("**********MENU**********");
        System.out.println("1. Para fight or flight");
        System.out.println("2. Para Tri fuerza");
        System.out.println("3. Para salir");
        opcion=leer.nextInt();
        }
    }
    static void tri(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero par y mayor que 20");
        int num=leer.nextInt();
        if(num>=20||num%2==0){
            for (int i = 0; i < num/2; i++) {
                System.out.print("           ");
                for (int j =0; j < num/2 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");
                }
            System.out.println();
            }
            for (int i = 0; i < num/2; i++) {
                for (int j = 0; j < num/2 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");
                }
                for (int j = 0; j < num/2 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");
                }
            System.out.println();
            }
        }
        else{
            System.out.println("una opcion correcta");
        }
    }
}
