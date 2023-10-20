# Explicación de código: Aplicación de Android con Jetpack Compose

## 1. Article App
Este código es una implementación básica de una aplicación de Android utilizando Jetpack Compose, una moderna biblioteca de desarrollo de interfaz de usuario (UI) que simplifica y ac

En el método onCreate, se configura el contenido de la actividad utilizando Jetpack Compose. Se establece un tema (ArticleTheme) y se crea una superficie (Surface) que ocupa toda la pantalla. Dentro de la superficie, se muestra la función ArticleImage.

```kotlin

@Composable
fun ArticleImage(modifier: Modifier = Modifier) {
    Column {
        // Muestra una imagen utilizando un recurso de drawable.
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = null
        )
        // Muestra dos bloques de texto.
        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
    }
}
```
El resultado sería el siguiente:

<img width="364" alt="Captura de pantalla 2023-10-20 a las 10 58 12" src="https://github.com/MinervaQuin/PAMN/assets/100958927/f226f53b-d654-41b3-9398-dd62b6054032">



Este código crea una aplicación de Android simple que utiliza Jetpack Compose para mostrar una pantalla que enseña un artículo. No ha habido ninguna incidencia ni problema al crear este programa.


## 2. Tasks Completed App
Este código es una implementación básica de una aplicación de Android donde se quiere crear una pantalla que muestre al usuario que todas sus tareas han sido realizadas.

```kotlin
@Composable
fun TasksCompleted(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.task_completed),
            contentDescription = null
        )
        Text(
            text = "All tasks completed",
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = "Nice work!",
            fontSize = 16.sp,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}
```
Se ha añadido una imagen ```kotlin Image(){ ...} ``` juntos a dos textos donde se ha especificado que no hay más tareas. No ha habido ningún problema, es un programa muy sencillo. El resultado sería el siguiente:

<img width="220" alt="Captura de pantalla 2023-10-20 a las 11 04 23" src="https://github.com/MinervaQuin/PAMN/assets/100958927/521a36f4-c519-4789-b2ae-1924e578cb8c">



## 3. Cuadrante App
Este código es una implementación básica de una aplicación de Android donde se quiere crear una pantalla que muestre al usuario un cuadrante. La pantalla es dividida en 4 y se han tenido que utilizar todas las técnicas del curso básico.

El código principal se divide en dos componentes composable.
### Information Card
Código que representa cada rectándulo donde se especifica información. Aquí se le da forma y se embellece el texto justificándolo, poniendo el texto a negrita, etc.

```kotlin
@Composable
fun Information(information: String, title: String,backColor: Color, modifier: Modifier = Modifier){
    Column (modifier = modifier
        .fillMaxSize()
        .background(backColor)
        .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "$title",
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(text = "$information",
            textAlign = TextAlign.Justify
        )
    }

}
```
### Cuadrante
En este código se divide la pantalla gracias al uso de ```kotlin Column() {
...} ```y ```kotlin Row() {...} ```. que permite crear una especie de malla o rendija en la que situar los elementos necesarios. Se ha utilizado el Modifier.fillMaxWidth(1f).

```kotlin
@Composable
fun Cuadrante(modifier: Modifier = Modifier) {
    Column (Modifier.fillMaxWidth()){
        Row(Modifier.weight(1f)){
                Information(information = "Displays text and follows the recommended Material Design guidelines.",
                    title = "Text composable", backColor =Color(0xFFEADDFF), modifier = Modifier.weight(1f) )

                Information(information = "Creates a composable that lays out and draws a given Painter class object.",
                title = "Image composable", backColor =Color(0xFFD0BCFF), modifier = Modifier.weight(1f) )


        }
        Row(Modifier.weight(1f)){


            Information("A layout composable that places its children in a horizontal sequence.",
                "Row composable",backColor = Color(0xFFB69DF8), modifier = Modifier.weight(1f))

            Information("A layout composable that places its children in a vertical sequence.",
                "Column composable",backColor = Color(0xFFF6EDFF), modifier = Modifier.weight(1f))


        }
    }


}
```
El resultado final sería el siguiente:

<img width="227" alt="Captura de pantalla 2023-10-20 a las 10 57 07" src="https://github.com/MinervaQuin/PAMN/assets/100958927/880b7051-a1dd-43ee-963d-b02ca8bb32c6">



## 3. Birthday Card App
