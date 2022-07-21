package functions;

public class Functions 
{

	public static void main(String[] args) 
	{
     //Find the sum of 66 and 77.
		
		sum(66,77);
	
	//Add two numbers.

     Functions obj= new Functions();
     
     int a=11;
     int b=22;
     
      int l=obj.add(a, b);
      
     System.out.println("addition is: "+l);

     //Write two numbers and swap their values also add them.
     int x=5;
     int y=4;
     swap(x,y);
     
     //Find the area of rectangle circle and square.
     int m=55;
     int n=44;
     float r=4f;
     int o=55;
     int area_rectangle=area(m,n);
     int area_square=area(m);
     float area_circle=area(r);
     
     System.out.println("Area of rectangle is: "+area_rectangle);
     System.out.println("Area of square is: "+area_square);
     System.out.println("Area of circle is: "+area_circle);
	}
    public int add(int a, int b)
    {
    	
	int result = a + b;
	return result;
    }
    public static void sum(int number1, int number2) 
    {
    	System.out.println("sum is: "+(number1+number2));
    }
    public static void swap(int x,int y) 
    {
    	System.out.println("Before swapping a:" + x + ", b:"+y);
    	int z=x;
    	x=y;
    	y=z;
    	System.out.println("After Swapping a:" + x + ", b:"+y);
    	System.out.println("Their sum is: "+(x+y));
    	
    }
    public static int area(int m,int n) 
    {
    	int answer=m*n;
    	return answer;
    }
    public static int area(int m) 
    {
    	int answer=m*m;
    	return answer;
    	
    }
    public static float area(float r) 
    {
    	float answer=3.14f*r*r;
    	return answer;
    	
    }
}
