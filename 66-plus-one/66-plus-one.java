class Solution {
   public int[] plusOne(int[] digits) {
        int[] value = new int[digits.length];
        int carry = 1;
        boolean expand = false;
        
        for(int i = digits.length - 1; i >= 0; i--) {
        	if(carry == 0) {
        		value[i] = digits[i];
        	}
        	
            int current = digits[i];
            
            int add = current + carry;
            
            if(add > 9) {
                value[i] = 0;
                
                if(i == 0)
                    expand = true;
            }else{
                value[i] = add;
                
                if(carry >= 1)
                	carry--;
            }
        }
        
        if(expand) {
            int[] newValue = new int[value.length + 1];
            newValue[0] = carry;
            
            for(int i = value.length - 1; i >= 1; i--) {
                newValue[i] = value[i];
            }
            
            value = newValue;
        }
        
        return value;
    }
}