public class FamilyEntrance extends Tickets{
    public double calculateFamilyPrice( int qtdFamily){
        return ((getValue() *qtdFamily) - (getValue() * qtdFamily)  * 0.05);
    }
}
