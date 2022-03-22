package com.training.demo.model;

import java.util.ArrayList;

public class PersonCollection {

	private static final ArrayList<Person> people=new 
			ArrayList<>();

	static{
		people.add(new Person(152424,"Sankalp Nayak",22));
		people.add(new Person(152426,"NAVIN GURRAM",21));
		people.add(new Person(152420,"KRUSHANG PATEL",21));
		people.add(new Person(152422,"AAKASH RATHORE",18));
		people.add(new Person(152427,"Ganesh Pakhale",18));
		people.add(new Person(152428,"GAURAV MAKASARE ",20));
		people.add(new Person(152430,"YESHA AJUDIA",35));
		people.add(new Person(152431,"Jimil Mukeshbhai Parmar",20));
		people.add(new Person(152432,"Honey Kholwala",20));
		people.add(new Person(152433,"TOMAR CHANDNI RAJESH",30));
		people.add(new Person(152435,"Lakhan Gurbani",21));
		people.add(new Person(152436,"ROHIT VISHWAS PATIL",22));
		people.add(new Person(152437,"KAUSHAL CHAUDHARY",21));
		people.add(new Person(152438,"Vishal",33));
		people.add(new Person(152439,"Divyanshu Sharma",18));
		people.add(new Person(152440,"Rohan Das ",22));
		people.add(new Person(152442,"JIMY PATEL",21));
		people.add(new Person(152443,"Chitra Ramkrushna Albankar",18));
		people.add(new Person(152445,"VINAY KUMAR",32));
		people.add(new Person(152447,"ANIKET MISHRA",18));
		people.add(new Person(152448,"Sweta Gupta",22));
		people.add(new Person(152449,"Radhika Bhojulal Lohar",22));
		people.add(new Person(152450,"ISHEET HARISH SHETTY",20));
		people.add(new Person(152451,"Tamseel Husain",22));
		people.add(new Person(152452,"YOGITA BHARATRAO KSHIRSAGAR",36));
		people.add(new Person(152453,"SHIVANI RAJESH BACHHEWAR",22));
		people.add(new Person(152454,"UJJVAL THAKKAR",31));
		people.add(new Person(152455,"AAYUSH THAKKAR",18));
		people.add(new Person(152457,"Bhupendra Singh",18));
		people.add(new Person(152458,"Sudhanshu Pathak",22));
		people.add(new Person(152459,"Yash Sonkar",34));
		people.add(new Person(152461,"Pragati Kumari Sharma",21));
		people.add(new Person(152462,"Aakash",18));
		people.add(new Person(152664,"JENISHA BHAVIN JOSHI",20));
		people.add(new Person(152667,"RIYAZ SHAIK",22));
		people.add(new Person(152668,"ABHISHEK PANDEY",18));
		people.add(new Person(152691,"DEEP SHAH",18));
	}
	
	public PersonCollection() {
		super();	
	}

	public static ArrayList<Person> getPeople() {
		return people;
	}
	
	
	
}
