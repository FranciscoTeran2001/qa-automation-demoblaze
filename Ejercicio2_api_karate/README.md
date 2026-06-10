# Automatización API REST - Signup y Login Demoblaze

## Descripción
Este proyecto contiene la automatización de pruebas de servicios REST de la página https://www.demoblaze.com/.
El objetivo es validar el correcto funcionamiento de los endpoints de registro (Signup) y autenticación (Login) mediante diferentes escenarios de prueba.

## Tecnologías y Herramientas Utilizadas
* **Lenguaje:** Java Development Kit (JDK) - Versión 17
* **Framework principal:** Karate Framework
* **Gestor de dependencias:** Maven

## Pre-requisitos
Para ejecutar este proyecto de forma local, se debe tener instalado y configurado lo siguiente:

1. **Java Development Kit (JDK) - Versión 17:** Debe estar configurado en las variables de entorno de su sistema.
2. **Apache Maven:** Debe estar instalado y configurado en las variables de entorno.

## Instrucciones paso a paso para la ejecución

**Paso 1: Navegar a la carpeta del proyecto**
Asegúrarse de abrir su terminal y situarse dentro de la carpeta específica de este ejercicio.

**Paso 2: Ejecutar las pruebas**
Para correr las pruebas automatizadas, ejecutar el siguiente comando en la terminal:
` mvn clean verify`

**Paso 3: Visualizar el reporte**
Una vez finalizada la ejecución, Karate generará un reporte detallado. Puede abrirlo navegando a la siguiente ruta:
`target/karate-reports/karate-summary.html`
Haz doble clic en el archivo `karate-summary.html` para abrirlo en su navegador.

## Nota importante
El escenario "Crear un nuevo usuario en signup" requiere un usuario que no exista previamente en la base de datos. Si la prueba falla en ese escenario, cambiar el username en `signup.feature` por uno diferente.