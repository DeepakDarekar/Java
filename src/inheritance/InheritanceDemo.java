package inheritance;

class InheritanceDemo  
{  
     public static void main(String[] args)  
     {  
          //object of child class square  
          Square sq = new Square();  
          //object of child class rectangle  
          Rectangle rec = new Rectangle();  
          //object of child class circle  
          Circle cir = new Circle();  
            
          //call the area methods of all child class to   
          //get the area of different objects  
          sq.area();  
          rec.area();  
          cir.area();  
     }  
} 