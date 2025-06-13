# 📚 Unidad 6: Arreglos (Arrays) en Java

Cuando tenemos que manejar muchos datos del mismo tipo, ¡usar variables independientes es un caos!  
Los **arreglos** o **arrays** nos permiten organizar y manipular listas ordenadas de datos.  

---

## 🎯 Objetivos de aprendizaje

- Entender qué es un arreglo y para qué sirve.
- Declarar, crear e inicializar arreglos en Java.
- Acceder y modificar elementos del arreglo.
- Recorrer arreglos con ciclos.
- Aplicar arreglos en problemas prácticos.

---

## 🗂 Contenidos

### 🧩 6.1 ¿Qué es un arreglo?

Un arreglo es una **estructura que almacena múltiples valores del mismo tipo** en una sola variable.  
Los valores se ordenan y acceden mediante un índice (número entero).

---

### 📝 6.2 Declaración y creación

```java
int[] numeros;          // Declaración
numeros = new int[5];   // Creación de un arreglo de 5 enteros
```

También se puede combinar:

```java
int[] numeros = new int[5];
```

---

### 🎯 6.3 Inicialización con valores

```java
int[] edades = {18, 20, 25, 30, 35};
```

---

### 🔢 6.4 Acceso a elementos

Cada elemento se accede por su índice (que comienza en 0):

```java
System.out.println(edades[2]);  // Imprime 25
```

Modificar un valor:

```java
edades[0] = 19;
```

---

### 🔄 6.5 Recorrer arreglos con ciclos

Usamos un ciclo `for` para recorrer todos los elementos:

```java
for (int i = 0; i < edades.length; i++) {
    System.out.println("Edad " + i + ": " + edades[i]);
}
```

También con `for-each` (más simple para solo leer):

```java
for (int edad : edades) {
    System.out.println("Edad: " + edad);
}
```

---

### 📚 6.6 Aplicaciones comunes

* Encontrar el mayor o menor valor.
* Calcular promedio.
* Buscar un elemento.
* Ordenar datos (concepto básico).

---

## 🧪 Actividades prácticas

| # | Actividad                | Descripción                                                      |
| - | ------------------------ | ---------------------------------------------------------------- |
| 1 | Crear arreglo de enteros | Declarar e inicializar un arreglo con 10 números.                |
| 2 | Promedio de edades       | Calcular y mostrar el promedio de un arreglo de edades.          |
| 3 | Buscar valor             | Pedir un número y buscar si está en el arreglo.                  |
| 4 | Modificar valores        | Cambiar un elemento específico y mostrar el arreglo actualizado. |
| 5 | Tabla de multiplicar     | Guardar los resultados de una tabla en un arreglo y mostrarla.   |

---

## 📘 Recursos adicionales

* [Arrays en Java – W3Schools](https://www.w3schools.com/java/java_arrays.asp)
* [Arreglos en Java – Programiz](https://www.programiz.com/java-programming/arrays)

---

## ⏭️ Próxima unidad: Estructuras de control de flujo

> ¡Vamos a dominar decisiones y repeticiones para hacer programas inteligentes y dinámicos! 🚦
