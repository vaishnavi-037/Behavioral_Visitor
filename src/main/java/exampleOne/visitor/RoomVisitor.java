package exampleOne.visitor;

import exampleOne.element.DeluxeRoom;
import exampleOne.element.DoubleRoom;
import exampleOne.element.SingleRoom;

public interface RoomVisitor {
    void visit(SingleRoom singleRoomObj);
    void visit(DoubleRoom doubleRoomObj);
    void visit(DeluxeRoom deluxeRoomObj);
}
