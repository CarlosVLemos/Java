public class treino2{
    public static void main(String[] args){
        int idade = 18;
        char genero = 'M';
        double altura = 1.79;
        double peso = 87.52;
        double IMC = peso / (altura * altura);
        boolean ativo = true;

        System.out.println("idade: " +idade);
        System.out.println("genero: " +genero);
        System.out.println("altura: " +altura);
        System.out.println("ativo: " +ativo);

        IMC = Math.round(IMC * 100) / 100.0;
        System.out.println("IMC: " + IMC);


        //converter valor
        int num = 26;
        double numdecimal = num;
        System.out.println("Conversor decimal, o número inteiro é: " +num);
        System.out.println("Número convertido, agora ele é " +numdecimal);

        // converão direta
        char a = '9';
        int b = 10;
        int e = Integer.parseInt(String.valueOf(a)) + b;
        System.out.println("e; " +e);


    
    }
}
