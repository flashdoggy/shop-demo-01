
const BreadCrumbLinks = function () {

}

/**
 * get bread crumb links and using them to generate bread crumbs
 * @param obj bread crumb links from backend
 */
BreadCrumbLinks.generateLinks = function (obj) {
    const linksList = obj;
    const reg = /(\w?)+\/$/;

    for (var i = 0; i < linksList.length; i++) {
        const l = linksList[i];
        const liNode = $("<li>");
        const aNode = $("<a>");
        $(aNode).attr("href", l);
        $(aNode).html(reg.exec(l)[0].substr(0,reg.exec(l)[0].length - 1));
        $(liNode).append(aNode);
        $(".breadcrumb").append(liNode);
    }
}
