
package my.program;
public class constructoroverload
{
    int x;
    int y;
constructoroverload()
{
    x=y=12;                //no argument
}

constructoroverload(int a)
{
    x=y=a;                    
}
constructoroverload(int a,int b)
{
    x=a;
    y=b;                         
}
constructoroverload(constructoroverload o)
{
    x=o.x;  
    y=o.y;                     
}

 
    public static void main(String[] args)
    {
        constructoroverload ob = new constructoroverload();
        
        
        
    }
  
}


