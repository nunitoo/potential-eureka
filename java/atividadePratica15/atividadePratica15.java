/// Desenvolva um programa em Java que declara vari�veis inteiras,
/// char e String, receba dois n�meros inteiros e uma op��o, 
/// calcula o produto dos dois n�meros se eles forem positivos, 
/// calcula a produt�ria do primeiro n�mero, o n�mero de vezes do segundo
/// e mostra as informa��es. Usar estruturas de decis�o e de m�ltipla escola.
///
///
/// Author: Mateus Nunes
///


import javax.swing.*;


class AtividadePratica15
{
    public static void input(char option)
    {
        // Vari�veis
        int number1, number2;
        int product = 1;
        String output = "";

        // Input
        number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro"));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero inteiro"));

        switch (option) 
        {
            case '1':
            {
                if(number1 > 0 && number2 > 0)
                {
                    product = number1 * number2;
                    output = "O produto de " + number1 + " por " + number2 + " � " + product; 
                }break;
            }   
            case '2':
            {
                for(int i = 1; i <= number2; i++)
                {
                    product = product * number1;
                    output = "O produt�rio de " + number1 + ", " + number2 + " vezes � " + product; 
                }break;
            }
        }JOptionPane.showMessageDialog(null, output);
    }

    public static void main(String args[])
    {
        // Vari�veis
        char option = 0;
        

        // In�cio
        option = (JOptionPane.showInputDialog("[1] para multiplica��o\n[2] para produt�ria\n")).charAt(0);
        switch (option) {
            case '1':
            {
                input(option);
                break;
            }   
            case '2':
            {
                input(option);
                break;
            }
            default:
            {
                JOptionPane.showMessageDialog(null, "Op��o inv�lida.");
                break;
            }
        }   



        System.exit(0);
    }
}
