# Llanquihue Tour



Prototipo Java de registro de personas para una agencia de turismo.



## Estructura



* `model.Direccion`: datos de dirección.
* `model.Persona`: datos generales, contiene una dirección (composición).
* `model.Empleado`: hereda de Persona.
* `app.Main`: crea tres personas y muestra sus datos con `toString()`.



## Ejecutar en NetBeans



Archivo > Abrir proyecto, selecciona esta carpeta (contiene `pom.xml`).
Usa JDK 17 o posterior y ejecuta **Run Project**.
La clase principal es `app.Main`.



## Terminal (Maven)



`mvn clean compile exec:java`

