<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="admin_menu.jsp"%>
    <div class="main-wrap">

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="admin_index.jsp">首页</a><span class="crumb-step">&gt;</span><span class="crumb-name">橱柜管理</span></div>
        </div>
        
        <div id="register" class="result-wrap">
            <form action="/WanhecuguiShop/manage/admin_douserdel" id="myform" method="post">
                <div class="result-title">
                    <div class="result-list">
                        <a href="/WanhecuguiShop/manage/admin_toproductadd"><i class="icon-font"></i>新增橱柜</a>
                    </div>
                </div>
                <div class="result-content">
                    <table class="result-tab" width="60%">
                        <tr>
                            <th>ID</th>
                            <th>橱柜名称</th>
                            <th>操作</th>
                        </tr>
                        
                        <c:forEach var="p" items="${plist}">
                        	<tr>
                        		<td>${p.PRODUCT_ID}</td>
                        		<td><img src="../images/product/${p.PRODUCT_FILENAME}" width="80" height="80">
                        			${p.PRODUCT_NAME}
                        		</td>
                        		<td>
                        			<a href="admin_toproductupdate?id=${p.PRODUCT_ID}">修改</a>
                        			<a href="javascript:productdel(${p.PRODUCT_ID})">&nbsp;&nbsp;&nbsp;&nbsp;删除</a>
                        		</td>
                        	</tr>
                        </c:forEach>
                       
                       <script>
                       		function productdel(id){
                       			if(confirm("你确定要删除这个橱柜吗？")){
                       				location.href="admin_doproductdel?id="+id;
								}
                       		}
                       		
                       </script>
                    </table>
                </div>
            </form>
        </div>
    </div>
    <!--/main-->
</div>
</body>
</html>