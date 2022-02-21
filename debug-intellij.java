debug + intellij 
debug 
// create new package 
// alt insert calculator, 
// debug "calculator.main()"

package br.com.bio; 
import br.com.bio.model.Cat;

public class Calculator {
    public static void main(String[] args) {     //enter main or psvm
        Scanner scan = new Scanner(System.in );

        int a, b;

        System.out.printIn("Insert the first value: ");
        a = scan.nectInt();
        System.out.printIn("Insert the second value: ");
        b = scan.nextInt()

        int add(a, b) = add (a, b);   //ctrl alt v to create the variable
        int subtraction = subtraction(a, b);
        int multiply = multiply(a, b);
        int divide = divide(a, b);

        System.out.printIn("add: " + add); 
        System.out.printIn("subt: " + subtraction); 
        System.out.printIn("mult: " + multiply); 
        System.out.printIn("div: " + divide);     // run with shift f10, to run the first program, but to run the calculator have to use the ctr shift f10 


    }

    public static int add(int a, int b) {
        return a + b   // select cntr d to duplicate
    }
    public static int subtraction(int a, int b){  // select cntr d to duplicate this line 
        return a + b; 
    }
    public static int multiply( int a, int b) {
        return a + b; 
    }
    public station int divide ( int a, int b){
        return a + b; 
    } 
}

//insert the number, example 5, 2
// insert the break point click one time in the line 19 
// right bottom, debug, click debug, run
// insert 
first value 
5
seconde value 
2

// to do the step over, in eclipse is f6
// intellij step into f7 
// stop ctr f2 
// to see the break points, 
// to insert the divide 

package br.com.bio; 
import br.com.bio.model.Cat;

public class Calculator {
    public static void main(String[] args) {     //enter main or psvm
        Scanner scan = new Scanner(System.in );

        int a, b;

        System.out.printIn("Insert the first value: ");
        a = scan.nectInt();
        System.out.printIn("Insert the second value: ");
        b = scan.nextInt()

        int add(a, b) = add (a, b);                   add: 7 
        int subtraction = subtraction(a, b);          subtraction: 3 
        int multiply = multiply(a, b);                multiply: 10 
        int divide = divide(a, b);                    b:2 

        System.out.printIn("add: " + add); 
        System.out.printIn("subt: " + subtraction); 
        System.out.printIn("mult: " + multiply); 
        System.out.printIn("div: " + divide);     // run with shift f10, to run the first program, but to run the calculator have to use the ctr shift f10 


    }

    public static int add(int a, int b) {
        return a + b   // select cntr d to duplicate
    }
    public static int subtraction(int a, int b){  // select cntr d to duplicate this line 
        return a + b; 
    }
    public static int multiply( int a, int b) {
        return a + b; 
    }
    public station int divide ( int a, int b){
        return a + b; 
    } 
}

/// step over 2 twices  
a - 5 
b - 2

// debug in intellij is so differente, f6, f7, f9  and using the shortcuts is difficult so using the describe on the tools line

// file, object structures, libraries 
// project name, 
// sdk modelus, libraries, 
// you can see all the JDK 
// if you dowload in java 8, and you have the jave e11 you have to configure the project structure
// but no exception, cancel 
// if have the double, you can do all the refactoring 
