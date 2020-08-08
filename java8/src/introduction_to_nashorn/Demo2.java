package introduction_to_nashorn;

import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Demo2 {

	public static void main(String[] args) {
		ScriptEngine se = new ScriptEngineManager().getEngineByName("nashorn");
		try {
			se.eval(new FileReader("src/Demo.js"));
			Invocable invocable = (Invocable) se;

			boolean res = (Boolean) invocable.invokeFunction("isPrime", 11);

			System.out.println(res);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
