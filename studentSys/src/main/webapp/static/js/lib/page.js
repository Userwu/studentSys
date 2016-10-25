/* 一个简单的分页，每次点击重渲染
 ******by wuati*****
 */
(function ($) {
    //默认参数 (放在插件外面，避免每次调用插件都调用一次，节省内存)
    var defaults = {
        //id : '#paging',//id
        leng: 9,//总页数
        currentPage: 1,//当前页数
        url: '',//链接前缀，用于填充每一项的链接
        activeClass: 'page-active',//active类
        firstPage: '首页',//
        lastPage: '末页',
        prv: '«',
        next: '»'
    };
    //扩展
    $.fn.extend({
        //插件名称
        page: function (options) {
            //覆盖默认参数
            var opts = $.extend(defaults, options);
            //主函数
            return this.each(function () {
                //激活事件
                var obj = $(this);
                var str = '';
                var l = opts.leng;
                //控制显示
                if (l > 1 && l < 10) {
                    for (var i = 1; i < l + 1; i++) {
                        if (i == opts.currentPage) {
                            str += '<li><a href="' + opts.url + 'p=' + i + '" data-label="#table-inner"  class="' + opts.activeClass + '">' + i + '</a></li>';
                            continue;
                        }
                        str += '<li><a href="' + opts.url + 'p=' + i + '" data-label="#table-inner" >' + i + '</a></li>';
                    }
                } else if (l > 9) {
                    if (opts.currentPage > 5) {
                        for (i = opts.currentPage - 4; i <= opts.currentPage + 4 && i <= l; i++) {
                            if (i == opts.currentPage) {
                                str += '<li><a href="' + opts.url + 'p=' + i + '" data-label="#table-inner" class="' + opts.activeClass + '">' + i + '</a></li>';
                                continue;
                            }
                            str += '<li><a href="' + opts.url + 'p=' + i + '" data-label="#table-inner">' + i + '</a></li>';
                        }
                    } else if (opts.currentPage <= 5) {
                        for (i = 1; i < 10; i++) {
                            if (i == opts.currentPage) {
                                str += '<li><a href="' + opts.url + 'p=' + i + '" data-label="#table-inner" class="' + opts.activeClass + '">' + i + '</a></li>';
                                continue;
                            }
                            str += '<li><a href="' + opts.url + 'p=' + i + '" data-label="#table-inner">' + i + '</a></li>';
                        }
                    }
                    //str += '<li><a href="javascript:">...</a></li>'
                } else {
                    str = '<li><a href="' + opts.url + 'p=1"  class="' + opts.activeClass + '" data-label="#table-inner">' + 1 + '</a></li>';
                }
                var next = '';
                if (opts.currentPage + 1 <= l)
                    next = '<a class="next" style="float:right;display: block" href="' + opts.url + 'p=' + (opts.currentPage + 1) + '" data-label="#table-inner">' + opts.next + '</a>';
                else
                    next = '<a class="next" style="float:right;display: block" data-label="#table-inner">' + opts.next + '</a>';
                var prv = '';
                if (opts.currentPage - 1 > 0)
                    prv = '<a class="prv" style="float:right;display: block" href="' + opts.url + 'p=' + (opts.currentPage - 1) + '" data-label="#table-inner">' + opts.prv + '</a>';
                else
                    prv = '<a class="prv" style="float:right;display: block" data-label="#table-inner">' + opts.prv + '</a>';
                obj.html(next + '<a class="last" href="' + opts.url + 'p=' + l + '" style="float:right;display: block" data-label="#table-inner">' + opts.lastPage + '</a><ul class="pagingUl">' + str + '</ul><a class="first" href="' + opts.url + 'p=1" style="float:right;display: block" data-label="#table-inner">' + opts.firstPage + '</a>' + prv);

                obj.on('click', '.next', function () {
                    var pageshow = parseInt($('.' + opts.activeClass).html());
                    if (pageshow == l) {
                    } else if (pageshow > l - 5 && pageshow < l) {
                        $('.' + opts.activeClass).removeClass(opts.activeClass).parent().next().find('a').addClass(opts.activeClass);
                    } else if (pageshow > 0 && pageshow < 6) {
                        $('.' + opts.activeClass).removeClass(opts.activeClass).parent().next().find('a').addClass(opts.activeClass);
                    } else {
                        $('.' + opts.activeClass).removeClass(opts.activeClass).parent().next().find('a').addClass(opts.activeClass);
                        fpageShow();
                    }
                });
            });
        }
    })
})(jQuery);