<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:useBean id="now" class="java.util.Date" scope="page"/>
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js?${now.time}"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js?${now.time}"></script>
<![endif]-->
<!-- jQuery 3 -->
<script src="/static/assets/bower_components/jquery/dist/jquery.min.js?${now.time}"></script>
<!-- jQuery UI 1.11.4 -->
<script src="/static/assets/bower_components/jquery-ui/jquery-ui.min.js?${now.time}"></script>
<%-- /*! jQuery Validation Plugin - v1.19.1 - 6/15/2019 --%>
<script src="/static/assets/bower_components/jquery-validation-1.19.1/dist/jquery.validate.min.js?${now.time}"></script>
<%-- jQuery Validation Localization --%>
<%--<script src="/static/assets/bower_components/jquery-validation-1.19.1/dist/localization/messages_zh.min.js?${now.time}"></script>--%>
<script src="/static/assets/bower_components/jquery-validation-1.19.1/dist/additional-methods.min.js?${now.time}"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<!-- Bootstrap 3.3.7 -->
<script src="/static/assets/bower_components/bootstrap/dist/js/bootstrap.min.js?${now.time}"></script>
<!-- daterangepicker -->
<script src="/static/assets/bower_components/moment/min/moment.min.js?${now.time}"></script>
<script src="/static/assets/bower_components/bootstrap-daterangepicker/daterangepicker.js?${now.time}"></script>
<!-- Slimscroll -->
<script src="/static/assets/bower_components/jquery-slimscroll/jquery.slimscroll.min.js?${now.time}"></script>
<!-- FastClick -->
<script src="/static/assets/bower_components/fastclick/lib/fastclick.js?${now.time}"></script>
<!-- AdminLTE App -->
<script src="/static/assets/js/adminlte.min.js?${now.time}"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="/static/assets/js/pages/dashboard.js?${now.time}"></script>

<jsp:include page="dynamic-frame.jsp" />