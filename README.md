# 🏢 Sistema de Gestión Triple AAA

## 📋 Descripción del Proyecto

**Software Triple AAA** es un sistema de gestión integral desarrollado en Java que permite administrar clientes y facturas para una empresa de servicios públicos. El sistema proporciona una interfaz gráfica intuitiva para el registro, consulta y gestión de información de clientes y sus respectivas facturas de servicios.

## 🎯 Propósito

Este proyecto tiene como objetivo principal facilitar la gestión administrativa de una empresa de servicios Triple AAA, automatizando los procesos de:

- ✅ Registro de clientes con información personal y de ubicación
- ✅ Gestión de facturas de servicios públicos
- ✅ Control de estratos socioeconómicos
- ✅ Administración de datos por barrios y municipios
- ✅ Almacenamiento persistente en archivos de texto

## 🚀 Funcionalidades Principales

### 🔐 Sistema de Autenticación
- **Login seguro**: Sistema de inicio de sesión para acceder al sistema
- **Control de acceso**: Verificación de credenciales de usuario

### 👥 Gestión de Clientes
- **Registro de clientes**: Captura de información personal completa
  - Número de referencia único
  - Cédula de identidad
  - Nombres y apellidos
  - Ubicación (municipio y barrio)
  - Género (Masculino, Femenino, Otros)
  - Estrato socioeconómico (1-6)

- **Validación de datos**: Verificación de información antes del registro
- **Almacenamiento**: Persistencia de datos en archivo `Clientes.txt`

### 🧾 Gestión de Facturas
- **Registro de facturas**: Creación de facturas de servicios
  - Número de factura único
  - Póliza de seguro
  - NIT o Cédula del cliente
  - Código de recorrido
  - Estrato del predio (1-5)
  - Barrio de facturación
  - Clasificación del predio (Individual, Colectivo, Multifamiliar, Comercial, Industrial, Servicios, Rural)
  - Número de unidades del predio (1-10)

- **Barrios disponibles**: san jose, la victoria, salvador, villa carolina
- **Almacenamiento**: Persistencia de datos en archivo `Factura.txt`

### 🎮 Menú Principal
- **Navegación intuitiva**: Acceso rápido a todas las funcionalidades
- **Interfaz amigable**: Diseño simple y fácil de usar

## 🛠️ Tecnologías Utilizadas

- **Lenguaje**: Java
- **GUI**: Java Swing para la interfaz gráfica
- **IDE**: NetBeans (proyecto NetBeans nativo)
- **Persistencia**: Archivos de texto plano (.txt)
- **Arquitectura**: Patrón MVC (Modelo-Vista-Controlador)

## 📁 Estructura del Proyecto

```
src/
├── modelo/                    # Modelos de datos
│   ├── Cliente.java          # Clase modelo para clientes
│   ├── Factura.java          # Clase modelo para facturas
│   └── Principal.java        # Clase principal del sistema
├── vista/                    # Interfaces gráficas
│   ├── FrmLogin.java/.form   # Ventana de inicio de sesión
│   ├── FrmMenu.java/.form    # Menú principal
│   ├── FrmClientes.java/.form # Gestión de clientes
│   └── FrmFacturas.java/.form # Gestión de facturas
├── controlador/              # Lógica de negocio
│   ├── Ccliente.java        # Controlador de clientes
│   └── Ffactura.java        # Controlador de facturas
└── imagenes/                 # Recursos gráficos
    ├── candado.jpg          # Ícono de seguridad
    ├── clientes.png         # Ícono de clientes
    ├── triplea.png          # Logo de la empresa
    └── imagen de una factura normal con fondo transparente.png
```

## 📊 Archivos de Datos

- **`Clientes.txt`**: Almacena información de clientes en formato separado por `::`
- **`Factura.txt`**: Almacena información de facturas en formato separado por `::`

## 🔧 Instalación y Ejecución

### Requisitos Previos
- Java Development Kit (JDK) 8 o superior
- NetBeans IDE (recomendado) o cualquier IDE compatible con Java

### Pasos para Ejecutar
1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/JeanCaicedo/Software-TripleAAA.git
   ```

2. **Abrir en NetBeans**:
   - Abrir NetBeans IDE
   - File → Open Project
   - Seleccionar la carpeta del proyecto

3. **Compilar y ejecutar**:
   - Clic derecho en el proyecto → Build
   - Ejecutar la clase `Principal.java`

### Ejecución desde línea de comandos
```bash
# Compilar
javac -d build src/modelo/*.java src/vista/*.java src/controlador/*.java

# Ejecutar
java -cp build modelo.Principal
```

## 👨‍💻 Uso del Sistema

1. **Inicio de sesión**: Ingrese sus credenciales en la ventana de login
2. **Menú principal**: Navegue entre las opciones disponibles
3. **Gestión de clientes**: Registre nuevos clientes con toda su información
4. **Gestión de facturas**: Cree facturas asociadas a los servicios prestados
5. **Consulta de datos**: Los datos se almacenan automáticamente en archivos de texto

## 🤝 Contribuir

Las contribuciones son bienvenidas. Para contribuir:

1. Fork del repositorio
2. Crear una rama para tu feature (`git checkout -b feature/nueva-funcionalidad`)
3. Commit de tus cambios (`git commit -m 'Agregar nueva funcionalidad'`)
4. Push a la rama (`git push origin feature/nueva-funcionalidad`)
5. Crear un Pull Request

## 📝 Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo `LICENSE` para más detalles.

## 👥 Autores

- **Jean Caicedo** - *Desarrollo principal* - [@JeanCaicedo](https://github.com/JeanCaicedo)

## 📞 Soporte

Si tienes alguna pregunta o problema, por favor crea un [issue](https://github.com/JeanCaicedo/Software-TripleAAA/issues) en el repositorio.

---

⭐ Si este proyecto te ha sido útil, no olvides darle una estrella al repositorio.
