package shapes;

public class Shapes1 {
    public static void main(String[] args) {
rectangle r = new rectangle(4,5);
        System.out.println("The area of rec is "+r.area()+" and para is "+r.para());
square s = new  square(5);
        System.out.println("The area of square is "+s.area()+" and para is "+s.para());

circle c = new  circle(6);
        System.out.println("The area of circle is "+c.area()+" and circum is "+c.circum());

cylinder cy = new  cylinder(5,6);
        System.out.println("The volume of cylinder is "+cy.volume()+" and area is "+cy.areacy());

sphere sp = new  sphere(6);
        System.out.println("The volume of sphere is "+sp.volume()+" and area is "+sp.areasp());
    }
}