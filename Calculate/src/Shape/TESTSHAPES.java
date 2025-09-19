package Shape;

import java.util.Scanner;

public class TESTSHAPES {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		char choice;
		do{

			System.out.println("====the shapes===");
			System.out.println("1.Rectangle");
			System.out.println("2.Circle");
			System.out.println("3.Square");
			System.out.println("4.Triangle");
			System.out.println(" select shape");
			int select=sn.nextInt();
			
			switch(select){
			case 1:
				System.out.println("Enter length");
				double len=sn.nextDouble();
				System.out.println("Enter width");
				double wid=sn.nextDouble();
				Rectangle mm=new Rectangle(len,wid);
				System.out.println("what would youi like to calculate");
				System.out.println("a.Area");
				System.out.println("b.perimeter");
				System.out.println("your choice:");
				int ent=sn.nextInt();
				if(ent==1){
					System.out.println("Area of rectangle"+ mm.calArea());}
				else if(ent==2){
					System.out.println("perimeter of rectangle"+ mm.calperimeter());
				}
				else{
					System.out.println("choose between 1 and two");}

				break;
			case 2:
				System.out.println("enter radius");
				double ss=sn.nextDouble();
				
				Circle rr=new Circle(ss);
				System.out.println("what would youi like to calculate");
				System.out.println("1.Area");
				System.out.println("2.perimeter");
				System.out.println("your choice:");
				int ent2=sn.nextInt();
				if(ent2==1){
					System.out.println("Area of Circle"+ rr.calArea());}
				else if(ent2==2){
					System.out.println("perimeter of Circle"+ rr.calperimeter());
				}
				else{
					System.out.println("choose between 1 and two");}
				break;
				
			case 3:
				
				System.out.println("enter side");
				double pp=sn.nextDouble();
				Square vv=new Square(pp);
				
				System.out.println("what would youi like to calculate");
				System.out.println("1.Area");
				System.out.println("2.perimeter");
				System.out.println("your choice:");
				int ent3=sn.nextInt();
				
				if(ent3==1){
					System.out.println("Area of Square"+ vv.calArea());}
				else if(ent3==2){
					System.out.println("perimeter of  Square"+ vv.calperimeter());
				}
				else{
					System.out.println("choose between 1 and two");}

				break;
				
				case 4:
					
					System.out.println("enter base");
					double mt=sn.nextDouble();
					System.out.println("enter height");
					double nt=sn.nextDouble();
					;
					
					Triangle my=new Triangle(mt,nt);
					System.out.println("what would youi like to calculate");
					System.out.println("1.Area");
					System.out.println("2.perimeter");
					System.out.println("your choice:"); 
					int ent4=sn.nextInt();
					
					if(ent4==1){
						System.out.println("Area of Triangle"+ my.calArea());}
					else if(ent4==2){
						System.out.println("perimeter of  Triangle"+ my.calperimeter());
					}
					else{
						System.out.println("choose between 1 and two");}

					
					
					break;
			default:
				System.out.println("invalid selection");
				break;
			}
				System.out.println("would you like to continue? y/n");
				choice=sn.next().charAt(0);
		}
		while( choice=='y');

		sn.close();
	}

}
	
















