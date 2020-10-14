<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="utf-8"/>
    <title>万和橱柜</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/index.css"/>
</head>
<body>
<%@ include file="header.jsp" %>

<div class="block_home_slider">
    <div id="home_slider" class="flexslider">
        <ul class="slides">
            <li>
                <div class="slide"><img src="img/1.jpg"/></div>
            </li>
            <li>
                <div class="slide"><img src="img/2.jpg"/></div>
            </li>
        </ul>
    </div>
</div>
<div class="thImg">
    <div class="clearfix"><a href="selectproductlist?fid=1"><img src="img/5.jpg"/></a><a href="selectproductlist?fid=2"><img
            src="img/4.jpg"/></a><a href="selectproductlist?fid=3"><img src="img/3.jpg"/></a></div>
</div>

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
<script src="js/jquery.flexslider-min.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">$(function () {
    $('#home_slider').flexslider({
        animation: 'slide',
        controlNav: true,
        directionNav: true,
        animationLoop: true,
        slideshow: true,
        slideshowSpeed: 2000,
        useCSS: false
    });
});</script>
</body>
</html>