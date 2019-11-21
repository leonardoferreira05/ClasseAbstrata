
public class Motor extends Produto {
    private double potencia;
    private double rpm;
    
    public Motor(String c,String n,String d,double p,double po,double r){
        super(c,n,d,p);
        this.setPotencia(po);
        this.setRpm(r);
    }
    
    public double calcularPrecoFinal(){
        return this.getPreco()-(this.getPreco()*0.5);
    }
    public String imprimirDados(){
      return "Código: "+this.getCodigo()+" nome: "+this.getNome()+" descrição: "+ this.getDescricao()+ " valor: "+ this.getPreco()+
      " potencia: "+this.getPotencia()+" RPM: "+this.getRpm();
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double p) {
        this.potencia = p;
    }

    public double getRpm() {
        return rpm;
    }

    public void setRpm(double r) {
        this.rpm = r;
    }
    
    
   


    
    
    
}
