/*
Problem Name
Count Special Characters

Problem Statement
Write a program to count the special characters in the given string

Input Format
Accept the string as an input

Constraints
NIL

Output Format
Print the count of the special characters.

Sample Test Cases
Sample Input 0
togy@#123

Sample Output 0
2
*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count = 0;
        for(int i=0;i<a.length();i++){
            char c = a.charAt(i);
            if(!Character.isLetterOrDigit(c)) count++;
        }
        System.out.println(count);
    }
}
