package pessoamaisalta;
import java.util.Scanner;

public class PessoaMaisAlta {
    public static void main(String[] args) {
        // Declaração de variáveis
        int altura, comparaAltura=0, contador=0;
        
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("Qual a sua altura em CM? (Digite 0 para parar) ---");
            altura = teclado.nextInt();
                if (altura> comparaAltura ){
                    comparaAltura = altura;
                }      
        }while(altura > 0);
        
        System.out.println("A maior das alturas é a de " + comparaAltura+" cm.");
    }
    
}
