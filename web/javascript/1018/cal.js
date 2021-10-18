function suCheck() {
    if (su1.value == "" || su2.value == "") {
        alert("수를 입력해야 합니다.")
        return false;
    }
    return true;
}

function add() {
    if (suCheck()) {
        var res = parseInt(su1.value) + parseInt(su2.value);
        demo.innerHTML = "결과는 " + res;
        demo2.style.display = "inline-block";
    }
}

function sub() {
    if (suCheck()) {
        var res = parseInt(su1.value) - parseInt(su2.value);
        demo.innerHTML = "결과는 " + res;
        demo2.style.display = "inline-block";
    }
}

function mul() {
    if (suCheck()) {
        var res = parseInt(su1.value) * parseInt(su2.value);
        demo.innerHTML = "결과는 " + res;
        demo2.style.display = "inline-block";
    }
}

function div() {
    if (suCheck()) {
        var res = parseInt(su1.value) / parseInt(su2.value);
        demo.innerHTML = "결과는 " + res;
        demo2.style.display = "inline-block";
    }
}

let y_btn = document.getElementById("btn");

y_btn.addEventListener("click", again);

function again() {
    if (confirm("다시 ㄱㄱ?")) {
        su1.value = "";
        su2.value = "";
        demo.innerHTML = "";
        demo2.style.display = "none";
        su1.focus();
    }
    else {
        alert("작업을 종료합니다.")
    }
}
