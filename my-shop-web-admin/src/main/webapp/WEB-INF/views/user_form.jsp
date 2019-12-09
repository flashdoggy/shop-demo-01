<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>MyShop | UserList</title>
    <jsp:include page="../includes/header.jsp"/>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
    <jsp:include page="../includes/nav.jsp" />

    <jsp:include page="../includes/left-side-column.jsp" />

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                User Management
                <small>Control panel</small>
            </h1>
            <ol class="breadcrumb" />
        </section>
        <!-- Main content -->
        <section class="content">
            <div class="row">
                <div class="col-md-12">
                    <c:if test="${null != baseResult && baseResult.getStatus() != '200'}">
                        <div class="alert alert-danger alert-dismissible">
                            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                            <h4><i class="icon fa fa-ban"></i> Alert!</h4>
                            ${baseResult.getMessage()}
                        </div>
                    </c:if>
                    <div class="box box-info">
                        <div class="box-header with-border">
                            <h3 class="box-title">${ null == tbUser || null == tbUser.id ? "Add" : "Update"} User</h3>
                        </div>
                        <!-- /.box-header -->
                        <!-- form start -->
                        <form id="validateForm" class="form-horizontal" action="/user/save" method="post">
                            <div class="box-body">
                                <div class="form-group">
                                    <label for="inputEmail" class="col-sm-2 control-label">Email</label>

                                    <div class="col-sm-10">
                                        <input type="email" class="form-control required" id="inputEmail" name="email" placeholder="Email" value="${tbUser.email}" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputUsername" class="col-sm-2 control-label">Username</label>

                                    <div class="col-sm-10">
                                        <input type="text" class="form-control required" id="inputUsername" name="username" placeholder="Username" value="${tbUser.username}" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputPhone" class="col-sm-2 control-label">Phone</label>

                                    <div class="col-sm-10">
                                        <input type="text" class="form-control required mobile" id="inputPhone" name="phone" placeholder="Phone" value="${tbUser.phone}" />
                                    </div>
                                </div>

                                <c:if test="${ null != tbUser && null != tbUser.id}" >
                                    <div class="form-group">
                                        <label for="inputOriginalPassword" class="col-sm-2 control-label">Original Password</label>

                                        <div class="col-sm-10">
                                            <input type="password" class="form-control" id="inputOriginalPassword" name="originalPassword" placeholder="Original Password" />
                                        </div>
                                    </div>
                                </c:if>

                                <div class="form-group">
                                    <label for="inputPassword" class="col-sm-2 control-label">New Password</label>

                                    <div class="col-sm-10">
                                        <input type="password" class="form-control" id="inputPassword" name="password" placeholder="Password" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputConfirmPassword" class="col-sm-2 control-label">Confirm Password</label>

                                    <div class="col-sm-10">
                                        <input type="password" class="form-control" id="inputConfirmPassword" name="confirmPassword" placeholder="Confirm Password" />
                                    </div>
                                </div>

                                <c:if test="${ null != tbUser && null != tbUser.id}" >
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <input type="hidden" class="form-control" id="inputId" name="id" value="${tbUser.id}" />
                                        </div>
                                    </div>
                                </c:if>

                            </div>
                            <!-- /.box-body -->
                            <div class="box-footer">
                                <button type="button" class="btn btn-default" onclick="history.back();">Cancel</button>
                                <button type="submit" class="btn btn-info pull-right">Submit</button>
                            </div>
                            <!-- /.box-footer -->
                        </form>
                    </div>
                </div>
            </div>
        </section>
    </div>

    <jsp:include page="../includes/copyright.jsp" />
</div>

<jsp:include page="../includes/footer.jsp" />
</body>

<jsp:include page="../includes/bread-crumb.jsp" />
<jsp:include page="../includes/form-validation.jsp" />
</html>
