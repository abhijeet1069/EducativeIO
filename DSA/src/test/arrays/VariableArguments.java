package test.arrays;

public class VariableArguments {
	
	public static void foo(String... args) {
		for(int i = 0; i < args.length; i++)
			System.out.print(args[i]+" ");
		System.out.println(args.getClass());
	}
	
	public static void main(String[] args) {
		String fe, fi, fo, fum;
		fe="abra";
		fi="ca";
		fo="dabra";
		fum="!!";
		foo(fe,fi,fo,fum);

	}

}
