import java.util.*;
public class Pratica02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while(true) {//inica um loop infinito onde será apenas interrompido com break
            System.out.println("digite uma string(ou 'sair' para encerrar)");//Pede para o usuario digitar uma string
            String input = teclado.nextLine();//Ler a string digitada pelo usuario

            if (input.equalsIgnoreCase("sair")){//Para verificar se o usuario digitou sair ignorando maisculas e minusculas
                System.out.println("Encerrar programa");//Exibe para o usuario caso digite sair que está o programa vai encerrar
                break;//sair do loop e encerrar o programa
            }
            //Verificar se a String digitada é um palíndromo
            String reversed = new StringBuilder(input).reverse().toString();//Cria um novo StringBuilder,inverte a string e a converte
            if(input.equalsIgnoreCase(reversed)) {//Para comparar a string origital com a invertida,ignorando maisculas e minusculas
                System.out.println("A string é um palíndromo.");//Informa ao usuario que a string é um palíndromo
            }else {
                System.out.println("A string não é um palíndromo.");//Informa ao usuario que a string não é um palíndromo
            }
        }

    }
}