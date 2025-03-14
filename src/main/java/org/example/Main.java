package org.example;

public class Main {
    public static void main(String[] args) {
        while (Chain of trust cotnains no trusted CA){
            if(chain length < verify_depth){
                try to extend chain of trust by 1 level
                set ERROR appropriately if any error
            }
            else
            {
                set ERROR to "incomplete chain"
            }
            if(ERROR){
                verify_result = error
                if(verify_callback == NULL){
                    if(verify_mode != 0){
                        Print error and terminate connection
                    }
                }
                else{

                    ret = verify_callback(preverify_ok = 0,...)
                    if((verify_mode != 0) and (ret ==0){
                        Print error and terminate connection
                    }
                }
                if(ERROR is not related to incorrect parsing){
                    return 1
                }
                else{
                    return ERROR
                }
            }else{
                ret = verify_callback(preverify_ok = 1,...)
                if((verify_mode != 0) and (ret ==0){
                    Print error and terminate connection
                }
            }
        }
    }
}