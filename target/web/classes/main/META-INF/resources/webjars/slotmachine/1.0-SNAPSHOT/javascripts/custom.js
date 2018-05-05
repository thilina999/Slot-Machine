"use strict";
var slotitem = new Array('bell', 'cherry', 'plum', 'redseven', 'lemon', 'watermelon');
var counter;
counter = 0;
var isrun = false;
var reelItemOne;
var reelItemTwo;
var reelItemThree;
var credits = 10;
var bets = 0;
var coin;
var win;
var value;
var isMaxBet = true;
var runreel1;
var runreel2;
var runreel3;
var clickedStat;
clickedStat = false;
// Get a reference to the database service
var database = firebase.database();
window.onload = function () {
    database.ref().remove();
};
function start() {
    if (clickedStat == true) {
        document.getElementById("staticsSecction").style.display = "none";
        clickedStat = false;
    }
    if (bets != 0) {
        runreel1 = true;
        runreel2 = true;
        runreel3 = true;
        isMaxBet = true;
        if (isrun == false) {
            spinem();
            isrun = true;
        }
    }
    else {
        document.getElementById("error").innerHTML = "Please Bet Before Spin";
        setTimeout("defaultView();", 2000);
    }
}
function spinem() {
    if (runreel1 == true) {
        spinreel1();
    }
    if (runreel2 == true) {
        spinreel2();
    }
    if (runreel3 == true) {
        spinreel3();
    }
    setTimeout("spinem(counter);", 50);
}
function stopreel1() {
    if (isrun == true) {
        runreel1 = false;
        checkmatch();
    }
}
function stopreel2() {
    if (isrun == true) {
        runreel2 = false;
        checkmatch();
    }
}
function stopreel3() {
    if (isrun == true) {
        runreel3 = false;
        checkmatch();
    }
}
function spinreel1() {
    var turns1;
    turns1 = 10 + Math.floor((Math.random() * 10));
    for (var a = 0; a < turns1; a++)
        reelItemOne = slotitem[a % 5];
    {
        document.getElementById("slot1").src = "/assets/images/" + reelItemOne + ".png";
    }
}
function spinreel2() {
    var turns2;
    turns2 = 10 + Math.floor((Math.random() * 10));
    for (var b = 0; b < turns2; b++)
        reelItemTwo = slotitem[b % 5];
    {
        document.getElementById("slot2").src = "/assets/images/" + reelItemTwo + ".png";
    }
}
function spinreel3() {
    var turns3;
    turns3 = 10 + Math.floor((Math.random() * 10));
    for (var c = 0; c < turns3; c++)
        reelItemThree = slotitem[c % 5];
    {
        document.getElementById("slot3").src = "/assets/images/" + reelItemThree + ".png";
    }
}
function checkmatch() {
    if (runreel1 == false && runreel2 == false && runreel3 == false) {
        if (isrun == true) {
            if (reelItemOne == reelItemTwo || reelItemOne == reelItemThree || reelItemTwo == reelItemThree) {
                if (reelItemOne == reelItemTwo || reelItemOne == reelItemThree) {
                    switch (reelItemOne) {
                        case "redseven":
                            value = 7;
                            break;
                        case "bell":
                            value = 6;
                            break;
                        case "watermelon":
                            value = 5;
                            break;
                        case "plum":
                            value = 4;
                            break;
                        case "lemon":
                            value = 3;
                            break;
                        case "cherry":
                            value = 2;
                            break;
                    }
                }
                else if (reelItemTwo == reelItemThree) {
                    switch (reelItemThree) {
                        case "redseven":
                            value = 7;
                            break;
                        case "bell":
                            value = 6;
                            break;
                        case "watermelon":
                            value = 5;
                            break;
                        case "plum":
                            value = 4;
                            break;
                        case "lemon":
                            value = 3;
                            break;
                        case "cherry":
                            value = 2;
                            break;
                    }
                }
                win = value * bets;
                document.getElementById("result").innerHTML = "You won " + win;
                database.ref().push().set({
                    Bet: bets,
                    Result: "Won",
                    Winnings: win
                });
                bets = 0;
                credits = credits + win;
                document.getElementById("credit").innerHTML = credits;
            }
            else {
                document.getElementById("result").innerHTML = "You Lost";
                database.ref().push().set({
                    Bet: bets,
                    Result: "Lost",
                    Winnings: 0
                });
                bets = 0;
            }
            document.getElementById("bet").innerHTML = bets;
            setTimeout("defaultView();", 2000);
            isrun = false;
        }
    }
}
function defaultView() {
    document.getElementById("error").innerHTML = "";
    document.getElementById("slot1").src = "/assets/images/redseven.png";
    document.getElementById("slot2").src = "/assets/images/redseven.png";
    document.getElementById("slot3").src = "/assets/images/redseven.png";
    document.getElementById("result").innerHTML = "Game Result";
}
function betOne() {
    if (credits > 0) {
        bets = bets + 1;
        credits--;
        document.getElementById("bet").innerHTML = bets;
        document.getElementById("credit").innerHTML = credits;
    }
    else {
        document.getElementById("error").innerHTML = "You dont have enough credits";
        setTimeout("document.getElementById(\'error\').innerHTML=\'\' ", 2000);
    }
}
function betMax() {
    if (isMaxBet) {
        if (credits >= 3) {
            bets = 3;
            credits = credits - 3;
            document.getElementById("bet").innerHTML = bets;
            document.getElementById("credit").innerHTML = credits;
            isMaxBet = false;
        }
        else {
            document.getElementById("error").innerHTML = "You dont have enough credits";
            setTimeout("document.getElementById(\'error\').innerHTML=\'\' ", 2000);
        }
    }
    else {
        document.getElementById("error").innerHTML = "You have already Bet Max";
        setTimeout("document.getElementById(\'error\').innerHTML=\'\' ", 2000);
    }
}
function addCoin() {
    credits++;
    document.getElementById("credit").innerHTML = credits;
}
function reset() {
    credits = credits + bets;
    document.getElementById("credit").innerHTML = credits;
    bets = 0;
    document.getElementById("bet").innerHTML = bets;
    isMaxBet = true;
}
var ref = firebase.database().ref();
var content = '';
function statics() {
    if (clickedStat == false) {
        ref.once('value', function (snapshot) {
            snapshot.forEach(function (childSnapshot) {
                var val = childSnapshot.val();
                content += '<tr>';
                content += '<td>' + val.Bet + '</td>';
                content += '<td>' + val.Result + '</td>';
                content += '<td>' + val.Winnings + '</td>';
                content += '</tr>';
            });
            $('#myTable').empty().append(content);
            content = '';
        });
        document.getElementById("staticsSecction").style.display = "block";
        clickedStat = true;
    }
    else if (clickedStat == true) {
        document.getElementById("staticsSecction").style.display = "none";
        clickedStat = false;
    }
}
