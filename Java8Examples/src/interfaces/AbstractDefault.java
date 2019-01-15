package interfaces;

public class AbstractDefault implements IDefaultEx {
	
	final void abstractPrintFunc() {
		printFunc();
	}
	
	final void printfuncForClassName() {
		System.out.println(this.getClass().getSimpleName());
	}

}
