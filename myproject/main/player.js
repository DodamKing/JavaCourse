const player = document.getElementById('player')
const file = document.getElementById('mp3_url');

let album_img = document.getElementById('album_img');
let song_title = document.getElementById('song_title');
let artist = document.getElementById('artist');
// let play_list = document.getElementById("play_list");

let play_btn = document.getElementById('play_btn');
let pause_btn = document.getElementById('pause_btn');
let heart1_btn = document.getElementById("heart1_btn");
let heart2_btn = document.getElementById("heart2_btn");
let back_btn = document.getElementById('back_btn');
let next_btn = document.getElementById('next_btn');


let listArr = ["../sample_music/그대가 분다 - 엠씨더맥스(M.C the max).mp3", "../sample_music/고백 - 멜로망스.mp3"];
let album_imgArr = [
    "https://musicmeta-phinf.pstatic.net/album/000/410/410380.jpg?type=r100Fll&v=20200318183611",
    "https://cdnimg.melon.co.kr/cm2/album/images/106/95/590/10695590_20210827162225_500.jpg?dcfb56aca4a0dbfa8bd50fc0b97d9078/melon/resize/260/quality/80/optimize"
];
let songArr = ["그대가 분다", "고백"];
let artistArr = ["엠씨더맥스(M.C the max)", "멜로망스"];
let listIndex = 0;
let sw = 0;


function play() {
    if (sw == 0) {
        file.src = listArr[listIndex];
        player.load();
        sw = 1;
    };
    
    album_img.setAttribute("src", album_imgArr[listIndex]);
    song_title.innerHTML = songArr[listIndex];
    artist.innerHTML = artistArr[listIndex];
    
    player.play();

    play_btn.style.display = 'none';
    pause_btn.style.display = 'inline-block';
}

function pause() {
    play_btn.style.display = 'inline-block';
    pause_btn.style.display = 'none';

    player.pause();
}

function continuous() {
    listIndex++;
    // if (listIndex >= listArr.length) { /* 전곡 반복 */
    //     listIndex = 0;
    // }
    if (listIndex >= listArr.length) {  /* 연속재생 */
        listIndex = 0;
        sw = 0;

        play_btn.style.display = 'inline-block';
        pause_btn.style.display = 'none';
        return
    }

    album_img.setAttribute("src", album_imgArr[listIndex]);
    song_title.innerHTML = songArr[listIndex];
    artist.innerHTML = artistArr[listIndex];

    file.src = listArr[listIndex];
    player.load();
    player.play();
}

function heart1_click() {
    heart1_btn.style.display = "none";
    heart2_btn.style.display = "inline-block";
}

function heart2_click() {
    heart2_btn.style.display = "none";
    heart1_btn.style.display = "inline-block";
}

function next() {
    listIndex++;

    if (listIndex >= listArr.length) {
        listIndex = 0;
    }

    play_btn.style.display = 'none';
    pause_btn.style.display = 'inline-block';

    album_img.setAttribute("src", album_imgArr[listIndex]);
    song_title.innerHTML = songArr[listIndex];
    artist.innerHTML = artistArr[listIndex];

    file.src = listArr[listIndex];
    player.load();
    player.play();
}

function back() {
    listIndex--;

    if (listIndex < 0) {
        listIndex = listArr.length - 1;
    }

    play_btn.style.display = 'none';
    pause_btn.style.display = 'inline-block';

    album_img.setAttribute("src", album_imgArr[listIndex]);
    song_title.innerHTML = songArr[listIndex];
    artist.innerHTML = artistArr[listIndex];

    file.src = listArr[listIndex];
    player.load();
    player.play();
}

function toggle_list() {
    if (play_list.style.display == "none") {
        play_list.style.display = "inline-block";
    }
    else {
        play_list.style.display = "none";
    }
}



play_btn.addEventListener('click', play);
pause_btn.addEventListener('click', pause);
heart1_btn.addEventListener("click", heart1_click);
heart2_btn.addEventListener("click", heart2_click);
next_btn.addEventListener('click', next);
back_btn.addEventListener('click', back);
list_btn.addEventListener("click", toggle_list)

player.addEventListener("ended", continuous);

