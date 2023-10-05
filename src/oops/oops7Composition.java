package oops;

class House{
    private DrawingRoom drawingRoom;

    // When create object of House class we initialize kitchen.
    public House(){
        // Object of Drawing room inside the constructor of House Class.
        drawingRoom = new DrawingRoom();
        // We set the sofa inside the constructor.
        drawingRoom.setSofa("L-shaped");
    }

    //Inside the House class to get the Sofa we have the methods.

}
class DrawingRoom{
    private String sofa;

    //Getter and Setter
    public String getSofa(){
        return sofa;
    }
    public void setSofa(String sofa){
        this.sofa = sofa;
    }
}
public class oops7Composition {
}
