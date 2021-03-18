/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankitpathak530
 */
package HackerRank;
import java.util.Scanner;
public class HackerGradeRound {
    public static void main(String args[])
    {
        int grade,result;
        Scanner sc=new Scanner(System.in);
        grade=sc.nextInt();        
        System.out.println(result=gradingStudents(grade));
    }
    static int gradingStudents(int grade)
    {
         int multiple;
         multiple=5*((grade/5)+1);
        int c=(grade>40)?((multiple-grade)<3?multiple:grade):grade;    
        return c;
    }
}
