/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.program;

public class GetterSetter
{
    private int x;
    public int GetX()
    {
        return x;
    }
    public void SetX(int a)
    {
        x=a;
    }
    
}
class A
{
    public static void main(String[] args)
    {
        GetterSetter ob = new GetterSetter();
        ob.SetX(10);
        System.out.println(ob.GetX());
    }
}
