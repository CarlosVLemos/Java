import java.util.Scanner;

public class treino5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Digite o seu salário e a taxa que paga: ");
        float salario = obj.nextInt();
        float taxa = obj.nextInt();
        float divida = (taxa/100) * salario;

        System.out.println("Você recebe: "+ salario +", com uma taxa de: " +taxa+"%" +" você deve pagar: " + divida);
    }
}
