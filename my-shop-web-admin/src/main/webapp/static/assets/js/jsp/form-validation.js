const Validation = function () {
    return {
        init: function () {
            handlerInitValidation();
        }
    };
}();

const handlerInitValidation = function () {
    $.validator.addMethod("mobile", function (value, element) {
        const length = value.length;
        const mobile = /(?:0|86|\+86)?1[3456789]\d{9}/;
        return this.optional(element) || (length == 11 && mobile.test(value));
    }, "phone number is incorrect!");

    $("#validateForm").validate({
        errorElement: 'span',
        errorClass: 'help-block',

        errorPlacement: function (error, element) {
            $(element).parent().parent().addClass('form-group').addClass('has-error');
            $(error).insertAfter(element);
        }
    });

};