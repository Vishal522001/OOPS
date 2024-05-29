//Calculating the value of numerical integral by method 1 //
package homework1; //Name of the Package//
import org.mariuszgromada.math.mxparser.Function; // Importing from library//

public class integral_method1  // Name of the class//
  {
    public static double integral1()
    {
    	Function F = new Function("P(t) = ((125353/40000)*t) + sin(2*pi*2*t)"); //Equation of the oscillating energy system//
    	double k,value=0;
        for (k=0;k<=20;k=k+0.1)
        {
            value = value+ (F.calculate(k)*0.1);
        }
        return value;
        
    }
    public static void main(String[] args)
    {
		System.out.println(integral1());
    }
}

