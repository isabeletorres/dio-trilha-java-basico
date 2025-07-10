public class Seller extends Employee{

    private int qttSales;

    public Seller(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }
    public int getQttSales(){
        return qttSales;
    }

    public void performSales(){
        qttSales++;
    }
     public void consultSales(){
         System.out.println("Quantidade de vendas realizadas: " + qttSales);
    }

}
