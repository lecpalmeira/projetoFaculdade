package controles;

import entidades.Produto;
import java.util.ArrayList;


public class RepositoriosManager {
    

    private static RepositoriosManager instancia;
    

    private long contadorProdutos = 1;

    

    private ArrayList<Produto> listaProdutos;
    
    

    public static RepositoriosManager getInstance() {
        
        if (instancia == null) {
            
            instancia = new RepositoriosManager();
        }
        
        return instancia;
    }


    private RepositoriosManager() {
        
        listaProdutos = new ArrayList<Produto>();
        loadProdutosParaTestes();
        
    }
    
    
  
    
    public long getContadorProdutos() {
        return contadorProdutos;
    }
    
    
    
    public void inserirProduto(Produto p) {
        
        listaProdutos.add(p);
        
        contadorProdutos++; 
        
    }
    
        public void excluirProduto(Produto p) {
        
        listaProdutos.remove(p);
        
    }
    
    
    public ArrayList<Produto> obterListaProdutos() {
        
        return listaProdutos;
    }

    
    
    private void loadProdutosParaTestes() {
        
        for (int i = 2000; i < 2017; i++) {
            Produto p = new Produto(
                    new Long(contadorProdutos), 
                    "FIFA "+(i+1),
                    100);
 
            contadorProdutos++;
            listaProdutos.add(p);
        }
        
        
    }


    
    public void modificarProduto(Produto p) {
        
        if (listaProdutos.contains(p)) {
            
            int index = listaProdutos.indexOf(p);
            listaProdutos.set(index, p);
            
        }
        
    }
    
    
}
