
public class CommandLine {

	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("No Command Line Arguments");
			System.exit(0);
		}
		else if(args.length==1) {
			int n=Integer.parseInt(args[0]);
			int sum=0;
			for(int i=0; i<=n; i++) {
				sum+=i;
			}
			System.out.println("Sum of first "+n+" numbers are: "+ sum);
		}
		else {
			System.out.println("Command line arguments are "+args);;;;;;;;;;;
			;;;;;
		}

	}

}
