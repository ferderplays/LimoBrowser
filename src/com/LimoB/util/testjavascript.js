function search() {
    var query_item = document.getElementById("query");
    const url = "https://google.com/search?q=";
    var uri = url + x;
    var win = window.open(uri);
    win.focus();
}