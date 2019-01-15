package interfaces;

public class DefaultMain {
	public static void main(String[] args) {
		Default def = new Default();
		def.abstractPrintFunc();
		def.printfuncForClassName();
		
		Default2 def2 = new Default2();
		def2.printfuncForClassName();
	}
}
