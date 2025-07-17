fun main() {
    // Ejercicio 1: calcularPromedio
    val numeros = listOf(10, 20, 30, 40)
    val promedio = calcularPromedio(numeros)
    println("Promedio: $promedio")

    // Ejercicio 2: Filtrar impares
    val listaNumeros = listOf(1,2,3,4,5,6,7,8,9,10)
    val impares = listaNumeros.filter { it % 2 != 0 }
    println("Números impares: $impares")

    // Ejercicio 3: isPalindrome
    println("Ingrese una palabra para verificar si es un palíndromo:")
    val input = readLine() ?: ""
    println("¿'$input' es palíndromo?: ${isPalindrome(input)}")

    // Ejercicio 4: Saludos con map
    val nombres = listOf("José", "Andres", "María")
    val saludos = nombres.map { "¡Hola, $it!" }
    saludos.forEach { println(it) }

    // Ejercicio 5: performOperation
    val resultadoSuma = performOperation(287, 290) { a, b -> a + b }
    val resultadoMultiplicacion = performOperation(30, 267) { a, b -> a * b }
    println("Suma: $resultadoSuma, Multiplicación: $resultadoMultiplicacion")

    // Ejercicio 6: Mapeo de Person a Student
    val personas = listOf(
        Person("Luis", 20, "Masculino"),
        Person("Ana", 22, "Femenino")
    )
    val estudiantes = personas.mapIndexed { index, p ->
        Student(p.name, p.age, p.gender, "ID${index + 1}")
    }

    estudiantes.forEach {
        println("El Estudiante ${it.name} tiene ${it.age} años")
    }
}

fun calcularPromedio(lista: List<Int>): Double {
    val suma = lista.reduce { acc, i -> acc + i }
    return suma.toDouble() / lista.size
}

fun isPalindrome(text: String) = text == text.reversed()

fun performOperation(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    return operacion(a, b)
}

data class Person(val name: String, val age: Int, val gender: String)
data class Student(val name: String, val age: Int, val gender: String, val studentId: String)
}

data class Person(val name: String, val age: Int, val gender: String)
data class Student(val name: String, val age: Int, val gender: String, val studentId: String)
