package com.litiantian.week12;

@@ -1,6 +1,7 @@
        package com.litiantian.dao;

        import com.litiantian.model.Category;
        import com.sun.istack.internal.NotNull;

        import java.sql.Connection;
        import java.sql.SQLException;
@@ -9,6 +10,7 @@
public interface IcategoryDao {

    public List<Category> findAllCategory(Connection con) throws SQLException;

    public String findByCategoryId(Connection con, int categoryId) throws SQLException;

}
