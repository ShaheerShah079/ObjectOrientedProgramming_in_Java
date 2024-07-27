package rskgerinics;

public class RSK<D1>
{

    public <D1 extends Number> double add(D1 one, D1 two)
    {
        return one.doubleValue() + two.doubleValue();
    }
}
