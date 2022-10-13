package guru.qa;

import java.util.*;

public class PhoneExample {

    public static void main(String[] args) {
        Phone samsung = new Phone(900, "Samsung", true);
        samsung.setSupportedOsVersions(Set.of("12", "13"));

        Phone iPhone = new Phone(1000,  "IPhone", false);
        iPhone.setSupportedOsVersions(Set.of("14", "15", "16", "17"));

        iPhone.setAddressBook(Map.of(
                "Дима", new Contact("8-800-555-35-35"),
                "Вася", new Contact("8-800-777-35-35")
        ));


        System.out.println("Supported OS count: " + iPhone.supportedOsVersions.size());


        System.out.println("foreach");

        for (String osVersion : iPhone.supportedOsVersions) {
            System.out.println("OS version: " + osVersion);
        }

        Set<String> keySet = iPhone.addressBook.keySet();
        Collection<Contact> values = iPhone.addressBook.values();
        Set<Map.Entry<String, Contact>> entries = iPhone.addressBook.entrySet();
        for (Map.Entry<String, Contact> entry: entries) {
            if (entry.getKey().equals("Дима")) {
                System.out.println("Димин контакт: " +  entry.getValue().toString());
            }
        }


        Phone sony = new Phone();
        sony.setPhoneName("Sony XPERIA");
        sony.setPrice(800);
        sony.setAndroidPhone(true);
        iPhone.setInCase(true);

    }
}
