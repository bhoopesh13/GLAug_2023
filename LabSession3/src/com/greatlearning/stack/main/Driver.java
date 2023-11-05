package com.greatlearning.stack.main;

import com.greatlearning.stack.service.BalancingBrackets;

public class Driver {
	  // Driver code
    public static void main(String[] args)
    {
       String bracketExpression = "([[{}]])";

         
        Boolean result;
        
        result = BalancingBrackets.checkingBracketsBalanced(bracketExpression);
        
        if (result)
            System.out.println("The entered String has Balanced Brackets");
        else
            System.out.println("The entered Strings do not contain Balanced Brackets ");
    }
}
