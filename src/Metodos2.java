import java.util.Scanner;

public class Metodos2 {
    public static void main(String[] args) {
    //IMC = peso kg / altura m^2
double IMC = 0;
        double altura2=0;
        double peso2=0;
        System.out.println("Ingrese el peso en kg:");
        Scanner peso = new Scanner(System.in);
        peso2=peso.nextDouble();


        System.out.println("Ingrese la altura en metros:");
        Scanner altura =new Scanner(System.in);
altura2=altura.nextDouble();

altura2=altura2*altura2;

        IMC = (double) peso2 / altura2;

        if(IMC<18.5){
            System.out.println("bajo peso");
        }else if(IMC>=18.5 && IMC<=24.9){
            System.out.println("Peso normal");

        } else if (IMC>=25&&IMC<=29.9) {
            System.out.println("Sobrepeso");
            
        }else if (IMC>=30&&IMC<=34.9){
            System.out.println("Obesidad tipo I");
            
        } else if (IMC>=35&&IMC<=39.9) {
            System.out.println("Obesidad tipo II");
        }else {
            System.out.println("Obesidad tipo III");

        }

        System.out.println(IMC);

    }
}
