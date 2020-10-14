<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="utf-8"/>
    <title>个人信息</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/mygrxx.css"/>
    <script src="js/calendar.js" ></script>
</head>
<body><!------------------------------head------------------------------>
    <div class="head ding">
    <div class="wrapper clearfix">
        <div class="clearfix" id="top"><h1 class="fl"><img width="60" height="60" src="img/logo.jpg"/></h1>
          	 
        </div>
        
    </div>
</div><!------------------------------idea------------------------------>
<div class="address mt" id="add">
    <div class="wrapper clearfix"><a href="indexselect" class="fl">首页</a><span>/</span><a href="mygxin.jsp" class="on">个人中心</a>
</div>
</div><!------------------------------Bott------------------------------>
<div class="Bott">
    <div class="wrapper clearfix">
        <div class="zuo fl">
            <h3><img width="60" height="60" src="img/logo.jpg"/>
                <p class="clearfix"><div >${name.USER_NAME }</div><a href="logout"><span>[退出登录]</span></a></p></h3>
            <div>
                <ul>
                    <li><a href="showcart">我的购物车</a></li>
                    <li><a href="mygrxx.jsp">我的信息</a></li>
                    
                </ul>
            </div>
        </div>
        <div class="you fl">
            <div class="gxin">
                
                <div class="xx"><h3 class="clearfix"><a href="#" class="fr" id="edit1">修改你的信息及密码</a>
                </h3>
                	<div >用户名：${name.USER_NAME }</div>
                    <div>性别：${name.USER_SEX=='T'?'男':'女'}</div>
              		<div>出生日期：${name.USER_BIRTHDAY }</div>
                	<div>电话：${name.USER_MOBILE }</div>
                	<div>地址：${name.USER_ADDRESS }</div>
                	<div >绑定邮箱：${name.USER_EMAIL }</div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="mask"></div>
<div class="bj">
    <div class="clearfix"><a href="mygrxx.jsp" class="fr gb"><img src="img/6.jpg"/></a></div>
    <h3>修改信息</h3>
    <form action="grxxdoupdate" method="post">
    <input type="hidden" name="userStatus" value="${name.USER_STATUS}">
   		<p>用户名：<input type="text" id="title" name="userName" value="${name.USER_ID }" readonly="readonly"/></p>
    	<p>姓名：<input type="text" id="title" name="name" value="${name.USER_NAME }"/></p>
    	<p>密码：<input id="title" name="passWord" size="50" value="${name.USER_PASSWORD}" type="text"></p>
    	
        <p>生日：<input type="text"  name="birthday" onfocus="c.show(this)" value="${name.USER_BIRTHDAY }"></p>
        <p>电话：<input type="text" id="title" name="mobile" value="${name.USER_MOBILE }"></p>
        <p>地址：<input type="text" id="title" name="address" value="${name.USER_ADDRESS }"></p>
        <p>绑定邮箱：<input type="text" id="title" name="email"  value="${name.USER_EMAIL }"></p>
        <label>性别:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input   type="radio" name="sex" value="T" ${name.USER_SEX=='T'?"checked":""}>男&nbsp;&nbsp;&nbsp;
        <input  type="radio" name="sex" value="F" ${name.USER_SEX=='F'?"checked":""}>女
                            
                       
                         
        <div class="bc"><input type="submit" value="保存"/><input  onClick="history.go(-1)" type="button" value="返回"/></div>
    </form>
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
<script src="js/user.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>