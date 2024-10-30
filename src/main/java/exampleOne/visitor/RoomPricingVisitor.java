package exampleOne.visitor;

import exampleOne.element.DeluxeRoom;
import exampleOne.element.DoubleRoom;
import exampleOne.element.SingleRoom;

public class RoomPricingVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoomObj) {
        System.out.println("Pricing computation logic for Single Room");
        singleRoomObj.roomPrice = 1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoomObj) {
        System.out.println("Pricing computation logic for Double Room");
        doubleRoomObj.roomPrice = 2000;
    }

    @Override
    public void visit(DeluxeRoom deluxeRoomObj) {
        System.out.println("Pricing computation logic for Deluxe Room");
        deluxeRoomObj.roomPrice = 5000;
    }
}
