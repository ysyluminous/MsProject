<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>秒杀首页</title>
<meta name="description" content="">
<meta name="keywords" content="">
<link href="" rel="stylesheet">
<!-- <script type="text/javascript" src="bower_components/jquery/dist/jquery.min.js"></script>
<script type="text/javascript" src="dist/js/adminlte.min.js"></script>
<script type="text/javascript" src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script> -->
 <%@include file="include/css.jsp"%>
<link rel="stylesheet" type="text/css" href="dist/css/AdminLTE.min.css">
<link rel="stylesheet" type="text/css" href="bower_components/bootstrap/dist/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="bower_components/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="bower_components/Ionicons/css/ionicons.min.css">
<link rel="stylesheet" type="text/css" href="dist/css/skins/skin-blue.min.css">
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <!-- Main Header -->
  <%@include file="include/navhead.jsp"%>
  <!-- Left side column. contains the logo and sidebar -->
  <%@include file="include/sider.jsp"%>

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
        
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <!-- Main Footer -->
 <%@include file="include/footer.jsp"%>

  <!-- Control Sidebar -->

  <!-- /.control-sidebar -->
  <!-- Add the sidebar's background. This div must be placed
  immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>
</div>
</body>
</html>