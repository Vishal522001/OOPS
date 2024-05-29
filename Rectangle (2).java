//Getting the rectangle//
package homework2; // Name of the Package//
import java.awt.Color; //Importing from the library//
import processing.core.PApplet;
//Rectangle Class is created with starting point x,y, width and height//
public class Rectangle //Name of the class//
{
    private double x;
    private double y;
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
//Rectangle is being drawn// 
    public void draw(Color col, PApplet app)
    {
        app.fill(col.getRGB());
        app.rect((int)this.x, (int)this.y, (int)this.width, (int)this.height);
    }
}


