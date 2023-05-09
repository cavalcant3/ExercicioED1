import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Calculadora calculadora = new Calculadora();
        Scanner ler = new Scanner(System.in);


        System.out.println("Informe a operação que vocÊ deseja usar \n" +
                "1 - adicao \n" +
                "2 - divisao \n" +
                "3 - multiplcacao \n" +
                "4 - raizQuadrada \n" +
                "5 - potenciacao \n" +
                "6 - log");


        int resposta = calculadora.getResultado();
        resposta = ler.nextInt();

        switch (resposta) {
            case 1:
                System.out.printf("Informe o primeiro valor: ");
                float numa;
                float numb;
                numa = ler.nextFloat();

                System.out.printf("Informe o segundo valor.: ");
                numb = ler.nextFloat();

//                System.out.println(calculadora.adicao(numa, numb));
                break;
            case 2:
                Divisao divisao = new Divisao();
                System.out.printf("Informe o primeiro valor: ");
                long num1;
                long num2;
                num1 = ler.nextLong();

                System.out.printf("Informe o segundo valor.: ");
                num2 = ler.nextLong();

                System.out.println(divisao.fazerConta(num1, num2));
                break;
            case 3:
                Multiplicacao multiplicacao = new Multiplicacao();
                System.out.printf("Informe o primeiro valor: ");
                long num3;
                long num4;
                num3 = ler.nextLong();

                System.out.printf("Informe o segundo valor.: ");
                num4 = ler.nextLong();
                System.out.println(multiplicacao.fazerConta(num3, num4));
                break;
            case 4:
                System.out.printf("Informe o primeiro valor: ");
                float num5;

                num5 = ler.nextFloat();
//                System.out.println(calculadora.raizQuadrada(num5));
                break;
            case 5:
                System.out.printf("Informe o valor da base: ");
                double x;
                x = ler.nextDouble();
                System.out.printf("Informe o  valor do expoente: ");
                double y;
                y = ler.nextDouble();

                System.out.println(calculadora.potenciacao(x, y));
                break;
            case 6:
                System.out.printf("Informe o valor do log: ");
                double a;
                a = ler.nextDouble();

                System.out.println(calculadora.log(a));
                break;
        }


    }

}