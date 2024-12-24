import java.util.Scanner;



// diferença de idades
public class treino4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("entre com a idade número um, e idade número dois:");
        int idade1 = obj.nextInt();
        int idade2 = obj.nextInt();
        
        
        
        System.out.println("a idade número um é: " +idade1 );
        System.out.println("a idade número dois é: " +idade2 );
        /*math.abs can be used her for evoiding this much lines
         * just create a variable idade3 with math.abs method
         * 
         * idade3 = math.abs(idade1 - idade2);
         */
        if (idade1<idade2){
            int diferença = idade1 - idade2 *(-1);
            System.out.println("a diferença é: "+diferença);
        }else {int idade3 = (idade1 - idade2);
        System.out.println("a diferença é: "+ idade3);
        };

    }
    
}

