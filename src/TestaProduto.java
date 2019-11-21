
public class TestaProduto {
    public static void main(String[] args) {
        Motor m1 = new Motor("c147","Fiat 147","Motor raiz",1732.55,410.00,8000);
        Parafuso p1 = new Parafuso("p12","Parafuso12 ","Parafuso top of mind ",2.25,4.5,2.2);
        
        System.out.println(m1.imprimirDados()+"\n");
        System.out.println("Preço do Motor: "+ m1.calcularPrecoFinal()+"\n");
        
        
        System.out.println(p1.imprimirDados()+"\n");
        System.out.println("Preço do parafuso: "+ p1.calcularPrecoFinal());
    }
    
}
