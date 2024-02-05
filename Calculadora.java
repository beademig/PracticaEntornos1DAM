/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beatrizdemiguelramirez.git;

/**
 *
 * @author beade
 */
public class Calculadora {
    
   private int operador1, operador2;
    
   public Calculadora(int a, int b)
   {
    operador1=a;
    operador2=b;
   }
   
   public void setOperador1(int a)
   {
     operador1=a;
   }

   public void setOperador2(int b)
   {
     operador2=b;
   }
   
   
   public int getOperador1()
   {
     return operador1;
   }

   public int getOperador2()
   {
     return operador2;
   }

   public int sumar()
    {
        return operador1+operador2;
    }
    
   public int restar()
    {
        return operador1-operador2;
    }
   
    public int multiplicar()
    {
        return operador1*operador2;
    }
}
