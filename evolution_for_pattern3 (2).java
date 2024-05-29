//Getting the evolutions for pattern 3 // 
package homework2; // Name of the Package//
import java.awt.Color;//Importing from the library//
import java.util.Scanner;
import processing.core.PApplet;
public class evolution_for_pattern3 extends PApplet //Name of the class//
{  
    public static int Columns = 40, Rows = 40; //Creating 40X40 rows and columns to run the evolution//
	public static int[][] population = new int[Columns][Rows]; //Creating the mesh for columns and rows//
	public static Rectangle Rect;
	public static int[][] future = new int[Columns][Rows];
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Generation number for running the required evolution"); //To print the generation number to get the required pattern//
    	int gen=sc.nextInt();
    	PApplet.main(evolution_for_pattern3.class);
    	 //Initialization of the mesh to get the required pattern for the given generation//
        int p=0;        
    	while(p<Columns)
    	{  
            int q=0;
    		while(q<Rows) 
      		{
            			population[q][p]=0;
        		System.out.print(population[p][q]);
        		q++;
        	}
    		p++;
     System.out.println();
        }                       //Placing  the pattern in the middle of the 40X40 field to run the evolution//
        population[20][16]=1;
        population[19][17]=1;
        population[19][18]=1;
        population[20][18]=1;
        population[21][18]=1;
        population[18][22]=1;
        population[19][22]=1;
        population[18][23]=1;
        population[19][23]=1;

          
       
        int i=0;
        while(i<gen) {    	//To get the future evolution//
        	future = nextGeneration(population);
        	population = future;   
        	i++;
        }       
    }
  //Creation of the  method for generating the next generation of cells//
    static int[][] nextGeneration(int grids[][])
    {
        int[][] future = new int[Columns][Rows];
 
                for (int c = 1; c < Columns - 1; c++)     //Applying the for loop for each and every cells in the rows and columns//
        {
            for (int r = 1; r < Rows - 1; r++)
            {
            	//Finding the cells which are alive//
                int Neighbourhood_cell = 0;   //Representation of the behavior of a single automat//
                for (int i = -1; i <= 1; i++)
                    for (int j = -1; j <= 1; j++)
                    	Neighbourhood_cell =Neighbourhood_cell+ grids[c + i][r + j];
                Neighbourhood_cell = Neighbourhood_cell- grids[c][r];
             //Now applying the evolution rules for the living automat by using if-else statements//
              //Condition when the cell dies due to loneliness//
                if ((grids[c][r] == 1) && (Neighbourhood_cell < 2))
                { 
                	future[c][r] = 0;
                }
              //Condition when the cell dies due to over population//
                else if ((grids[c][r] == 1) && ( Neighbourhood_cell >3))
                { 
                	future[c][r] = 0;
                }
              //Condition for new cell generation//
                else if ((grids[c][r] == 0) && (Neighbourhood_cell == 3))
                {
                    future[c][r] = 1;
                }
              //Condition for no change in the cell//
                else {
                    future[c][r] = grids[c][r];}
            }
        }
 
        System.out.println("New Generation"); //For getting the patterns for the required generation number//
        for (int i = 0; i < Columns; i++)
        {
            for (int j = 0; j < Rows; j++)
            {
                if (future[j][i] == 0)
                    System.out.print("."); //Representing '.' for dead cells//
                else
                    System.out.print("#"); //Representing '#' for alive cells//
            }
            System.out.println();
        }
        
        return future;
   }

    public void settings() {
        size(800,785);
    }
    public void draw() {
        background(200);

        for(int a = 0; a<40; a++)
        {
            for(int b = 0; b < 40; b++)
            {
                Rect = new Rectangle(a*20, b*20,20,20);
                
               if(future[a][b] == 1)
                {
                	 Rect.draw(Color.yellow,this); //For alive cells//
                }
                else
                {
                	Rect.draw(Color.gray,this);  //For dead cells//
                }
            }
        }
    }
}































