# 🔁 Unidad 4: Estructuras de Control – Repeticiones (Bucles)

¡Llegó el momento de automatizar tareas repetitivas!  
Con los bucles, vas a poder ejecutar código **varias veces** sin tener que copiarlo. Vamos a dominar los tres bucles principales de Java: `while`, `do-while` y `for`.

---

## 🎯 Objetivos de aprendizaje

- Comprender cuándo y cómo usar bucles para repetir tareas.
- Utilizar correctamente `while`, `do-while` y `for`.
- Identificar condiciones de parada para evitar bucles infinitos.
- Aplicar bucles a problemas cotidianos de programación.

---

## 🗂 Contenidos

### 🔁 4.1 ¿Qué es un bucle?

Un bucle permite ejecutar un bloque de código varias veces mientras se cumpla una condición.

---

### 🔄 4.2 Bucle `while`

Ejecuta mientras la condición sea verdadera.  
Ideal cuando no sabemos cuántas veces se va a repetir.

```java
int i = 1;
while (i <= 5) {
    System.out.println("Valor: " + i);
    i++;
}
```

---

### 🔄 4.3 Bucle `do-while`

Ejecuta **al menos una vez**.
Primero hace, después pregunta.

```java
int i = 1;
do {
    System.out.println("Valor: " + i);
    i++;
} while (i <= 5);
```

---

### 🔁 4.4 Bucle `for`

Se usa cuando **sabemos cuántas veces** queremos repetir.
Más compacto y usado comúnmente.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Valor: " + i);
}
```

---

### ⚠️ 4.5 Control de flujo: `break` y `continue`

* `break`: sale del bucle inmediatamente.
* `continue`: salta al siguiente ciclo, sin terminar el actual.

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    if (i == 5) break;
    System.out.println(i);
}
```

---

### 🎯 4.6 Errores comunes y bucles infinitos

* Condiciones mal formuladas.
* Variables que nunca cambian.
* No usar correctamente el incremento/decremento.

---

## 🧪 Actividades prácticas

| # | Actividad               | Descripción                                                             |
| - | ----------------------- | ----------------------------------------------------------------------- |
| 1 | Números del 1 al 10     | Mostrar los números del 1 al 10 con cada tipo de bucle.                 |
| 2 | Tabla de multiplicar    | Mostrar la tabla del número que el usuario ingrese.                     |
| 3 | Suma de N números       | Leer `N` números y mostrar la suma total.                               |
| 4 | Ingreso de contraseñas  | Pedir al usuario que ingrese una contraseña correcta usando `do-while`. |
| 5 | Números pares hasta 100 | Mostrar los pares del 2 al 100 usando `for` y `continue`.               |

---

## 📘 Recursos adicionales

* [Java While Loop – W3Schools](https://www.w3schools.com/java/java_while_loop.asp)
* [Java For Loop – Programiz](https://www.programiz.com/java-programming/for-loop)
* [Bucles en Java – Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html)

---

## ⏭️ Próxima unidad: Funciones y métodos

> Vamos a **ordenar nuestro código** en bloques reutilizables. ¡Los métodos llegan para organizar el caos! 🧱
