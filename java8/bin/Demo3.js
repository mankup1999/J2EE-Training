
var map=Java.type("java.util.HashMap");

obj=new map();

obj.put('India','New Delhi');
obj.put('Russia','Mascow');
obj.put('England','London');
obj.put('France','Paris');
obj.put('America','New York');

for(var key in obj)
	print(key+" : "+obj.get(key));