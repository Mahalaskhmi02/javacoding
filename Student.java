package com.jojuskills; 
public record Student(int rollno, String Name){ 
 Student() { 
  this(0,"x");} 
 public static void main(String args[]) { 
  System.out.println("Hello record"); 
  System.out.println(a); 
  m(); } 
 static int a=50; 
 static {System.out.println("Static block"); } 
 static void m() { 
  System.out.println("Static method");}} 
  public record Student(int rollno, String Name){ 
 Student() { 
  this(0,"x");} 
 public static void main(String args[]) { 
  int a=75; 
  System.out.println("Hello record"); 
  Student s=new Student(); 
  System.out.println(a); 
  s.m();  } 
   void m() { 
  System.out.println("Non-Static method");}} 
  public record Student(int rollno, String Name, float fee, String course){ 
 Student() { 
  this(0,"x",0f,"y");} 
 public static void main(String args[]) { 
   Student s =new Student(100,"Anu",1500,"Java"); 
   System.out.println(s);}}
   Public class Student { 
 Private String name; 
 Public String getName() { 
 Return name; 
 Public void setName(String name) { 
 This.name=name; }} 