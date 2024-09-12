import java.util.Scanner;

public class question2

{

    public static void main (String[] args)
    {
        Scanner input= new Scanner (System.in);
        
        System.out.println ("What is your favourite course at school? ");
        String courseName = input.nextLine();
        
        System.out.println ("What is your favourite show? ");
        String showName = input.nextLine();

        System.out.println ("How many hours do you spend studying each day? ");
        int studyTime = input.nextInt();

        System.out.println ("How many hours do you spend watching shows each day? ");
        int showTime = input.nextInt();
        
        int total= studyTime+ showTime;
        
        System.out.println ("Your favourite course at school is " + courseName + ".");
        System.out.println ("Your favourite show is " + showName + ".");
        System.out.println ("You spend " + studyTime + " hours studying each day.");
        System.out.println ("You spend " + showTime + " hours watching shows each day.");
        System.out.println ("In total, you spend " + total +" hours studying and watching shows each day.");

        
        input.close();
    

    
    }
}
