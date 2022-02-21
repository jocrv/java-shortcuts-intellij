shortcuts, versioning 

refactor java

package br.com.bio;
import br.com.bio.model.Cat;

public class FirstProgram { 
    public static void main(String[] args) {
        Cat cat = new Cat ();
        System.out.println(cat);

        System.out.println(cat); 

        /*int a = 5;
        int b = 3;
        System.out.println("Hello, peeps!" + (a+b));*/ 
    }



}


// cntr alt l toe lines
// cntr d duplice the line
// ctr shiftht arrow up to upper


eclipse:
cntr d delete the line 

// to version on github 
// jetbrains file, resources all the shortcuts 

// create new repository this on github
// intellij, VCS 

enable version control, select git 
// VCS 
commit
cntr k 
default changelist
the blanck space put some read me:
example first commit 
define remote:
name origin
URL (copy link on github)
press ok 
select the project 
push tag ALL 
push 
login in to github 

jetbrains ide
permissions 


refresh github 



package br.com.bio;
import br.com.bio.model.Cat;

public class FirstProgram { 
    public static void main(String[] args) {
        Cat cat = new Cat ();
        System.out.println(cat);

        System.out.println(cat); 

        
        book book1 = new Book( name: "Lor of Rings", numPages: 500);  // create the variable book or book1 
        System.out.println(book1); 
        /*int a = 5;
        int b = 3;
        System.out.println("Hello, peeps!" + (a+b));*/ 

    }



}

class Book { 
    private String name;
    private Integer numPages; 

    public Book(String name, Integer numPages){
        this.name = name;
        this.numPages = numPages; 
    }

    public String getName(){      //Get Setters here 
        return name; 
    }

    public void setName(String name) {
        this.name = name; 
    }

    public integer getNumPages() {
        return numPages;
    }

    public void setNumPages(Integer numPages) {
        this.numPages = numPages; 
    }   // alt insert to strings 

    @Override
    public String toString() {
        return "Book{" +
        "name= " + name + '\''+ 
        ", numPages=" + numPages + 
        '}'; 
    }
}

// to commit cntr k 
// blank space, "creating the class book"
// now do the push 
// VCS push 
cntr shift k 
pushed 1 commit 
// check on github 
