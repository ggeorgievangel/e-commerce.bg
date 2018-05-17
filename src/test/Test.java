package test;

public class Test {

	static class Foo{
		
		private Test t= new Test();
		
		public void Foofoo() {
			System.out.println("foo foo foo");
			Test.x = 5000;
					
		}

	}
	
	private static int x;
	private  String name = "Test";
	
	public Test() {
		this.x = 5;
	}
	
	public Test(int x) {
		this.x = x;
	}
	
	public static void main(String[] args) {
		
		
		//Foo f = new Foo();
		
		System.out.println(25/2);
		System.out.println(1%2);
		System.out.println(1/2);
		
		Test t = new Test();
		Test z = new Test();
		t = z;
		System.out.println("Te tva e bace - " + t.equals(z));
		t.doSomthing(t);
		System.out.println("from main " + t.x);
		
		System.out.println(t.getClass() == Test.class);
	
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Bau bau bau");
				
			}
		};
		
		System.out.println("ops");
		runThread(r);
	//	f.Foofoo();
		System.out.println(t.name);
		System.out.println(t.x);
	
	}

	private void doSomthing(Test t) {

		this.x = 1500;
		
		System.out.println("============ " + super.toString() + " ============");
		System.out.println("from do something "  + x);
		
	}

	private static void runThread(Runnable r) {
		Thread t = new Thread(r);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
