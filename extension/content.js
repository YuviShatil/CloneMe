const img = document.createElement("img");
img.src = chrome.runtime.getURL("image.jpg");
img.style.position = "fixed";
img.style.bottom = "10px";
img.style.right = "10px";
img.style.width = "60px";
img.style.height = "60px";
img.style.cursor = "pointer";
img.style.zIndex = "9999";
img.addEventListener("click", () => {
    window.open("https://github.com/YuviShatil/CloneMe", "_blank");
});
document.body.appendChild(img);