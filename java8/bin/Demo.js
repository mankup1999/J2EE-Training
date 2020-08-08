
function isPrime(x) {
	if (x <= 1)
		return false;

	for (var i = 2; i * i <= x; i++)
		if (x % i == 0)
			return false;
	return true;
}