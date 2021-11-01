const song_list = []
const thum_list = []
const title_list = []
const artist_list = []


$("button[name='add_btn']").click(function() {
    let topIndex = $("button[name='add_btn']").index(this);
    let thum = $("section table img")[topIndex].src;
    let title = $("div[name='top10Title']")[topIndex].innerText;
    let artist = $("div[name='top10Artist']")[topIndex].innerText;

    thum_list.push(thum);
    title_list.push(title);
    artist_list.push(artist);

    setList();
    // console.log(thum_list);
});

$("button[name='delete_btn']").click(function() {
    alert("gg");
});

function dellist(index) {
    thum_list.splice(index, 1);
    title_list.splice(index, 1);
    artist_list.splice(index, 1);
    
    setList();
}

function setList() {
    let res = "";
    for (let i=0; i<thum_list.length; i++) {
        res += "<div class='d-flex p-1'><div class='imgBox mr-4'><img src='" + thum_list[i] + "'></div><div><div class='playlist_t'>" + title_list[i] + "</div><div class='playlist_a'>" + artist_list[i] + "</div></div><div class='ml-auto'><button name='delete_btn' type='button' class='btn' onclick='dellist(" + i + ")' ><i class='fa-regular fa-trash-can'></i></button></div></div>";
    }
    play_list.innerHTML = res;
}