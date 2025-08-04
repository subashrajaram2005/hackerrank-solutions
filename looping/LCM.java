/*Problem Name
Find LCM of Two Numbers

Problem Statement
Write a C program to find the LCM of the given two numbers.

Input Format
Integer Integer

Constraints
Nill

Output Format
Integer

Sample Test Cases
Sample Input 0
8 5

Sample Output 0
40

*/
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i <= a * b; i++) {
            if (i != 0 && i % a == 0 && i % b == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
