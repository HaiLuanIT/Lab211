/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab25demo;

import application.Menu;
import application.ProductMenu;
import business.entity.Product;
import business.utilities.DataInput;
import data.ProductDaoImpl;

/**
 *
 * @author lyhai
 */
public class Lab25Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Menu m = new Menu();
        int choice;
        
        do{
            System.out.println("//------------------------------//");
            System.out.println("1.Show menu manage product.");
            System.out.println("2.Show menu manage warehouse.");
            System.out.println("3.Show menu report.");
            System.out.println("Other, exit.");
            System.out.println("//-----------------------------//");
            
            choice = DataInput.getInt("Select:");
            
            switch (choice) {
                case 1:{
                    m.manageProduct();
                    break;
                }
                    
                default:
                    break;
            }
        }while(choice >= 1 && choice <= 3);
    }
    
}
