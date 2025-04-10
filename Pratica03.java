import java.util.*;
public class Pratica03 {
    enum Estado {//Para representar os estados do automato
        Q0, Q1, Q2, QF
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
                    estadoAtual = Estado.Q1;//Se estiver no estado Q0 e receber a,vai para o estado Q1 
                } else if (caracter == 'b') {
                    estadoAtual = Estado.Q2;//Se estiver no estado Q0 e receber a,vai para o estado Q2
                }
                break;
                case Q1:
                if (caracter == 'a') {
                    estadoAtual = Estado.QF;//Se estiver no estado Q1 e receber a,vai para o estado QF
                } else if (caracter == 'b') {
                    estadoAtual = Estado.Q2;//Se estiver no estado Q1 e receber a,vai para o estado Q2
                }
                break;
                case Q2:
                if (caracter == 'a') {
                    estadoAtual = Estado.Q1;//Se estiver no estado Q2 e receber a,vai para o estado Q1
                } else if (caracter == 'b') {
                    estadoAtual = Estado.QF;//Se estiver no estado Q2 e receber a,vai para o estado QF
                }
                break;
                case QF://Estado final permanece nele mesmo com o caracter que receber
            }
        }
        if (estadoAtual == Estado.QF) {
            System.out.println("Essa palavra foi aceita");//A palavra digitada pelo usuario foi aceita
        } else {
            System.out.println("Essa palavra nâo foi aceita");//A palavra digitada pelo usuario não foi aceita
        }
    }
}