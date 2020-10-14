<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="admin_menu.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <div class="main-wrap">
        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="admin_index.jsp">首页</a><span class="crumb-step">&gt;</span><a class="crumb-name" href="admin_productselect">橱柜管理</a><span class="crumb-step">&gt;</span><span>修改橱柜</span></div>
        </div>
        <div class="result-wrap">
            <div class="result-content">
                <form action="/WanhecuguiShop/manage/admin_doproductupdate" method="post"  id="myform" name="myform">
                    <table class="insert-tab" width="100%">
                        <tbody>
                         <tr>
                            <th><i class="require-red">*</i>橱柜ID：</th>
                            <td>
                                <input class="common-text required" id="title" name="productId" size="50" value="${p.PRODUCT_ID}" type="text" readonly="readonly">
                            </td>
                        </tr>
                        
                         <tr>
                            <th><i class="require-red">*</i>橱柜名称：</th>
                            <td>
                                <input class="common-text required" id="title" name="productName" size="50" value="${p.PRODUCT_NAME}" type="text">
                            </td>
                        </tr>
                                      
                        
                         <tr>
                            <th><i class="require-red">*</i>橱柜价格：</th>
                            <td>
                                <input class="common-text required" id="title" name="productPrice" size="50" value="${p.PRODUCT_PRICE}" type="text">
                            </td>
                        </tr>
                         <tr>
                            <th><i class="require-red">*</i>橱柜介绍：</th>
                            <td>
                                <input class="common-text required" id="title" name="productDesc" size="50" value="${p.PRODUCT_DESCRIPTION}" type="text">
                            </td>
                        </tr>
                         <tr>
                            <th><i class="require-red">*</i>橱柜库存：</th>
                            <td>
                                <input class="common-text required" id="title" name="productStock" size="50" value="${p.PRODUCT_STOCK}" type="text">
                            </td>
                        </tr>
                    

                        
                        <tr>
                            <th></th>
                            <td>
                                <input class="btn btn-primary btn6 mr10" value="提交" type="submit">
                                <input class="btn btn6" onClick="history.go(-1)" value="返回" type="button">
                            </td>
                        </tr>
                        </tbody></table>
                </form>
            </div>
        </div>

    </div>
      <!--/main-->
</div>
</body>
</html>