package com.semanticsquare.oop;

public class elclipsetest {
	private int id;
	private String name;
	static int divsorCount;

	static int computeCout;

	void computeCount() {
		int id = 1000;
		int nextId = id + 1;
		System.out.println(nextId);
		computeCout++;
	}

	void studentAssignment(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Lo " + id + name);
	}

	void updateName(elclipsetest d, String newName) {
		d.name = newName;
		System.out.println("Name is updated" + newName);
	}

	static int[] array = new int[2];

	static void arrayMethod() {
		array[0] = 200;
		array[2] = 300;
		System.out.println(array[0]);
	}

	void count() {
		double count;

	}

	// ARRAY

	static int[] a = new int[] { 1, 2, 3, 4 };
	static int[] b = new int[4];

	static void updateArray(int[] b, int index, int value) {
		b[index] = value;
		System.out.println("New Value in the array is  " + value);
	}

//	 divisor count

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Hello WOrld! ");
		elclipsetest s = new elclipsetest();
		elclipsetest s1 = new elclipsetest();
//    s.id = 100;
//    s.name = "Piyush";
		s.studentAssignment(100, "Piyush");
		s1.computeCount();
		s1.studentAssignment(2000, "Ashu");
		s.computeCount();

		s1.updateName(s1, "Pk");
		System.out.println(s1.name);
		System.out.println("The Compute Count is  " + computeCout);

		updateArray(a, 2, 33);

//   display array
		for (int i : a) {
			System.out.println(i);
		}
	

// display divisor count
	//int x = 24;
    //int divisorCount = 0 ;

    for (int i = 1; i <= x; i++) {
     //   if (x % i == 0) {
            System.out.println(i);
           // divisorCount++;

        }

    }
}
}}}
