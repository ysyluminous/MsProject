<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html>
<head>
 
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
<form action="updateMsProductState" method="post">
<input name="id" value="${msProductInfo.id }" type="hidden">
	商品id:${msProductInfo.productId }"</br>
	商家id:${msProductInfo.merchant }"</br>
	商品标题:${msProductInfo.productTitle }</br>
	商品图片地址:${msProductInfo.productPic }</br>
	秒杀价格:${msProductInfo.miaoshaPrice }</br>
	商品原价:${msProductInfo.productOgPrice }</br>
	秒杀开始时间:${starttimestring }</br>
	秒杀结束时间:${endtimestring}</br>
	秒杀商品数量:${msProductInfo.productCount }</br>
	库存:${msProductInfo.stockCount }</br>
	描述:${msProductInfo.description }</br>
	审核通过:<input type="radio" name="state" value="2">
	审核不通过:<input type="radio" name="state" value="3">
	<input type="button" value="提交" onclick="submit(this)">
</form>

<script type="text/javascript">
	function submit(obj){
		obj.parent.sumbit();
	}
</script>
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
