<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 顶部导航栏部分 -->
<header class="main-header">

    <!-- Logo -->
    <a href="index2.html" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>秒杀</b>系统</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>秒杀</b>系统</span>
    </a>

    <!-- Header Navbar -->
    <nav class="navbar navbar-static-top" role="navigation">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>
      <!-- Navbar Right Menu -->
     <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <!-- Messages: style can be found in dropdown.less-->
       <%--    <li class="dropdown messages-menu">
            <!-- Menu toggle button -->
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-envelope-o"></i>
              <span class="label label-success">4</span>
            </a>
            <ul class="dropdown-menu">
              <li class="header">You have 4 messages</li>
              <li>
                <!-- inner menu: contains the messages -->
                <ul class="menu">
                  <li><!-- start message -->
                    <a href="#">
                      <div class="pull-left">
                        <!-- User Image -->
                        <img src="${pageContext.request.contextPath }/static/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
                      </div>
                      <!-- Message title and timestamp -->
                      <h4>
                        Support Team
                        <small><i class="fa fa-clock-o"></i> 5 mins</small>
                      </h4>
                      <!-- The message -->
                      <p>Why not buy a new awesome theme?</p>
                    </a>
                  </li>
                  <!-- end message -->
                </ul>
                <!-- /.menu -->
              </li>
              <li class="footer"><a href="#">See All Messages</a></li>
            </ul>
          </li>
          <!-- /.messages-menu -->

          <!-- Notifications Menu -->
          <li class="dropdown notifications-menu">
            <!-- Menu toggle button -->
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-bell-o"></i>
              <span class="label label-warning">10</span>
            </a>
            <ul class="dropdown-menu">
              <li class="header">You have 10 notifications</li>
              <li>
                <!-- Inner Menu: contains the notifications -->
                <ul class="menu">
                  <li><!-- start notification -->
                    <a href="#">
                      <i class="fa fa-users text-aqua"></i> 5 new members joined today
                    </a>
                  </li>
                  <!-- end notification -->
                </ul>
              </li>
              <li class="footer"><a href="#">View all</a></li>
            </ul>
          </li>
          <!-- Tasks Menu -->
          <li class="dropdown tasks-menu">
            <!-- Menu Toggle Button -->
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-flag-o"></i>
              <span class="label label-danger">9</span>
            </a>
            <ul class="dropdown-menu">
              <li class="header">You have 9 tasks</li>
              <li>
                <!-- Inner menu: contains the tasks -->
                <ul class="menu">
                  <li><!-- Task item -->
                    <a href="#">
                      <!-- Task title and progress text -->
                      <h3>
                        Design some buttons
                        <small class="pull-right">20%</small>
                      </h3>
                      <!-- The progress bar -->
                      <div class="progress xs">
                        <!-- Change the css width attribute to simulate progress -->
                        <div class="progress-bar progress-bar-aqua" style="width: 20%" role="progressbar"
                             aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                          <span class="sr-only">20% Complete</span>
                        </div>
                      </div>
                    </a>
                  </li>
                  <!-- end task item -->
                </ul>
              </li>
              <li class="footer">
                <a href="#">View all tasks</a>
              </li>
            </ul>
          </li> --%>
          <!-- User Account Menu -->
          <li class="dropdown user user-menu">
            <!-- Menu Toggle Button -->
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <!-- The user image in the navbar-->
              <img src="${pageContext.request.contextPath }/static/dist/img/user2-160x160.jpg" class="user-image" alt="User Image">
              <!-- hidden-xs hides the username on small devices so only the image appears. -->
              <span class="hidden-xs">
              
              <c:choose>
                 <c:when test="${onLine.status == '1'}">
                	 	 <!-- 如果为1 则 用户登陆， 显示用户退出 -->
				 	  欢迎您${onLine.msUser.userName}
                	</c:when>
                	<c:when test="${onLine.status == '2'}">
                	 	 <!-- 如果为2 则 商户登陆， 显示商户退出 -->
				 	  店铺名:${onLine.msMerchant.merchantShopName}
                	</c:when>
                	<c:otherwise>
                	  请登录
               	 </c:otherwise>
				</c:choose> 
              </span>
            </a>
            <ul class="dropdown-menu">
              <!-- The user image in the menu -->
              <li class="user-header">
                <img src="${pageContext.request.contextPath }/static/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">

                <p>
	                <c:choose>
					    <c:when test="${onLine == null || onLine==''}">
					        <!-- 顶部未登录 -->
					        请登录
					    </c:when>
					    <c:otherwise>
					        <!-- 顶部已登录 -->
					        ${onLine.msUser.userName }
					    </c:otherwise>
					</c:choose>
                  <small> --</small>
                </p>
              </li>
              <!-- Menu Body -->
	            <!--   <li class="user-body">
	                 <div class="row">
	                  <div class="col-xs-4 text-center">
	                    <a href="#">Followers</a>
	                  </div>
	                  <div class="col-xs-4 text-center">
	                    <a href="#">Sales</a>
	                  </div>
	                  <div class="col-xs-4 text-center">
	                    <a href="#">Friends</a>
	                  </div>
	                </div>
	                /.row
	              </li> -->
              <!-- Menu Footer-->
              
              <!-- 用户和商家都没登陆 -->
              
             <!-- 如果为空  表示没有登陆
             	显示 用户和商户的 注册和登陆
               -->
               
                
                <c:choose>
                 <c:when test="${onLine.status == '1'}">
               	 	 <!-- 如果为1 则 用户登陆， 显示用户退出，和订单 -->
				 	 <li class="user-footer">
						 	 <div class="pull-left">
						         <a href="${pageContext.request.contextPath }/orderAction/queryOrderByUserId" 
						         class="btn btn-default btn-flat">我的订单</a>
				            </div>
				            <div class="pull-right">
				                <a href="${pageContext.request.contextPath }/userRegAndLogAction/signOut" class="btn btn-default btn-flat">用户退出</a>
				            </div>
				        </li>
                	</c:when>
                	<c:when test="${onLine.status == '2'}">
                	 	 <!-- 如果为2 则 商户登陆， 显示商户退出 -->
				 	 <li class="user-footer">
					 			 <div class="pull-left">
					                <a href="${pageContext.request.contextPath }/orderAction/orderListByMerId" class="btn btn-default btn-flat">商家订单</a>
					            </div>
				            <div class="pull-right">
				                <a href="${pageContext.request.contextPath }/userRegAndLogAction/signOut" class="btn btn-default btn-flat">商户退出</a>
				            </div>
				        </li>
                	</c:when>
                	<c:otherwise>
                	 <li class="user-footer">
				          <!-- 用户未登录 -->
				            <div class="pull-left">
				                <a href="${pageContext.request.contextPath }/userRegAndLogAction/toLogin" class="btn btn-default btn-flat">用户登录</a>
				            </div>
				            <div class="pull-right">
				                <a href="${pageContext.request.contextPath }/userRegAndLogAction/toRegiter" class="btn btn-default btn-flat">用户注册</a>
				            </div>
				        </li>
				        
				        <li class="user-footer">
				            <!-- 商户未登录 -->
				            <div class="pull-left">
				                <a href="${pageContext.request.contextPath }/merchantRegAndLogAction/toLogin" class="btn btn-default btn-flat">商户登录</a>
				            </div>
				            <div class="pull-right">
				                <a href="${pageContext.request.contextPath }/merchantRegAndLogAction/toRegiter" class="btn btn-default btn-flat">商户注册</a>
				            </div>
				        </li>
               	 </c:otherwise>
				</c:choose> 
				
              
            </ul>
          </li>
          
        </ul>
      </div> 
    </nav>
  </header>