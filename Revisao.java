import java.util.Scanner;

public class Revisao {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva o seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Ola, "+ nome +"seja bem-vindo(a) ao meu programa!");

        System.out.println("============================");
        
        System.out.println(nome + ", Escreva a sua nota de HTML: ");
        double nota1 = entrada.nextDouble();
        double total = nota1*0.5;
        System.out.println("Sua media foi" + total);
        ;
    }

}


//Atividade 01
public class Atividade01{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva seu primeiro numero: ");
        double numero1 = entrada.nextDouble();
        System.out.println("Escreva seu segundo numero: ");
        double numero2 = entrada.nextDouble();

        double total = numero1+numero2;
        System.out.println("Seu resultado foi "+ total);

    }
}

//Atividade 02
public class Atividade02{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva seu valor em metros: ");
        double numero1 = entrada.nextDouble();
        double total = numero1*100;
        System.out.println("Seu valor e igual a "+ total+" centimetros");

    }
}

//Atividade 03

public class atividade03{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva um numero: ");
        double numero1 = entrada.nextDouble();
        if(numero1 %2==0){
        System.out.println("Seu numero e par");
        }else{
         System.out.println("Seu numero e impar");
        }


    }
}

//Atividade 04

public class Atividade04{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva a velocidade do carro: ");
        double numero1 = entrada.nextDouble();
        if (numero1 > 80){
            Double acima = numero1 - 80;
            double multa = acima * 5;
            System.out.println("Voce ultrapassou a velocidade permitida, sua multa e de "+multa+" reais");
        }else{
            System.out.println("Voce esta dentro do limite permitido");
        }


    }
}