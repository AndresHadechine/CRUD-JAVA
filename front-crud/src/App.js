
import { useState } from 'react';
import './App.css';

import Form from './components/Form';
import List from './components/List';


function App() {
  const [players, setPlayers] = useState([]);
  const setPlay = (player) => {setPlayers([...players,player])}
  return (
    <div className = 'container mt-3'>
    <Form setPlay = {setPlay} />
    <List players = {players} />
    </div>
  );
}

export default App;
