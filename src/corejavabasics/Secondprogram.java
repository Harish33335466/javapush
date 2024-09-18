package corejavabasics;

public class Secondprogram {
	
	int a=30;
	int b=50;
	
	public void secndfn() {
		System.out.println("I am from second class function");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Secondprogram sn=new Secondprogram();
		sn.secndfn();
		Firstprogram fn = new Firstprogram();
		fn.firstfn();
		System.out.println(fn.h);
	}

}
