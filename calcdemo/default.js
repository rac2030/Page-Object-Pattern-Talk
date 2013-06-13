var number = '';
var result = document.getElementById('result');
var tape = document.getElementById('tape');
tape.scrollTop = 10000;


function keypress(e) {
    switch (e.keyCode) {
        case 8: // backspace
            backspace();
            break;
        case 67: // C
        case 99: // c
            allclear();
            break;
        case 46: // .
            decimal();
            break;
        case 48: // 0
        case 49:
        case 50:
        case 51:
        case 52:
        case 53:
        case 54:
        case 55:
        case 56:
        case 57: // 9
            enter(String.fromCharCode(e.keyCode));
            break;
        case 42: // *
        case 120: // x
        case 88: // X
            multiply();
            break;
        case 47: // /
            divide();
            break;
        case 43: // +
            add();
            break;
        case 45: // -
            subtract();
            break;
        case 13: // ENTER
        case 32: // SPACE
        case 61: // =
            equals();
            break;
    }
}


function allclear() {
    number = '';
    operator = null;
    result.innerText = "0";
    tape.innerHTML = '';
}

function backspace() {
    if (number.length > 0) {
        number = number.substr(0, number.length - 1);
        if (number.length === 0) {
            result.innerText = '0';
        }
        else {
            result.innerText = number;
        }
    }
}

function clearentry() {
    number = '';
    result.innerText = '0';
}


function nine() {
    enter('9');
}

function eight() {
    enter('8');
}
function seven() {
    enter('7');
}

function six() {
    enter('6');
}

function five() {
    enter('5');
}

function four() {
    enter('4');
}

function three() {
    enter('3');
}

function two() {
    enter('2');
}

function one() {
    enter('1');
}

function zero() {
    enter('0');
}

function decimal() {
    if (number && number.indexOf('.')===-1) {
        enter('.');
    }
}



function enter(digit) {
    number = number + digit;
    result.innerText = number;
}


function multiply() {
    if (!number) {
        number = parseFloat(result.innerText);
    }
    number1 = number;
    operator = "x";
    number = '';
    result.innerText = '0';
    tape.innerHTML += number1.toString() + "<br/>× ";
}

function divide() {
    if (!number) {
        number = parseFloat(result.innerText);
    }
    number1 = number;
    operator = '/';
    number = '';
    result.innerText = '0';
    tape.innerHTML += number1.toString() + "<br/>÷ ";
}

function add() {
    if (!number) {
        number = parseFloat(result.innerText);
    }
    number1 = number;
    operator = "+";
    number = '';
    result.innerText = '0';
    tape.innerHTML += number1.toString() + "<br/>+ ";
}

function subtract() {
    if (!number) {
        number = parseFloat(result.innerText);
    }

    // If entered with no number entered, this is a leading minus.

    if (number.length == 0) {
        enter('-');
        return;
    }

    // Subtraction operator.

    number1 = number;
    operator = '-';
    number = '';
    result.innerText = '0';
    tape.innerHTML += number1.toString() + "<br/>- ";
}

function percent() {
    if (!operator) {
        return;
    }
    number = (parseFloat(number1) * (parseFloat(number)/100)).toString();
    result.innerText = number;
}


function equals() {
    if (!operator) {
        return;
    }
    try
    {
        switch (operator) {
            case 'x':
                result.innerText = (parseFloat(number1) * parseFloat(number)).toString();
                tape.innerHTML += number.toString() + "<br/>--------------------<br/>= " + result.innerText + "<br/>&nbsp;<br/>";
                number = '';
                break;
            case '/':
                result.innerText = (parseFloat(number1) / parseFloat(number)).toString();
                tape.innerHTML += number.toString() + "<br/>--------------------<br/>= " + result.innerText + "<br/>&nbsp;<br/>";
                number = '';
                break;
            case '+':
                result.innerText = (parseFloat(number1) + parseFloat(number)).toString();
                tape.innerHTML += number.toString() + "<br/>--------------------<br/>= " + result.innerText + "<br/>&nbsp;<br/>";
                number = '';
                break;
            case '-':
                result.innerText = (parseFloat(number1) - parseFloat(number)).toString();
                tape.innerHTML += number.toString() + "<br/>--------------------<br/>= " + result.innerText + "<br/>&nbsp;<br/>";
                number = '';
                break;
        }
    }
    catch (e) {
        result.innerText = "Error";
    }
    operator = null;
    number = '';
}


// write results to div named 'output'

function write(message) {
    document.getElementById('output').innerHTML += message + "<br>";
}

