public class Main {
    public static void main(String[] args) {
        Multiplier.multiply(10, 5);
        Multiplier.multiply(10.5, 5);

        System.out.printf(Address.createAddress("Polska", "Warszawa", "02-601", "Racławicka", 36));
        System.out.printf(Address.createAddress("Polska"));

    }
}