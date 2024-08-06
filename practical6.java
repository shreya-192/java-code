import java.util.Scanner;
public class practical6 {
public static void main(String[] args) {
System.out.println("\n23DIT052"); 
Scanner input = new Scanner(System.in);
System.out.println("Enter the string");
String str = input.nextLine(); 
System.out.println("Enter the number of length of string: ");
int l=input.nextInt();
System.out.println("Enter the number of times you wanr to print the string: "); 
int n=input.nextInt();
int i=0;
do { 
if(str.length()>=l)
{ for(int j=0;j<l;j++)
{
System.out.print(str.charAt(j));
} }
else{
System.out.print(str); }
i++;
} while (i<n);
 } 
}