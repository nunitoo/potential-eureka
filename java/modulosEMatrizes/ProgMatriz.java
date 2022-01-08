
import javax.swing.*;

class ProgMatriz
{
    public static void main(String args[])
    {
        // Vars 

        int vetor[] = {2, 4, 6, 8, 10};
        int matriz[][] = new int [2][3];
        String msg = "vetor = ";


        for(int i = 0; i < vetor.length; i++)
        {
            msg = msg + vetor[i] + "   ";
        }
        System.out.println(msg);
        JOptionPane.showMessageDialog(null, msg);

        msg = "matriz = \n\n";
        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[0].length; j++)
            {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro para a posição " + i + " e " + j));
                msg = msg + matriz[i][j] + "   ";
            }
            msg = msg + "\n";
        }
        System.out.println(msg);
        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);
    }
}

