package com.basics.introduction;

public class Student {
int rno;
String name;
int marks;

void greeting(){
System.out.println("Hello My Name is " + this.name);
}
Student(int rno, String name, int marks)
{
    this.rno = rno;
    this.name = name;
    this.marks = marks;
}

Student (String newname){
    this.name = newname;
}
}
