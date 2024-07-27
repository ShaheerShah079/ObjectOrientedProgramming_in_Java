package shapes;
class sphere extends circle{
public sphere(float r){
super(r);
}
public float volume(){
return (float) ((area()*4*radius)/3);
}
public float areasp(){
return (float) (area()*4);
}
}
