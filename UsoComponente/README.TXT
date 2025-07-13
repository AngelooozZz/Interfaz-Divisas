# ComponenteVisualDivisas

Un componente visual para conversión de divisas que obtiene tasas de cambio en tiempo real, desarrollado en Java Swing.

++ Características principales

- Conversión entre las 30 divisas más importantes del mundo
- Interfaz gráfica intuitiva
- Tasas de cambio en tiempo real
- Diseño personalizable

++ Requisitos

- Java JDK 8 o superior
- Archivo JAR de la librería *IntentodeLibreria33*

++ Uso

1. Ejecutar la clase principal `InterfazConvertir`
2. Seleccionar la divisa de origen
3. Seleccionar la divisa destino
4. Ingresar el monto a convertir
5. Hacer clic en el botón "Convertir"

++ Componentes personalizados

El proyecto incluye los siguientes componentes Swing personalizados:

- *MiComboBox*: ComboBox estilizado para selección de divisas
  - Dimensiones: 225x25 píxeles
  - Colores: Fondo blanco, texto negro

- *MiBoton*: Botón personalizado para realizar la conversión
  - Texto: "Convertir"
  - Dimensiones: 115x25 píxeles
  - Colores: Fondo blanco, texto negro

- *MiEtiquetaTitle*: Etiqueta de título principal
  - Texto: "Conversion Divisas"
  - Fuente: Tahoma, negrita, 16px
  - Alineación centrada

- *EtiquetaResultados*: Para mostrar los resultados de conversión
  - Dimensiones: 222x26 píxeles
  - Colores: Fondo blanco, texto negro

++ Personalización

Posibles modificaciones a  realizar:

- La manera en que se solicita el monto de cambio
- La forma de mostrar los resultados
- El diseño visual de los componentes
- Los colores y fuentes utilizadas
- La distribución de los elementos en la interfaz

++ Ejecución

Compilar y ejecutar el proyecto desde la clase principal:
java InterfazConvertir

++ Creditos 
@AngelooozZz
@VelascoYahir (colaborador)
* If two JAR files on the project classpath have the same name, only the first
JAR file is copied to the lib folder.
* Only JAR files are copied to the lib folder.
If the classpath contains other types of files or folders, these files (folders)
are not copied.
* If a library on the projects classpath also has a Class-Path element
specified in the manifest,the content of the Class-Path element has to be on
the projects runtime path.
* To set a main class in a standard Java project, right-click the project node
in the Projects window and choose Properties. Then click Run and enter the
class name in the Main Class field. Alternatively, you can manually type the
class name in the manifest Main-Class element.
