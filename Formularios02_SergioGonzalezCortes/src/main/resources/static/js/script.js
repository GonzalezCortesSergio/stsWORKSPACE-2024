let formulario = document.forms.formulario;
let datosErroneos = false;
formulario.addEventListener("submit", comprobarFormulario);


function comprobarCamposRellenados() {
	let todosOk = true;
	
	
	for(let campo of formulario.elements) {
		
		if (campo.type === "text" && campo.value === "") {
			
			todosOk = false;
		}
	}
	
	if (!todosOk) {
		
		let mensajeError = formulario.nextElementSibling;
		
		mensajeError.classList.add("bg-danger");
		
		mensajeError.innerHTML = "No se puede enviar el formulario con los datos vacíos";
		
		datosErroneos = true;
	}
}

function comprobarDNI() {
	
	let letras = ["T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", 
    "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E",
    "T"];

    let campoDni = formulario.elements.dni;
    let letraDni = dni.value.substring(8, 9);
    let dniSinLetra = dni.value.split('');
    dniSinLetra.pop();
    dniSinLetra = dniSinLetra.join("");

    if (letras[dniSinLetra % 23] !== letraDni) {

        let mensajeError = campoDni.nextElementSibling;

        mensajeError.classList.add("bg-danger");
        mensajeError.innerHTML = "La letra del DNI es incorrecta";

        datosErroneos = true;
    }

}

function comprobarFormulario (evento) {
	
	evento.preventDefault();
	
	datosErroneos = false;
	
	comprobarCamposRellenados();
	comprobarDNI();
	
	if(!datosErroneos){
		formulario.submit();
	}
}