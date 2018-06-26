object Fun
{
    
        def sq(n: Int): Int =n*n
        // {
        //     var y: Int = 2;
        //     var x= y*y;   
        //     println(x) 

        //     var z= x+x;
        //     println(z);
        // }
        def sum(a: Int,b: Int):Int=
        {
            // a*a+b*b;
            sq(a)+sq(b)
        }
        def guess(): Int=
        {
            var x : Int;
            var n : Int;
            println("Enter number:"+n);
            val str=scala.oi.StdIn.readInt()
            if((n*n)-x!=1|| (n*n)-x!=0||(n*n)-x!=1)
            {
               println("") 
            }

        }
        def main(args : Array[String])
        {
        println(sq(2));
        println(sum(2,3));
        }
}
