Automatización E2E - Flujo de Compra Demoblaze

## Descripción
Este proyecto contiene la automatización de una prueba funcional E2E del flujo de compra en la página [Demoblaze](https://www.demoblaze.com/).
El objetivo es validar que un usuario pueda agregar productos al carrito, visualizar su selección, completar el formulario y finalizar la compra exitosamente.

## Tecnologías y Herramientas Utilizadas
* **Lenguaje:** Java Development Kit (JDK) - Versión 17
* **Framework principal:** Serenity BDD
* **Patrón de diseño:** Page Object Model
* **Gestor de dependencias:** Maven
* **Navegador de prueba:** Google Chrome

## Pre-requisitos
Para ejecutar este proyecto de forma local, debe tener instalado y configurado lo siguiente:

1. **Java Development Kit (JDK) - Versión 17:** Debe estar configurado en las variables de entorno de tu sistema.
2. **Apache Maven:** Debe estar instalado y configurado en las variables de entorno.
3. **Git:** Para poder clonar el repositorio.
4. **Google Chrome**
## Instrucciones paso a paso para la ejecución

**Paso 1: Clonar el repositorio**
Abre tu terminal y ejecuta el siguiente comando:
`git clone [URL_DE_TU_REPOSITORIO_GITHUB]`

**Paso 2: Navegar a la carpeta del proyecto**
`cd [NOMBRE_DE_LA_CARPETA]`

**Paso 3: Ejecutar las pruebas**
Para correr la suite de pruebas automatizadas y generar el reporte de Serenity, ejecuta el siguiente comando en la terminal:
`mvn clean verify`
*(Nota: Si usas Gradle, sería `gradle clean test aggregate`)*

**Paso 4: Visualizar el reporte**
Una vez finalizada la ejecución, Serenity generará un reporte detallado. Puedes abrirlo navegando a la siguiente ruta en tu explorador de archivos:
`target/site/serenity/index.html`
Haz doble clic en el archivo `index.html` para abrirlo en tu navegador.

## Estructura del Proyecto (Opcional pero recomendado)
* `src/test/resources/features`: Archivos `.feature` escritos en Gherkin con los escenarios de prueba.
* `src/main/java/.../tasks`: Tareas que realiza el actor (ej. AgregarProducto, LlenarFormulario).
* `src/main/java/.../userinterfaces`: Mapeo de los elementos de la web de Demoblaze (Localizadores).