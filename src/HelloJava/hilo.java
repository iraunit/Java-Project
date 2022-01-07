package HelloJava;

class rohit{
    public void rohru(){
        System.out.println("Rauni vema");
    }
}

class rohitraunit extends  rohit{
    @Override
    public void rohru(){
        System.out.println("fjsdkfjsdf");
    }
}

public class hilo {

    public static  void main ( String args []){
        System.out.println("hello");

        rohitraunit rr=new rohitraunit();
        rr.rohru();
        Integer i=22;
        System.out.println(Integer.bitCount(i));
    }
}
