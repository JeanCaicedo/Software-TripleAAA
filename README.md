# Software-TripleAAA

Aplicación de escritorio en Java Swing que simula la gestión de clientes y facturas de una empresa de servicios públicos. Proyecto académico desarrollado en NetBeans con persistencia en archivos de texto plano.

![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-F80000?style=for-the-badge&logo=java&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apachenetbeanside&logoColor=white)
![Ant](https://img.shields.io/badge/Apache%20Ant-A81C7D?style=for-the-badge&logo=apacheant&logoColor=white)

## Descripción del proyecto

Sistema administrativo para una empresa ficticia de servicios públicos "Triple AAA" que automatiza el registro y consulta de clientes y facturas. Es un proyecto académico (no productivo) que practica el patrón MVC, interfaces Swing y el manejo de archivos planos como mecanismo de persistencia.

## Funcionalidades principales

### Autenticación

- Ventana de login con verificación de credenciales antes de acceder al menú principal.

### Gestión de clientes

- Registro con número de referencia, cédula, nombres, apellidos, municipio, barrio, género y estrato socioeconómico (1-6).
- Validación de campos antes de guardar.
- Persistencia en `Clientes.txt` con separador `::`.

### Gestión de facturas

- Alta de facturas con número, póliza, NIT o cédula del cliente, código de recorrido, estrato del predio (1-5), barrio y clasificación (Individual, Colectivo, Multifamiliar, Comercial, Industrial, Servicios, Rural).
- Número de unidades del predio (1-10).
- Barrios soportados: san jose, la victoria, salvador, villa carolina.
- Persistencia en `Factura.txt` con separador `::`.

### Menú principal

- Navegación entre módulos de clientes y facturas tras autenticarse.

## Stack

- Lenguaje: Java SE
- GUI: Swing (archivos `.java` y `.form` generados por el editor de NetBeans)
- Arquitectura: MVC (`modelo/`, `vista/`, `controlador/`)
- Build: Apache Ant (`build.xml`) con configuración de NetBeans en `nbproject/`
- Persistencia: archivos de texto plano (sin base de datos)

## Requisitos previos

- JDK 8 o superior
- NetBeans IDE (recomendado) o cualquier IDE compatible con proyectos Ant de Java

## Instalación

```bash
git clone https://github.com/JeanCaicedo/Software-TripleAAA.git
cd Software-TripleAAA
```

## Ejecución

### Desde NetBeans

1. `File > Open Project` y seleccionar la carpeta del repositorio.
2. Clic derecho en el proyecto y `Build`.
3. Ejecutar la clase `modelo.Principal`.

### Desde línea de comandos

```bash
javac -d build src/modelo/*.java src/vista/*.java src/controlador/*.java
java -cp build modelo.Principal
```

## Estructura del proyecto

```
src/
├── modelo/                   # Entidades y clase principal
│   ├── Cliente.java
│   ├── Factura.java
│   └── Principal.java
├── vista/                    # Formularios Swing
│   ├── FrmLogin.java / .form
│   ├── FrmMenu.java / .form
│   ├── FrmClientes.java / .form
│   └── FrmFacturas.java / .form
├── controlador/              # Controladores MVC
│   ├── Ccliente.java
│   └── Ffactura.java
└── imagenes/                 # Recursos gráficos
Clientes.txt                  # Persistencia de clientes
Factura.txt                   # Persistencia de facturas
build.xml                     # Configuración Ant
nbproject/                    # Configuración NetBeans
```

## Autor

Jean Caicedo — [@JeanCaicedo](https://github.com/JeanCaicedo)
