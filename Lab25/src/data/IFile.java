/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package data;

import business.entity.Product;
import java.io.File;
import java.util.List;

/**
 *
 * @author lyhai
 */
public interface IFile {
    File createNewFile() throws Exception;
    List<String> readDateFromFile() throws Exception;

}
