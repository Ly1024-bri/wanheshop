<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>详情页</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/proList.css"/>
</head>
<body><!------------------------------head------------------------------>

<%@ include file="header.jsp" %>

<!-----------------address------------------------------->
<div class="address">
    <div class="wrapper clearfix">
    	<a href="indexselect">首页</a><span>/</span>
    	<a href="selectproductlist?cid=${cate.CATE_ID}">${cate.CATE_NAME}</a><span>/</span>
    	<a>${p.PRODUCT_NAME}</a>
    </div>
</div><!-----------------------Detail------------------------------>
<div class="detCon">
    <div class="proDet wrapper">
        <div class="proCon clearfix">
            <div class="proImg fl">
            <img class="det"  src="images/product/${p.PRODUCT_FILENAME}"/>
                <div class="smallImg clearfix">
                <img src="images/product/${p.PRODUCT_FILENAME}" data-src="images/product/${p.PRODUCT_FILENAME}">
                 </div>
            </div>
            <div class="fr intro">
                <div class="title"><h4>【万和橱柜】${p.PRODUCT_NAME}</h4><br><br>
                    <p>【${p.PRODUCT_DESCRIPTION}】</p><br><br>
                    <span>￥${p.PRODUCT_PRICE}.00</span></div>
                <div class="proIntro"><p>颜色分类</p>
                    <div class="smallImg clearfix categ">
                    	
                    	<img style="width:80px;height:80px" src="images/product/${p.PRODUCT_FILENAME}" >
                    </div>
                    <p>数量:&nbsp;&nbsp;库存<span>${p.PRODUCT_STOCK}</span>件</p>
                    <div class="num clearfix">
                    	<img class="fl sub" src="img/temp/sub.jpg">
                    	<span id="count" class="fl" >1</span>
                    	<img class="fl add" src="img/temp/add.jpg">
                        </div>
                </div>
                <div class="btns clearfix">
                	<p class="buy fl"><a href="javascript:shopAdd(${p.PRODUCT_ID },'z')">立即购买</a></p>
                	<p class="cart fr"><a href="javascript:shopAdd(${p.PRODUCT_ID },'s')"> 加入购物车</a></p>
                </div>
            </div>
       </div>
    </div>
</div>
<script>
	function shopAdd(id, url) {
		var count = document.getElementById("count").innerHTML;
		
		location.href='cartadd?id='+id+'&count='+count+'&url='+url;
		
	}

</script>



