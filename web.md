# Comandos Web para Desarrollo Frontend 🦭

## HTML Semantico 

- Esqueleto 🩻

* <!DOCTYPE html> : Le dice al navegador que estás usando HTML5.

* <html> : El contenedor raíz de todo.

* <head> : La "mente" de la página (metadatos, enlaces a CSS, título de la pestaña).

* <body> : El "cuerpo" (todo lo que el usuario ve).

* <script> : Lo que vaya dentro estara con el lenguaje JavaScript

- Texto y contenido 🖋️

* <h1/> a <h6/>	Títulos (el 1 es el más importante, el 6 el más pequeño).

* <p/>	Párrafos de texto.

* <span/>	Para aplicar estilo a una palabra o frase específica dentro de un texto.

* <strong/>	Poner texto en negrita (importancia semántica).

* <em/>	Poner texto en cursiva (énfasis).

* <br/>	Salto de línea simple (no abuses de él, usa margen en CSS).

* <hr/>	Una línea horizontal divisoria.

- Enlaces y multimedia 🔗

* <a> : Hipervínculos. Atributos clave: href (destino) y target="_blank" (abrir en pestaña nueva).

* <img> : Imágenes. Atributos: src (ruta) y alt (texto descriptivo por si no carga).

* <video> / <audio> : Para insertar archivos multimedia. Usa el atributo controls para que aparezca el botón de play.

* <iframe> : Para incrustar otra página (como un video de YouTube o un mapa de Google).

- Listas 📋

* <ul> : Lista desordenada (bolitas/bullets).

* <ol> : Lista ordenada (1, 2, 3...).

* <li> : Cada elemento dentro de la lista.

- Formularios (Captura de datos) 🗳️

Esto lo verás mucho cuando empieces con bases de datos:

* <form> : El contenedor del formulario.

* <label> : La etiqueta de texto para un campo (ayuda a la accesibilidad).

* <input> : El campo donde se escribe. Atributos clave:

 * type="text" (Texto normal).

 * type="password" (Oculta los caracteres).

 * type="email" (Valida que sea un correo).

 * type="submit" (El botón de enviar).

* <textarea> : Cuadro de texto grande para comentarios.

* <select> / <option> : Menús desplegables.

- Tablas (Para mostrar datos técnicos) 📎

* <table> : La tabla completa.

* <tr> : Una fila (Table Row).

* <th> : Encabezado de columna (Table Header).

* <td> : Una celda normal (Table Data).

# CSS (Layaout)

En CSS, las clases se llaman con un punto (.clase) y los IDs con un hashtag (#id). Siempre prefiere usar clases, es mucho más limpio.

- Box Model 📦

* width / height: Ancho y alto (puedes usar px, %, o vh/vw).

* padding: Espacio dentro del borde (separa el texto de la orilla del cuadro).

* margin: Espacio fuera del borde (separa un cuadro de otro).

* border: El grosor, estilo y color de la línea del cuadro (ej: 2px solid red).

* box-sizing: border-box;: TRUCO PRO. Pon esto siempre para que el padding no "infle" el tamaño total de tu caja y no se te rompa el diseño.

- Colores y fondos 🌈

* color: Cambia el color del texto.

* background-color: Cambia el color de fondo.

* background-image: Para poner una foto de fondo. Usa background-size: cover; para que la foto no se estire feo.

* opacity: Para darle transparencia (de 0 a 1).

- Tipografia 🆎

* font-family: Elige la fuente (ej: 'Arial', 'Inter').

* font-size: Tamaño de la letra (mejor usa rem en vez de px para que sea escalable).

* font-weight: Grosor (bold, normal, 300, 700).

* text-align: Centrar, alinear a la izquierda o derecha.

* text-decoration: none;: Se usa mucho para quitarle la línea azul fea a los enlaces (<a>).

- Flexbox 📐

Ya no se usa float. Si quieres centrar algo, usa Flexbox. Se aplica al contenedor padre:

* display: flex;: Activa el modo flexible.

* flex-direction: row | column;: ¿Hijos en fila o en columna?

* justify-content: Alinea de forma horizontal (center, space-between, space-around).

* align-items: Alinea de forma vertical (center, flex-start, flex-end).

* gap: El espacio exacto entre los hijos (ej: gap: 20px;).

- Posicionamiento 📏

* position: relative;: El elemento se queda en su lugar, pero permite moverlo un poco.

* position: absolute;: El elemento se "sale" del flujo y vuela sobre los demás (útil para iconos sobre imágenes).

* position: fixed;: Se queda pegado aunque hagas scroll (como los menús de arriba).

* z-index: Define quién va encima de quién (como capas de Photoshop).

- Responsive Design (Celulares) 📱

/* Esto dice: "Si la pantalla mide menos de 768px, haz esto:" */
@media (max-width: 768px) {
  .menu {
    flex-direction: column;
  }
}
