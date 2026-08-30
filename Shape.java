
public class Shape {
    
    private String Color;


public Shape(String Color){
    
    this.Color=Color;
    
}    
    
public String toString(){
    
    return "Shape[Color = "+ Color +"]";
    
}

public Double GetArea(){
    
    System.err.println("Shape Unknown , Cant Find Area ");
    
    return 0.0;
    
}
    
}

class Rectangle extends Shape{
    
    private int Lenght;
    private int Width;
    

public Rectangle(String Color, int lenght, int width){

super(Color);
this.Lenght=lenght;
this.Width=width;

}

@Override
    
public String toString(){
    
    return "Rectangle[Lenght = "+ Lenght +",Width = "+ Width +","+super.toString()+"]";
    
}

@Override
    
public Double GetArea(){

    return(double) Lenght*Width;
    
}
    
}

class Triangle extends Shape{
    
    private int Base;
    private int Hieght;
    
    
public Triangle(String Color, int Base, int Hieght){
    
    super(Color);
    this.Base=Base;
    this.Hieght=Hieght;
    
}

public String toString(){
    
    return "Triangle[Base = "+ Base +", Hieght = "+ Hieght +", "+super.toString()+"]";
    
}

@Override
    
public Double GetArea(){
    
    return(Double) 0.5*Base*Hieght;
    
}

}

