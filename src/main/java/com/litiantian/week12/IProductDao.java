package com.litiantian.week12;

package com.litiantian.dao;

import com.litiantian.model.Product;
import com.litiantian.week4.ConfigDemoServlet;

import java.io.InputStream;
import java.sql.Connection;
@@ -18,5 +19,5 @@ public interface IProductDao {
    public List<Product> findAll(Connection con) throws SQLException;
    public List<Product> findByProductName(String productName, Connection con) throws SQLException;
    public List<Product> getPicture(Integer productId, Connection con) throws SQLException;

}
    public byte[] getPictureById(Integer productId, Connection con) throws  SQLException;
}