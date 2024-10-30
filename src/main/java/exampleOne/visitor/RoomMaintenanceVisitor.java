package exampleOne.visitor;

import exampleOne.element.DeluxeRoom;
import exampleOne.element.DoubleRoom;
import exampleOne.element.SingleRoom;

public class RoomMaintenanceVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoomObj) {
        System.out.println("Performing maintenance for Single Room");
    }

    @Override
    public void visit(DoubleRoom doubleRoomObj) {
        System.out.println("Performing maintenance for Double Room");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoomObj) {
        System.out.println("Performing maintenance for Deluxe Room");
    }
}
