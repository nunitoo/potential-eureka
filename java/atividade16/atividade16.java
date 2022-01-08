// Desenvolva um programa em Java que declara um vetor de 5 posições
// e calcula a somatória e a produtória desses números,
// utilizando funções e procedimentos sem parâmetros
//
/// Author: Mateus Nunes
//


class Atividade16
{
    // Vars
    static int vetor[] = {2, 3, 4, 5, 6};

    public static int sum()
    {
        int aux = 0;
        for(int i = 0 ; i <= vetor.length - 1 ; i++)
        {
            aux = aux + vetor[i];
        }
        return aux;
    }

    public static int producer()
    {
        int aux = 1;
        for(int i = 0 ; i <= vetor.length - 1 ; i++)
        {
            aux = aux * vetor[i];
        }
        return aux;
    }


    public static void main(String args[])
    {
        // Início
        System.out.println(sum());
        System.out.println(producer());

        System.exit(0);
    }
}


