# Prueba Técnica Automatización QA - Demoblaze
Este repositorio contiene la solución a la prueba técnica de automatización de los dos ejercicios.

## Estructura del Repositorio

* **`Ejercicio1_E2E_serenity/`**: Proyecto con la automatización E2E del flujo de compras utilizando Serenity BDD.
* **`Ejercicio2_api_karate/`**: Proyecto con la automatización de pruebas de servicios REST (Signup y Login) utilizando Karate Framework.

## Pre-requisitos

1. **Java Development Kit (JDK) - Versión 17:**
   Descarga: https://www.oracle.com/java/technologies/downloads/#java17
   Para verificar ejecute:
```
   java -version
```

2. **Apache Maven:**
   Descarga: https://maven.apache.org/download.cgi
   Para verificar ejecute:
```
   mvn -version
```
> **Sugerencia:** Si Maven no es reconocido luego de instalarlo, configure las variables de entorno manualmente ejecutando en su terminal:
```
   $env:MAVEN_HOME="C:\Tools\apache-maven-3.9.11"
   $env:PATH="$env:MAVEN_HOME\bin;$env:PATH"
```
> Reemplace `C:\Tools\apache-maven-3.9.11` por la ruta donde instaló Maven.

3. **Git:** Para clonar el repositorio.
   Descarga: https://git-scm.com/downloads
   Para verificar ejecute:
```
   git --version
```

## Cómo obtener este proyecto

**Paso 1: Elegir carpeta para clonar**
Elija la carpeta donde desea clonar el proyecto.

**Paso 2: Clonar el proyecto**
Ejecute el siguiente comando:
```
git clone https://github.com/FranciscoTeran2001/qa-automation-demoblaze.git
```

**Nota:** Ingrese a cada una de las carpetas listadas arriba. Dentro de cada una se encuentra un archivo `readme.md` con los pre-requisitos técnicos y los comandos exactos para ejecutar las pruebas.