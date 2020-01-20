const ajax = function (url, data) {
    var r = null
    $.ajax(
        {
            url:url,
            data: data,
            dataType:"json",
            type:"POST",
            async:false,
            success: function(result,status,xhr){
                console.log(result)
                r = result
            },
            error: function (data) {
                console.log('error', data)
                alert(url + "error")
            },
        }
    );
    return r
}

