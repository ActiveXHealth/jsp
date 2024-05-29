//Mostrar y ocultar contraseña
var togglee = false;

function mostrar (id) {
    const fieldContraseña = document.getElementById(id);
    togglee = !togglee;
    if (togglee){
        fieldContraseña.setAttribute("type","text");
    } else {
        fieldContraseña.setAttribute("type", "password");
    }
}

//Cambiar de tema
var toggleModo = false;

document.getElementById("containerPresentacion");
const modoOscuro = () => {
    toggleModo = !toggleModo;
    if (toggleModo){
        //Modo oscuro
        containerPresentacion.style.backgroundImage ="linear-gradient(to bottom, rgb(121, 89, 212), rgb(76, 55, 135))";
    } else {
        //Modo claro
        containerPresentacion.style.backgroundImage ="linear-gradient(to bottom, var(--azul), rgb(62, 132, 136))";
    }
}

//Desplazar al inicio
function volverInicio(){
    scrollTo(top);
}