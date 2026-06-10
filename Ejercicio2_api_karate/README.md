# Automatización API REST - Signup y Login Demoblaze

## Descripción
Este proyecto contiene la automatización de pruebas de servicios REST de la página [Demoblaze](https://www.demoblaze.com/).
El objetivo es validar el correcto funcionamiento de los endpoints de registro (Signup) y autenticación (Login) mediante diferentes escenarios de prueba.

## Tecnologías y Herramientas Utilizadas
* **Lenguaje:** Java Development Kit (JDK) - Versión 17
* **Framework principal:** Karate Framework
* **Gestor de dependencias:** Maven

## Escenarios de Prueba Cubiertos
Escenarios:
- Crear un nuevo usuario exitosamente
- Intentar crear un usuario ya existente
- Login con usuario y password correcto
- Login con usuario y password incorrecto

## Pre-requisitos
Para ejecutar este proyecto de forma local, debe tener instalado y configurado lo siguiente:

1. **Java Development Kit (JDK) - Versión 17:** Debe estar configurado en las variables de entorno de su sistema.
   Para verificar ejecute:
```
java -version
```

2. **Apache Maven:** Debe estar instalado y configurado en las variables de entorno.
   Para verificar ejecute:
```
mvn -version
```

3. **Git:** Para clonar el repositorio.
   Para verificar ejecute:
```
git --version
```

## Instrucciones paso a paso para la ejecución

**Paso 1: Clonar el repositorio**
Abra una terminal y ejecute el siguiente comando para descargar el proyecto:
```
git clone https://github.com/FranciscoTeran2001/qa-automation-demoblaze.git
```

**Paso 2: Navegar a la carpeta del ejercicio**
Ingrese a la carpeta específica de este ejercicio:
```
cd qa-automation-demoblaze/Ejercicio2_api_karate
```

**Paso 3: Ejecutar las pruebas**
Para correr las pruebas automatizadas, ejecute el siguiente comando en la terminal:
```
mvn clean verify
```

**Paso 4: Visualizar el reporte**
Una vez finalizada la ejecución, Karate generará un reporte detallado. Puede abrirlo navegando a la siguiente ruta:
```
target/karate-reports/karate-summary.html
```
Haga doble clic en el archivo `karate-summary.html` para abrirlo en su navegador.

De igualmanera se encuentra el reporte de la prueba que se realizó con anterioridad.Puede abrirlo navegando a la siguiente ruta en su explorador de archivos:
```
Reporte/karate-reports/karate-summary.html
```

## Nota importante
El escenario "Crear un nuevo usuario en signup" requiere un usuario que no exista previamente en la base de datos. Si la prueba falla en ese escenario, modifique el valor de `username` en el archivo:
```
src/test/java/demoblaze/features/signup.feature
```
Cambie el valor en la línea del Scenario "Crear un nuevo usuario en signup" por un nombre de usuario diferente.