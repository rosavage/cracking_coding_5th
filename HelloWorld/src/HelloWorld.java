/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robert
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0;i<6;i++)
        {
            System.out.println(i);
        }
        Person p = new Person("Rob");
        p.printName();
    }
}
