/*
Problem Name
Convert Digits in String to Number

Problem Statement
Write a program to convert the digits of the string into a single number

Input Format
Accept string as an input

Constraints
NIL

Output Format
Print the number in the string

Sample Test Cases
Sample Input 0
hi12hello13

Sample Output 0
1213

Sample Input 1
heaven

Sample Output 1
0
*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();   
        StringBuilder digits = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)) {
                digits.append(ch);
            }
        }   
        if(digits.length() == 0){
            System.out.println(0);
        } else {
            System.out.println(digits.toString());
        }
    }
}
