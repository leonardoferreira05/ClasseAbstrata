
public abstract class Produto {
    private String codigo;
    private String nome;
    private String descricao;
    private double preco;

    public Produto(String c, String n, String d, double p) {
        this.setCodigo(c);
        this.setNome(n);
        this.setDescricao(d);
        this.setPreco(p);
    }
             
    public abstract double calcularPrecoFinal();
    public abstract String imprimirDados();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String c) {
        this.codigo = c;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String d) {
        this.descricao = d;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double p) {
        this.preco = p;
    }
    
    
    
}
