document.getElementById("registroForm").addEventListener("submit", function (e) {
    e.preventDefault();

    const formData = new FormData(e.target);
    const data = {
        placa: formData.get("placa"),
        marca: formData.get("marca"),
        modelo: formData.get("modelo"),
        color: formData.get("color"),
        ubicacion: formData.get("ubicacion"),
        idTipoVehiculo: parseInt(formData.get("idTipoVehiculo"))
    };

    fetch("/admin/vehiculos", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(data)
    })
        .then(res => res.json())
        .then(res => {
            alert("Vehículo registrado");
            cargarVehiculos();
        })
        .catch(err => console.error("Error al registrar:", err));
});

function cargarVehiculos() {
    fetch("/admin/vehiculos")
        .then(res => res.json())
        .then(data => {
            const contenedor = document.getElementById("listaVehiculos");
            contenedor.innerHTML = "";
            data.forEach(v => {
                contenedor.innerHTML += `<p>${v.placa} - ${v.marca} - ${v.ubicacion}</p>`;
            });
        });
}

cargarVehiculos();