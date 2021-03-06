import React, { Fragment, useState } from 'react';
import { Button, Table } from 'react-bootstrap';


const Form = ({ setPlay }) => {
    const [player, setPlayer] = useState({ ID: null, name: "", color: "", points: 0 });
    const inputChagens = (e) => { setPlayer({ ...player, [e.target.name]: e.target.value }); };
    const [podium, setPodium] = useState({ ID: null, firstPlace: "", secondPlace: "", thirdPlace: "" });
    const playGame = () => {
        fetch("http://localhost:8080/api/savePodium", {
            method: "GET",
            headers: {
                "Content-Type": "application/json",
            },
        }).then((response) => response.json())
            .then((Podium) => {
                setPodium({ ID: null, firstPlace: Podium.firstPlace, secondPlace: Podium.secondPlace, thirdPlace: Podium.thirdPlace });
                alert("Primer lugar: " + Podium.firstPlace + "\nSegundo lugar: " + Podium.secondPlace + "\nTercer lugar: " + Podium.thirdPlace);
            });
    };
    const addPlayer = () => {
        fetch("http://localhost:8080/api/setPlayer", {
            method: "POST",
            body: JSON.stringify(player),
            headers: {
                "Content-Type": "application/json",
            },
        }).then((response) => response.json())
            .then((player) => {
                setPlay(player);
                setPlayer({ ID: null, name: "", color: "", points: 0 });
                alert("Jugador agregado");
            });
    };
    const resetGame = () => {
        fetch("http://localhost:8080/api/resetGame", {
            method: "POST",
        }
        ).then(()=>{alert("Podio reiniciado");})
    };
    return (
        <Fragment>
            <h1><b>Juego de Carros</b></h1>
            <form className="row">
                <div className="col-md-4" >
                    <input
                        placeholder="Escribe el nombre del jugador nuevo"
                        className="form-control"
                        width="40px"
                        type="text"
                        name="name"
                        onChange={inputChagens}
                        value={player.name}
                    >
                    </input>

                </div>
                <div className="col-md-15" >
                    <select variant="warning" className="btn mr-2" name="color" onChange={inputChagens}  >
                        <option value="1">Seleccionar Carro</option>
                        <option value="Rojo">Rojo</option>
                        <option value="Verde">Verde</option>
                        <option value="Amarillo">Amarillo</option>
                        <option value="Azul">Azul</option>
                        <option value="Morado">Morado</option>
                        <option value="Naranja">Naranja</option>
                    </select>
                </div>
                <div className="col-md-15">
                    <Button
                        className="btn mr-2"
                        onClick={addPlayer}
                    >Crear</Button >
                </div>
                <div className="col-md-20">
                    <Button
                        variant="success"
                        className="btn mr-2"
                        onClick={playGame}
                    >Jugar</Button>
                </div>
                <div className="col-md-20">
                    <Button
                        variant="danger"
                        className="btn mr-2"
                        onClick={resetGame}
                    ><b>Borrar Score</b></Button>
                </div>
            </form>
        </Fragment>
    );

}
export default Form;