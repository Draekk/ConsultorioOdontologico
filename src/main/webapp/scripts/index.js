const menuOdontologo = document.getElementById('menu-odontologo');
const menuPaciente = document.getElementById('menu-paciente');
const odontologo = document.getElementById('odontologo');
const paciente = document.getElementById('paciente');

function toogleIncativeClass(element) {
  if (!element.classList.contains('inactive')) {
    element.classList.add('inactive');
  } else {
    element.classList.remove('inactive');
  }
}

odontologo.addEventListener('click', () => {
  toogleIncativeClass(menuOdontologo);
});

paciente.addEventListener('click', () => {
  toogleIncativeClass(menuPaciente);
});

