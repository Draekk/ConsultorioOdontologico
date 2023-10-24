const menuOdontologo = document.getElementById('menu-odontologo');
const menuPaciente = document.getElementById('menu-paciente');
const menuUsuario = document.getElementById('menu-usuario');
const odontologo = document.getElementById('odontologo');
const paciente = document.getElementById('paciente');
const usuario = document.getElementById('usuario');

function toogleInactiveClass(element) {
    if (!element.classList.contains('inactive')) {
        element.classList.add('inactive');
    } else {
        element.classList.remove('inactive');
    }
}

odontologo.addEventListener('click', () => {
    toogleInactiveClass(menuOdontologo);
});

paciente.addEventListener('click', () => {
    toogleInactiveClass(menuPaciente);
});

usuario.addEventListener('click', () => {
    toogleInactiveClass(menuUsuario);
});

