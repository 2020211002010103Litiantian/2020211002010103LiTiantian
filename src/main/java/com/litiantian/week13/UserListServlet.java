package com.litiantian.week13;


        package com.litiantian.controller;

        import javax.servlet.*;
        import javax.servlet.http.*;
        import javax.servlet.annotation.*;
        import java.io.IOException;
        import java.sql.Connection;

@WebServlet(name = "UserListServlet", value = "/admin/userList")
public class UserListServlet extends HttpServlet {
    private Connection con = null;
    @Override
    public void init() throws ServletException {
        con = (Connection) getServletContext().getAttribute("con");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/admin/userList.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
 42
         src/main/java/com/YangFanou/model/Item.java
@@ -0,0 +1,42 @@
        package com.YangFanou.model;

        import java.io.Serializable;

public class Item implements Serializable {
    private Product product;
    private int quantity;

    public Item() {
        super();
    }

    public Item(Product product, int quantity) {
        super();
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}