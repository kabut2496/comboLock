/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package combolockdriver;

/**
 *
 * @author kabut2496
 */
public class ComboLock {
 //used to store the combo
    
    private int num1,num2,num3;

//Constructor
      public ComboLock(int number1,int number2,int number3) {
        num1=number1;
        num2=number2;
        num3=number3;
      }
      
//alows the combo to ge retrived 
      
      public int gNum1(){
        return num1;
    }
     
      public void setNum1(int setNum1){
        num1 = setNum1;
    }
      public int gNum2(){
        return num2;
    }
     
      public void setNum2(int setNum2){
        num2 = setNum2;
    }
       public int gNum3(){
       return num3;
    }
     
      public void setNum3(int setNum3){
        num3 = setNum3;
    }
}
