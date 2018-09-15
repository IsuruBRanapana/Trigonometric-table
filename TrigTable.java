import java.util.Scanner;

public class TrigTable{
	public static void main(String []args){

		System.out.print("If you want main table enter 1, else find some enter 2 :- ");
		Scanner input= new Scanner(System.in);
		int selection=input.nextInt();
		if (selection==1){
			System.out.printf("%30s\n","Trigonometric Table");
			System.out.printf("%-10s%-10s%-15s%-15s%-10s\n","Degrees","Radians","Sin","Cos","Tan");

			int degrees=0;
			double radians=Math.toRadians(degrees);
			System.out.printf("%-10d%-10.4f%-15.4f%-11.4f%10.4f\n",degrees,radians,Math.sin(radians),Math.cos(radians),Math.tan(radians));

			degrees=30;
			radians=Math.toRadians(degrees);
			System.out.printf("%-10d%-10.4f%-15.4f%-11.4f%10.4f\n",degrees,radians,Math.sin(radians),Math.cos(radians),Math.tan(radians));

			degrees=45;
			radians=Math.toRadians(degrees);
			System.out.printf("%-10d%-10.4f%-15.4f%-11.4f%10.4f\n",degrees,radians,Math.sin(radians),Math.cos(radians),Math.tan(radians));

			degrees=60;
			radians=Math.toRadians(degrees);
			System.out.printf("%-10d%-10.4f%-15.4f%-11.4f%10.4f\n",degrees,radians,Math.sin(radians),Math.cos(radians),Math.tan(radians));

			degrees=90;
			radians=Math.toRadians(degrees);
			System.out.printf("%-10d%-10.4f%-15.4f%-11.4f%10.4f\n",degrees,radians,Math.sin(radians),Math.cos(radians),Math.tan(radians));
		}else if (selection==2){
			System.out.print("Enter the degrees :- ");
			int degrees=input.nextInt();
			double radians=Math.toRadians(degrees);

			System.out.printf("%30s\n","Trigonometric Table");
			System.out.printf("%-10s%-10s%-15s%-15s%-10s\n","Degrees","Radians","Sin","Cos","Tan");
			System.out.printf("%-10d%-10.4f%-15.4f%-11.4f%10.4f\n2",degrees,radians,Math.sin(radians),Math.cos(radians),Math.tan(radians));
		}
	}
}