package my.learn.testdata;

import my.learn.domain.Address;

public class AddressGenerator {

    public static Address generateAddress(int cityIndex) {
        return Address.builder()
                .streetNumber(cityIndex)
                .streetName("street name " + cityIndex)
                .city(selectCity(cityIndex))
                .country(selectCountry(cityIndex))
                .zipCode("1234" + cityIndex)
                .build();
    }

    private static String selectCity(int cityIndex) {
        return cityIndex % 2 == 0 ? "Paris" : "Rouen";
    }

    private static String selectCountry(int index) {
        return index % 2 == 0 ? "France" : "Belgium";
    }
}
