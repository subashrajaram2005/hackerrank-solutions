/*Problem Name
Print Numbers from 1 to N

Problem Statement
Write a C program to print all the numbers from 1 to n.

Input Format
Integer

Constraints
Nill

Output Format
Display the numbers in the range

Sample Test Cases
Sample Input 0  
10

Sample Output 0  
1 2 3 4 5 6 7 8 9 10
*/
  
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
            System.out.print(i + " ");
    }
}
