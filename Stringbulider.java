package Stringbuffer;
//package : Package is name that organizes a set of related classes and interfaces similar to 
///here I have created a package as Stringbuffer
public class Stringbulider {
	//public : members which can access as public,public members are visible to all other classes.
			//class : is a context of java that are used to create objects and to define object data types and methods.
		  //classes are the basics of opps(object oriented programming)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
		//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		StringBuffer buffer=new StringBuffer("nagaraju"); //here created StringBuffer with variable buffer
		System.out.println("It gives the ouput has : " +buffer);  //it prints the string  
		System.out.println("The length is : "+buffer.length());   //here it prints the length of the string which is 14
		System.out.println("Capacity is : "+buffer.capacity());// here first the default  capacity is 16 and it adds to the given string capacity
		
		buffer.append(" The student of ACADGILD");    //this used to append the specified string with this string      
				
		System.out.println(buffer);//system is used to return code
        //out is a static member
        //println is used to print text and gives output
		System.out.println("The length is : "+buffer.length());//here the length will be 47
		System.out.println("Capacity is : "+buffer.capacity()); //now its capacity will become 72
		
		buffer.append(" Is here to Learn, Do and Earn");//appending
		
		System.out.println("Capacity is : "+buffer.capacity()); //gives the capacity of 144
		//system is used to return code
        //out is a static member
        //println is used to print text and gives output
       
		
		System.out.println(buffer);//system is used to return code
		 //system : system is a class in java language.lang package
	  	//out : out is the static member of system class.It's type PrintStream
	  	//println: which is used to print the output.
		System.out.println("The length is : "+buffer.length()); //gives the length of 57
		System.out.println("Capacity is : "+buffer.capacity());// here it shows like now (72*2)+2=144 i.e (old capacity*2)+2
		//this is how the append uses the capacity of string buffer or string builder
	
	}

}
