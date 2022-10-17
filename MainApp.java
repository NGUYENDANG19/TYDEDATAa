package Bassic.dev;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// phuong trinh bac 2 ; ax^2 + bx + c = 0
		Scanner sc = new Scanner(System.in);
		
		double a,b,c,x1,x2,delta;
		
		System.out.println("a==");
		a = sc.nextDouble();
		System.out.println("b==");
		b = sc.nextDouble();
		System.out.println("c==");
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2)-4*a*c;
		
		if(delta<0)	{
			System.out.println("py vo nghiem");
		}else if(delta==0)	{
			x1 = b/2*a ;
			System.out.println("py co nghiem kep x1= x2=" + x1);
		
	}else	{
		x1 = (-b-Math.sqrt(delta))/(2*a);
		x2 = (-b+Math.sqrt(delta))/(2*a);
		System.out.println("pt co nghiem");
		System.out.println("x1=" + x1);
		System.out.println("x2=" + x2);
	}
	}		
}
