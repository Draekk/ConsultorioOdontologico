const showPass = document.getElementById('show-pass');
const hidePass = document.getElementById('hide-pass');
const passInput = document.getElementById('pass-input');

function toogleInactiveClass(element) {
    if (!element.classList.contains('inactive')) {
        element.classList.add('inactive');
    } else {
        element.classList.remove('inactive');
    }
}

hidePass.addEventListener('click', () => {
    passInput.type = 'text';
    toogleInactiveClass(showPass);
    toogleInactiveClass(hidePass);
});

showPass.addEventListener('click', () => {
    passInput.type = 'password';
    toogleInactiveClass(hidePass);
    toogleInactiveClass(showPass);
});