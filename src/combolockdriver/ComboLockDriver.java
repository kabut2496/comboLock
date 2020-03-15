/**
 * 15/03/2020
 * Karl Butler
 * to simulate a lock
 */

package combolockdriver;

import javax.swing.*;
/**
 *
 * @author kabut2496
 */
public class ComboLockDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//declaring variables
        
    String getNum,getNum2,getNum3;
    int num1,num2,num3,unNum1,unNum2,unNum3,x;
    x=0;
    
//geting the combo to the lock
        getNum = JOptionPane.showInputDialog("Enter the first number of the lock");
        num1=Integer.parseInt(getNum);
        
        getNum2 = JOptionPane.showInputDialog("Enter the second number of the lock");
        num2=Integer.parseInt(getNum2);
        
        getNum3 = JOptionPane.showInputDialog("Enter the third number of the lock");
        num3=Integer.parseInt(getNum3);
    
//creating the object
     
        ComboLock combo = new ComboLock(num1, num2, num3);
     
//a loop to give the user 3 trys to remeber ther combo
     
        for(int i =1;i<=3;i++){
            
// the user entering there combo
        
        getNum = JOptionPane.showInputDialog("to unlock the lock enter the first number of the lock");
        unNum1=Integer.parseInt(getNum);
        
        getNum2 = JOptionPane.showInputDialog("to unlock the lock enter the second number of the lock");
        unNum2=Integer.parseInt(getNum2);
        
        getNum3 = JOptionPane.showInputDialog("to unlock the lock enter the third number of the lock");
        unNum3=Integer.parseInt(getNum3);
      
//testing to see if they got it right or wrong
        
        if(unNum1==combo.gNum1()&&unNum2==combo.gNum2()&&unNum3==combo.gNum3()){
            System.out.println("good job you remebered your combo");
            i=3;
        }else {
            System.out.println("you are wrong");
            x++;
        }
        }

//telling them they took to many trys
        
        if(x==3){
            System.out.println("you took to many trys you are now locked out");
        }
    }
    
    
}
