/*
Problem Name
Search Character in String

Problem Statement
Write a program to search for a character in a string

Input Format
Accept string as an input

Constraints
NIL

Output Format
Present / Not Present

Sample Test Cases
Sample Input 0
p
apple

Sample Output 0
Present

Sample Input 1
f
Myslate

Sample Output 1
Not Present
*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        String str = sc.next();
        if(str.indexOf(ch)!=-1) System.out.println("Present");
        else System.out.println("Not Present");
    }
}
