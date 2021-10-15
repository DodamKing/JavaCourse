var myImg = document.getElementById("mainImg");
var imgArr = ["img/m1.jpg", "img/m2.jpg", "img/m3.jpg", "img/m4.jpg", "img/m5.jpg", "img/m6.jpg", "img/m7.jpg", "img/m8.jpg", "img/m9.jpg", "img/m10.jpg"];
var imgIndex = 0;

function changeImg() {
    myImg.setAttribute("src", imgArr[imgIndex]);
    imgIndex++;
    if (imgIndex >= imgArr.length) {
        imgIndex = 0;
    }
}
setInterval(changeImg, 3000)