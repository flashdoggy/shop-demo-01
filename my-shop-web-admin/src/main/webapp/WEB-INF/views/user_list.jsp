<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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
                    <div class="col-xs-12">
                        <div class="box">
                            <div class="box-header">
                                <h3 class="box-title">User Account List</h3>

                                <div class="box-tools">
                                    <div class="input-group input-group-sm hidden-xs" style="width: 300px;">
                                        <div class="input-group-btn">
                                            <a href="#" type="button" class="btn btn-sm btn-success"><i class="fa fa-plus"></i> Add New Account</a>
                                        </div>

                                        <input type="text" name="table_search" class="form-control pull-right" placeholder="Search">

                                        <div class="input-group-btn">
                                            <button type="submit" class="btn btn-default"><i class="fa fa-search"></i></button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- /.box-header -->
                            <div class="box-body table-responsive no-padding ">
                                <table class="table table-hover">
                                    <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>UserName</th>
                                            <th>Phone</th>
                                            <th>Email</th>
                                            <th>Created</th>
                                            <th>Actions</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${tbUsers}" var="tbUser">
                                            <tr>
                                                <td>${tbUser.id}</td>
                                                <td>${tbUser.username}</td>
                                                <td>${tbUser.phone}</td>
                                                <td>${tbUser.email}</td>
                                                <td><fmt:formatDate value="${tbUser.created}" pattern="yyyy-MM-dd hh:mm:ss" /></td>
                                                <td>
                                                    <a href="#" type="button" class="btn btn-sm btn-default"><i class="fa fa-search"></i> Information</a>
                                                    <a href="#" type="button" class="btn btn-sm btn-primary"><i class="fa fa-edit"></i> Modify</a>
                                                    <a href="#" type="button" class="btn btn-sm btn-danger"><i class="fa fa-trash"></i> Delete</a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <!-- /.box-body -->
                        </div>
                        <!-- /.box -->
                    </div>
                </div>
            </section>
        </div>

        <jsp:include page="../includes/copyright.jsp" />
    </div>

    <jsp:include page="../includes/footer.jsp" />
    </body>

    <jsp:include page="../includes/bread-crumb.jsp" />
</html>
