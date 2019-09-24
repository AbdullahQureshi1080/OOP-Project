/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package GUIProject;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Abdullah
 */
public class ReadAllData {
    public static ArrayList <Customer> readAllData(){
        ArrayList<Customer>CustomerList = new ArrayList<>();
        ObjectInputStream inputStream = null;
        try{
            inputStream = new ObjectInputStream(new FileInputStream("Cs.ser"));
            boolean EOF = false;
            while(!EOF) {
                try {
                    Customer myObj = (Customer) inputStream.readObject();
                    CustomerList.add(myObj);
                    //System.out.println("Read: " + myObj.getName());
                }
                catch (ClassNotFoundException e) {
                    //System.out.println("Class not found");
                }
                catch (EOFException end) {
                    // EOFException is raised when file ends
                    // set End Of File flag to true so that loop exits
                    EOF = true;
                }
            }
        } catch(FileNotFoundException e) {
            //System.out.println("Cannot find file");
        } catch (IOException e) {
            //System.out.println("IO Exception while opening stream");
            //e.printStackTrace();
        } finally { // cleanup code to close stream if it was opened
            try {
                if(inputStream != null)
                    inputStream.close( );
            } catch (IOException e) {
                // TODO Auto-generated catch block
                System.out.println("IO Exception while closing file");
            }
        }
        // returns ArrayList
        return CustomerList;
    }
}
