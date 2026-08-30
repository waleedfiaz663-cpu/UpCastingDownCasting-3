
public class Test {
    
    public static void main(String[]args){
        
        Shape S = new Shape("Black");
        
        Shape S1 = new Rectangle("Blue",4,5);
        
        Shape S2 = new Triangle("White",6,7);
        
        //System.out.println(S.GetArea());
        
       // System.out.println(S1.GetArea());
        
       // System.out.println(S2.GetArea());
        
        
        Shape[] Shape= new Shape[3];
        
        Shape[0]=S;
        
        Shape[1]=S1;
        
        Shape[2]=S2;
        
        for(int i=0;i<Shape.length;i++){
            
            System.out.println(Shape[i].toString());
            
            System.out.println("Area is : " +Shape[i].GetArea());
        }
    }
    
}
