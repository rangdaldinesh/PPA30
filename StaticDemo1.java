import java.lang.*;

class Demo
{
        public int i;
        public int j;
        public static int k;

        static
        {
            System.out.println("Inside static block");
            k = 11;
        }

        Public Demo()
        {
            System.out.println("Inside constructor");
            this.i = 0;
            this.j = 0;
        }

        Public void fun()
        {
             System.out.println("Inside non static fun");
             System.out.println(this.i);
             System.out.println(this.j);
             System.out.println(this.k);
        }
        
        Public static void gun()
        {
            System.out.println("Inside static gun");
            System.out.println(k);
        }
}

class StaticDemo
{
    Public static void main(String a[])
    {
        Demo.gun();

        Demo obj;
      obj = new Demo();
/*
        obj.fun();

        System.out.println(obj.i);
        System.out.println(obj.j);  */
    }
}