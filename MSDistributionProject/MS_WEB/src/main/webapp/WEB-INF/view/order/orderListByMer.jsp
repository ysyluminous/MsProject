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
		<div class="col-xs-12">
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">订单列表</h3>

              <div class="box-tools">
                <div class="input-group input-group-sm" style="width: 150px;">
                  <input type="text" name="table_search" class="form-control pull-right" placeholder="Search">

                  <div class="input-group-btn">
                    <button type="submit" class="btn btn-default"><i class="fa fa-search"></i></button>
                  </div>
                </div>
              </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body table-responsive no-padding">
              <table class="table table-hover">
                <tbody><tr>
                    <th>支付金额</th>
					<th>订单生成时间</th>
					<th>支付转态</th>
					<th>收货人地址</th>
					<th>收货人电话</th>
					<th>收货人名称</th>
					<th>交易流水号</th>
					<th>购买数量</th>
					<th>支付类型</th>
					<th>操作</th>
                </tr>
                 <c:forEach items="${orderList}" var="item" >
	                <tr>
	                    <td>${item.payAmount }</td>
						<td>${item.createTime }</td>
						<td>${item.payStatus }</td>
						<td>${item.receiveAddress }</td>
						<td>${item.receivePhone }</td>
						<td>${item.receiveName }</td>
						<td>${item.tradeId }</td>
						<td>${item.num }</td>
						<td>${item.payType }</td>
						<!-- int orderid,int paytype -->
						<td> 
							<c:if test="${item.payStatus == 1 }">
							未支付
							</c:if>
								<c:if test="${item.payStatus == 2 }">支付完成
						 		</c:if> 
							<c:if test="${item.payStatus == 3 }">退款成功</c:if>
							<c:if test="${item.payStatus == 4 }">退款申请中
								<a href="javascript:void" onclick="auditRefund('${pageContext.request.contextPath }',
								'${item.tradeId}','${item.payAmount}','${item.id}','${item.payType}','3')">退款审核通过</a>
								||
								<a href="javascript:void" onclick="auditRefund('${pageContext.request.contextPath }',
								'${item.tradeId}','${item.payAmount}','${item.id}','${item.payType}','5')">退款审核不通过</a>
							</c:if>
							<c:if test="${item.payStatus == 5 }">退款申请不成功</c:if>
						</td>
					</tr>
                </c:forEach>
                
              </tbody></table>
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
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

function  auditRefund(url,tradeId,payAmount,orderId,payType,payStatus){
	window.location.href=url+"/orderAction/auditRefund?tradeId="+tradeId+"&&payAmount="+payAmount+"&&orderId="+orderId+"&&payType="+payType+"&&payStatus="+payStatus;
}
</script>

<!-- Optionally, you can add Slimscroll and FastClick plugins.
     Both of these plugins are recommended to enhance the
     user experience. -->
</body>
</html>
