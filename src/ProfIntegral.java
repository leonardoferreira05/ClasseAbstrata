
public class ProfIntegral extends Professor{
    
    private double salario;

    public ProfIntegral(double salario, String n) {
        super(n);
        this.setSalario(salario);
    }

   
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ProfIntegral(String nome) {
        super(nome);
    }

     public double calcularSalarioLiquido() {
        return this.getSalario() - (this.getSalario()* 0.11);
        
     }
    
}
