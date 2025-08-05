/*
Problem Name
Print Number Pattern with Odd and Even Rows

Problem Statement
Write a program to display the following pattern:

Odd rows print increasing odd numbers starting from 1

Even rows print increasing even numbers starting from 2

Input Format
Integer

Constraints
Input > 0

Output Format
Star Pattern (Number Pattern)

Sample Test Cases
Sample Input 0
5

Sample Output 0
1  
24  
135  
2468  
13579

*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int val;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) val = 2;
            else val = 1;
            for(int j = 1; j <= i; j++) {
                System.out.print(val);
                val += 2;
            }
            System.out.println();
        }
    }
}
