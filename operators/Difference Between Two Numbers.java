/*
Problem Name
Difference Between Two Numbers

Problem Statement
Get two numbers from the user and print the difference between the two numbers.

Input Format
Accept two integers as input

Constraints
-100 ≥ n ≤ 100

Output Format
Print the difference between two numbers

Sample Test Cases
Sample Input 0
78 25

Sample Output 0
53

*/
  
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(a - b);
    }
}
