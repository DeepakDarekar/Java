package inheritance;
class Shape  
{  
     //define a length which is public and can be used in square,   
     //rectangle and circle classes  
     public int length = 10;  
}  
  
//inherit the properties of Shape class with the use of extends keyword  
  
class Square extends Shape  
{  
     void area()  
     {  
          //calculate area of square  
          int area = length * length;  
  
          //print it on the screen  
          System.out.println("Area of square : "+area);  
     }  
}  
  
class Rectangle extends Shape  
{  
     void area()  
     {  
          //define a breadth  
          int breadth = 7;  
          //calculate area of rectangle  
          int area = length * breadth;  
          //print on the screen  
          System.out.println("Area of rectangle : "+area);  
     }  
}  
  
class Circle extends Shape  
{  
     void area()  
     {  
          //calculate area of circle using length of the shape class as radius  
          float area = 3.14f * length * length;  
          //print on the screen  
          System.out.println("Area of circle : "+area);  
     }  
}  
  
//make a entry class which contains main method  

