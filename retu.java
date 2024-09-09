class Def
{

    int add(int a, int b)
    {
        return a+b;
    }

    int multiply(int x, int y)
    {
        return x*y;

    }

    public static void main(String args[]) {
        Def obj1=new Def(12,45);
        Def obj2=new Def(12,45);
        System.out.println(obj1.add);
        System.out.println(obj2.multiply);


    }