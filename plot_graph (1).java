//Plotting of the function P(t)//
package homework1;  //Name of the Package//

import org.mariuszgromada.math.mxparser.Function; // Importing from library//
import processing.core.PApplet;

public class plot_graph extends PApplet  // Name of the class//
   {
    public static void main(String[] args)
    {
        PApplet.main(plot_graph.class);

    }
    private FunctionPlotter1D fp;
    public void settings()
    {
        size(850,560,P3D);
    }
    public void setup()
    {
        Function F = new Function("P(t) = ((125353/40000)*t) + sin(2*pi*2*t)"); //Equation of the oscillating energy system//
        fp = new FunctionPlotter1D(F,0,20);

    }
    public void draw()
    {
        background(300);
        fp.plot(this);
    }

}

