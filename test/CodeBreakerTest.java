/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import codebreaker.CodeBreaker;
import static org.hamcrest.CoreMatchers.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sergio.llanos, DanielPelaezP, dcamilobj
 */
public class CodeBreakerTest {
    
  CodeBreaker cd = new CodeBreaker();
    
    @Test
    public void allNumbersMatch(){
        
        String res = cd.symbols("1234");
        assertEquals(res,"XXXX");
    }
    @Test 
     public void noNumbersMatch(){
        
        String res = cd.symbols("6789");
        assertEquals(res,"");
    }
     @Test
      public void oneNumberMatch(){
        
        String res = cd.symbols("5176");
        assertEquals(res,"_");
    }
    @Test
      public void twoOrMoreNumbersMatch(){
        
        String res = cd.symbols("3125");
        assertThat(res, anyOf(is("__"), is("___"),is("____")));
    }
    @Test
      public void onePositionMatch(){
        
        String res = cd.symbols("7894");
        assertThat(res, anyOf(is("X"), is("X_"), is("X__"), is("X___")));
    }   
    @Test
      public void twoOrThreePositionMatch(){
        
        String res = cd.symbols("1324");
        assertThat(res, anyOf(is("XX"), is("XX_"), is("XX__"), is("XXX"), is("XXX_")));
    }
    @Test
      public void numberLength(){        
        String res = cd.symbols("12345");
        assertEquals(res, "el numero debe tener 4 digitos");
    }  
    @Test
      public void lettersOnTheNumber(){        
        String res = cd.symbols("a*bc");
        assertEquals(res, "Se debe ingresar solo numeros");
    } 
      
    @Test
      public void repeatNumbers(){        
        String res = cd.symbols("5152");
        assertEquals(res, "No puede haber dígitos repetidos");
    } 
      
    
  

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
