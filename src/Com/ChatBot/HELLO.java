package Com.ChatBot;
import java.util.*;
import java.io.*;

public class HELLO {
	public static void main (String args[]) {
		while (true) {
			Scanner sc=new Scanner (System.in);
			//System.out.println("Hello Dear /n" + "How May I Help You:-");
			//System.out.println("Hello shivani,How May I Help You:-");
			String user=sc.nextLine();
			
	    if(user.equals("Hi!") ||user.equals("Hi")||user.equals("hi")||user.equals("Hello")||user.equals("hello"))
	    {
	    	//System.out.println("User said:" +user );
	    	//System.out.println("Bot said:" + "Hello" );
	    	System.out.println("Hello Shivani \n" + "How May I Help You:-");
	    }
	    else if(user.equals("Who are you")|| user.equals("who are you")|| user.equals("are you robot or human")|| user.equals("Are you robot or human"))
	    {
	    	//System.out.println("User said:" +user );
    	    System.out.println("Bot said:" + "I am bot," );
    	    System.out.println("Bot said:" + "how may i help you " );
	    }	
	    
	    else if(user.equals("What is java?")|| user.equals("what is java"))
	    {
	    	//System.out.println("User said:" +user );
    	    System.out.println("Bot said:" + "sure i will tell you" );
    	    System.out.println( "java is a high-level, object-oriented programming language \n" +"developed by Sun Microsystems (now owned by Oracle Corporation) in 1995.\n" +"It was designed to be platform-independent and follows the principle of \n" +"Write Once, Run Anywhere (WORA),\n" +"meaning that Java code can run on any device \n"+"or platform that has a Java Virtual Machine (JVM) installed." );
    	    
    	    System.out.println();
    	    System.out.println();
    	    System.out.println("thank you for visit\n"+"Clear your all doubt about java\n"+"feel free to Asked");
	    }	
	    
	    else if(user.equals("tell me is features of java ")|| user.equals("features of java"))
	    {
	    	//System.out.println("User said:" +user );
    	    System.out.println("Bot said:" + "Following are the features of java" );
    	    System.out.println( "->Object-oriented\n"+"->platform-independent\n"+"->robust\n"+
    	                       "->secure\n"+"->multithreaded\n"+"->dynamic memory allocation (garbage collection)\n"+
    	    		           "->rich standard library\n"+"->versatile application areas (web, mobile, desktop)." );
    	    System.out.println();
    	    System.out.println();
    	    //System.out.println("thank you for visit\n"+"Clear your all doubt about java\n"+"feel free to Asked");
    	    
    	    System.out.println("thank you for visit, feel free to Asked");    
	    }
	    
	    else if(user.equals("Adding two number")|| user.equals("adding two number"))
	    {
	    	//System.out.println("User said:" +user );
    	    System.out.println("First number =");
    	    int n1=sc.nextInt();
    	    System.out.println("Second number =");
    	    int n2=sc.nextInt();
    	    System.out.println("Bot said:" + "Adding two number is"+(n1+n2) );
    	    
    	    System.out.println();
    	    System.out.println();
    	    //System.out.println("thank you for visit\n"+"Clear your all doubt about java\n"+"feel free to Asked");
    	    
    	    System.out.println("thank you for visit, feel free to Asked");  
		}
	    
	    else if(user.equals("i want multiplication table"))
	    {
	    	//System.out.println("User said:" +user );
    	    System.out.println("which number table you want shivani =");
    	    int num=sc.nextInt();
    	    for(int i=1; i<=10; i++)
    	    {
    	    	System.out.println(i*num);
    	    }
    	    System.out.println("Anything else ,Please Asked me");
		}
	    
	    else if(user.equals("Open Notepad")|| user.equals("open notepad"))
	    {
	    	Runtime rs=Runtime.getRuntime();
	    	try
	    	{
	    		rs.exec("notepad");
	    	}
	    	catch(IOException e)
	    	{
	    		System.out.println(e);
	    	}
	    }
	    
	    else if(user.equals("Exit")|| user.equals("exit"))
	    {
	    	System.exit(0);
	    }
	    	}
	} 
	

}
