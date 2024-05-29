//Representing method 2 of the numerical intergral2//
package homework1; //Name of the Package//
import java.awt.Color; // Importing from library//
import org.mariuszgromada.math.mxparser.Function;
import grafica.GPoint;
import processing.core.PApplet;

public class representing_method2 extends PApplet // Name of the class//
   {
    public static void main(String[] args)
    {
        PApplet.main(representing_method2.class);
    }
    private FunctionPlotter1D fp;
    public void settings()
    {
        size(800,500,P3D);
    }
    public void setup()
    {
        double i;
        Function F = new Function("P(t) = ((125353/40000)*t) + sin(2*pi*2*t)"); //Equation of the oscillating energy system//

        fp = new FunctionPlotter1D(F,0,1.5);
        for (i=0;i<1.5;i=i+0.1)
        {
            GPoint A = new GPoint((float) i,0);
            GPoint B = new GPoint((float)i,(float) (F.calculate(i)+(float)F.calculate(i+0.1))/2);
            GPoint C = new GPoint( (float) ((float)i+0.1),(float) (F.calculate(i)+(float)F.calculate(i+0.1))/2);
            GPoint D = new GPoint( (float) ((float)i+0.1),0);
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

