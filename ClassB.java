	public class ClassB 
	  {
      ClassA classA = new ClassA();
		public static void main(String[] args) 
		  {			
          ClassB b = new ClassB();
          
		  String name = "Michael";
		  b.classA.setName(name);
		  System.out.println(b.classA.getName());
		  
		  
		  int age = 50;
		  b.classA.setAge(age);
		  System.out.println(b.classA.getAge());
		  } 
		  } 
	  
		


