class Websocket{
    constructor(){
        this.stompClient = null
    }

    connect(conn_url) {
        let ws = new SockJS(conn_url);
        this.stompClient = Stomp.over(ws);
    }

    subScribe(url, callback) {
        let stompClient = this.stompClient
        stompClient.connect({}, function () {
            //订阅服务端的/topic/greeting地址
            stompClient.subscribe(url, function (greeting) {
                let res = JSON.parse(greeting.body)
                callback(res)
            })
        },function () {
            log('Info: STOMP connection closed.');
        });
    }

    disconnect() {
        let stompClient = this.stompClient
        if (stompClient !== null) {
            stompClient.disconnect();
            stompClient = null;
        }
        log('Info: STOMP connection closed.');
    }

}