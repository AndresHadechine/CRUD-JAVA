import React, { Fragment, useState } from 'react';
import { Button, Table } from 'react-bootstrap';

const List = ({players}) => {


    return(
        <Table>
        <thead>
          <tr>
            <td><b>ID</b></td>
            &nbsp;&nbsp;
            <td><b>Nombre</b></td>
            <td><b>Color</b></td>
          </tr>
        </thead>
        <tbody>
          {players.map((player) => {
            return <tr key={player.id}>
              <td>{player.id}</td>
              &nbsp;&nbsp;
              <td>{player.name}</td>
              <td>{player.color}</td>
            </tr>
          })}
        </tbody>
      </Table>

        
    );
} 



export default List;