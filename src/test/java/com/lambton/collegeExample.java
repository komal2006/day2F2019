package com.lambton;

public class collegeExample
{

    public static void main(String[] args)
    {
       /*int a,b;
        Arithmetic arithmetic = new Arithmetic();

        System.out.println("Sum : " + arithmetic.add(a=20, b=3));
        System.out.println("Sub : " + arithmetic.sub(a=20, b=3));
        System.out.println("Mul : " + arithmetic.mul(a=20, b=3));
        System.out.println("Div : " + arithmetic.div(a=20, b=3));*/

       Student s1 = new Student();
       s1.setFirstName("Komaldeep");
       s1.setLastName("Kaur");
       s1.setMarksSub1(40);
        s1.setMarksSub2(50);
        s1.setMarksSub3(35);
        s1.setMarksSub4(60);
        s1.setMarksSub5(69);

        System.out.println(s1.getfullName());





       s1.generateresult();


    }


}
