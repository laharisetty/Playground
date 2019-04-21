import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int first_dig = n/100;
    int second_dig = ((n/10)%10);
    int last_dig = n % 10;
    int reverse = (last_dig*100+second_dig*10+first_dig);
    System.out.println(reverse);
  }
}