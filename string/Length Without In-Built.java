/*
Problem Name
Length of String Without Using In-Built Function

Problem Statement
Write a program to find the length of the string without using in-built function

Input Format
Accept string as an input

Constraints
NIL

Output Format
Print the count of the string

Sample Test Cases
Sample Input 0
i like apple

Sample Output 0
12
*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count = 0;
        for(int i : a.toCharArray()) count++;
        System.out.println(count);
    }
}
