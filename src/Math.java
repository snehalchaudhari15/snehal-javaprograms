public class Math {
private static Math maths=null;
private Math() {
}
    public static Math getinstance ()
    {
        if (maths == null) {
            maths = new Math();
        }
        return maths;
    }
    public int add( int num1, int num2)
    {
        return num1 + num2;
    }
    public int sub( int num1, int num2)
    {
        return num1 - num2;
    }
}

