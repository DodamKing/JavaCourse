let myImg = document.getElementById("mainImg");
let imgArr = ['img/m1.jpg', 'img/m2.jpg', "img/m3.jpg", "img/m4.jpg", "img/m5.jpg", "img/m6.jpg", "img/m7.jpg", "img/m8.jpg", "img/m9.jpg", "img/m10.jpg"];
let imgIndex = 1;

function changeImg() {
    myImg.setAttribute("src", imgArr[imgIndex]);
    imgIndex++;
    if (imgIndex >= imgArr.length) {
        imgIndex = 0;
    };
}
setInterval(changeImg, 3000)