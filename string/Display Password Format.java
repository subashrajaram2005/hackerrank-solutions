/*
Problem Name
Display Password Format

Problem Statement
Write a program to accept the string from the user and display the string in the password format without making any change in the input array

Input Format
Accept the string as input

Constraints
NIL

Output Format
Print string in password format

Sample Test Cases
Sample Input 0
Password

Sample Output 0
********
*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++) 
            System.out.print("*");
    }
}
