<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="utf-8"/>
    <title>${title}</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/proList.css"/>
</head>
<body>

<%@ include file="header.jsp" %>

<div class="banner"><a ><img src="img/1.jpg"/></a></div>
<!-----------------address------------------------------->
<div class="address">
    <div class="wrapper clearfix"><a href="indexselect">首页</a><span>/</span><a>万和橱柜</a><span>/</span><a href="#" class="on">${title}</a></div>
</div><!-------------------current---------------------->

<ul class="proList wrapper clearfix">
    
    <c:forEach var="p" items="${list}">

    	<li><a href="selectproductview?id=${p.PRODUCT_ID}">
        		<dl>
           			<dt><img src="images/product/${p.PRODUCT_FILENAME}"></dt>
            			<dd>【万和橱柜】${p.PRODUCT_NAME}</dd>
            		<dd><br>￥${p.PRODUCT_PRICE}.00</dd>
        		</dl>
    		</a>
    	</li>
    	
    </c:forEach>
    
</ul>
<div class="gotop"><a href="showcart">
    <dl>
        <dt><img src="img/gt1.jpg"/></dt>
        <dd>去购<br/>物车</dd>
    </dl>
</a><a href="#" class="dh">
    <dl>
        <dt><img src="img/gt2.jpg"/></dt>
        <dd>联系<br/>客服</dd>
    </dl>
</a><a href="mygxin.jsp">
    <dl>
        <dt><img src="img/gt3.jpg"/></dt>
        <dd>个人<br/>中心</dd>
    </dl>
</a>
</a><a href="#" class="toptop" style="display: none">
    <dl>
        <dt><img src="img/gt4.jpg"/></dt>
        <dd>返回<br/>顶部</dd>
    </dl>
</a>
    <p>18011129776</p></div>
<div class="footer">
    <div class="top">
        <div class="wrapper">
            <div class="clearfix"><a  class="fl"><img src="img/foot1.png"/></a><span class="fl">7天无理由退货</span>
            </div>
            <div class="clearfix"><a  class="fl"><img src="img/foot2.png"/></a><span class="fl">15天免费换货</span>
            </div>
            <div class="clearfix"><a  class="fl"><img src="img/foot3.png"/></a><span class="fl">包邮</span>
            </div>
            <div class="clearfix"><a  class="fl"><img src="img/foot4.png"/></a><span class="fl">优质服务</span>
            </div>
        </div>
    </div>
   
    <p class="dibu">万和橱柜 <br/>
       联系电话：18011129776</p>
</div>
<script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
<script src="js/nav.js" type="text/javascript" charset="utf-8"></script>
<script src="js/pro.js" type="text/javascript" charset="utf-8"></script>
<script src="js/cart.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>