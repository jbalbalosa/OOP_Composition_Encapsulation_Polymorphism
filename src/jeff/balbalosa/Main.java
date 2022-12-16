package jeff.balbalosa;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java Programming Masterclass");
        System.out.println("OOP - 3 Major Components");

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case ("220B", "Dell" , "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast","Acer", 27, new Resolution((2540,1440)));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6, "v2.44");
    }


}