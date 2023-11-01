package application;

import java.text.Format;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import application.enums.Colors;
import entitites.Circle;
import entitites.Rectangle;
import entitites.Shape;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
			System.out.print("Enter the number of shapes: ");
			int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Colors color = Colors.valueOf(sc.next());
			
			if(ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Heigth: ");
				double heigth = sc.nextDouble();
				list.add(new Rectangle(color, width, heigth));
			} else {
			
			System.out.print("Radius: ");
			Double radius = sc.nextDouble();
			list.add(new Circle(color, radius));	
			}						
		}
		
		System.out.println("");
		System.out.println("SHAPE AREAS: ");
		for(Shape sp : list) {
			System.out.println(String.format("%.2f", sp.area()));
		}
		
		
		
		sc.close();
	}

}

/*            CONSOLE
  	Enter the number of shapes: 2
	Shape #1 data:
	Rectangle or Circle (r/c)? r
	Color (BLACK/BLUE/RED): RED
	Width: 4.0
	Heigth: 5.0
	Shape #2 data:
	Rectangle or Circle (r/c)? c
	Color (BLACK/BLUE/RED): BLUE
	Radius: 3.0

	SHAPE AREAS: 
	20.00
	28.27
*/
