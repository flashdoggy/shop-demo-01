<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js?<fmt:formatDate value='${now}' pattern='yyyy-MM-dd HH:mm:ss' />"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js?<fmt:formatDate value='${now}' pattern='yyyy-MM-dd HH:mm:ss' />"></script>
<![endif]-->
<!-- jQuery 3 -->
<script src="/static/assets/bower_components/jquery/dist/jquery.min.js<fmt:formatDate value='${now}' pattern='yyyy-MM-dd HH:mm:ss' />"></script>
<!-- jQuery UI 1.11.4 -->
<script src="/static/assets/bower_components/jquery-ui/jquery-ui.min.js<fmt:formatDate value='${now}' pattern='yyyy-MM-dd HH:mm:ss' />"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<!-- Bootstrap 3.3.7 -->
<script src="/static/assets/bower_components/bootstrap/dist/js/bootstrap.min.js<fmt:formatDate value='${now}' pattern='yyyy-MM-dd HH:mm:ss' />"></script>
<!-- Slimscroll -->
<script src="/static/assets/bower_components/jquery-slimscroll/jquery.slimscroll.min.js<fmt:formatDate value='${now}' pattern='yyyy-MM-dd HH:mm:ss' />"></script>
<!-- FastClick -->
<script src="/static/assets/bower_components/fastclick/lib/fastclick.js<fmt:formatDate value='${now}' pattern='yyyy-MM-dd HH:mm:ss' />"></script>
<!-- AdminLTE App -->
<script src="/static/assets/js/adminlte.min.js<fmt:formatDate value='${now}' pattern='yyyy-MM-dd HH:mm:ss' />"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="/static/assets/js/pages/dashboard.js<fmt:formatDate value='${now}' pattern='yyyy-MM-dd HH:mm:ss' />"></script>

<jsp:include page="dynamic-frame.jsp" />