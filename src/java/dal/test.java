/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.util.List;
import model.category;

/**
 *
 * @author Phuong78
 */
public class test {
    public static void main(String[] args) {
        DsAdminDAO a = new DsAdminDAO();
        List<category> list = a.getAll();
        System.out.println(list.get(0));
        category b =list.get(0);
        b.setLinkAnhString("aaaaaa");
        a.insert(b);
    }
}
