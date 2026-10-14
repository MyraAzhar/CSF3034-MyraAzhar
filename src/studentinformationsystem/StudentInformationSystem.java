/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author MRPC
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Name: Nur Amira Natasha");
        System.out.println("Student ID: S86444");
        
        int mark1 = 45;
        int mark2 = 43;
        int total = mark1 + mark2;
        
        System.out.println("Total Mark: " + total);
        
        if (total >= 80){
            System.out.println("Result: Excellent");
        }else if (total >= 60){
            System.out.println("Result: Good");
        }else {
            System.out.println("Result: Needs Improvement");
            System.out.println("Course: Bachelor of computer science with maritime informatics");
        }
        // TODO code application logic here
    }
    
}
