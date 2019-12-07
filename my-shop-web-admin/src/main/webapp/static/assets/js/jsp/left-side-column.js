const LeftSideColumn = function () {

}

LeftSideColumn.showActiveLink = function (linkStr) {
    const secondMenuList = $(".main-sidebar ul.treeview-menu li a");
    secondMenuList.each(function (i, secondMenu) {
        if (linkStr == secondMenu.href) {
            const li = $(secondMenu).parent('li');
            const ul = $(li).parent('ul');
            const pli = $(ul).parents('li.treeview');
            $(li).addClass('active');
            $(ul).show();
            $(pli).addClass('menu-open');
        }
    });
}