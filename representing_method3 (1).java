//Representing method 3 of the numerical intergral3//
package homework1; //Name of the Package//
import java.awt.Color; // Importing from library//
import org.mariuszgromada.math.mxparser.Function;
import grafica.GPoint;
import processing.core.PApplet;

public class representing_method3 extends PApplet // Name of the class//
   {
    public static void main(String[] args)
    {
        PApplet.main(representing_method3.class);
    }
    private FunctionPlotter1D fp;
    public void settings()
    {
        size(800,500,P3D);
    }
    public void setup()
    {
        double j;
        Function F = new Function("P(t) = ((125353/40000)*t) + sin(2*pi*2*t)"); //Equation of the oscillating energy system//

        fp = new FunctionPlotter1D(F,0,1.5);
        for (j=0;j<=1.5;j=j+0.1)
        {
            GPoint A = new GPoint((float) j,0);
            GPoint B = new GPoint((float)j,(float) F.calculate(j));
            GPoint C = new GPoint( (float) ((float)j+0.1),(float)F.calculate(j+0.1));
            GPoint D = new GPoint( (float) ((float)j+0.1),0);
            fp.addLine(A, B, Color.GREEN);
            fp.addLine(B, C, Color.GREEN);
            fp.addLine(C, D, Color.GREEN);
        }
    }
    public void draw()
    {
        background(200);
        fp.plot(this);
    }
}

