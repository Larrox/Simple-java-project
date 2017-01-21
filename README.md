* Author name: Łukasz Birunt

* Really short description:
	Project is a little program which simulates a forest.
	You can plant a few different species like oak or raspberries and do some stuff with them.
	Two interfaces provide unique functions to  different types of plants.
	There is also some custom exceptions which keep basic logic.
	A list and hash map are included, mainly for fit the requirements.
	Program uses polimorphic bindings.
	
* Instructions how to compile and run application:
	It's a standard maven project, there is some links which may be helpful in case of problems:
	[Maven in 5 Minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html).
	[Maven official documentation](https://maven.apache.org/index.html).

* Aditional informations:
	The class Forest Demo is a main class of the program. You can find some helpful comments there.
	
	Inheritance schema:
		
							Plant
					/					\
			Tree							Bush
			/	\					/		|			\
		Oak		Spruce		Raspberries	Blackberries	Wild Rose