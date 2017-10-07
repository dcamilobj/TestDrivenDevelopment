/*
 * To digitsange this license header, digitsoose License Headers in Project Properties.
 * To digitsange this template file, digitsoose Tools | Templates
 * and open the template in the editor.
 */
package codebreaker;

/**
 *
 * @author sergio.llanos, DanielPelaezP, dcamilobj
 */
public class CodeBreaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
    public String symbols(String number){
        if (number.length() != 4)
            return "el numero debe tener 4 digitos";
        if(equalsCharsInArray(number) == true)
            return "No puede haber dígitos repetidos";     
        String myNumber  = "1234";
        String res ="";
        char[] digits = number.toCharArray();
        for(int i=0;i<digits.length;i++)
        {   
            if(!Character.isDigit(number.charAt(i))){
             return "Se debe ingresar solo numeros";
            }
            else if(myNumber.charAt(i) == number.charAt(i))
            {
                res = "X" + res;
            }
            else if(myNumber.contains(Character.toString(digits[i])))
            {
                res += "_";                          
            }
        }
                         
        return res;
    }
 
    public boolean equalsCharsInArray(String s)
    {
        boolean res = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
              if(s.charAt(i) == s.charAt(j))
              {
                  res = true;
              }
            }
        }
        return res;
    }
}
