# 🧱 Unidad 5: Funciones y Métodos en Java

Organizar nuestro código es clave para crecer como programadores.  
Con los **métodos**, podemos dividir nuestros programas en **bloques reutilizables y ordenados**. ¡Bienvenido al poder de la modularidad!

---

## 🎯 Objetivos de aprendizaje

- Comprender la importancia de reutilizar código con métodos.
- Declarar y utilizar métodos con y sin parámetros.
- Retornar valores desde un método.
- Aplicar buenas prácticas en el diseño de funciones.

---

## 🗂 Contenidos

### 🧠 5.1 ¿Qué es un método?

Un método (o función) es un **bloque de código con nombre** que se ejecuta cuando se lo llama.  
Permite dividir el problema en partes más pequeñas y reutilizables.

---

### ✍️ 5.2 Declaración y sintaxis básica

```java
public static void saludar() {
    System.out.println("¡Hola desde un método!");
}
````

* `public static`: modificadores (los usaremos siempre al principio por ahora).
* `void`: tipo de retorno (`void` = no devuelve nada).
* `saludar()`: nombre del método + paréntesis vacíos (sin parámetros).
* `{ ... }`: bloque de código del método.

---

### 📞 5.3 Llamado a métodos

```java
public class Main {
    public static void main(String[] args) {
        saludar(); // Llamamos al método
    }

    public static void saludar() {
        System.out.println("¡Hola!");
    }
}
```

---

### 🎁 5.4 Métodos con parámetros

Podemos enviar datos al método:

```java
public static void saludarNombre(String nombre) {
    System.out.println("¡Hola " + nombre + "!");
}
```

Llamado:

```java
saludarNombre("Ana");
```

---

### 🔙 5.5 Métodos con retorno de valor

Un método puede devolver un valor, por ejemplo, un número:

```java
public static int sumar(int a, int b) {
    return a + b;
}
```

Llamado:

```java
int resultado = sumar(4, 5);
System.out.println("Resultado: " + resultado);
```

---

### 📌 5.6 Buenas prácticas

* Usar **nombres claros** (`calcularPromedio`, `mostrarMensaje`, etc.).
* Un método = una responsabilidad.
* Evitar métodos muy largos.
* Siempre que puedas: **modularizá**.

---

## 🧪 Actividades prácticas

| # | Actividad            | Descripción                                                                 |
| - | -------------------- | --------------------------------------------------------------------------- |
| 1 | Método saludar       | Crear un método que imprima un saludo simple.                               |
| 2 | Tabla de multiplicar | Crear un método que reciba un número y muestre su tabla.                    |
| 3 | Calculadora          | Crear métodos `sumar`, `restar`, `multiplicar`, `dividir`.                  |
| 4 | Verificador de mayor | Crear un método que reciba dos números y devuelva el mayor.                 |
| 5 | Nombre completo      | Crear un método que reciba nombre y apellido y devuelva el nombre completo. |

---

## 📘 Recursos adicionales

* [Métodos en Java – W3Schools](https://www.w3schools.com/java/java_methods.asp)
* [Funciones y Parámetros – Programiz](https://www.programiz.com/java-programming/methods)

---

## ⏭️ Próxima unidad: Arreglos (Arrays)

> ¡Vamos a trabajar con listas de datos! Imaginá tener cientos de variables... ahora solo con una línea. 🚀
