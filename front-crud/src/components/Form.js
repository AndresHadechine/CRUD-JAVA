import React,{Fragment, useState} from 'react';
import { Button, Table } from 'react-bootstrap';


const Form = () => {

    return (
        <Fragment>
        <h1><b>Juego de Carros</b></h1>
        <form className ="row">
                <div  className="col-md-4" >
                    <input
                     placeholder = "Escribe el nombre del jugador nuevo"
                     className = "form-control"
                     width = "40px"
                     type = "text" 
                     >
                    </input>
                </div>
                <div  className="col-md-15" >
                <Button variant = "warning" className = "btn mr-2" >Lista de Carros</Button>
                </div>
                <div  className="col-md-15">
               <Button className = "btn mr-2" >Crear</Button >
                </div>
                <div  className="col-md-20">
               <Button variant = "success" className = "btn mr-2">Jugar</Button>
                </div>
                <div  className="col-md-20">
               <Button variant = "danger" className = "btn mr-2"><b>Borrar Score</b></Button>
                </div>
        </form>
        </Fragment>
     );

}
export default Form;