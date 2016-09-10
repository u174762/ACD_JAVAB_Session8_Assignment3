
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		ThreadC t3 = new ThreadC();
		
		t1.setPriority(1);
		t2.setPriority(2);
		t3.setPriority(3);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

	}


