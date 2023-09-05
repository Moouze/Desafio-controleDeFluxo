import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();

    }

    static void contar (int parametroUm, int parametrodois) throws ParametrosInvalidosException{
        if(parametroUm > parametrodois)
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");

        int contagem = parametrodois - parametroUm;
        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o numero : "+ i);
        }
    }
}
