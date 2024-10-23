import java.util.Scanner;
import java.util.ArrayList;

public class Metodos1 {
    public static void main(String[] args) {
        int cali;
        int promedio;
        int suma=0;
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese la calificacion " + (i+1) + " :");
            Scanner valor_calif = new Scanner(System.in);
            cali=valor_calif.nextInt();
            array.add(cali);

        }

        for (int numero : array) {
            suma += numero;
        }
        promedio=suma/array.size();
        System.out.println("promedio: " + promedio);

        if (promedio>=80){
            System.out.println("aprovado");
        }else{
            System.out.println("reprobado");
        }

        }
    }

