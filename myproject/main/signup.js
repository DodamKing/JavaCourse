"use strict"

var idPattern = /[^a-zA-Z0-9]$/;
var pwdPattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&]{8,}$/;
var emailPatter = /^[\w-]+(\.[\w-]+)*@([\w-]+\.)+[a-zA-Z]+$/;
var phonePatter = /01[016789][1-9][0-9]{2,3}\d{4}$/;
var namePatter = /[^가-힣]/;

let gender;
let interest = document.getElementsByName("interests");
let interests = "";

function pilsuC() {
    if (userId.value == "" || pwd.value == "" || email.value == "" || phone.value == "") {
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

pwd.addEventListener("keyup", () => {
    if (!pwdPattern.test(pwd.value)) {
        demo2.innerHTML = "비밀번호는 최소 8자, 대문자 하나, 소문자 하나, 숫자 하나 및 특수 문자 하나 이상을 포함해야 합니다.";
    }
    else {
        demo2.innerHTML = "";
    }
    pilsuC();
});

email.addEventListener("keyup", () => {
    if (!emailPatter.test(email.value)) {
        demo3.innerHTML = "이메일 주소를 확인하세요.";
    }
    else { 
        demo3.innerHTML = "";
    }
    pilsuC();
});

phone.addEventListener("keyup", () => {
    if (!phonePatter.test(phone.value)) {
        demo4.innerHTML = "휴대폰 번호를 확인하세요.";
    }
    else {
        demo4.innerHTML = "";
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

all_check.addEventListener("click", () => {
    if (all_check.checked == true) {
        for (let i=0; i<interest.length; i++) {
            interest[i].checked = true;
        }
    }
    else {
        for (let i=0; i<interest.length; i++) {
            interest[i].checked = false;
        }
    }
});

typeChange.addEventListener("click", () => {
    if (typeChange.checked == true) {
        pwd.type = "text";
    }
    else {
        pwd.type = "password";
    }
});

signup_btn.addEventListener("click", () => {
    if (document.getElementsByName("gender")[0].checked == true) {
        gender = document.getElementsByName("gender")[0].value;
    }
    else {
        gender = document.getElementsByName("gender")[1].value;
    }

    for (let i=0; i<interest.length; i++) {
        if(interest[i].checked == true) {
            interests += interest[i].value + ", ";
        }
    }

    opener.demo.innerHTML = "안녕하세요 " + userNm.value +"님 회원가입이 완료되었습니다.<br>" + 
    "아이디: " + userId.value + 
    "<br>이메일: " + email.value + 
    "<br> 휴대폰 번호: " + phone.value +
    "<br> 생년월일: " + year.value + " " + month.value + "월 " + date.value + "일" + 
    "<br> 성별: " + gender + 
    "<br> 관심분야: " + interests +
    "<br>자기소개<br>" + coment.value;
    close();
});