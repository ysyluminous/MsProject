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
		<div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Quick Example</h3>
            </div>
            <!-- /.box-header -->
            <!-- form start -->
            <form role="form"   action="/orderAction/payOrder" method="post">
              <div class="box-body">
              
				
				<input type="hidden" name="productId" value="${msProductInfo.id}">
				<input type="hidden" name="userId" value="${msUserId}">
				<input type="hidden" name="merchantId" value="${msProductInfo.merchant}">
				<input type="hidden" name="payAmount" value="${payAmount}">
				<input type="hidden" name="num" value="${num}">
				<input type="hidden" name="stockCount" value="${msProductInfo.stockCount}">
				
              
             	 <div class="form-group">
                  <label>商品名称：</label>
                  <input type="text" class="form-control" name="productTitle" placeholder="${msProductInfo.productTitle}" disabled="">
                </div>
                 <div class="form-group">
                  <label>购买数量：</label>
                  <input type="text" class="form-control"  name="num" placeholder="${num}" disabled="">
                </div>
                 <div class="form-group">
                  <label>支付总额：</label>
                  <input type="text" class="form-control" name="payAmount"  placeholder="${payAmount}" disabled="">
                </div>
                
                
                <div class="form-group">
                  <label for="exampleInputEmail1">收货人地址:</label>
                  <input type="text" class="form-control" name="receiveAddress"  id="exampleInputEmail1" placeholder="收货人地址:">
                </div>
                <div class="form-group">
                  <label for="exampleInputEmail1">收货人电话:</label>
                  <input type="email" class="form-control" name="receivePhone"   id="exampleInputEmail1" placeholder="收货人电话">
                </div>
                   <div class="form-group">
                  <label for="exampleInputEmail1">收货人名称:</label>
                  <input type="text" class="form-control"  name="receiveName"  id="exampleInputEmail1" placeholder="收货人名称:">
                </div>
                
              </div>
              <!-- /.box-body -->

              <div class="box-footer">
                <button type="submit" class="btn btn-primary" onclick="submit(this)">订单提交</button>
              </div>
            </form>
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
<script type="text/javascript">
function submit(obj){
	obj.parent.sumbit();
}
</script>

<!-- Optionally, you can add Slimscroll and FastClick plugins.
     Both of these plugins are recommended to enhance the
     user experience. -->
</body>
</html>
