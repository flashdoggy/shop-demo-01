<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:useBean id="now" class="java.util.Date" scope="page"/>
<script language=javascript src='/static/assets/js/jsp/left-side-column.js?<fmt:formatDate value="${now}" pattern="yyyy-MM-dd HH:mm:ss" />'></script>>

<script language=javascript>
    $(function() {
        LeftSideColumn.showActiveLink('${activeLinkd}');
    })
</script>
