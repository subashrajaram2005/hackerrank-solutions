/*Problem Name
Sum of Two Integers

Problem Statement
Get 2 integer inputs and display their sum.

Input Format
Accept 2 integers

Constraints
Nil

Output Format
Print the sum as output

Sample Test Cases
Sample Input 0
78 22

Sample Output 0
Sum of 78 and 22 is 100

*/
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
    }
}
