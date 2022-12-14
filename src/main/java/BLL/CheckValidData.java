/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ngoccanh
 */
public class CheckValidData {
    
    public boolean checkIsNumber(String in){
        try{
            in = in.replaceAll("\\s", "");
            Integer.parseInt(in);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean checkIsNagativeNum(int in){
        return in < 0 ? true : false;
    }
    
    public boolean checkIsString(String in){
       try{
            String.valueOf(in);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean checkIsSpecialChar(String in){
        boolean result = true;
        Pattern p = Pattern.compile("[^a-z0-9\\s]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(in);
        return result = m.find();
       
    }
  
   public boolean checkPhoneNumber(String phone) {
    
    boolean isNumeric = phone.matches("^[0-9]+$");
    char st1 = phone.charAt(0);

    if (isNumeric == false) {
        return false;
      
    } else if (phone.length() != 10) {
        
        return false;
    } else if (st1 != '0') {
        return false;
    }
    return true;
}

   
    
   
}
