/*
Problem Name
Count Uppercase Characters

Problem Statement
Write a program to count the number of upper-case characters in a given string

Input Format
Accept string as an input

Constraints
NIL

Output Format
Print the count of Uppercase characters

Sample Test Cases
Sample Input 0
BeauTIfull Life

Sample Output 0
4
*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count = 0;
        for(int i=0;i<a.length();i++){
            if(Character.isUpperCase(a.charAt(i))) count++;
        }
        System.out.println(count);
    }
}
