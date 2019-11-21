
public class ProfHorista extends Professor {
    
    private double vlrTrab;
    private int hrTrab;

    public int getHrTrab() {
        return hrTrab;
    }

    public ProfHorista(int hrTrab, String nome, double v) {
        super(nome);
        this.setHrTrab(hrTrab);
        this.setvlrTrab(v);
        
    }

    public void setHrTrab(int hrTrab) {
        this.hrTrab = hrTrab;
    }

    public double getvlrTrab() {
        return vlrTrab;
    }

    public void setvlrTrab(double vlrTrab) {
        this.vlrTrab = vlrTrab;
    }

    public ProfHorista(String n) {
        super(n);
    }
    
       public double calcularSalarioLiquido() {
        return ((this.getvlrTrab() * this.hrTrab )- (this.getvlrTrab()* 0.05));
        
     }

   
   
  }
