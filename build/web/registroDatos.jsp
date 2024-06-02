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
    <title>ActiveX - Registrarse</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous" />
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
    <script src="assets/js/main.js"></script>
    
</head>
<body>
    <div class="colAzul">
        <p class="brandActiveX">ActiveX</p>
        <img src="assets/img/registro/Saly-27.png" style="margin-left: 50px;width:30%" alt="alt"/>
    </div>
    <div class="colBlanca">
        <img class="saly15" src="assets/img/registro/Saly-25.png" style="margin-left: 40%;margin-top:20%" alt="alt"/>
    </div>
    <form class="container-login" method="post" action="dashboard.jsp" style="max-width: 1000px;min-width: fit-content;width: fit-content">
        <div class="container-contenidoLogin">
            <div>
                <p style="font-size: 30px">¡Bienvenido!</p>
                <p >Comencemos con algunos datos básicos sobre ti</p>
            </div>
            <div>
                <h1 class="ingresaTit">Tu perfil</h1>
            </div>
            <div class="mt-4 d-flex filaDatos1 " style="gap:25px;">
                <div style="max-width: 400px">
               <label for="nombreUsuario" class="form-label">Crea un nombre de usuario</label>
               <input type="text" class="form-control input" id="nombreUsuario" placeholder="Nombre de usuario" required>
            </div>
                <div>
                    <label for="validationCustom04" class="form-label">Selecciona tu objetivo</label>
                    <select class="form-select input" id="validationCustom04" required>
                      <option selected disabled value="">Selecciona...</option>
                      <option value="Reducir">Reducir Peso</option>
                      <option value="Mantener" >Mantenerme en forma</option>
                      <option value="Aumentar" >Ganar músculo</option>
                    </select>
                </div>
                <div>
                    <label for="validationCustom04" class="form-label">Selecciona tu membresía</label>
                    <select class="form-select input" id="validationCustom04" required>
                      <option selected disabled value="">Selecciona...</option>
                      <option value="Básica">Básica (Gratis)</option>
                      <option value="Intermedia" disabled="true">Intermedia ($150/mes)</option>
                      <option value="X" disabled="true">X (250$/mes)</option>
                    </select>
                </div>
            </div>
            <div class="d-flex filaDatos2 " style="gap:25px;margin-top: 35px">
                <div style="max-width: 400px">
                <label for="dateInput" class="form-label">Fecha de Nacimiento</label>
                <input type="date" class="form-control" id="dateInput" name="dateInput" required>
                <script>
                    document.addEventListener('DOMContentLoaded', function() {
                        var dateInput = document.getElementById('dateInput');
                        var today = new Date();
                        var minDate = new Date(today.getFullYear() - 17, today.getMonth(), today.getDate());
                        var minDateString = minDate.toISOString().split('T')[0];
                        dateInput.setAttribute('max', minDateString);
                    });
                </script>
            </div>
                <div>
                    <label for="pesoUsuario" class="form-label">Ingresa tu peso (kg)</label>
                    <input type="number" class="form-control" id="pesoUsuario" name="pesoUsuario" min="40" max="250" placeholder="Ej. 65" required>
                </div>
                <div>
                    <label for="estaturaUsuario" class="form-label">Ingresa tu estatura (m)</label>
                    <input type="number" class="form-control" id="estaturaUsuario" name="estaturaUsuario" min="1.30" max="2.20" step="0.01" placeholder="Ej. 1.70" required>
                </div>
                <div>
                    <label for="validationCustom04" class="form-label">Sexo</label>
                    <select class="form-select input" id="validationCustom04" required>
                      <option selected disabled value="">...</option>
                      <option value="Básica">Hombre</option>
                      <option value="Intermedia">Mujer</option>
                    </select>
                </div>
            </div>
            <div>
                <button class="btnIngresar" type="submit">
                    Comenzar
                </button>
            </div>
        </div>
    </form>
    
    <style><%@include file="assets/css/registroDatos.css"%></style>
   <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/main.js"></script>
   <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <!--SCRIPTS DE BOOTSTRAP-->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
</body>
</html>
