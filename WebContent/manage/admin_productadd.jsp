<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="admin_menu.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <div class="main-wrap">

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="admin_index.jsp">首页</a><span class="crumb-step">&gt;</span><a class="crumb-name" href="admin_productselect">橱柜管理</a><span class="crumb-step">&gt;</span><span>新增橱柜</span></div>
        </div>
        <div class="result-wrap">
            <div class="result-content">
                <form action="/WanhecuguiShop/manage/admin_doproductadd" method="post" enctype="multipart/form-data" id="myform" name="myform">
                    <table class="insert-tab" width="100%">
                        <tbody>
                         <tr>
                            <th><i class="require-red">*</i>橱柜名称：</th>
                            <td>
                                <input class="common-text required" id="title" name="productName" size="50" value="" type="text">
                            </td>
                        </tr>
                        <tr>
                            <th><i class="require-red">*</i>橱柜分类：</th>
                            <td>
                                <select class="common-text required" name="parentId">
                                		<c:forEach var="f" items="${flist}">
                                			<option value="${f.CATE_ID}" disabled="disabled"> -${f.CATE_NAME}</option>
                                				<c:forEach var="c" items="${clist}">
                                					<c:if test="${c.CATE_PARENT_ID == f.CATE_ID}">
                                						<option value="${f.CATE_ID}-${c.CATE_ID}">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  |-${c.CATE_NAME}</option>
                                					</c:if>
                                				</c:forEach>
                                		</c:forEach>
                                </select>
                            </td>
                        </tr>

                        <tr>
                            <th><i class="require-red">*</i>橱柜图片：</th>
                            <td>
                                <input class="common-text required" id="title" name="photo" size="50" value="" type="file">
                            </td>
                        </tr>
                         <tr>
                            <th><i class="require-red">*</i>橱柜价格：</th>
                            <td>
                                <input class="common-text required" id="title" name="productPrice" size="50" value="" type="text">
                            </td>
                        </tr>
                         <tr>
                            <th><i class="require-red">*</i>橱柜介绍：</th>
                            <td>
                                <input class="common-text required" id="title" name="productDesc" size="50" value="" type="text">
                            </td>
                        </tr>
                         <tr>
                            <th><i class="require-red">*</i>橱柜库存：</th>
                            <td>
                                <input class="common-text required" id="title" name="productStock" size="50" value="" type="text">
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