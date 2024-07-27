package shapes;
class cylinder extends circle {
int height;
public cylinder(int r,int h){
super(r);
height=h;
}
public float volume(){
return (float) area()*height;
}
public float areacy(){
return (float) circum()*height;
}
}

