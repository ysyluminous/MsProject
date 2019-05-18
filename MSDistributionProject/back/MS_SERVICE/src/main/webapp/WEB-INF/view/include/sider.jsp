<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 左侧菜单栏 -->
<aside class="main-sidebar">

    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">

      <!-- Sidebar user panel (optional) -->
     

      <!-- Sidebar Menu -->
      <ul class="sidebar-menu" data-widget="tree">
        <li class="header">HEADER</li>
        <!-- Optionally, you can add icons to the links -->
        <!-- <li class="active"><a href="http://www.baidu.com"><i class="fa fa-link"></i> <span>百度</span></a></li>
        <li><a href="#"><i class="fa fa-link"></i> <span>Another Link</span></a></li> -->
        
       <li>
		    <a href="${pageContext.request.contextPath }/adminPageAction/toHome">
		        <i class="fa fa-link">
		        </i>
		        <span>
		       商家系统
		        </span>
		    </a>
		</li>
		 <li>
		    <a href="${pageContext.request.contextPath }/userPageAction/toHome">
		        <i class="fa fa-link">
		        </i>
		        <span>
		          用户系统
		        </span>
		    </a>
		</li>
       <!--  <li class="treeview">
          <a href="#"><i class="fa fa-link"></i> <span>Multilevel</span>
            <span class="pull-right-container">
                <i class="fa fa-angle-left pull-right"></i>
              </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="#">Link in level 2</a></li>
            <li><a href="#">Link in level 2</a></li>
          </ul>
        </li> -->
      </ul>
      <!-- /.sidebar-menu -->
    </section>
    <!-- /.sidebar -->
  </aside>