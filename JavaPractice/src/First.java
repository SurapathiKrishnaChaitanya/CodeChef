import java.util.*;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Second sc=new Second();
		sc.practice();
		Character abc = 'C';
		int arr[]=new int[3];
		String d = abc.toString();
		ArrayList<String> cars=new ArrayList<String>();
		LinkedList<String> bikes=new LinkedList<String>();
		HashMap<String, String> cities=new HashMap<String, String>();
		HashSet<String> countries=new HashSet<String>();
		countries.add("Africa");
		countries.add("China");
		cities.put("FirstName", "Krishna Chaitanya");
		cities.put("Lastname", "Surapathi");
		cars.add("Astro");
		cars.add("BMW");
		cars.add("Chevrolet");
		Iterator<String> car=cars.iterator();
		System.out.println(cars);
		cars.add(3,"EV");
		System.out.println(cars);
		System.out.println(cars.get(0));
		System.out.println(cars.get(1));
		cars.set(2,"Castro");
		cars.remove(1);
		System.out.println(cars.size());
		cars.clear();
		System.out.println(cars.size());
		bikes.addFirst("Acer");
		bikes.addLast("Zeta");
		Collections.sort(cars);
		Collections.sort(bikes);
		Collections.sort(cars,Collections.reverseOrder());
		System.out.println(bikes);
		bikes.removeFirst();
		bikes.removeLast();
		System.out.println(bikes);
		System.out.println(cities);
		System.out.println(abc);
		System.out.println(abc.charValue());
		System.out.println(d);
		
		try {
				arr[1] = 1;
				arr[2] = 2;
				arr[0] = 3;
				System.out.println(arr[2]);
		}
		catch (Exception ex)
		{
			System.out.println(arr[1]+" "+ex);
		}
	}

}
