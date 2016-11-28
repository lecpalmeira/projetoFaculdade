
package controles;

import entidades.Produto;


public class CadastroController {
    
    
    public boolean cadastrarProduto(Produto p) {
     
        boolean result = false;
        
        if (p != null && p.getNome().length() > 0
                && p.getPreco() != 0.0) {
            
          
            p.setCodigo(RepositoriosManager.getInstance().getContadorProdutos());
            
            RepositoriosManager.getInstance().inserirProduto(p);
 
            
            result = true;
        }
        
        
        return result;
    }

    public boolean atualizarProduto(Produto p) {
        
        
        boolean result = false;
        
        if (p != null && p.getNome().length() > 0
                && p.getPreco() != 0.0) {
            
            
        
            RepositoriosManager.getInstance().modificarProduto(p);
            result = true;
        }
        
        
        return result;
        
        
    }
    
        public boolean deletarProduto(Produto p) {
     
        boolean result = false;
        
        if (p != null && p.getNome().length() > 0
                && p.getPreco() != 0.0) {
            
          
            p.setCodigo(RepositoriosManager.getInstance().getContadorProdutos());
            
            RepositoriosManager.getInstance().excluirProduto(p);
 
            
            result = true;
        }
        return result;
               
        }
}
