/// Desenvolva um programa em Java que declara vari�veis inteiras, reais e String,
/// recebe dois n�meros inteiros usando interface com usu�rio,
/// calcula o quociente da divis�o dos dois n�meros,
/// a pot�ncia do primeiro n�mero pelo segundo n�mero
/// e mostra essas informa��es usando interface com usu�rio.
///
///
/// Author: Mateus Nunes
///

import javax.swing.*;

class AtividadePratica14
{
    public static void main(String args[])
    {

        // Vari�veis
        int number1, number2;
        double quociente;
        double pow;
        String message;



        // In�cio

        number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro"));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero inteiro"));
        quociente = (double)number1 / number2;
        pow = Math.pow(number1, number2);
        message = "O quociente da divis�o de " + number1 + " por " + number2 + " � " + quociente + ". A pot�ncia de " + number1 + " por " + number2 + " � " + pow + ".";



        JOptionPane.showMessageDialog(null, message);
        System.exit(0);
    }
}


