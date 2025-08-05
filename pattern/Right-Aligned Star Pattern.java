/*
Problem Name
Print Right-Aligned Star Pattern

Problem Statement
Print the following right-aligned star pattern.

Input Format
Integer

Constraints
Input > 0

Output Format
Star pattern

Sample Test Cases
Sample Input 0
5

Sample Output 0
    *****  
   *****  
  *****  
 *****  
*****

*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
