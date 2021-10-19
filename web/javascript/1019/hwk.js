const answer = document.getElementById("answer");
var temp1 = "", temp2 = ""; 
var res = "";

function clear() {
    answer.value = 0;
    temp1 = "";
    temp2 = "";
    res = "";
}

function click_num() {
    res = answer.value;
    if (res == "0") res = "";
    res += this.value;
    answer.value = res;
}

function click_dot() {
    if (answer.value == "0") res = "0.";
    else if (String(answer.value).includes(".")) return;
    else res = answer.value + this.value;
    
    answer.value = res;
}

function click_op() {
    temp1 = answer.value;
    temp2 = this.value;
    demo.innerText = temp1 + " " + temp2;
    answer.value = "";
}

function enter() {
    if (temp2 == "+") {
        res = parseFloat(temp1) + parseFloat(answer.value);
    }

    else if (temp2 == "-") {
        res = parseFloat(temp1) - parseFloat(answer.value);
    }

    else if (temp2 == "*") {
        res = parseFloat(temp1) * parseFloat(answer.value);
    }

    else if (temp2 == "/") {
        res = parseFloat(temp1) / parseFloat(answer.value);
    }

    demo.innerText = temp1 + " " + temp2 + " " + answer.value + " " + this.value;
    answer.value = res;

}

btn_c.addEventListener("click", clear);
btn_d.addEventListener("click", click_op);
btn_m.addEventListener("click", click_op);
btn_s.addEventListener("click", click_op);
btn_a.addEventListener("click", click_op);
btn_dot.addEventListener("click", click_dot);
btn_enter.addEventListener("click", enter);

btn_0.addEventListener("click", click_num);
btn_1.addEventListener("click", click_num);
btn_2.addEventListener("click", click_num);
btn_3.addEventListener("click", click_num);
btn_4.addEventListener("click", click_num);
btn_5.addEventListener("click", click_num);
btn_6.addEventListener("click", click_num);
btn_7.addEventListener("click", click_num);
btn_8.addEventListener("click", click_num);
btn_9.addEventListener("click", click_num);

