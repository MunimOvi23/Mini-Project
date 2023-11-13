/*Guessing Game*/
var numWin = 0;
var numLose = 0;

for (var i = 0; i < 5; i++) {
    var num = parseInt(prompt("Enter a Number Between 1-5: "));

    // Check if the input is a valid number between 1 and 5
    if (num >= 1 && num <= 5) {
        var random = Math.floor(Math.random() * 5) + 1;

        if (num == random) {
            console.log("You Have Won!!");
            numWin++;
        } else {
            console.log("You Have Lost. The Random Number Was:" + random);
            numLose++;
        }
    } else {
        // Display an alert for invalid input and decrement the loop counter to repeat the current iteration
        alert("Enter a Valid Number between 1 and 5");
        i--;
    }
}

document.write("You Have Won: " + numWin + " Times" + "</br>");
document.write("You Have Lost: " + numLose + " Times");
