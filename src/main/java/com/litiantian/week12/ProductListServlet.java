package com.litiantian.week12;

@@ -1,14 +1,40 @@
        package com.litiantian.controller;

        import comlitiantian..dao.ProductDao;
        import com.litiantian.model.Product;

        import javax.servlet.*;
        import javax.servlet.http.*;
        import javax.servlet.annotation.*;
        import java.io.IOException;
        import java.sql.Connection;
        import java.sql.SQLException;
        import java.util.List;

@WebServlet(name = "ProductListServlet", value = "/admin/productList")
public class ProductListServlet extends HttpServlet {
    private Connection con;
    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        super.init();
        con = (Connection) getServletContext().getAttribute("con");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        try {
            ProductDao productDao = new ProductDao();
            List<Product> all = productDao.findAll(con);
            request.setAttribute("productList", all);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String path = "/WEB-INF/views/admin/productList.jsp";
        request.getRequestDispatcher(path).forward(request,response);
    }