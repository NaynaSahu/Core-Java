package strings;

public class Arguments_In_String {
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1] + args[2]);
		int y = args.length;
		switch (y) {
		case(0):
		System.out.println("khali hai justv chill bro");
		break;
		case (1):
			System.out.println(args[0]);
		break;
	/*
	 * default :
	 * 
	 * System.out.println("khali hai justv chill bro"); break;
	 */
		}
	}

}
