# 🔄 Unidad 7: Estructuras de Control de Flujo en Java

Para que un programa sea realmente útil, no basta con ejecutar instrucciones en orden, necesitamos que tome **decisiones** y **repita acciones** según distintas condiciones.  
Aquí es donde las **estructuras de control de flujo** entran en juego.

---

## 🎯 Objetivos de aprendizaje

- Comprender y utilizar sentencias condicionales (`if`, `else`, `switch`).
- Utilizar bucles o ciclos (`for`, `while`, `do-while`) para repetir código.
- Aplicar control de flujo en programas prácticos.
- Identificar la mejor estructura según el problema.

---

## 🗂 Contenidos

### ⚖️ 7.1 Sentencias condicionales

#### 7.1.1 `if` y `else`

Permiten ejecutar bloques de código según una condición:

```java
if (edad >= 18) {
    System.out.println("Eres mayor de edad");
} else {
    System.out.println("Eres menor de edad");
}
```

#### 7.1.2 `else if`

Para múltiples condiciones:

```java
if (nota >= 7) {
    System.out.println("Aprobado");
} else if (nota >= 4) {
    System.out.println("Regular");
} else {
    System.out.println("Reprobado");
}
```

---

### 🔀 7.2 Sentencia `switch`

Alternativa para muchas condiciones según un valor específico:

```java
switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    default:
        System.out.println("Día inválido");
}
```

---

### 🔄 7.3 Bucles o ciclos

#### 7.3.1 Ciclo `for`

Ideal para repetir un bloque un número conocido de veces:

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Repetición " + i);
}
```

#### 7.3.2 Ciclo `while`

Se repite mientras la condición sea verdadera:

```java
int i = 0;
while (i < 5) {
    System.out.println("While " + i);
    i++;
}
```

#### 7.3.3 Ciclo `do-while`

Se ejecuta al menos una vez, y luego repite mientras la condición sea verdadera:

```java
int i = 0;
do {
    System.out.println("Do-While " + i);
    i++;
} while (i < 5);
```

---

## 🧪 Actividades prácticas

| # | Actividad               | Descripción                                                        |
| - | ----------------------- | ------------------------------------------------------------------ |
| 1 | Validación de edad      | Pedir la edad y mostrar si es mayor o menor de edad.               |
| 2 | Clasificación de notas  | Mostrar mensaje según rango de nota usando `if-else if`.           |
| 3 | Menú con switch         | Crear un menú simple que muestre opciones según número ingresado.  |
| 4 | Imprimir números pares  | Usar un `for` para imprimir los primeros 10 números pares.         |
| 5 | Contador con while      | Contar de 10 a 1 usando `while`.                                   |
| 6 | Validación con do-while | Pedir un número positivo, repetir hasta que se ingrese uno válido. |

---

## 📘 Recursos adicionales

* [Control de flujo en Java – W3Schools](https://www.w3schools.com/java/java_conditions.asp)
* [Bucles en Java – Programiz](https://www.programiz.com/java-programming/for-loop)

---

## ⏭️ Próxima unidad: Programación orientada a objetos (POO)

> ¡Vamos a conocer cómo pensar en objetos para diseñar software moderno y organizado! 🧩
