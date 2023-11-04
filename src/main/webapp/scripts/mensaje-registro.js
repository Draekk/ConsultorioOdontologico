const popUp = document.querySelector('.pop-up');
const btnClose = document.getElementById('pop-up-close');

function toggleInactiveClass(element) {
    if (!element.classList.contains('inactive')) {
        element.classList.add('inactive');
    } else {
        element.classList.remove('inactive');
    }
}

btnClose.addEventListener('click', () => {
   toggleInactiveClass(popUp); 
});
