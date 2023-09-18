/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.service;

import business.utilities.DataInput;
import business.entity.Product;
import data.IProductDao;
import data.ProductDaoImpl;
import java.util.List;

/**
 *
 * @author lyhai
 */
public class ProductService implements IProductService {

    IProductDao rawProduct = new ProductDaoImpl();

    @Override
    public void addNew(Product p) throws Exception {
        try {
            boolean isCheck = rawProduct.add(p);
            if (isCheck) {
                System.out.println("Add product successfully!");
            } else {
                System.out.println("Add failed!");
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void delete(String code) throws Exception {

        try {
            boolean status = rawProduct.delete(code);
            if (status) {
                System.out.println("Delete successfully!");
            } else {
                System.out.println("Delete failed!");
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void update(String id, Product p) throws Exception {

        try {
            boolean status = rawProduct.update(id,p);
            
            if (status){
                System.out.println("Update successfully!");
            } else System.out.println("Update failed!");
        } catch (Exception e) {
        }
    }

    @Override
    public void printList() throws Exception {

        try {
            boolean isCheck = rawProduct.printList();
            if (isCheck) {
                System.out.println("Print successfully!");
            } else {
                System.out.println("List null");
            }
        } catch (Exception e) {
        }
    }

    @Override
    public List<Product> getList() throws Exception {
        return rawProduct.getList();
    }

}
