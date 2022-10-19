import org.junit.jupiter.api.Test;

public class PracticeTest {
    @Test

    public void workingWithOrders() {
        Koshka firstKoshka = new Koshka();
        firstKoshka.setWeight(5.3);
        firstKoshka.setBreed("Stray cat");
        firstKoshka.setKittens(7);

        Koshka secondKoshka = new Koshka();
        secondKoshka.setWeight(4.4);
        secondKoshka.setBreed("Persian");
        secondKoshka.setKittens(4);

        System.out.println("Privet, mir!");
        System.out.println("1st Koshka");
        System.out.println(firstKoshka.getBreed());
        System.out.println("2nd Koshka");
        System.out.println(secondKoshka.getBreed());
////////////////////////////////////////////////////////////////
        Mashina firstMashina = new Mashina();
        firstMashina.setModel("Mitsubishi Lancer Evo");
        firstMashina.setTotalPrice(20000);
        firstMashina.setCapacity(5);

        Mashina secondMashina = new Mashina();
        secondMashina.setModel("BMW M5");
        secondMashina.setTotalPrice(30000);
        secondMashina.setCapacity(5);

        System.out.println("Машины");
        System.out.println("Первая Машина:");
        System.out.println(firstMashina.getModel());
        System.out.println("Вторая Машина:");
        System.out.println(secondMashina.getModel());
//////////////////////////////////////////////////////////////////
        Butilka firstButilka = new Butilka();
        firstButilka.setBeverage("Coca Cola");
        firstButilka.setItemCount(5);
        firstButilka.setVolume(2);

        Butilka secondButilka = new Butilka();
        secondButilka.setBeverage("Kvass");
        secondButilka.setItemCount(3);
        secondButilka.setVolume(0.5);

        System.out.println("Bottles:");
        System.out.println("first bottle:");
        System.out.println(firstButilka.getBeverage());
        System.out.println("second bottle:");
        System.out.println(secondButilka.getBeverage());
///////////////////////////////////////////////////////////////////
        Tabletka firstTabletka = new Tabletka();
        firstTabletka.setBrand("Olainfarm");
        firstTabletka.setItemCount(20);
        firstTabletka.setTotalPrice(15.99);

        Tabletka secondTabletka = new Tabletka();
        secondTabletka.setBrand("Pfizer");
        secondTabletka.setCapacity(30);
        secondTabletka.setTotalPrice(18.99);

        System.out.println("Medicine:");
        System.out.println("first tablets:");
        System.out.println(firstTabletka.getBrand());
        System.out.println("second tablets:");
        System.out.println(secondTabletka.getBrand());
///////////////////////////////////////////////////////////////////////
        Vinogradina firstVinogradina = new Vinogradina();
        firstVinogradina.setShop("Lidl");
        firstVinogradina.setTotalPrice(2.59);
        firstVinogradina.setWeight(0.5);

        Vinogradina secondVinogradina = new Vinogradina();
        secondVinogradina.setShop("Rimi");
        secondVinogradina.setTotalPrice(3.20);
        secondVinogradina.setWeight(0.5);

        System.out.println("Grapes");
        System.out.println("Lidl grapes:");
        System.out.println(firstVinogradina.getTotalPrice());
        System.out.println(firstVinogradina.getWeight());
        System.out.println("Rimi grapes");
        System.out.println(secondVinogradina.getTotalPrice());
        System.out.println(secondVinogradina.getWeight());
///////////////////////////////////////////////////////////////////////////
        Lampa lampaOne = new Lampa();
        lampaOne.setShop("Depo");
        lampaOne.setBrightness("ECO");
        lampaOne.setTotalPrice(20.99);

        Lampa lampaTwo = new Lampa();
        lampaTwo.setShop("Ikea");
        lampaTwo.setBrightness("Not ECO");
        lampaTwo.setTotalPrice(12.99);

        System.out.println("Lamps:");
        System.out.println("first lamp");
        System.out.println(lampaOne.getTotalPrice());
        System.out.println("second lamp:");
        System.out.println(lampaTwo.getTotalPrice());
////////////////////////////////////////////////////////////////////////////
        Telefon firstTelefon = new Telefon();
        firstTelefon.setModel("Iphone 10");
        firstTelefon.setOperatingSystem("IOS");
        firstTelefon.setStrorage(1);

        Telefon secondTelefon = new Telefon();
        secondTelefon.setModel("Samsung S21");
        secondTelefon.setOperatingSystem("Android");
        secondTelefon.setStrorage(2);

        System.out.println("Smartphones:");
        System.out.println("First Smartphone:");
        System.out.println(firstTelefon.getModel());
        System.out.println("Second Smartphone:");
        System.out.println(secondTelefon.getModel());
//////////////////////////////////////////////////////////////////////////////
        Kaktus firstKaktus = new Kaktus();
        firstKaktus.setType("Aloe Vera");
        firstKaktus.setTotalPrice(5);

        Kaktus secondKaktus = new Kaktus();
        secondKaktus.setType("Mexican");
        secondKaktus.setTotalPrice(3);

        System.out.println("Cactuses:");
        System.out.println("First Cactus:");
        System.out.println(firstKaktus.getType());
        System.out.println("Second Cactus:");
        System.out.println(secondKaktus.getType());



    }
}
