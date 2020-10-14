<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="utf-8"/>
    <title>结算界面</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/proList.css"/>
    <link rel="stylesheet" type="text/css" href="css/mygxin.css"/>
</head>

<div class="head ding">
    <div class="wrapper clearfix">
        <div class="clearfix" id="top"><h1 class="fl"><a><img style="width: 60px;height: 60px" src="img/logo.jpg"/></a></h1>
               
        </div>
    </div>
        <ul class="clearfix" id="bott">
            <li><a href="indexselect">首页</a></li>
          		
        </ul>
</div>
<div class="order cart mt">
    <div class="site"><p class="wrapper clearfix"><span class="fl">订单确认</span><img class="top"  src="img/temp/cartTop02.png"></p>
    </div>
    <div class="orderCon wrapper clearfix">
        <div class="orderL fl"><h3>收件信息</h3>
            
            <div class="addres clearfix">
                <div class="addre fl on">
                    <div class="tit clearfix"><p class="fl">${name.USER_NAME} <span class="default">[默认地址]</span></p>
                        </div>
                    <div class="addCon"><p>${name.USER_ADDRESS }</p>
                        <p>${name.USER_MOBILE }</p></div>
                </div>
                
            </div>
            <h3>支付方式</h3>
            <div class="way clearfix"><img class="on" src="img/temp/way01.jpg"><img src="img/temp/way02.jpg"><img
                    src="img/temp/way03.jpg"><img src="img/temp/way04.jpg"></div>
            <h3>选择快递</h3>
            <div class="dis clearfix"><span class="on">顺风快递</span><span>百世汇通</span><span>圆通快递</span><span>中通快递</span>
            </div>
        </div>
        <div class="orderR fr">
            <div class="msg"><h3>订单内容<a href="showcart" class="fr">返回购物车</a></h3>
              
              <c:forEach var="rs" items="${requestScope.shoplist }">
              
                <ul class="clearfix">
                    <li class="fl"><img width="100" height="100" src="images/product/${rs.cart_p_filename }"></li>
                    <li class="fl"><p>${rs.cart_p_name }</p>
                        <p>颜色分类：黑色</p>
                        <p>数量：${rs.cart_quantity}</p></li>
                    <li class="fr">￥${rs.cart_p_price * rs.cart_quantity}.00</li>
                </ul>
                
                </c:forEach>
           
            </div>
            <div class="tips"><p><span class="fl">商品金额：</span><span class="fr">￥${totalprice}.00</span></p>
                <p><span class="fl">优惠金额：</span><span class="fr">￥0.00</span></p>
                <p><span class="fl">运费：</span><span class="fr">免运费</span></p></div>
            <div class="count tips"><p><span class="fl">合计：</span><span class="fr">￥${totalprice}.00</span></p></div>
             <a href="ok.jsp" class="pay">去支付</a></div>
    </div>
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
<script src="js/pro.js" type="text/javascript" charset="utf-8"></script>
<script src="js/user.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>