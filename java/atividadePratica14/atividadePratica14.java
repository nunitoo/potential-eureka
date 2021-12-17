/// Desenvolva um programa em Java que declara variáveis inteiras, reais e String,
/// recebe dois números inteiros usando interface com usuário,
/// calcula o quociente da divisão dos dois números,
/// a potência do primeiro número pelo segundo número
/// e mostra essas informações usando interface com usuário.
///
///
/// Author: Mateus Nunes
///

import javax.swing.*;

class AtividadePratica14
{
    public static void main(String args[])
    {

        // Variáveis
        int number1, number2;
        double quociente;
        double pow;
        String message;



        // Início

        number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));
        quociente = number1 / number2;
        pow = Math.pow(number1, number2);
        message = "O quociente da divisão de " + number1 + " por " + number2 + " é " + quociente + ". A potência de " + number1 + " por " + number2 + " é " + pow + ".";



        JOptionPane.showMessageDialog(null, message);
        System.exit(0);
    }
}


