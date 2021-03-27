
package exer14;

import java.util.Scanner;


public class Exer14 {

    /** Quilowatt */
    public static void main(String[] args) {
        Scanner leia;
        leia = new Scanner (System.in);
        
        float salario;
        float kw ;
        float custo;
        
        System.out.println("Digite o valor do salario minimo");
       salario = Float.parseFloat(leia.nextLine());
       
        System.out.println("Digite o valor do quilowatt");
       kw = Float.parseFloat(leia.nextLine());
       
       custo = salario/5/100;
        System.out.println("1 kw custa R$"+custo);
        
        System.out.println("O preço a pagar é "+custo*kw);
        
        System.out.println("com o desconto de 15% fica R$"+custo *kw/100*85);
       
       
        
        
        
                
        
        
        
    }
    
}
