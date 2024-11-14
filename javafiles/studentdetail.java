package javafiles;

import java.util.Scanner;
class student1
{
    String name;
    String usn;
     String phone;
    String branch;
    void read(){
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("enter name");
            name=s.next();
            System.out.println("enter usn");
            usn=s.next();
            System.out.println(" enter PHONE");
            phone=s.next();
            System.out.println("enter branch");
            branch=s.next();
        }
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("usn:"+usn);
        System.out.println("phone:"+phone);
        System.out.println("branch:"+branch);
    }
}
class student{
    public static void main(String[] args){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter value of n");
        n=s.nextInt();
        student1 s1[]=new student1[n];
        for(int i=0;i<n;i++){
            s1[i]=new student1();
        }
        for(int i=0;i<n;i++){
            s1[i].read();
        }
        for(int i=0;i<n;i++){
            s1[i].display();
        }
        s.close();
    }
}