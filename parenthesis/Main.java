package com.company;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        try{
            File file = new File("three_expressions.txt"); // here can be and first file
            Scanner read = new Scanner(file);

            while(read.hasNextLine()){
                boolean error = false; // for error checking
                Stack stack = new Stack();
                String data = read.nextLine();
                for(char el : data.toCharArray()){
                    if (el == '('){
                        stack.push(el);
                    }
                    else if (el == ')'){
                        try{
                            stack.pop();
                        } catch (Exception e){
                            System.out.println("It is not balanced");
                            error = true;
                            break;
                        }
                    }
                }
                if (stack.isEmpty() && error == false){ // for cases when all is good
                    System.out.println("It is balanced");
                }else if(!stack.isEmpty() && error == false){ // for cases when stack is not empty
                    System.out.println("It is not balanced"); // but CATCH didn't worked
                }                                             // for example '(' more than ')'
            }                                                 // there is no error but stack has excess value
            read.close();
        }catch (FileNotFoundException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
