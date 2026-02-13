public class Square {
    int side;
    void getData(int si)
    {
        side= si;
    }
    int CalArea()
    {
        return side*side;
    }
    public static void main(String args[])
    {
        Square s = new Square();
        s.getData(5);
        System.out.println("Area of Square:"+s.CalArea());
    }
}
