package exampleOne.element;

import exampleOne.visitor.RoomVisitor;

public interface RoomElement {
    void accept(RoomVisitor visitor);
}
