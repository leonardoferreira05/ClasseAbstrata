public class Parafuso extends Produto {
    private double comprimento;
    private double diametro;

    public Parafuso( String c, String n, String d, double p,double comp, double diam) {
        super(c, n, d, p);
        this.setComprimento(comp);
        this.setDiametro(diam);
    }
    
    public double calcularPrecoFinal(){
        return this.getPreco()+(this.getPreco()*0.5);
    }
    public String imprimirDados(){
      return "Código: "+this.getCodigo()+" nome: "+this.getNome()+" descrição: "+ this.getDescricao()+ " valor: "+ this.getPreco()+
      " Comprimento: "+this.getComprimento()+" Diametro: "+this.getDiametro();
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comp) {
        this.comprimento = comp;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diam) {
        this.diametro = diam;
    }
    
}
