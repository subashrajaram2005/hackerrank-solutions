/*Problem Name
Quotient and Remainder of Two Numbers

Problem Statement
Get two numbers from user and print the values of the quotient and the remainder when the two values are divided.

Input Format
Accept two numbers as input

Constraints
NIL

Output Format
Print remainder and quotient as output

Sample Test Cases
Sample Input 0
54 65

Sample Output 0
54 / 65 = 0.830769
54 % 65 = 54
*/
  
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.printf("%d / %d = %.6f\n", a, b, (float)a / b);
        System.out.println(a + " % " + b + " = " + (a % b));
    }
}
