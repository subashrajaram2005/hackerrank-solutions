/*
Problem Name
Print Star Pattern

Problem Statement
Print the following pattern of stars.

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
*
**
***
****

*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
