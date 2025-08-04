/*Problem Name
Print All Odd Numbers from 1 to N

Problem Statement
Write a C program to print all the Odd numbers from 1 to n.

Input Format
Integer

Constraints
Nill

Output Format
Display the odd numbers in the given range

Sample Test Cases
Sample Input 0
20

Sample Output 0
1 3 5 7 9 11 13 15 17 19

*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
