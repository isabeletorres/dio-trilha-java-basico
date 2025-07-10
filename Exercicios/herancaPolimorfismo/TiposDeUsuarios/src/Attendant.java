public class Attendant extends Employee{

    private double cashValue;


    public Attendant(String name, String email, String password) {
        super(name, email, password, false);
    }

    public Double getCashValue(){
        return cashValue;
    }

    public void setCashValue(Double cashValue){
        this.cashValue = cashValue;
    }

    public void receivePayment(double value){
        cashValue += value;
    }
    public void closeBox(){
        System.out.println("Caixa fechado com o valor de: " + cashValue);
    }
}
