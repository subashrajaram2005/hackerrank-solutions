/*
Problem Name
Rotate String N Times

Problem Statement
Write a program to accept the string and rotate the string n times

Input Format
Accept the n value and string as an input

Constraints
NIL

Output Format
Print the rotated string

Sample Test Cases
Sample Input 0
6
apple

Sample Output 0
pplea
*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        int len = str.length();
        String doubled = str + str ;
        int start = num % len;
        System.out.println(doubled.substring(start,start+len));
    }
}
