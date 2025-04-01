import java.util.*;
public class Pratica01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true) {//inicia um loop infinito onde será apenas interrompido com break
            System.out.println("Digite uma string(ou sair para encerrar): ");//Para o usuario digitar uma string
            String input = teclado.nextLine();//Ler a string digitada pelo usuario

            if(input.equalsIgnoreCase("sair")){//Para verificar se o usuario digitou sair ignorando maisculas e minusculas
                System.out.println("Encerrar programa");//Exibe para o usuario caso digite sair que está o programa vai encerrar
                break;//sair do loop e encerrar o programa
            }
            System.out.println("Prefixos:");//Mostra ao usuario o titulo prefixos
            for(int i=1; i <= input.length(); i++) {//Vai percorrer de 1 até o tamanho do string digitado pelo usuario
                System.out.println(input.substring(0, i));//Mostra os prefixos da string digitada
            }
            System.out.println("Sufixos:");//Mostra ao usuario o titulo sufixos
            for(int i=0; i< input.length(); i++) {//Vai percorrer de 0 até o tamanho do string digitado pelo usuario
                System.out.println(input.substring(i));//Mostra os sufixos da string digitada
            }
        }
    }
}