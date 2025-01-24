/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Mother
{
    int x;
    
    static void show(){
        System.out.println("Show method of Mother is called");
    }
    
}

class child extends Mother{
    static void show(){
        System.out.println("Show method of Child is called");
    }
    
} 

public class Polymorphism{
    public static void main(String[] args){
        Mother m= new Mother();
        m.show();
        child ch = new child();
        ch.show();
        Mother m1= new child();
        m1.show();
        
    }
}


