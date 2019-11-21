
public abstract class Professor {
    private String nome;
    
    public abstract double calcularSalarioLiquido();
    
     public Professor(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

   
    
}
