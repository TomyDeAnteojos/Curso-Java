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
