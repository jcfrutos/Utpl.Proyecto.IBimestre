# Utpl.Proyecto.IBimestre
Repositorio base del proyecto de 1 primestre de Interoperabilidad

# Spring Boot ATS Anexos

Este proyecto es una aplicación Spring Boot que implementa la carga mensual de archivos XML de Anexos Transaccionales Simplificados (ATS) de hasta 3 gigabytes. La aplicación proporciona una API que separa estos anexos en diferentes categorías: ATS de compras, ATS de ventas, ATS de rendimientos, ATS de anulados y ATS de recaps, almacenando cada uno en tablas diferentes en una base de datos relacional.

## Estructura del Proyecto

La estructura del proyecto es la siguiente:

```
springboot-ats-anexos
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── ats
│   │   │               ├── SpringbootAtsAnexosApplication.java
│   │   │               ├── controller
│   │   │               │   └── AtsController.java
│   │   │               ├── service
│   │   │               │   └── AtsService.java
│   │   │               ├── model
│   │   │               │   ├── AtsCompra.java
│   │   │               │   ├── AtsVenta.java
│   │   │               │   ├── AtsRendimiento.java
│   │   │               │   ├── AtsAnulado.java
│   │   │               │   └── AtsRecap.java
│   │   │               └── repository
│   │   │                   ├── AtsCompraRepository.java
│   │   │                   ├── AtsVentaRepository.java
│   │   │                   ├── AtsRendimientoRepository.java
│   │   │                   ├── AtsAnuladoRepository.java
│   │   │                   └── AtsRecapRepository.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── schema.sql
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── ats
│                       └── SpringbootAtsAnexosApplicationTests.java
├── pom.xml
└── README.md
```

## Requisitos

- Java 11 o superior
- Maven
- Base de datos relacional (MySQL, PostgreSQL, etc.)

## Configuración

1. Clona el repositorio en tu máquina local.
2. Navega al directorio del proyecto.
3. Configura la conexión a la base de datos en `src/main/resources/application.properties`.
4. Ejecuta el siguiente comando para compilar y ejecutar la aplicación:

   ```
   mvn spring-boot:run
   ```

## Uso de la API

La API expone endpoints para cargar archivos XML y procesar los anexos. Consulta la documentación de la API para más detalles sobre los endpoints disponibles.

## Pruebas

Las pruebas unitarias están incluidas en el proyecto y se pueden ejecutar con el siguiente comando:

```
mvn test
```
