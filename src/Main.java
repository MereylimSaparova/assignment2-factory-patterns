import abstractfactory.*;
import factorymethod.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Factory Method ===");

        TransportFactory truckFactory = new TruckFactory();
        truckFactory.planDelivery();

        TransportFactory shipFactory = new ShipFactory();
        shipFactory.planDelivery();

        System.out.println();

        System.out.println("=== Abstract Factory: Windows ===");

        GUIFactory windowsFactory = new WindowsFactory();
        Application windowsApp = new Application(windowsFactory);
        windowsApp.render();

        System.out.println();

        System.out.println("=== Abstract Factory: Mac ===");

        GUIFactory macFactory = new MacFactory();
        Application macApp = new Application(macFactory);
        macApp.render();
    }
}