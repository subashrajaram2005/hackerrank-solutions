/*
Problem Name
Check Perfect Square

Problem Statement
Check whether given number is perfect square or not.

Input Format
Accept an integer as input

Constraints
NIL

Output Format
Print Perfect Square if the number is a perfect square, otherwise print Not.

Sample Test Cases
Sample Input 0
10000

Sample Output 0
Perfect Square

Sample Input 1
145

Sample Output 1
Not
*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((int)Math.sqrt(n) * (int)Math.sqrt(n) == n)
            System.out.println("Perfect Square");
        else
            System.out.println("Not");
    }
}
