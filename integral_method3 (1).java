//Calculating the value of numerical integral by method 3 //
package homework1; //Name of the Package//
import org.mariuszgromada.math.mxparser.Function; // Importing from library//

public class integral_method3 // Name of the class//
  {
    public static double integral3()
    {
    	Function F = new Function("P(t) = ((125353/40000)*t) + sin(2*pi*2*t)"); //Equation of the oscillating energy system//

        double j,value=0;
        for (j=0;j<=20;j=j+0.1)
        {
            double a=((F.calculate(j+0.1)-F.calculate(j))/(0.1));
            double b=(F.calculate(j)-j*a);
            double c= (a*Math.pow(j+0.1, 2)/2)+(F.calculate(j)-a*j)*(j+0.1);
            double d= (a*Math.pow(j, 2)/2)+(F.calculate(j)-a*j)*(j);
            value=value+(c-d);
        }
        return value;
    }
    public static void main(String[] args)
    {
    	System.out.println(integral3());
    }
}

