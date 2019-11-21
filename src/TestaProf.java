
public class TestaProf {
    public static void main(String[] args) {
        ProfIntegral pI = new ProfIntegral(2500.00,"Leo");
        ProfHorista pH = new ProfHorista(40,"Leonardo", 40.0);
        
         System.out.println("Salário do professor horista " + pH.getNome() + " é :R$ " + pH.calcularSalarioLiquido() + "\n");
         
          System.out.println("Professor Integral " +pI.getNome()+" de 40 hr/semana é: R$ " + pI.calcularSalarioLiquido());
          
        
    }
    
}
