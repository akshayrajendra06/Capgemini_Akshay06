import React from 'react';
import { Link } from 'react-router-dom';
import { ListGroup, ListGroupItem } from 'reactstrap';
// rafce 
const Menus = () => {
    
  return ( 
    <ListGroup>
        <Link className="list-group-item list-group-item-action" tag="a" to="/" action>
        Home
        </Link>
 
        <Link className="list-group-item list-group-item-action"  tag="a" to="/add-couses" action>
        Add Room 
        </Link>

        <Link className="list-group-item list-group-item-action"  tag="a" to="/all-courses" action>
        Viwe Rooms
         </Link>
{/* 
        <Link className="list-group-item list-group-item-action"  tag="a" to="#!" action>
        About 
        </Link>

        <Link className="list-group-item list-group-item-action"  tag="a" to="#!" action>
        Contact
         </Link> */}
    

    </ListGroup>


  
  )};

export default Menus;
