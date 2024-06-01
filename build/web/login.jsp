<%--
    Document   : login
    Created on : 1 jun 2024, 13:53:47
    Author     : Gael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>ActiveX - Iniciar Sesión</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous" />
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
    <script src="assets/js/main.js"></script>
    
</head>
<body>
    <div class="colMorada">
        <p class="brandActiveX">ActiveX</p>
        <img class="salyDiscover" src="assets/img/Saly-discover.png" alt="alt"/>
    </div>
    <div class="colBlanca">
        <img class="salySitting" src="assets/img/login/Saly-sitting.png" alt="alt"/>
    </div>
    <form class="container-login" method="post" action="registrarDatos.jsp">
        <div class="container-contenidoLogin">
            <div class="justify-content-between d-flex">
                <p class="encabezadoLogin saludoLogin">¡Hola de nuevo!</p>
                <p class="encabezadoLogin preguntaLogin text-end">¿No tienes una cuenta? <br><a style="color: var(--azul-aqua);text-decoration: none;" href="signUp.html">Crea una</a></p>
            </div>
            <div>
                <h1 class="ingresaTit">Ingresa</h1>
            </div>
            <div class="container-datos container-correoNombre">
                <label for="correo">
                    Introduce tu correo
                </label>
                <input type="email" class="fieldNombre field" id="correo" value="" placeholder="Tu correo" required>
            </div>
            <div class="container-datos container-contraseña">
                <label for="contraseñaLogin">
                    Introduce tu contraseña
                </label>
                <input class="fieldContraseña field" id="contaseñaLogin" placeholder="Tu contraseña" type="password" required>
                <div class="form-check pt-2 d-flex">
                <input class="form-check-input checkMostrar" type="checkbox" id="checkMostrar" onclick="mostrar('fieldContraseña1')"><label class="form-check-label px-2" for="checkMostrar">Mostrar contraseña</label>
                <a href="reset.html" class="olvidoContraseña text-end">
                    Olvidé mi contraseña
                </a>
                </div>
            </div>
            <div>
                <button class="btnIngresar" type="submit">
                    Ingresar
                </button>
            </div>
            <div class="mt-4">  
                <p class="text-center prefieresTxt">O si prefieres...</p>
            </div>
            <div>
                <button class="btnGoogle" type="button">
                    <div class="d-flex justify-content-center" style="gap:10px">
                        <img src="assets/img/google.png" alt="">
                        Ingresa con Google
                    </div>
                </button>
            </div>
        </div>
    </form>
    <style><%@include file="assets/css/login.css"%></style>
    <!--SCRIPTS DE BOOTSTRAP-->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
</body>
</html>
