import java.util.*;
public class Pratica04 {
    enum Estado {//Para representar os estados do automato
        Q0, S3, S6, S4
    }
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma palavra composta por 'a' ou 'b'");//Solicita ao usuario que digite uma palavra
        String palavra = teclado.next();
        Estado estadoAtual = Estado.Q0;//Onde o estado do automato se inicia
        for (char caracter : palavra.toCharArray()) {//Declara a variavel caracter usada para armazenar cada caracter individualmente,converte a array palavra em um array de caracteres 
            switch (estadoAtual) {
                case Q0:
                if (caracter == 'a') {
                    estadoAtual = Estado.S3;//Se estiver no estado Q0 e receber a,vai para o estado S3 
                } else if (caracter == 'b') {
                    estadoAtual = Estado.Q0;//Se estiver no estado Q0 e receber a,vai se manter em Q0
                }
                break;
                case S3:
                if (caracter == 'a') {
                    estadoAtual = Estado.S6;//Se estiver no estado S3 e receber a,vai para o estado S6
                } else if (caracter == 'b') {
                    estadoAtual = Estado.Q0;//Se estiver no estado S3 e receber a,vai para o estado Q0
                }
                break;
                case S6:
                if (caracter == 'a') {
                    estadoAtual = Estado.S6;//Se estiver no estado S6 e receber a,vai se mnater em S6 que já é um estado final
                } else if (caracter == 'b') {
                    estadoAtual = Estado.S4;//Se estiver no estado S6 e receber a,vai para o estado S4 que é um estado final assim como S6
                }
                break;
                case S4:
                if (caracter == 'a') {
                    estadoAtual = Estado.S6;//Se estiver no estado S4 e receber a,vai para o estado S6 que é um estado final assim como S4
                } else if (caracter == 'b') {
                    estadoAtual = Estado.S4;//Se estiver no estado S4 e receber a,vai se manter no estado S4 que já é um estado final
                }
                break;
            }
        }
        if (estadoAtual == Estado.S6 || estadoAtual == Estado.S4) {
            System.out.println("Essa palavra foi aceita");//A palavra digitada pelo usuario foi aceita
        } else {
            System.out.println("Essa palavra nâo foi aceita");//A palavra digitada pelo usuario não foi aceita
        }
    }
}