import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        Scanner ler = new Scanner(System.in);


        System.out.println("Informe a operação que vocÊ deseja usar" +
                "1 - adicao" +
                "2 - multiplcacao");

        int resposta = calculadora.getResultado() ;
        resposta = ler.nextInt();

        switch (resposta){
            case 1:
                System.out.println(calculadora.adicao());
                break;
        }



    }

}