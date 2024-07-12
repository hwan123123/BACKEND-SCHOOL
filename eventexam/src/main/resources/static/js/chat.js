const ws = new WebSocket("ws://localhost:8080/ws");

ws.onmessage = (event) => {
    const chatMessage = document.getElementById("chatMessages");
    const chatElement = document.createElement("p");
    chatElement.innerText = event.data;
    chatMessage.appendChild(chatElement);
    chatMessage.scrollTop = chatMessage.scrollHeight;
};

const sendMessage = () => {
    const message = document.getElementById("message").value;
    if (message.trim() !== "") {
        ws.send(message);
        document.getElementById("message").value = '';
        document.getElementById("message").focus();
    }
};

document.getElementById("message").addEventListener("keypress", (event) => {
    if (event.key === "Enter") {
        sendMessage();
        event.preventDefault();
    }
});