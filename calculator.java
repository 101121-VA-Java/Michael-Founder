import javax.lang.model.util.ElementScanner14;

public class calculator {
        public static void main(String[] args) 
		{
//****** Variable declarations ************ 
		  int nbr1 = 8;
          int nbr2 = 4;
          int nbr3 = 0;
          int countdwn = 12;
         // String countdwn = args[1];
          String weekday = args[0];
          String name = args[2]; 
//****** Method calls ************ 
          //Call add method
		  nbr3 = addMtd(nbr1, nbr2);

          //Call subtract method
		  nbr3 = subtrcMtd(nbr1, nbr2);

          //Call multiply method
		  nbr3 = mltplyMtd(nbr1, nbr2);

          //Call Remainder/Modulus method
		  nbr3 = remndrMtd(nbr1, nbr2);
          
          //Call Weekday Check Method
          weekdayMtd(weekday);

          //Call Greeting Method
          greetMtd(name);

          //Call Count Down Method   
         // String count = args[1];   <----- Could not pass interger arg from command line??????????????
         // int countdwn = Integer.parseInt(count);
            countdownMtd(countdwn);

          //Call Print Method
          //prtMtd(nbr3);

		  //print the returned value to the console		   
		  //System.out.println(nbr3); 
		}

//****** Methods ************ 
        //print the returned value to the console
        public static void prtMtd(int num3)
        {		   
        System.out.println(num3);
        } 

		//Add method 
		public static int addMtd(int num1, int num2)
		{
		  int num3 = num1 + num2;
		  System.out.println("num3 = " + num3); 
		  return (int)num3;
	    }

        //Subtract method 
		public static int subtrcMtd(int num1, int num2)
		{
		  int num3 = num1 - num2;
		  System.out.println("num3 = " + num3); 
		  return (int)num3;
        } 

        //Multiply method 
		public static int mltplyMtd(int num1, int num2)
		{
		  int num3 = num1 * num2;
		  System.out.println("num3 = " + num3); 
		  return (int)num3;   
        }

        //Remainder/Modulus method 
		public static int remndrMtd(int num1, int num2)
		{
		  int num3 = num1 % num2;
		  System.out.println("num3 = " + num3); 
		  return (int)num3;   
        }

        public static void weekdayMtd(String wkday)
        {
        switch(wkday){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                System.out.println("Today is  " + wkday);
              //System.out.println("Today is  " + args[0]);
                break;
            default:
                System.out.println("You Must Enter A WEEKDAY.");
          }
        } 
        

        public static void countdownMtd(int cntdwn)
        {
        int remaindr = cntdwn % 2;
        if (remaindr == 0)
		   {
            for(int i = cntdwn; i > 0; i--) {
                System.out.println("Counting Down to Zero: " + i); 
            }
        }
       // else <--------Could not get this else stmt to compile????????????
       //     {
       //         System.out.println("Input must be positive or 0.");
       //     } 
       }
       //Greeting method 
		public static void greetMtd(String nam)
		{
		  System.out.println("Happy Haloween to " + nam); 
		     
        }

               
}



