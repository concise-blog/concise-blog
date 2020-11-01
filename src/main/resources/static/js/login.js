
$(function(){

    $("#toReg").click(function () {
        $(".showDetail").slideUp("slow");
        $(".registry").slideDown("slow");
    });

    $("#toLogin").click(function () {
        $(".showDetail").slideDown("slow");
        $(".registry").slideUp("slow");
    });


});
