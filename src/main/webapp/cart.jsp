<%--
  Created by IntelliJ IDEA.
  User: 16683
  Date: 2022/5/28
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
@@ -37,32 +37,34 @@
</td></tr></c:when>
<c:otherwise>
    <!-- loop_start -->


    <c:set var="cal" value="0.0" />
    <c:forEach var="c" items="${cart}">
        <tr>
            <td class="cart_product">
                <a href="productDetails?productId=productId "><img src="getImg?id=productId" alt="" style="height: 150px; width: 150px"></a>
                <a href="productDetails?productId=${c.product.productId} "><img src="getImg?id=${c.product.productId}" alt="" style="height: 150px; width: 150px"></a>
            </td>
            <td class="cart_description">
                <h4><a href="">product Name </a></h4>
                <p>Web ID: product Id </p>
                <h4><a href="">${c.product.productName}</a></h4>
                <p>Web ID: ${c.product.productId} </p>
            </td>
            <td class="cart_price">
                <p>price</p>
                <p>${c.product.price}</p>
            </td>
            <td class="cart_price">
                <p>quantity</p>
                <p>${c.quantity}</p>

            </td>
            <td class="cart_total">

                <p id="total" class="cart_total_price">cal total</p>
                <p id="total" class="cart_total_price">${c.quantity*c.product.price}</p>
            </td>
            <td class="cart_delete">
                <a class="cart_quantity_delete" href="<%=basePath%>cart?action=remove&productId=${c.product.productId}"><i class="fa fa-times"></i></a>
            </td>
        </tr>
        cal culate Grand Total
        <c:set var="cal" value="${cal + (c.quantity*c.product.price)}"/>
    </c:forEach>
    <!--loop_end-->
</c:otherwise>
</c:choose>
@@ -71,7 +73,7 @@
</div>
</div>
</section> <!--/#cart_items-->

<c:if test="${!(empty cart)}">
    <section id="do_action">
        <div class="container">

            @@ -80,10 +82,10 @@
            <div class="col-sm-6">
                <div class="total_area">
                    <ul>
                        <li>Cart Sub Total <span>print sub total</span></li>
                        <li>Cart Sub Total <span><c:out value="${cal}"/></span></li>
                        <!--<li>Eco Tax <span>$2</span></li>-->
                        <li>Shipping Cost <span>Free</span></li>
                        <li>Total <span>print total</span></li>
                        <li>Total <span><c:out value="${cal}"/> </span></li>
                    </ul>
                    <a class="btn btn-default update" href="<%=basePath%>shop">Update</a>
                    <a class="btn btn-default check_out" href="<%=basePath%>order">Order</a>
                    @@ -92,7 +94,7 @@
                </div>
            </div>
    </section><!--/#do_action-->

</c:if>


<%@include file="footer.jsp" %>