# 🌐 Desarrollo Web (HTML5 y CSS3)

## 🏗️ HTML Semántico: El Esqueleto 🩻

| Etiqueta | Función |
| :--- | :--- |
| `<!DOCTYPE html>` | Le dice al navegador que estás usando HTML5. |
| `<html>` | El contenedor raíz de todo el documento. |
| `<head>` | Metadatos, enlaces a CSS y título de la pestaña. |
| `<body>` | El cuerpo (todo lo que el usuario ve). |
| `<script>` | Contenedor para código **JavaScript**. |

### 🖋️ Texto y Contenido
* `<h1>` a `<h6>` : Títulos (H1 es el principal, H6 el más pequeño).
* `<p>` : Párrafos de texto.
* `<span>` : Para estilizar una palabra específica dentro de un texto.
* `<strong>` : Texto en **negrita** (importancia).
* `<em>` : Texto en *cursiva* (énfasis).
* `<br>` : Salto de línea simple.
* `<hr>` : Línea horizontal divisoria.

### 🔗 Enlaces y Multimedia
* `<a>` : Hipervínculos. Usa `href="url"` para el destino.
* `<img>` : Imágenes. Usa `src="ruta"` y `alt="descripción"`.
* `<iframe>` : Para incrustar videos de YouTube o mapas.

### 📋 Listas
* `<ul>` : Lista desordenada (puntos).
* `<ol>` : Lista ordenada (números).
* `<li>` : Elemento individual de la lista.

### 🗳️ Formularios
* `<form>` : Contenedor principal.
* `<label>` : Texto descriptivo para un input.
* `<input>` : Campo de entrada. Tipos: `text`, `password`, `email`, `submit`.
* `<textarea>` : Cuadro de texto multilínea.
* `<select>` y `<option>` : Menús desplegables.

---

## 🎨 CSS (Layout y Estilo)

> **Nota:** En CSS, las clases se llaman con punto `.clase` y los IDs con `#id`. ¡Usa siempre clases!

### 📦 Box Model (Modelo de Caja)
* `width` / `height` : Ancho y alto.
* `padding` : Espacio **dentro** del borde.
* `margin` : Espacio **fuera** del borde.
* `border` : Línea del cuadro (ej: `2px solid red`).
* `box-sizing: border-box;` : **TRUCO PRO.** Evita que el padding deforme el tamaño de la caja.

### 🌈 Colores y Fondos
* `color` : Color del texto.
* `background-color` : Color de fondo.
* `background-image` : Imagen de fondo (usa `background-size: cover;`).
* `opacity` : Transparencia (0 a 1).

### 📐 Flexbox (Alineación)
* `display: flex;` : Activa el modo flexible en el padre.
* `flex-direction: row | column;` : Dirección de los hijos.
* `justify-content` : Alineación horizontal.
* `align-items` : Alineación vertical.
* `gap` : Espacio entre hijos (ej: `gap: 20px;`).

### 📱 Responsive Design
```css
/* Para pantallas de celular (menos de 768px) */
@media (max-width: 768px) {
  .menu {
    flex-direction: column;
  }
}
