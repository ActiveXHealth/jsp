<%-- 
    Document   : index
    Created on : 29 may 2024, 21:17:22
    Author     : Gael
--%>

<%@page import="conexion.TestConexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ActiveX - Inicio</title>
    <!--CONEXIÓN CON BOOTSTRAP-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <!--LINK A FUENTES-->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
    <!--LINK AL ÍCONO DE LA PÁGINA-->
    <link rel="icon" type="image/png" href="assets/img/Logo.png">
    <!--LINK A CSS PRINCIPALES-->
    <link rel="stylesheet" href="assets/css/main.css">
    <link rel="stylesheet" href="assets/css/light-mode.css">
    <link rel="stylesheet" href="assets/css/dark-mode.css">
    <!--LINK A CSS ESPECÍFICO-->
    <link rel="stylesheet" href="assets/css/index.css">
    <!--CONEXIÓN CON LOS SCRIPTS-->
    <script src="assets/js/main.js"></script>
</head>
<body>
    <!--NAVBAR-->
    <nav class="navbar navbar-expand-lg border-bottom navbar1 light-mode">
        <div class="container-fluid">
          <a class="navbar-brand" href="index.html"><img src="assets/img/Logo.png" alt=""> ActiveX</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar" aria-controls="offcanvasNavbar" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasNavbar" aria-labelledby="offcanvasNavbarLabel">
            <div class="offcanvas-header">
              <h5 class="offcanvas-title" id="offcanvasNavbarLabel">ActiveX</h5>
              <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
            </div>
            <div class="offcanvas-body">
            <ul  class="navbar-nav justify-content-start flex-grow-1 pe-3">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="index.html">Inicio</a>
              </li>
              <li class="nav-item ">
                <a class="nav-link nav-link-hover" href="rutinas.html">Rutinas</a>
              </li>
              <li class="nav-item">
                <a class="nav-link disabled" href="#">Dietas</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="objetivos.html">Objetivos</a>
              </li>
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Explorar
                </a>
                <ul class="dropdown-menu">
                  <li><a class="dropdown-item disabled" href="#">Entrenadores</a></li>
                  <li><a class="dropdown-item disabled" href="#">Nutriólogos</a></li>
                  <li><hr class="dropdown-divider"></li>
                  <li><a class="dropdown-item" href="index.html">Quiénes somos</a></li>
                  <li><a class="dropdown-item" href="#">Contáctanos</a></li>
                </ul>
              </li>
            </ul>
            <div class="sesionBtns">
                <a class="btn btnSignIn mx-3" id="btnUno"  href="login.html" role="button" rel="noreferrer">Sign in</a>
                <button class="btnSignUp px-3 py-2" type="submit">Sign up</button>
                <button onclick="modoOscuro()" class="btn btnTemaOscuro"><img class="imgLuna" src="assets/img/moon.png" alt=""></button>
            </div>
          </div>
        </div>
      </nav>
    
    <!--PRESENTACIÓN-->
        <div class="container-fluid containerPresentacion row justify-content-center" id="containerPresentacion">
            <div class="col-xl-7 col-md-6 col-sm-3  colSaly">
                <img class="saly1" src="assets/img/saly1.png" alt="">
            </div>
            <div class="col-xl-5 col-md-8 col-sm-12 colPresentacion">
             <p class="presentacion"><b><span class="primerPalabra">Tus</span> rutinas.</b></p>
                <p class="presentacion"><b><span class="primerPalabra">Tu</span> dieta.</b></p>
                <p class="presentacion"><b><span class="primerPalabra">Tus</span> objetivos.</b></p>
                <p class="presentacion"><b><span class="primerPalabra">Todo</span> en un solo lugar.</b></p> 
                <div class="w-100 justify-content-center">
                    <p class="text-white info1" style="font-size: 20px;max-width: 100%;">Nos encargamos de ofrecerte la mejor experiencia, tomándonos en serio tu salud.</p>  
                </div>
                <div class="containerBtns d-flex">
                    <button class="btnEmpiezaAhora py-4 mx-2">
                        Empieza ahora
                    </button>
                    <button class="btnMasInfo py-4">
                        Más información
                    </button>
                </div>
            </div>
        </div>

    <!--CARACTERÍSTICAS-->
    <% 
        TestConexion con = new TestConexion();
        System.out.println("hola");
        %>
            <div class="container-fluid containerComienza">
                <img src="assets/img/Circle.png" class="circulos" style="position: absolute;margin-left: -15px;margin-top: 10px;" alt="">
                <img src="assets/img/Vector.png" style="position: absolute;margin: 50px 10% auto;" alt="">
                <img src="assets/img/Vector.png" style="position: absolute;margin: 250px 40% auto;" alt="">
                <img src="assets/img/Vector.png" style="position: absolute;margin: 100px 88% auto;" alt="">
                <h5 class="pt-5 pb-5 text-center">Comienza a utilizar ActiveX</h5>
                <div class="containerVentajas container" >
                    
                    <div class="col-xl col-sm col-md-3 contImg">
                        <img class="v" src="assets/img/v1.png">
                        <p class="mt-3 titVentajas">Entrenadores <br><span class="subtitVentajas">certificados</span></p>
                    </div>
                    <div class="col-xl col-sm col-md-3 contImg">
                        <img class="v" src="assets/img/v2.png">
                        <p class="mt-3 titVentajas">Seguimiento <br><span class="subtitVentajas">de objetivos</span></p>
                    </div>
                    <div class="col-xl col-sm col-md-3 contImg">
                        <img class="v" src="assets/img/v3.png">
                        <p class="mt-3 titVentajas">Seguimiento <br><span class="subtitVentajas">de objetivos</span></p>
                    </div>
                </div>
            </div>

            <!--POR QUÉ UTILIZAR ACTIVEX-->
            <div class="container-fluid containerPorque">
                <h3 class="pt-5 pb-5 text-center text-white">¿Por qué utilizar ActiveX?</h3>
                <div class="row">
                    <div class="col text-center"><img class="saly15" src="assets/img/Saly-15.png" alt="">
                    </div>
                    <div class="col-xl col-sm-12 text-center colInfo1">
                        <div class="infoPorque"><img src="assets/img/Frame 4873.png" class="img" alt=""><p class="text-white pInfoPorque">Planes de dieta y rutinas de ejercicio personalizadas.</p></div>
                        <div class="infoPorque"><img src="assets/img/Frame 4874.png" class="img" alt=""><p class="text-white  pInfoPorque">ActiveX te acompaña a donde sea que vayas. Siempre a tu alcance</p></div>
                        <div class="infoPorque"><img src="assets/img/Frame 4875.png" class="img" alt=""><p class="text-white  pInfoPorque">Seguimiento detallado de tus objetivos.</p></div>
                    </div>
                </div>
            </div>

            <!--SERVICIOS-->
            <div class="container-fluid containerServicios">
              <h3 class="pt-5 pb-5 text-center text-white">Servicios</h3>
              <div class="row servicios text-white" style="width: 80%; margin: auto;font-size: 20px;">
                  <div class="col servicio text-center">
                      <img src="assets/img/calendar2-check.png" class="img mb-3" alt="">
                      <p>Entrenamiento</p>
                  </div>
                  <div class="col servicio text-center">
                      <img src="assets/img/graph-up-arrow.png" class="img mb-3" alt="">
                      <p>Dieta enfocada a tus objetivos</p>
                  </div>
                  <div class="col servicio text-center">
                      <img src="assets/img/estats.png" class="img mb-3" alt="">
                      <p>Seguimiento constante</p>
                  </div>
                  <div class="col servicio text-center">
                      <img src="assets/img/cloud-arrow-up-fill.png" class="img mb-3" alt="">
                      <p>Renovación de rutinas y dieta</p>
                  </div>
              </div>
            </div>

            <!--PLANES-->
            <div class="container-fluid containerPlanes">
            <h2 class="pt-5 pb-2 text-center txtPlanes" style="font-weight: 600;">Nuestros Planes</h2>
            <h5 class="pb-5 text-center" style="font-weight: 400;">La solución para conseguir tus objetivos</h5>

            <div class="row justify-content-center planes" style="width: 70%; margin: auto; font-size: 20px;">
                <div class="col-lg col-md-12 col-sm-12 mb-4 d-flex justify-content-center">
                    <div class="plan planA text-center">
                        <h4 class="pt-4" style="font-weight: 600;">Plan básico</h4>
                        <h1 class="pt-2 pb-3">Gratis</h1>
                        <ul class="text-start" style="font-size: 17px;font-weight: 300;">
                            <li>Rutinas enfocadas a tus objetivos (generadas automáticamente)</li>
                            <li>Dieta generada automáticamente</li>
                            <li>Seguimiento de objetivos</li>
                        </ul>
                        <button class="mb-4 mt-3 btnA" style="font-weight: 500;"><a href="login.html" style="text-decoration: none;color: white;">¡Comienza ya!</a></button>
                    </div>
                </div>
                <div class="col-lg col-md-12 col-sm-12 mb-4 d-flex justify-content-center" style="cursor: not-allowed;">
                    <div class="plan planX text-center">
                        <h2 style="font-weight: 600;">Plan X</h2>
                        <p style="font-weight: 300;">El plan <b>definitivo</b> para tu cambio físico</p>
                        <h1 class="pb-3">$250<sub style="font-size: 20px;">/mes</sub></h1>
                        <ul class="text-start" style="font-size: 17px;font-weight: 300;">
                            <li>Todos los beneficios del plan intermedio</li>
                            <li>Creador de rutinas</li>
                            <li>Entrenador personal</li>
                            <li>Nutriólogo personal</li>
                            <li>Panel de control completo y detallado</li>
                            <li>Comunicación directa con tus preparadores físicos</li>
                        </ul>
                        <button class="btnX" style="font-weight: 500;cursor: not-allowed">Ver más</button>
                    </div>
                </div>
                <div class="col-lg col-md-12 col-sm-12 mb-4 d-flex justify-content-center"style="cursor: not-allowed;">
                    <div class="plan planA text-center">
                        <h4 class="pt-4" style="font-weight: 600;">Plan intermedio</h4>
                        <h1 class="pt-2 pb-3">$150<sub style="font-size: 20px;">/mes</sub></h1>
                        <ul class="text-start" style="font-size: 17px;font-weight: 300;">
                            <li>Rutinas asignadas por un profesional</li>
                            <li>Dieta personalizada y realizada por un especialista</li>
                            <li>Opción de solicitar una nueva rutina o cambiar de objetivo en cualquier momento</li>
                            <li>Seguimiento de objetivos</li>
                        </ul>
                        <button class="btnA" style="font-weight: 500;cursor: not-allowed">Ver más</button>
                    </div>
                </div>
            </div>
            </div>

            <!--FOOTER-->
            <footer class="container-fluid footer">
                <div class="row">
                    <div class="col-xl-6 col-sm-12 mx-5">
                        <h3 style="margin-top: 50px;"><img src="assets/img/Logo.png" style="width: 35px;" alt=""> ActiveX</h3>
                        <p class="" style="max-width: 85%;margin-top: 50px;">ActiveX es una plataforma dedicada al bienestar que ofrece planes de dieta personalizados, rutinas de ejercicio adaptadas y seguimiento de objetivos. Nuestro enfoque se basa en proporcionar herramientas prácticas respaldadas por profesionales en salud y fitness. Creemos en la importancia de un enfoque equilibrado y sostenible para mejorar la salud y el bienestar. </p>
                        <p class="mt-4" style="color: rgb(102, 102, 102);">Todos los precios se muestran en la moneda nacional de México*</p>
                    </div>
                    <div class="col-xl-5 col-sm-12">
                        <div class="row" style="color: rgb(22, 22, 22);font-weight: 500;">
                            <div class="col mt-5">
                                <h5>Servicios</h5>
                                <div class="mt-5 servicios">
                                    <p>
                                        Entrenadores
                                    </p>
                                    <p>
                                        Nutriólogos
                                    </p>
                                    <p>
                                        Objetivos
                                    </p>
                                </div>
                            </div>
                            <div class="col mt-5">
                                <h5>Explorar</h5>
                                <div class="mt-5 servicios">
                                    <p>
                                        Quiénes somos
                                    </p>
                                    <p>
                                        Nutriólogos
                                    </p>
                                    <p>
                                        Objetivos
                                    </p>
                                </div>
                            </div>
                            <div class="col mt-5">
                                <h5>Contáctanos</h5>
                                <div class="mt-5 servicios">
                                    <p>
                                        <div class="row">
                                            <div class="col-2">
                                                <img src="assets/img/Frame 69.png" alt="">
                                            </div>
                                            <div class="col-10">
                                                Mar Mediterráneo 227, Nextitla, Miguel Hidalgo, 11420 Ciudad de México, CDMX
                                            </div>
                                        </div>
                                    </p>
                                    <p>
                                        <div class="row">
                                            <div class="col-2">
                                                <img src="assets/img/Frame 70.png" alt=""> 
                                            </div>
                                            <div class="col-10" style="margin-top: 6px">
                                                activexhealth@gmail.com
                                            </div>
                                        </div>
                                       
                                    </p>
                                    <p>
                                       <img src="assets/img/Frame 71.png" alt=""> +52 55 8923 5490
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div style="max-width: 100%;">
                        <hr class="mx-5" style=" border-width: 4px;border-color: black;">
                    </div>
                    <div class="mx-5" style="max-width: 95%; display: flex;justify-content: space-between;font-weight: 550;">
                            <p>ActiveX 2024 © All right reserved</p>
                            <p>Terms & Conditions</p>
                    </div>
                </div>
            </footer>

            
    
            <!--SCRIPTS DE BOOTSTRAP-->
            <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
</body>
</html>

