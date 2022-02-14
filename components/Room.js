/* eslint-disable no-unused-vars */
import axios from "axios";
import React from "react";
import { toast } from "react-toastify";


import {
    Card,
    CardBody,
    CardTitle,
    CardSubtitle,
    CardText,
    CardId,
    CardFooter,
    Button,
    Container ,} from "reactstrap";

import base_url from "../api/BootApi";

    const Room=({corona , update})=>{

        const deleteRoom=(id) =>{
            axios.delete(`${base_url}/courses/${id}`).then(
                (response)=>{
                        toast.success("Delete Successfully...!")
                        update(id);
                },(error)=>{
                    toast.error("Course not deletee !! Server problem ")
                }
            )
        }

        // const updateCouses=(id)=>{
        //     axios.put(`${base_url}/courses`).then(
        //         (response)=> {
        //             toast.success("Updete Successfully...!")
        //         },(error)=>{
        //             toast.error("Rr[rrroorEoor]...!")

        //         }
        //     )
        // }


        

        return (
            <Card className="text p-lg-1"> 
                <CardBody className="text-center p-3">
                <table className="table ">
                    <thead className="table-dark">
                    <tr>
                        <th>User Name </th>
                        <th>User Number </th>
                        <th> User Mail Id </th>
                        <th>Apoiments Date </th>
                    </tr>
                    </thead>
                    <tbody >
                        <tr>
                        <th>{corona.title}</th>
                        <th>{corona.id}</th>
                        <th>{corona.description}</th>
                        <th>{corona.date}</th>
                        </tr>
                    </tbody>
                    
                </table>

{/* 
                    <CardSubtitle  className="text font-monospace"> {corona.id} </CardSubtitle>
                    <CardSubtitle  className="text font-monospace"> {corona.title} </CardSubtitle>
                    <CardSubtitle  className="text font-monospace"> {corona.description} </CardSubtitle> */}

                </CardBody>

                <Container className="text-center">
                    <Button color="danger" onClick={()=>{
                        deleteRoom(corona.id);
                    }}>Delete</Button>
                    
                    {/* <Button  className="m-3" color="warning" onClick={()=> {
                        updateCouses(corona.id);
                    
                    }}>Update</Button> */}

                </Container>
            </Card>
        )
    }

    export default Room;