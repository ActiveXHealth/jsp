      function crearColorAleatorio() {
        var red = Math.floor(Math.random() * 256);
        var green = Math.floor(Math.random() * 256);
        var blue = Math.floor(Math.random() * 256);
        var colorAleatorio = "rgb(" + red + "," + green + "," + blue + ")";
        return colorAleatorio;
      }