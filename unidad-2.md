# 🧮 Unidad 2: Tipos de Datos, Variables y Operaciones

En esta unidad vas a aprender a **guardar información**, a **trabajar con números y textos**, y a **manipular datos** en tus programas. ¡Comenzamos a construir programas más útiles e inteligentes! 🤓⚙️

---

## 🎯 Objetivos de aprendizaje

- Comprender qué es una variable y cómo se declara en Java.
- Conocer los diferentes tipos de datos primitivos.
- Realizar operaciones matemáticas y concatenaciones.
- Escribir programas que interactúan con el usuario.

---

## 🗂 Contenidos

### 🧪 2.1 ¿Qué es una variable?

- Definición simple: "cajitas" donde guardamos información.
- Declaración de variables en Java:
  ```java
  int edad = 21;
  String nombre = "Lucía";

* Asignación y modificación de valores.
* Reglas para nombrar variables (nombres significativos, camelCase).

> 🔎 **Ejercicio mental:** Pensá 3 cosas que podrías guardar en una variable.

---

### 🔢 2.2 Tipos de datos primitivos

| Tipo      | Nombre                | Ejemplo                    |
| --------- | --------------------- | -------------------------- |
| `int`     | Números enteros       | `int edad = 18;`           |
| `double`  | Números con decimales | `double nota = 9.5;`       |
| `boolean` | Verdadero o falso     | `boolean aprobado = true;` |
| `char`    | Un solo carácter      | `char letra = 'A';`        |

> 🧠 **Importante:** Java es un lenguaje **fuertemente tipado**, ¡siempre tenés que declarar el tipo de dato!

---

### 🧵 2.3 Tipo de dato String

* Definición: cadenas de texto (no es primitivo, pero muy usado).
* Declaración y concatenación:

  ```java
  String saludo = "Hola, " + nombre;
  ```
* Métodos útiles: `.length()`, `.toUpperCase()`, `.toLowerCase()`

---

### ➕ 2.4 Operaciones básicas

* Aritméticas: `+`, `-`, `*`, `/`, `%`
* Concatenación de Strings con `+`
* Operaciones mixtas:

  ```java
  int a = 5;
  double b = 2.0;
  double resultado = a / b;
  ```

> ⚠️ Cuidado con las divisiones entre enteros. ¡Puede perderse la parte decimal!

---

### 👤 2.5 Entrada de datos del usuario

* Importación de Scanner:

  ```java
  import java.util.Scanner;
  ```
* Uso de `Scanner` para leer datos:

  ```java
  Scanner sc = new Scanner(System.in);
  System.out.print("Ingrese su nombre: ");
  String nombre = sc.nextLine();
  ```
* Métodos: `nextLine()`, `nextInt()`, `nextDouble()`

> 🚨 Siempre cerrar el `Scanner` con `sc.close();` cuando no se usa más.

---

## 🧪 Actividades prácticas

| # | Actividad                | Descripción                                       |
| - | ------------------------ | ------------------------------------------------- |
| 1 | Programa de presentación | Leer nombre, edad y mostrar saludo personalizado. |
| 2 | Calculadora básica       | Sumar, restar, multiplicar y dividir dos números. |
| 3 | Concatenación creativa   | Crear mensajes con varias variables (`String`).   |
| 4 | Longitud del nombre      | Mostrar cuántas letras tiene el nombre ingresado. |
| 5 | Desafío extra            | Leer nombre y año de nacimiento. Calcular edad.   |

---

## 📘 Recursos adicionales

* [Scanner en Java (Oracle)](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)
* [Guía de tipos de datos Java – Programiz](https://www.programiz.com/java-programming/data-types)
* [Java Operators – W3Schools](https://www.w3schools.com/java/java_operators.asp)

---

## ⏭️ Próxima unidad: Estructuras de Control – Decisiones con `if`, `else` y operadores lógicos

> ¡Ahora tus programas empezarán a tomar decisiones como verdaderas inteligencias! 🔍💡
