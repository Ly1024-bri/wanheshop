<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="head">
    <div class="wrapper clearfix">
        <div class="clearfix" id="top"><a><img style="width: 80px;height: 80px" src="img/logo.jpg"/></a><h1 class="fl"></h1>
            <div class="fr clearfix" id="top1"><p class="fl">
            	<c:if test="${isLogin !=1 }">
            		<a href="login.jsp" id="login">登录</a><a href="reg.jsp" id="reg">注册</a>
            	
            	</c:if>
            	
            	<c:if test="${isLogin ==1 }">
            		<b>你好：</b><a href="mygxin.jsp" id="login">${name.USER_NAME }</a>
            	
            	</c:if>
            	
            	<c:if test="${isAdminLogin ==1 }">
            		<a href="manage/admin_index.jsp" id="login1">进入后台</a>
            	
            	</c:if>
            </p>
               
                <div class="btn fl clearfix">
                        <c:if test="${isLogin ==1 }">
                       	 	<a href="mygxin.jsp"><img src="img/grzx.jpg"/></a>
                        	<a href="showcart"><img src="img/gwc.jpg"/></a>
                        </c:if>
                </div>
            </div>
        </div>
        <ul class="clearfix" id="bott">
            <li><a href="indexselect">首页</a></li>
          		<c:forEach var="f" items="${flist}">
            		<li><a href="selectproductlist?fid=${f.CATE_ID}">${f.CATE_NAME}</a>
                		<div class="sList2">
                    		<div class="clearfix">
                    			<c:forEach var="c" items="${clist}">
                    				<c:if test="${f.CATE_ID == c.CATE_PARENT_ID}">
                    					<a href="selectproductlist?cid=${c.CATE_ID}">${c.CATE_NAME}</a>
                    				</c:if>
                				</c:forEach>
                			</div>
                		</div>
            		</li>
            	</c:forEach>
        </ul>
    </div>
</div>