/*
Problem Name
Print Star Pattern with Border and Diagonals

Problem Statement
Write a program to display the following star pattern with border and both diagonals.

Input Format
Integer

Constraints
Input > 0

Output Format
Star pattern

Sample Test Cases
Sample Input 0
4

Sample Output 0
*******  
**   **  
* * * *  
*  *  *  
* * * *  
**   **  
*******

*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        n = (2 * n) - 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j == n || i == j || i + j == n + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