<div class="introMsg wrapper clearfix">
    <div class="msgL fl">
        <div class="msgTit clearfix"><a class="on">商品详情</a><a>所有评价</a></div>
        <div class="msgAll">
            <div class="msgImgs"><p>${p.PRODUCT_DESCRIPTION}</p><img src="images/product/${p.PRODUCT_FILENAME}"></div>
            <div class="eva">
                <div class="per clearfix"><img class="fl" src="img/temp/per01.jpg">
                    <div class="perR fl"><p>林***</p>
                        <p>不好意思评价晚了，橱柜非常好看，价格实惠，发货快，安装好，全5分</p>
                        <div class="clearfix"></div>
                        <p><span>2020年5月20日08:31</span></p></div>
                </div>
                <div class="per clearfix"><img class="fl" src="img/temp/per02.jpg">
                    <div class="perR fl"><p>胡***</p>
                        <p>大品牌值得信赖 装修非常精致，好评！</p>
                        <p><span>2020年5月28日14:30</span></p></div>
                </div>
                <div class="per clearfix"><img class="fl" src="img/temp/per01.jpg">
                    <div class="perR fl"><p>林***</p>
                        <p>不好意思评价晚了，橱柜非常好看，价格实惠，发货快，安装好，全5分</p>
                        <div class="clearfix"></div>
                        <p><span>2020年5月20日08:31</span></p></div>
                </div>
                <div class="per clearfix"><img class="fl" src="img/temp/per02.jpg">
                    <div class="perR fl"><p>胡***</p>
                       <p>大品牌值得信赖 装修非常精致，好评！</p>
                        <p><span>2020年5月28日14:30</span></p></div>
                </div>
                <div class="per clearfix"><img class="fl" src="img/temp/per01.jpg">
                    <div class="perR fl"><p>林***</p>
                        <p>不好意思评价晚了，橱柜非常好看，价格实惠，发货快，安装好，全5分</p>
                        <div class="clearfix"></div>
                        <p><span>2020年5月20日08:31</span></p></div>
                </div>
                <div class="per clearfix"><img class="fl" src="img/temp/per02.jpg">
                    <div class="perR fl"><p>胡***</p>
                        <p>大品牌值得信赖 装修非常精致，好评！</p>
                        <p><span>2020年5月28日14:30</span></p></div>
                </div>
                <div class="per clearfix"><img class="fl" src="img/temp/per01.jpg">
                    <div class="perR fl"><p>林***</p>
                        <p>不好意思评价晚了，橱柜非常好看，价格实惠，发货快，安装好，全5分</p>
                        <div class="clearfix"></div>
                        <p><span>2020年5月20日08:31</span></p></div>
                </div>
                <div class="per clearfix"><img class="fl" src="img/temp/per02.jpg">
                    <div class="perR fl"><p>胡***</p>
                       <p>大品牌值得信赖 装修非常精致，好评！</p>
                        <p><span>2020年5月28日14:30</span></p></div>
                </div>
                <div class="per clearfix"><img class="fl" src="img/temp/per01.jpg">
                    <div class="perR fl"><p>林***</p>
                        <p>不好意思评价晚了，橱柜非常好看，价格实惠，发货快，安装好，全5分</p>
                        <div class="clearfix"></div>
                        <p><span>2020年5月20日08:31</span></p></div>
                </div>
                <div class="per clearfix"><img class="fl" src="img/temp/per02.jpg">
                    <div class="perR fl"><p>胡***</p>
                        <p>大品牌值得信赖 装修非常精致，好评！</p>
                        <p><span>2020年5月28日14:30</span></p></div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="like"><h4>为你推荐</h4>
    <div class="bottom">
        <div class="hd"><span class="prev"><img src="img/temp/a.jpg"></span><span class="next"><img
                src="img/temp/b.jpg"></span></div>
        <div class="imgCon bd">
            <div class="likeList clearfix">
                <div>
                 <c:forEach var="cp" items="${classlist }">
        	<a href="selectproductview?id=${cp.PRODUCT_ID }">
            	<dl>
                	<dt><img width="180" height="200" src="images/product/${cp.PRODUCT_FILENAME }"></dt>
                	<dd>【万和橱柜】${cp.PRODUCT_NAME }</dd>
                	<dd>￥${cp.PRODUCT_PRICE}.00</dd>
            	</dl>
        	</a>
        		</c:forEach>
        		
               </div>
            </div>
        </div>
    </div>
</div>
<div class="like"><h4>最近访问</h4>
    <div class="bottom">
        <div class="hd"><span class="prev"><img src="img/temp/a.jpg"></span><span class="next"><img
                src="img/temp/b.jpg"></span></div>
        <div class="imgCon bd">
            <div class="likeList clearfix">
                <div>
                 <c:forEach var="lp" items="${lastlylist }">
        			<a href="selectproductview?id=${lp.PRODUCT_ID }">
            			<dl>
                			<dt><img src="images/product/${lp.PRODUCT_FILENAME }"></dt>
                				<dd>【万和橱柜】${lp.PRODUCT_NAME }</dd>
                				<dd>￥${lp.PRODUCT_PRICE}.00</dd>
            				</dl>
        			</a>
        		</c:forEach>
        		
               </div>
            </div>
        </div>
    </div>
</div><!--返回顶部-->
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
<script src="js/jquery.SuperSlide.2.1.1.js" type="text/javascript" charset="utf-8"></script>
<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
<script src="js/nav.js" type="text/javascript" charset="utf-8"></script>
<script src="js/pro.js" type="text/javascript" charset="utf-8"></script>
<script src="js/cart.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">jQuery(".bottom").slide({
    titCell: ".hd ul",
    mainCell: ".bd .likeList",
    autoPage: true,
    autoPlay: false,
    effect: "leftLoop",
    autoPlay: true,
    vis: 1
});</script>
</body>
</html>