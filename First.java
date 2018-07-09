
package mars;

import java.util.Scanner;

interface turnLeft{
	void turnLeft();
}
interface turnRight{
	void turnRight();
}
interface move{
	void move();
}

public class First{

	
	public static final Integer N = 1;
	public static final Integer E = 2;
	public static final Integer S = 3;
	public static final Integer W = 4;
	public static void main(String args[]) {
		int row,col;
		Scanner input= new Scanner(System.in);
		row=input.nextInt();
		col=input.nextInt();
		Rover rover = new Rover(row,col);
		rover.setPosition(1, 2, N);
		rover.process("LMLMLMLMM");
		rover.printPosition(); // prints 1 3 N

		rover.setPosition(3, 3, E);
		rover.process("MMRMMRMRRM");
		rover.printPosition(); // prints 5 1 E

	}
}
