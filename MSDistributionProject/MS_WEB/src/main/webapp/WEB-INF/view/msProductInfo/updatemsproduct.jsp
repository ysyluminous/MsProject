<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>秒杀首页</title>


 <%@include file="../include/css.jsp"%>

</head>
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
            <form role="form" action="updateMsProduct" method="post">
              <div class="box-body">
               <%-- <div class="form-group">
                  <label for="exampleInputEmail1">商品id:</label>
                  <input type="email" class="form-control"    id="exampleInputEmail1" placeholder="商品id" name="productId" value="${msProductInfo.productId }">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">商品标题</label>
                  <input type="text" class="form-control" id="exampleInputPassword1" placeholder="商品标题" ${msProductInfo.productTitle }>
                </div>
                <div class="form-group">
                  <label for="exampleInputFile">File input</label>
                  <input type="file" id="exampleInputFile">

                  <p class="help-block">Example block-level help text here.</p>
                </div>
                <div class="checkbox">
                  <label>
                    <input type="checkbox"> Check me out
                  </label>
                </div>--%>
                 <input name="id" value="${msProductInfo.id }" type="hidden">
                 商品id:<input name="productId" value="${msProductInfo.productId }"></br>
                 商品标题:<input name="productTitle" value="${msProductInfo.productTitle }"></br>
                 商品图片地址:<input name="productPic" value="${msProductInfo.productPic }"></br>
                 秒杀价格:<input name="miaoshaPrice" value="${msProductInfo.miaoshaPrice }"></br>
                 商品原价:<input name="productOgPrice" value="${msProductInfo.productOgPrice }"></br>
                 秒杀开始时间:<input name="startTimeString" value="${starttimestring }"></br>
                 秒杀结束时间:<input name="endTimeString" value="${endtimestring}"></br>
                 秒杀商品数量:<input name="productCount" value="${msProductInfo.productCount }"></br>
                 库存:<input name="stockCount" value="${msProductInfo.stockCount }"></br>
                 描述:<input name="description" value="${msProductInfo.description }"></br>
              </div>
              <!-- /.box-body -->

              <div class="box-footer">
                <button type="submit" class="btn btn-primary" onclick="submit(this)">Submit</button>
              </div>
            </form>
          </div>
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <!-- Main Footer -->
 <%@include file="../include/footer.jsp"%>
<script type="text/javascript">
	function submit(obj){
		obj.parent.sumbit();
	}
</script>
  <!-- Control Sidebar -->

  <!-- /.control-sidebar -->
  <!-- Add the sidebar's background. This div must be placed
  immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>
</div>
</body>
</html>