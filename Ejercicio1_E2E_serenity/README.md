# Automatización E2E - Flujo de Compra Demoblaze

## Descripción
Este proyecto contiene la automatización de una prueba funcional E2E del flujo de compra en la página [Demoblaze](https://www.demoblaze.com/).
El objetivo es validar que un usuario pueda agregar productos al carrito, visualizar su selección, completar el formulario y finalizar la compra exitosamente.

## Tecnologías y Herramientas Utilizadas
* **Lenguaje:** Java Development Kit (JDK) - Versión 17
* **Framework principal:** Serenity BDD
* **Patrón de diseño:** Screenplay Pattern
* **Gestor de dependencias:** Maven
* **Navegador de prueba:** Google Chrome

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

3. **Google Chrome:** La versión de ChromeDriver se gestiona automáticamente con WebDriverManager.

## Instrucciones paso a paso para la ejecución

**Paso 1: Navegar a la carpeta del proyecto**
Asegúrese de abrir su terminal y situese dentro de la carpeta específica de este ejercicio:
```
cd qa-automation-demoblaze/Ejercicio1_E2E_serenity
```

**Paso 2: Ejecutar las pruebas**
Para correr la prueba automatizada y generar el reporte de Serenity, ejecute el siguiente comando en la terminal:
```
mvn clean verify
```

**Paso 3: Visualizar el reporte**
Una vez finalizada la ejecución, Serenity generará un reporte detallado. Puede abrirlo navegando a la siguiente ruta en su explorador de archivos:
```
target/site/serenity/index.html
```
Haga doble clic en el archivo `index.html` para abrirlo en su navegador.

De igualmanera se encuentra el reporte de la prueba que se realizó con anterioridad. Puede abrirlo navegando a la siguiente ruta en su explorador de archivos:
```
Reporte/serenity/index.html
```

