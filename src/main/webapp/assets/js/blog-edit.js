//绑定编辑区input事件
$('#target-editor').on('input', function (e) {

    $('#preview').html(markdown.toHTML($('#target-editor').val()));
    fomateCode();
});

$('form').on('click', function (e) {
    $('#preview').html(markdown.toHTML($('#target-editor').val()));
    formate();
});

function formate() {
    fomateCode();
    fomateParagraph();
}

function fomateCode() {
    var codes = $('code');
    for (var i = 0, length = codes.length; i < length; i++) {
        var ctext = $(codes[i]).html();

        console.log(ctext);
        $(codes[i]).html(ctext.replace(/\n/g, '<br>'));
    }
}

function fomateParagraph() {

}


