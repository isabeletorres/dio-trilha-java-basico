public class Main {
    public static void main(String[] args) {
        HalfPrice meia = new HalfPrice();
        meia.setValue(40.0);
        System.out.println("Meia entrada: " + meia.calculateHalfPrice());

        FamilyEntrance familia = new FamilyEntrance();
        familia.setValue(40.0);
        System.out.println("Ingresso familiar (3 pessoas): " + familia.calculateFamilyPrice(3));

    }
}