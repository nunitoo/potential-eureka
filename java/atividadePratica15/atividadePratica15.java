/// Desenvolva um programa em Java que declara variáveis inteiras,
/// char e String, receba dois números inteiros e uma opção, 
/// calcula o produto dos dois números se eles forem positivos, 
/// calcula a produtória do primeiro número, o número de vezes do segundo
/// e mostra as informações. Usar estruturas de decisão e de múltipla escola.
///
///
/// Author: Mateus Nunes
///


import javax.swing.*;


class AtividadePratica15
{
    public static void input(char option)
    {
        // Variáveis
        int number1, number2;
        int product = 1;
        String output = "";

        // Input
        number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));

        switch (option) 
        {
            case '1':
            {
                if(number1 > 0 && number2 > 0)
                {
                    product = number1 * number2;
                    output = "O produto de " + number1 + " por " + number2 + " é " + product; 
                }break;
            }   
            case '2':
            {
                for(int i = 1; i <= number2; i++)
                {
                    product = product * number1;
                    output = "O produtório de " + number1 + ", " + number2 + " vezes é " + product; 
                }break;
            }
        }JOptionPane.showMessageDialog(null, output);
    }

    public static void main(String args[])
    {
        // Variáveis
        char option = 0;
        

        // Início
        option = (JOptionPane.showInputDialog("[1] para multiplicação\n[2] para produtória\n")).charAt(0);
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
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                break;
            }
        }   



        System.exit(0);
    }
}
