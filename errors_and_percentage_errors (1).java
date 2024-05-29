// Calculation of the absolute and relative errors along with their percentage errors of the numerical results//

package homework1; //Name of the Package//
import org.mariuszgromada.math.mxparser.Function; // Importing from library//

public class errors_and_percentage_errors   // Name of the class//
{
    public static void main(String[] args)
    {
    	//Declare the variables//
        double energy_consumption = 626.765;                           // Analytical value obtained by integration by hand//
        double abs_err1,abs_err2,abs_err3;                            //Declaring absolute error// 
        double rel_err_percent1,rel_err_percent2,rel_err_percent3;   //Declaring absolute percentage error//
        double rel_err1,rel_err2,rel_err3;                          //Declaring relative error//
        double abs_err_percent1,abs_err_percent2,abs_err_percent3; //Declaring relative percentage error//
        Function F = new Function("P(t) = ((125353/40000)*t) + sin(2*pi*2*t)");  //Equation of the oscillating energy system//
        double integral1 = integral_method1.integral1();
        System.out.println("Integral value for method 1 is: " +integral1);
        abs_err1 = Math.abs(integral1-energy_consumption);
        abs_err_percent1 = abs_err1 * 100;
        rel_err1 = abs_err1/energy_consumption;
        rel_err_percent1 = rel_err1 * 100;
        System.out.println("\n" +"Absolute error for method 1 is: "+abs_err1 +"\n" +"Absolute error % for method 1 is: " +abs_err_percent1+"\n"+"\n" +"Relative error for method 1 is: " +rel_err1 +"\n" +"Relative error % for method 1 is: " +rel_err_percent1);
        System.out.println();
        double integral2 = integral_method2.integral2();
        System.out.println("\n" +"Integral value for method 2 is: " +integral2);
        abs_err2 = Math.abs(integral2-energy_consumption);
        abs_err_percent2 = abs_err2 * 100;
        rel_err2 = abs_err2/energy_consumption;
        rel_err_percent2 = rel_err2 * 100;
        System.out.println("\n" +"Absolute error for method 2 is: "+abs_err2 +"\n" +"Absolute error % for method 2 is: " +abs_err_percent2 +"\n" + "\n" +"Relative error for method 2 is: " +rel_err2 +"\n" +"Relative error % for method 2 is: " +rel_err_percent2);
        System.out.println();
        double integral3 = integral_method3.integral3();
        System.out.println("\n" +"Integral value for method 3 is: " +integral3);
        abs_err3 = Math.abs(integral3-energy_consumption);
        abs_err_percent3 = abs_err3 * 100;
        rel_err3 = abs_err3/energy_consumption;
        rel_err_percent3 = rel_err3 * 100;
        System.out.println("\n" +"Absolute error for method 3 is: "+abs_err3 +"\n" +"Absolute error % for method 3 is: " +abs_err_percent3+"\n" +"\n" +"Relative error for method 3 is: " +rel_err3 +"\n" +"Relative error % for method 3 is: " +rel_err_percent3);
    }


}

