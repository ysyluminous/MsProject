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
		<!-- 秒杀商品  -->
<form action="${pageContext.request.contextPath }/orderAction/toPayOrder">
		
		<input type="hidden" name="id" value="${msproduct.id}">
<div class="row">
        <div class="col-xs-12">
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">111</h3>

              <div class="box-tools">
               <!-- <button  type="button" class="btn btn-block btn-default" onclick="location='toApplyMsProduct'">申请秒杀商品</button> -->
              </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body table-responsive no-padding">
              <table class="table table-hover">
                <tbody>
                	<tr>
		                   
							<th>商品标题</th>
							<th>图片地址</th>
							<th>秒杀价格</th>
							<th>秒杀原价</th>
							<th>秒杀开始时间</th>
							<th>秒杀结束时间</th>
							<th>秒杀商品数</th>
							<th>秒杀数量</th>
							<th>库存</th>
							
                	</tr>
             
                <tr>
						<th>${msproduct.productTitle }</th>
						<th>${msproduct.productPic }</th>
						<th>${msproduct.miaoshaPrice }</th>
						<th>${msproduct.productOgPrice }</th>
						<th>${msproduct.startTime }</th>
						<th>${msproduct.endTime }</th>
						<th>？</th>
						<th>${msproduct.productCount }</th>
						<th>${msproduct.stockCount }</th>
                </tr>
             
              </tbody>
              </table>
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
        </div>
      </div>
      <div class="row">
        <div class="col-xs-12">
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">222</h3>

              <div class="box-tools">
               <!-- <button  type="button" class="btn btn-block btn-default" onclick="location='toApplyMsProduct'">申请秒杀商品</button> -->
              </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body table-responsive no-padding">
              <table class="table table-hover">
                <tbody>
                	<tr>
						<th>商品产地</th>
						<th>商品名称</th>
						<th>商品品牌</th>
						<th>商品重量</th>
						<th>规格和包装</th>
						<th>商品详情图片地址</th>
                	</tr>
                <tr>
						<td>${msproductDetail.productPalce}</td>
						<td>${msproductDetail.productName}</td>
						<td>${msproductDetail.brandName}</td>
						<td>${msproductDetail.productWeight}</td>
						<td>${msproductDetail.specification}</td>
						<td>${msproductDetail.imageSrc}</td>
                </tr>
              </tbody>
              </table>
            </div>
            <!-- /.box-body -->
            <div class="box-footer clearfix">
              <div class="input-group input-group-sm" style="width: 250px;">
                  <input type="text" name="num" class="form-control pull-right" placeholder="输入购买数量">

                  <div class="input-group-btn">
                    <button type="submit" class="btn btn-default"><i class="">立即购买</i></button>
                  </div>
                </div>
            </div>
          </div>
          <!-- /.box -->
        </div>
      </div>
 <input type="button" value="立即购买" onclick="submit(this)"/>
</form>
	
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
