/* eslint-disable no-useless-escape */
/* eslint-disable no-unused-vars */
import React, { useState,useEffect } from "react";

import base_url from "../api/BootApi";
import axios from "axios";
import { toast } from "react-toastify";
import Room from "./Room";

const Allrooms=()=>{

    useEffect(() =>{
        document.title="All  Room || See Your Emformation Propary";
    },[] ) // Only first time you will excute

// Function  to call server

const getAllRoomFromServer=() =>{
    axios.get(`${base_url}/courses`).then(
        (response)=>{
            // Success
            // console.log(response);
            console.log(response.data);
            toast.success("User Details  has been loade",{
                position:"bottom-center"
            });
                // position:"bottom-center",
                setRoom(response.data);
            
        },
        (error)=>{
            // for error 
            console.log(error);
            toast.error("Somthing went wrong Please check your net!...")
        }
    );

};

// Calling 

// Calling loading Courses  Function
useEffect(() =>{
    getAllRoomFromServer();
},[])


    const [rooms,setRoom] = useState([
        {id:5575, title:"Java Heere Bro " , description:"this is demo coures"  , date:"20/3/2020"}
    ]);

const updateCousesId=(id)=>{
    // eslint-disable-next-line eqeqeq
    setRoom(rooms.filter((c) => c.id != id));
};



    return(
        <div> 
            <h1 className="text-center">All Booking Details </h1>
            <p> <i>List of Room Details are  as Follows</i> </p>

     { rooms.length > 0
                ? rooms.map((item) => <Room  key={item.id} corona={item} update={updateCousesId}  />)
                : "No courses"}
        </div>
    );
    
}

export default Allrooms;