package entidades;


public class Produto {


    private Long codigo;
    private String nome;
    private double preco;
    
    public Produto(Long codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    @Override
    public String toString() {
        String valores = "codigo="+codigo+
                         ", nome="+nome+
                         ", preco="+preco;
        
        return valores;
    }
    
    
    
    
}
