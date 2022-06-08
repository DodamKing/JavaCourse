"use strict"

var idPattern = /[^a-zA-Z0-9]$/;
/*var pwdPattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&]{8,}$/;*/
var pwdPattern = /[\d]/;
var emailPatter = /^[\w-]+(\.[\w-]+)*@([\w-]+\.)+[a-zA-Z]+$/;
var phonePatter = /01[016789][1-9][0-9]{2,3}\d{4}$/;
var namePatter = /[^가-힣]/;

let gender;
let interest = document.getElementsByName("interests");
let interests = "";

function pilsuC() {
    if (userId.value == "" || pwd.value == "" || userNm.value == "") {
        pilsu.style.display = "inline-block";
    }
    else {
        pilsu.style.display = "none";
    }
}

userId.addEventListener("keyup", () => {
    if (idPattern.test(userId.value)) {
        demo1.innerHTML = "아이디는 영문 대소문자와 숫자만 가능합니다.";
    }
    else {
        demo1.innerHTML = "";
    }
    pilsuC();
});

password.addEventListener("keyup", () => {
    if (!pwdPattern.test(password.value)) {
        demo2.innerHTML = "비밀번호는 숫자를 포함해야 합니다.";
    }
    else {
        demo2.innerHTML = "";
    }
    pilsuC();
});

userNm.addEventListener("keyup", () => {
    if (namePatter.test(userNm.value)) {
        demo5.innerHTML = "이름은 한글만 가능합니다.";
    }
    else {
        demo5.innerHTML = "";
    }
});

typeChange.addEventListener("click", () => {
    if (typeChange.checked == true) {
        password.type = "text";
    }
    else {
        password.type = "password";
    }
});