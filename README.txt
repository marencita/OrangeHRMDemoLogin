Prueba a la pagina web OrangeHRMDemo.
Se incluye gherkin + cucumber + SerenityBDD 
java 17 + gradle 7.4

pasos:
ingresa a la pagina https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
ingresa usuario, contraseña y da click en boton Login
Verifica que la siguiente ventana contenga una caja de texto para búsquedas

Para la construcción se utilizó Ide Intellij IDEA 2023.2.2
con plugins: 
cucumber+ 15.3.3
Cucumber for java 232.8660.142
Gherkin 232.8660.88
Gradle

Comando de ejecución (probado en windows):
gradle test
