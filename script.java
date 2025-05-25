// script.js
document.addEventListener('DOMContentLoaded', function() {
    const buyButtons = document.querySelectorAll('.buy-btn');
    let cart = [];

    // Function to add product to cart
    function addToCart(productName, productPrice) {
        cart.push({ name: productName, price: productPrice });
        alert(`${productName} has been added to your cart!`);
    }

    // Add event listener for each "Buy Now" button
    buyButtons.forEach(button => {
        button.addEventListener('click', function() {
            const productCard = button.parentElement;
            const productName = productCard.querySelector('h3').textContent;
            const productPrice = productCard.querySelector('p').textContent.split('$')[1];
            addToCart(productName, parseFloat(productPrice));
        });
    });
});

var MainImge = document.getElementsById('active-image')
var smallimg = document.getElementsByClassName('pro2-small-img')

smallimg [0].onclick = function (){
    MainImge.src = smallimg.src[0];
}
smallimg["1"].onclick = function(){
    MainImge.src = smallimg.src["1"];
}
smallimg[2].onclick == function(){
    MainImge.src = smallimg.src[2];
}
smallimg[3].onclick == function (){
    MainImge.src = smallimg.src[3];
}
