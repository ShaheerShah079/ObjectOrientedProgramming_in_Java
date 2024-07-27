package shapes;
class rectangle implements box{
    int length;
    int breath;
    public rectangle(int l, int b){
length=l;
breath=b;
    }
    public int area(){
        return length*breath;
    }
    public int para(){
        return 2*(length+breath);
    }
}
