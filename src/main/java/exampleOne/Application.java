package exampleOne;

import exampleOne.element.DeluxeRoom;
import exampleOne.element.DoubleRoom;
import exampleOne.element.RoomElement;
import exampleOne.element.SingleRoom;
import exampleOne.visitor.RoomMaintenanceVisitor;
import exampleOne.visitor.RoomPricingVisitor;
import exampleOne.visitor.RoomVisitor;

public class Application {
    public static void main(String[] args) {
        RoomElement singleRoom = new SingleRoom();
        RoomElement doubleRoom = new DoubleRoom();
        RoomElement deluxeRoom = new DeluxeRoom();

        // performing operations on the objects
        RoomVisitor pricingVisitor = new RoomPricingVisitor();

        singleRoom.accept(pricingVisitor);
        System.out.println(((SingleRoom)singleRoom).roomPrice);

        doubleRoom.accept(pricingVisitor);
        System.out.println(((DoubleRoom)doubleRoom).roomPrice);

        deluxeRoom.accept(pricingVisitor);
        System.out.println(((DeluxeRoom)deluxeRoom).roomPrice);

        RoomVisitor maintenanceVisitor  = new RoomMaintenanceVisitor();

        singleRoom.accept(maintenanceVisitor);

        doubleRoom.accept(maintenanceVisitor);

        deluxeRoom.accept(maintenanceVisitor);

    }
}
