# Proyecto MiBoton

*MiBoton* es un componente visual personalizado desarrollado en Java con Swing, diseñado para ser usado dentro de NetBeans como un botón estilizado. Este proyecto forma parte del conjunto de componentes gráficos reutilizables del proyecto mayor *DivisasTAP*.

#  Descripción

Este proyecto contiene múltiples clases visuales que extienden componentes estándar de Java Swing, como *JButton*, *JComboBox* o *JLabel*, permitiendo mejorar la estética y la experiencia de usuario de interfaces gráficas.

# Componentes incluidos

| Clase                  | Descripción breve                                               |
|------------------------|-----------------------------------------------------------------|
| MiBoton                | Botón estilizado que puede ser arrastrado desde la paleta.      |
| MiComboBox             | ComboBox personalizado para selección de divisas u otros datos. |
| MiEtiquetaTitle        | Etiqueta decorativa para títulos.                               |
| EtiquetaResultados     | Etiqueta para mostrar resultados en pantalla.                   |
| PanelConversorDivisas  | Panel contenedor con dos combos y un botón de acción.           |

#  Objetivo

El objetivo de este proyecto es proporcionar componentes reutilizables y visualmente coherentes para aplicaciones desarrolladas en NetBeans, especialmente para interfaces relacionadas con conversión de divisas o entrada de datos estandarizados.

#  Cómo usar

*Uso en código:*
   ```java
   MiBoton boton = new MiBoton();
   boton.setText("Presionar");
   panel.add(boton);

@AngelooozZz
@VelascoYahir (colaborador)