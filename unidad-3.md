# 🧭 Unidad 3: Estructuras de Control – Decisiones y Condicionales

¡Ahora nuestros programas pueden **pensar** y tomar **decisiones**! 🧠  
En esta unidad vamos a hacer que el código se adapte a diferentes situaciones. Vas a aprender a usar estructuras como `if`, `else`, `switch` y operadores lógicos para construir **código inteligente**.

---

## 🎯 Objetivos de aprendizaje

- Comprender cómo tomar decisiones en un programa usando condicionales.
- Utilizar operadores de comparación y lógicos.
- Aplicar estructuras de control como `if`, `if-else`, `else if` y `switch`.
- Resolver problemas donde el flujo del programa varía según condiciones.

---

## 🗂 Contenidos

### 🔍 3.1 Operadores Relacionales

- `==` igual a  
- `!=` distinto de  
- `>` mayor que  
- `<` menor que  
- `>=` mayor o igual  
- `<=` menor o igual  

```java
int edad = 18;
if (edad >= 18) {
    System.out.println("Es mayor de edad");
}
```

---

### ⚙️ 3.2 Sentencia `if`

* Flujo simple con `if`
* Flujo doble con `if` + `else`
* Flujo múltiple con `else if`
* Anidamiento de condiciones

```java
int numero = 5;
if (numero > 0) {
    System.out.println("Positivo");
} else if (numero < 0) {
    System.out.println("Negativo");
} else {
    System.out.println("Cero");
}
```

---

### 🔄 3.3 Operadores lógicos

| Operador | Descripción     | Ejemplo                              |
| -------- | --------------- | ------------------------------------ |
| `&&`     | AND lógico      | `edad > 18 && edad < 65`             |
| `\|\|`   | OR lógico       | `nota >= 6 \|   \| asistencia > 80`  |
| `!`      | Negación lógica | `!esAdmin`                           |

---

### 🎚 3.4 Estructura `switch`

Ideal cuando tenemos **muchas opciones discretas** (como menús o estados):

```java
int dia = 3;
switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    default:
        System.out.println("Día no válido");
}
```

---

### 💡 3.5 Buenas prácticas

* Siempre usar `break` en `switch`, salvo casos especiales.
* Evitar duplicación de condiciones.
* Leer condiciones como si fueran oraciones: que "suenen" lógicas.

---

## 🧪 Actividades prácticas

| # | Actividad                | Descripción                                            |
| - | ------------------------ | ------------------------------------------------------ |
| 1 | ¿Aprobó o no?            | Leer nota del estudiante y mostrar si aprueba (`>=6`). |
| 2 | Par o impar              | Determinar si un número es par o impar.                |
| 3 | Calculadora con `switch` | Leer operación y dos números, y mostrar el resultado.  |
| 4 | Clasificación de edades  | Mostrar si es niño, adolescente, adulto o mayor.       |
| 5 | Menú interactivo         | Crear menú con `switch` para seleccionar opciones.     |

---

## 📘 Recursos adicionales

* [Java If-Else Statements – W3Schools](https://www.w3schools.com/java/java_conditions.asp)
* [Operadores Lógicos en Java – Programiz](https://www.programiz.com/java-programming/logical-operators)
* [Java Switch – Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html)

---

## ⏭️ Próxima unidad: Estructuras de Control – Repeticiones con bucles

> El código ya piensa. Ahora también **repite tareas** de forma eficiente. ¡Llegan los bucles! 🔁
