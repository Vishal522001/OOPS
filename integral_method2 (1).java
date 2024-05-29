//Calculating the value of numerical integral by method 2 //
package homework1; //Name of the Package//
import org.mariuszgromada.math.mxparser.Function; // Importing from library//

import org.mariuszgromada.math.mxparser.Function;

public class integral_method2 // Name of the class//
   {
    public static double integral2()
    {
    	Function F = new Function("P(t) = ((125353/40000)*t) + sin(2*pi*2*t)"); //Equation of the oscillating energy system//
        double i,value=0;
        for (i=0;i<=20;i=i+0.1)
        {
            value = value+ (((F.calculate(i)+F.calculate(i+0.1))/2)*0.1);
        }
        return value;
       
    }
    public static void main(String[] args)
    {
    	System.out.println(integral2());
    }
}
