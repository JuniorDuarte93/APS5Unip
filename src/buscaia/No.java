
package buscaia;

public class No {

    int valor;
    No noEsq, noDir;
    
    public static No raiz;

    public No(int valor) {
        this.valor = valor;
    }
    
    public static void inserir(int valor) {
        inserir(raiz, valor);
    }
    
   

    public static void inserir(No node, int valor) {
        if (node == null) {
            System.out.println("Raiz " + valor);
            raiz = new No(valor);
        } else {
            if (valor < node.valor) {
                if (node.noEsq != null) {
                    inserir(node.noEsq, valor);
                } else {
                    System.out.println("Inserindo " + valor + " a esquerda de " + node.valor);
                    node.noEsq = new No(valor);
                }

            } else {
                if (node.noDir != null) {
                    inserir(node.noDir, valor);
                } else {
                    System.out.println("Inserindo " + valor + " a direita de " + node.valor);
                    node.noDir = new No(valor);
                }
            }
        }
        
       
    }
    
    public static void ordem(No node) {
        if (node != null) {
            ordem(node.noEsq);
            System.out.print(node.valor + ", ");
            ordem(node.noDir);

        }
    }
    
    
      public static void buscaEmProfundidade(No node, int valorProcurado){
          
          
        if (node == null) {
            System.out.print("Arvore Vazia \n \n" );
            
        }else if(node.valor == valorProcurado) {
           ordem(node.noEsq);
           System.out.print("Achou" );
           ordem(node.noDir);
        }
          
          
          
        
      
    }
    

    
   
   
    public static void main(String[] args) {
        
        
        
        ;
        inserir(15);
        inserir(5);
        inserir(2);
        inserir(50);
        inserir(78);
        inserir(52);
        
        
        ordem(raiz);
        
          
    
    }
    
}
