function showDate() {
	var d = new Date(), minutes = d.getMinutes().toString().length == 1 ? '0'
			+ d.getMinutes() : d.getMinutes(), hours = d.getHours().toString().length == 1 ? '0'
			+ d.getHours()
			: d.getHours(), ampm = d.getHours() >= 12 ? 'pm' : 'am', months = [
			'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep',
			'Oct', 'Nov', 'Dec' ], days = [ 'Sun', 'Mon', 'Tue', 'Wed', 'Thu',
			'Fri', 'Sat' ];
	var x = days[d.getDay()] + ' ' + months[d.getMonth()] + ' ' + d.getDate()
			+ ' ' + d.getFullYear() + ' ' + hours + ':' + minutes + ampm;
	document.getElementById("div1").innerHTML = "<p>" + x + "</p>";
	
	var seconds = 60*3;
    function tick() {
        seconds--;
        if( seconds > 0 ) {
            setTimeout(tick, 1000);
        } else {
            alert("3 mins past");
        }
    }
    tick();
}

function inputChange(x) {
	x.style.color = "white";
	x.style.backgroundColor = "black";
	x.style.textShadow = ".5px .5px";
}

function submitFocus(x) {
	x.style.color = "white";
	x.style.backgroundColor = "red";
	x.style.textShadow = "1px 1px";
}

function submitNoFocus(x) {
	x.style.color = "black";
	x.style.backgroundColor = "white";
	x.style.textShadow = "0px 0px";
}

function validate() {

	var firstName = document.getElementById("firstName").value;
	var lastName = document.getElementById("lastName").value;
	var password = document.getElementById("password").value;
	var confirmPassword = document.getElementById("confirmPassword").value;
	var mobileNo = document.getElementById("mobileNo").value;

	var flag = true;

	if (nameValidate(firstName) == false) {
		alert("First Name Invalid");
		flag = false;
		return flag;
	}
	if (nameValidate(lastName) == false) {
		alert("Last Name Invalid");
		flag = false;
		return flag;
	}
	if (password.length < 6 || password.length > 20) {
		alert("Password length must be between 6 to 20 characters");
		flag = false;
		return flag;
	}
	if (confirmPassword.length < 6 || confirmPassword.length > 20) {
		alert("Confirm password length must be between 6 to 20 characters");
		flag = false;
		return flag;
	}
	if (password != confirmPassword) {
		alert("Password and Confirm password do not match");
		flag = false;
		return flag;
	}

	if (mobileValidate(mobileNo) == false) {
		alert("Mobile number format is wrong");
		flag = false;
		return flag;
	}
	return flag;
}

function nameValidate(y) {

	for (var i = 0; i < y.length; i++) {
		var c = y.charAt(i);
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {

		} else {
			return false;
		}
	}

	return true;
}

function mobileValidate(z) {
	var phoneno = /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/;

	if (z.match(phoneno))
		return true;

	return false;
}
