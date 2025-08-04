/*Problem Name
Sum of Even Numbers in a Given Range

Problem Statement
Write a C program to find the sum of even numbers in the given range.

Input Format
Integer

Constraints
Nill

Output Format
Display the sum of even numbers in the range

Sample Test Cases
Sample Input 0
10

Sample Output 0
30

*/
  
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 2; i <= a; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.print(sum);
    }
}
