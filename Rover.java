package mars;

public class Rover implements turnLeft, turnRight, move{
	public static final Integer N = 1;
	public static final Integer E = 2;
	public static final Integer S = 3;
	public static final Integer W = 4;
	Integer x = 0;
	Integer y = 0;
	Integer facing = N;
	int row,col;
	public Rover(int r,int c) {
		row=r;
		col=c;
	}
	public void setPosition(Integer x, Integer y, Integer facing) {
		this.x = x;
		this.y = y;
		this.facing = facing;
	}
	public void printPosition() {
		char dir = 'N';
		if (facing == 1) {
			dir = 'N';
		} else if (facing == 2) {
			dir = 'E';
		} else if (facing == 3) {
			dir = 'S';
		} else if (facing == 4) {
			dir = 'W';
		}
		System.out.println(x   +" "   +y  + " "  + dir);
	}
	public void process(String commands) {
		for (int idx = 0; idx < commands.length(); idx++) {
			process(commands.charAt(idx));
		}
	}
	private void process(Character command) {
		if (command.equals('L')) {
			turnLeft();
		} else if (command.equals('R')) {
			turnRight();
		} else if (command.equals('M')) {
			move();
		} else {
			throw new IllegalArgumentException(
					"Speak in Mars language, please!");
		}
	}
	 public void move() {
			if (facing == N) {
				if(this.y!=col)
				this.y++  ;
				else
					System.out.println("Out of boundry");
			} else if (facing == E) {
				if(this.x!=col)
				this.x++  ;
				else
					System.out.println("Out of boundry");
			} else if (facing == S) {
				if(this.y!=0)
				this.y--;
				else
					System.out.println("Out of boundry");
			} else if (facing == W) {
				if(this.x!=0)
				this.x--;
				else
					System.out.println("Out of boundry");
			}
		}
		public void turnLeft() {
			facing = (facing - 1) < N ? W : facing - 1;
		}
		public void turnRight() {
			facing = (facing + 1) > W ? N : facing + 1;
		}
}