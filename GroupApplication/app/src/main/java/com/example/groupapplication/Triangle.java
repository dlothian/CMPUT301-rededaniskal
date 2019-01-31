import android.graphics.drawable.shapes.Shape;

public class Triangle extends Shape {
    public Triangle(int xCoord, int yCoord, int zCoord){
        this.x = xCoord;
        this.y = yCoord;
        this.z = zCoord;
        System.out.println("I am a triangle!");
    }

    public Triangle(int xCoord, int yCoord, int zCoord, String firstColor){
        this(xCoord, yCoord, zCoord);
        this.color = firstColor;

    }
}
