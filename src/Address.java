public class Address {

    public static String createAddress(String country) {
        return createAddress(country, null);
    }
    public static String createAddress(String country, String city) {
        return createAddress(country, city, null);
    }
    public static String createAddress(String country, String city, String postalCode) {
        return createAddress(country, city, postalCode, null);
    }
    public static String createAddress(String country, String city, String postalCode, String street) {
        return createAddress(country, city, postalCode, street, null);
    }
    public static String createAddress(String country, String city, String postalCode, String street, Integer houseNo) {
        StringBuilder sb = new StringBuilder();

        if(country != null) {
            sb.append("Country: %s");
        }
        if(city != null) {
            sb.append(", city: %s");
        }
        if(postalCode != null) {
            sb.append(", postalCode: %s");
        }
        if(street != null) {
            sb.append(", street: %s");
        }
        if(houseNo != null) {
            sb.append(", houseNumber: %d");
        }

        return String.format(sb.toString(), country, city, postalCode, street, houseNo);
    }
}
