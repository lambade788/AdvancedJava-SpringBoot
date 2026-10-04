import java.util.*;

public class string {
    public static void main(String[] args){
        // // declaration
        // String name="Rahul";
        // String Fullname="Rahul Lambade";
        // System.out.println(Fullname);

        // Scanner input= new Scanner(System.in);
        // System.out.print("Enter your First Name:");
        // String firstname=input.nextLine();
        // System.out.print("Enter your last Name:");
        // String lastname=input.nextLine();

        // String FullName=firstname +" "+ lastname;
        // System.out.println(FullName);
        // System.out.println(FullName.length());
        // System.out.println(FullName.charAt(3));

        // // charat
        // for(int i=0;i<Fullname.length();i++){
        //     System.out.println(Fullname.charAt(i));
        // }

        // compare
        // String name1="Rahul";
        // String name2="Rahul";

        // if(name1.compareTo(name2)==0){
        //     System.out.println("String are equal.");
        // }else{
        //     System.out.println("String are not equal.");
        // }

        // // substring
        // String name="Rahul Lambade is grate person";
        // String Name= name.substring(6,13);
        // System.out.println(Name);

        // String builder 
        // String in java are immutable

        // StringBuilder sb= new StringBuilder("Rahul");
        // System.out.println(sb);

        // // char at index 0
        // System.out.println(sb.charAt(0));

        // // set cahr at index
        // sb.setCharAt(4, 'u');
        // System.out.println(sb);

        // // insert 
        // sb.insert(0, 's');
        // System.out.println(sb);

        // // delete
        // sb.delete(0, 1);
        // System.out.println(sb);

        // sb.setCharAt(4, 'l');
        // System.out.println(sb);

        // // append
        // sb.append(" L");
        // sb.append("ambade");
        // System.out.println(sb);

        // // reverse string
        // for(int i=0;i<sb.length()/2;i++){
        //     int front=i;
        //     int back=sb.length()-1-i;

        //     char frontchar=sb.charAt(front);
        //     char backchar=sb.charAt(back);

        //     sb.setCharAt(front, backchar);
        //     sb.setCharAt(back, frontchar);
        // }
        // System.out.println(sb);

// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

// System.out.println("Enter number of an array");
// int size=input.nextInt();
// String[] movies= new String[size];
// int totLength = 0;

//  System.out.println("Enter the "+size+" movie names:");
// for(int i=0;i<size;i++){
//     movies[i]=input.nextLine();
//     totLength+=movies[i].length();
// }


//      System.out.println(totLength);

// Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 

    //   String names=input.nextLine();
    //   String result="";

    //   for(int i=0;i<names.length();i++){
    //     if(names.charAt(i)=='e'){
    //         result+='i';
    //     }
    //     else{
    //         result += names.charAt(i);
    //     }
    //   }
    //    System.out.println(result);



// Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”

 Scanner sc = new Scanner (System.in);
     String email = sc.next();
     String userName = "";


     for(int i=0; i<email.length(); i++) {
       if(email.charAt(i) == '@') {
        break;
       } else {
         userName += email.charAt(i);
       }
     }


    System.out.println(userName);











    }
    
}
