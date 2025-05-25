function changeImage(pro2smallimg) {
  // Get the active image element
  const activeImage = document.getElementById("active-image");

  // Change the active image's source to the clicked thumbnail's source
  activeImage.src = pro2smallimg.src;

  // Remove the 'active' class from all thumbnails
  const thumbnails = document.querySelectorAll(".pro2smallimg");
  thumbnails.forEach((thumb) => thumb.classList.remove("active"));

  // Add the 'active' class to the clicked thumbnail
  pro2smallimg.classList.add("active");
}
