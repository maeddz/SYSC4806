$(document).ready(function () {

    $(document).on("submit", "#createaddressbook", function (event) {
        $.ajax({
            type: $("#createaddressbook").attr("method"),
            url: '/addressBook'
        }).done(function (response) {
            let body = response.substring(response.indexOf("<body>") + 6, response.indexOf("</body>"));
            $("body").html(body);
        });
        alert("created!");
        event.preventDefault();
    });

    $(document).on("submit", "#viewaddressbook", function (event) {
        $.ajax({
            type: $('#viewaddressbook').attr("method"),
            url: '/addressBook',
            data: $('#viewaddressbook').serialize(),
        }).done(function (response) {
            let body = response.substring(response.indexOf("<body>") + 6, response.indexOf("</body>"));
            $("body").html(body);
        });
        event.preventDefault();
    });
});

function createBuddy() {
    let data = {
        "name": $("#name").val(),
        "number": $("#number").val(),
    };
    addrId = $("#addrId").val();
    $.ajax({
        type: 'post',
        url: '/addressBook/' + addrId,
        data: JSON.stringify(data),
        contentType: 'application/json'
    }).done(function (response) {
        let body = response.substring(response.indexOf("<body>") + 6, response.indexOf("</body>"));
        $("body").html(body);
    });
    alert("buddy added!");
    location.reload();
}
