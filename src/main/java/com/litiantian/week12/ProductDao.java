package com.litiantian.week12;

@@ -8,10 +8,7 @@
        import java.io.ByteArrayInputStream;
        import java.io.InputStream;
        import java.nio.charset.StandardCharsets;
        import java.sql.Connection;
        import java.sql.PreparedStatement;
        import java.sql.ResultSet;
        import java.sql.SQLException;
        import java.sql.*;
        import java.util.ArrayList;
        import java.util.List;

@@ -26,7 +23,7 @@ public int save(Product product, Connection con) throws SQLException {
        if(product.getPicture()!=null) {

        //for mysql
        pt.setBlob(3, product.getPicture());
        pt.setBlob(3, product.getPicture());
        }
        pt.setDouble(4, product.getPrice());
        pt.setInt(5, product.getCategoryId());
@@ -159,4 +156,18 @@ public List<Product> getPicture(Integer productId, Connection con) throws SQLExc
        }
        return productList;
        }
        }

@Override
public byte[] getPictureById(Integer productId, Connection con) throws SQLException {
        byte[] imgByte = null;
        String sql = "select picture from product where productId=?" ;
        PreparedStatement pt = con.prepareStatement(sql);
        pt.setInt(1, productId);
        ResultSet rs = pt.executeQuery();
        while (rs.next()) {
        Blob blob = rs.getBlob("picture");
        imgByte = blob.getBytes(1, (int)blob.length());
        }
        return imgByte;
        }
        }