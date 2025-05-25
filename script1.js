// Get the "Buy Now" button and the form container
const buyButton = document.getElementById('buyButton');
const formContainer = document.getElementById('personalInfoForm');

// When the "Buy Now" button is clicked, show the form
buyButton.addEventListener('click', function() {
    formContainer.style.display = 'block'; // Show the form
});
