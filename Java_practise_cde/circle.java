package shapes;
class circle {
public float radius;
public circle(float r){
radius=r;
}
public float circum(){
return (float) (2*3.141592653589793*radius);
}
public float area(){
return (float) (3.141592653589793*radius*radius);
}
}
