// Janera Dobson
// IT 145
// Southern New Hampshire University
// 3.15 Program: Text message expander


import java.util.Scanner;
public class TextMsgExpander
{
   public static void main(String[ ] args)
   {
       Scanner scnr = new Scanner(System.in);
        
	    String TextMsgExpander;
      
       String BFF = "best friend forever";
       String IDK = "I don't know";
       String JK = "just kidding";
       String TMI = "too much information";
       String TTYL = "talk to you later";
       
       System.out.println("Enter text: ");
       TextMsgExpander = scnr.nextLine();
         
       System.out.println("You entered: "+ TextMsgExpander);
       System.out.println();

       if(TextMsgExpander.contains("BFF")) {
           TextMsgExpander = TextMsgExpander.replace("BFF",BFF);
           System.out.println("Replaced \"BFF\" with " + "\"" + BFF + "\"" + ".");
}

       if(TextMsgExpander.contains("IDK")) {
           TextMsgExpander = TextMsgExpander.replace("IDK",IDK);
           System.out.println("Replaced \"IDK\" with " + "\"" + IDK + "\"" + ".");
}

       if(TextMsgExpander.contains("JK")) {
           TextMsgExpander = TextMsgExpander.replace("JK",JK);
           System.out.println("Replaced \"JK\" with " + "\"" + JK + "\"" + ".");
}

       if(TextMsgExpander.contains("TMI")) {
           TextMsgExpander = TextMsgExpander.replace("TMI",TMI);
           System.out.println("Replaced \"TMI\" with " + "\"" + TMI + "\"" + ".");
}

       if(TextMsgExpander.contains("TTYL")) {
           TextMsgExpander = TextMsgExpander.replace("TTYL",TTYL);
           System.out.println("Replaced \"TTYL\" with " + "\"" + TTYL + "\"" + ".");
}

	    System.out.println();
	    System.out.println("Expanded: " + TextMsgExpander);
  	 }
}
      
      
      

      
         
   
