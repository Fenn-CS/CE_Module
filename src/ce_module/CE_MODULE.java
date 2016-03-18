/*
 ** Licence**
 * Licensed to be compatible with the Scilab CeCILL license.
 */
package ce_module;
import binary.Number;
/**
 *
 * @author Fon E. Noel Nfebe
 */
public class CE_MODULE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Simple Test Cases
        //Pass a String of base two numbers or base n numbers where n>10
        //Or simply pass an interger in base is less than 10 and !=2
        Number number = new Number(45,10);
        System.out.println("That Converts To:"+number.ConvertToBase(32));
        number = new Number("F",16); 
        System.out.println("That Converts To:"+number.ConvertToBase(10));
        number = new Number("1000",2);
        System.out.println("That Converts To:"+number.ConvertToBase(8));
        number = new Number("25FF",16);
        System.out.println("That Converts To:"+number.ConvertToBase(8));
        number = new Number(22777,8);
        System.out.println("That Converts To:"+number.ConvertToBase(2));
        
        
    }
    
}
