package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import test.Test.Foo;

public class Demo {

	public static void main(String[] args) {
//
//		Test t = new Test();
//		Test t1 = new Test();
//		Foo f = new Test.Foo();
//		f.Foofoo();
//		Set<Test> testSet = new HashSet<>();
//		ArrayList<Test> testlist = new ArrayList<>();
//		testSet.add(t);
//		testSet.add(t);
//		testSet.add(t1);
//		System.out.println(testSet.size());
//		testlist.add(t);
//		testlist.add(t);
//		System.out.println(testlist.size());
//		int[] arr = {1,2,3,4,5,6,7};
//		reverseArray(arr);
//
//		ArrayList<String> list = new ArrayList<>();
//		list.add("Pesho"); // add element
//		list.add(1, "Gosho"); // element can be added on specific index if this index exist
//		list.get(0); // get works only with index
//		list.remove("Gosho"); // can remove specific object
//		list.remove(0); // can remove object from specific index if this index exist
//		list.contains("dadssa"); // check if list contains specific object
//		
//		LinkedList<String> link = new LinkedList<>();
//		link.add("Pesho"); // add element
//		link.add(1, "Gosho"); // element can be added on specific index if this index exist
//		link.get(0); // get works only with index
//		link.remove("Gosho"); // can remove specific object
//		link.remove(0); // can remove object from specific index if this index exist
//		link.contains("dadssa"); // check if list contains specific object
//		
//		HashSet<String> hset = new HashSet<>();
//		hset.add("Minka"); // adding specific object to HashSet
//		System.out.println(hset.contains("Ginka")); // search for specific object returns boolen
//		hset.iterator().next(); // get next element with iterator no get here!
//		System.out.println(hset.remove("dasda")); // removes specific object returns false if object doesn't exist
//		hset.isEmpty(); // checks if hset is empty
//		
//		TreeSet<String> treeset = new TreeSet<>();
//		treeset.add("Minka"); // adding specific object to HashSet
//		System.out.println(treeset.contains("Minka")); // search for specific object returns boolen
//		treeset.iterator().next(); // get next element with iterator no get here!
//		System.out.println(treeset.remove("Minka")); // removes specific object returns false if object doesn't exist
//		treeset.isEmpty(); // checks if hset is empty
//		
//		HashMap<String,String> hmap = new HashMap<>();
//		hmap.put("Penka", "Ot pernik"); // name --> city
//		hmap.get("Penka"); // get on key returns value --> city
//		hmap.containsKey("Ganka"); // returns boolean if key exist
//		hmap.keySet(); // returns key set of map and can be iterated
//		hmap.entrySet();
//		hmap.values();
//		
//		
//		TreeMap<String,String> tmap = new TreeMap<>();
//		tmap.put("Penka", "Ot pernik"); // name --> city
//		tmap.get("Penka"); // get on key returns value --> city
//		tmap.containsKey("Ganka"); // returns boolean if key exist
//		tmap.keySet(); // returns key set of map and can be iterated
//		tmap.entrySet();
//		tmap.values();
//		
//		String first = "abc";
//		String second = "def";
//		System.out.println(second.compareTo(first));
//
//		try {
//			testExeptions(arr);
//		}
//		catch(MyExeption e) {
//			System.out.println("Just catch my exeption");
//		}
//		catch(NullPointerException e) {
//			System.out.println("Just catch null pointer");
//		}
//		finally {
//			System.out.println("Basi exeptionite");
//		}
		printPingPongNmbers();
	}
	
	private static void reverseArray(int[] arr) {
		
		System.out.println(Arrays.toString(arr));
		int k = arr.length-1;
		for (int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[k-i];
			arr[k-i]  = temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	private static void testExeptions(int[] arr) throws MyExeption {
		//System.out.println(arr.length);
		throw new MyExeption();
	}
	
	public static void printPingPongNmbers() {
		for (int i = 1; i <= 100; i++) {
			if(!(i%3==0 || i%5==0)) {
				System.out.println(i);
			}
			else if((i%3==0 && i%5==0)) {
				System.out.println("PingPong");
			}
			else if(i%3==0) {
				System.out.println("Ping");
			}
			else {
				System.out.println("Pong");
				
			}
		}
	}
}
