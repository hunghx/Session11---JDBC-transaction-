package ra.academy.service;

import ra.academy.model.Product;
import ra.academy.util.ConnectDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class ProductService {
    public void createProduct(Product p){
        Connection conn = ConnectDB.getConnection();
        try {
            conn.setAutoCommit(false);
            // cập nhật số lượng
            CallableStatement call2 = conn.prepareCall("{call proc_update_product_count(?)}");
            call2.setInt(1,p.getCatalogId());
            call2.executeUpdate();

            // thêm mới
            CallableStatement call1 = conn.prepareCall("{call proc_insert_product(?,?,?,?,?,?)}");
            call1.setString(1,p.getName());
            call1.setString(2,p.getDescription());
            call1.setDouble(3,p.getPrice());
            call1.setInt(4,p.getStock());
            call1.setInt(5,p.getCatalogId());
            call1.registerOutParameter(6, Types.INTEGER);
            call1.executeUpdate();
            int idNew = call1.getInt(6);
            System.out.println(idNew);
            conn.commit();
        } catch (SQLException e) {
           e.printStackTrace();
        }finally {
            ConnectDB.closeConnection(conn);
        }

    }
}
