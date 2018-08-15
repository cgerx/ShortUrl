var host = "localhost:8080/";


$(function () {
    $("#btn_generate_code").bind("click",generate_code);
});


//生成短链接
function generate_code() {
    $.ajax({
        type:'POST',
        url:'/u',
        data:{
            "url":$("#input_url").val()
        },
        success:function (data) {
            if (data["success"] == true){
                var code = data["data"]["code"];
                $("#span_generate_result").html("生成短链接成功：" + host + "u/" + code);
            } else {
                var message = data["message"];
                $("#span_generate_result").html("生成短链接失败：" + message);
            }
        }
    });
}