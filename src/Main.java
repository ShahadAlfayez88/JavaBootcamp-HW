import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
         //1
        System.out.println("1.Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers.");
        System.out.println("Enter Two Numbers to calculate the sum, multiply, subtract, divide and remainder");
        System.out.println("Enter The first number");
        int x=n.nextInt();
        System.out.println("Enter The Second number");
        int y=n.nextInt();
        int sum= x+y; int Mul= x*y;
        int Sup= x-y; int Div= x/y; int Rem= x%y;
        System.out.println(x + "+" + y + "=" +sum);
        System.out.println(x + "*" + y + "=" + Mul);
        System.out.println(x + "-" + y + "=" + Sup);
        System.out.println(x + "/" + y + "=" + Div);
        System.out.println(x + "%" + y + "=" + Rem);

         //2

        System.out.println("2.Write a Java program to convert a given string into lowercase.");
        String Sentence = s.nextLine();
        System.out.println(Sentence.toLowerCase());



        // 4
        System.out.println("4.Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd. (use if-statement)");
        System.out.println("Enter Number");
        int Num=n.nextInt();

        if(Num % 2 == 0){
            System.out.println(1);
        }else
            System.out.println(0);

        //5
        System.out.println("5.Write a program that checks the role of the user, Please enter your role: admin , superuser, user");
        String Role=s.nextLine();

        if(Role.equals("admin")){
            System.out.println("welcome admin");
        } else if (Role.equals("superuser")) {
            System.out.println("welcome superuser");
        } else if (Role.equals("user")) {
            System.out.println("welcome user");
        } else
            System.out.println("you enterd wrong one");


        //6
        System.out.println("6.Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.");
        int Num1=n.nextInt();
        int Num2=n.nextInt();
        int Num3=n.nextInt();

        if((Num1+Num2)==Num3){
            System.out.println("The Result is True");
        } else
            System.out.println("The Result is False");

        //7
        System.out.println("7.Take three numbers from the user and print the greatest number.");
        int Number1=n.nextInt();
        int Number2=n.nextInt();
        int Number3=n.nextInt();

        if(Number1 > Number2 && Number1> Number3){
            System.out.println("The Greatest Number is "+ Number1);
        } else if (Number2 > Number1 && Number2> Number3) {
            System.out.println("The Greatest Number is "+ Number2);
        } else
            System.out.println("The Greatest Number is "+ Number3);


        // 8
        System.out.println("8.Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.");
        int DayNumber=n.nextInt();
        switch (DayNumber){
            case 1 :
                System.out.println("Sunday");
                break;
            case 2 :
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4 :
                System.out.println("Wednesday");
                break;
            case 5 :
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7 :
                System.out.println("Saturday");
                break;
            default:
                System.out.println("You enter wrong number");
        }

}}