<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>AdminLTE 2 | Starter</title>
 <%@include file="../include/css.jsp"%>
</head>
<!--
BODY TAG OPTIONS:
=================
Apply one or more of the following classes to get the
desired effect
|---------------------------------------------------------|
| SKINS         | skin-blue                               |
|               | skin-black                              |
|               | skin-purple                             |
|               | skin-yellow                             |
|               | skin-red                                |
|               | skin-green                              |
|---------------------------------------------------------|
|LAYOUT OPTIONS | fixed                                   |
|               | layout-boxed                            |
|               | layout-top-nav                          |
|               | sidebar-collapse                        |
|               | sidebar-mini                            |
|---------------------------------------------------------|
-->
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <!-- Main Header -->
 <%@include file="../include/navhead.jsp"%>
  <!-- Left side column. contains the logo and sidebar -->
  <%@include file="../include/sider.jsp"%>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Page Header
        <small>Optional description</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
        <li class="active">Here</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content container-fluid">

      <!--------------------------
        | Your Page Content Here |
        -------------------------->
 <div class="row">
        <div class="col-xs-12">
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">秒杀商品列表</h3>

              <div class="box-tools">
               <button  type="button" class="btn btn-block btn-default" onclick="location='toApplyMsProduct'">申请秒杀商品</button>
              </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body table-responsive no-padding">
              <table class="table table-hover">
                <tbody>
                	<tr>
		                    <th>商品id</th>
							<th>商品标题</th>
							<th>图片地址</th>
							<th>秒杀价格</th>
							<th>商家id</th>
							<th>秒杀原价</th>
							<th>申请时间</th>
							<th>状态</th>
							<th>秒杀开始时间</th>
							<th>秒杀结束时间</th>
							<th>秒杀商品数</th>
							<th>库存</th>
							<th>商品描述</th>
							<th>操作</th>
                	</tr>
               <c:forEach items="${listMsProduct}" var="item">
                <tr>
	                    <th>${item.productId }</th>
						<th>${item.productTitle }</th>
						<th>${item.productPic }</th>
						<th>${item.miaoshaPrice }</th>
						<th>${item.merchant }</th>
						<th>${item.productOgPrice }</th>
						<th>${item.applayDate }</th>
						<th>${item.aidotStatus }</th>
						<th>${item.startTime }</th>
						<th>${item.endTime }</th>
						<th>${item.productCount }</th>
						<th>${item.stockCount }</th>
						<th>${item.description }</th>
						<th>
							<a href="toUpdateMsProduct?id=${item.id}">修改</a>||
							<a href="deletemsproductByid?id=${item.id}">删除</a>||
							<a href="queryMsProductByid?id=${item.id}">查看</a>||
							<a href="toupdatemsproductstate?id=${item.id}">审核</a>||
							<a href="${pageContext.request.contextPath }/msProductDetailAction/toInsertMsProductDetail?productId=${item.productId}&&merchant=${item.merchant}">添加商品详情</a>||
							<a href="${pageContext.request.contextPath }/msProductDetailAction/queryMsProductdetailByid?productId=${item.productId}">查看商品详情</a>||
							<a href="${pageContext.request.contextPath }/msProductDetailAction/toUpdateMsProductDetail?productId=${item.productId}">修改商品详情</a></th>
						</th> 
                </tr>
                </c:forEach>
              </tbody></table>
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
        </div>
      </div>
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <!-- Main Footer -->
  <%@include file="../include/footer.jsp"%>

</div>
<!-- ./wrapper -->

<!-- REQUIRED JS SCRIPTS -->
 <%@include file="../include/js.jsp"%>


<!-- Optionally, you can add Slimscroll and FastClick plugins.
     Both of these plugins are recommended to enhance the
     user experience. -->
</body>
</html>






