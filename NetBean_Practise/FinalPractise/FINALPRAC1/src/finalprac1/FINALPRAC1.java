package finalprac1;

interface A
{
    public void me();
}

interface B
{
    public void me1();
}
interface C
{
    public void me3();
}
interface D extends A,B
{
    public void me4();
}

abstract class Abcclass implements C
{
    public void me5()
    {
        
    }
    public abstract void me6();
    
    
}



class MyClass extends Abcclass implements D 
{

    @Override
    public void me4()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void me()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void me1()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void me6()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void me3()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
}






public class FINALPRAC1
{
    public static void main(String[] args)
    {





    }
    
}
