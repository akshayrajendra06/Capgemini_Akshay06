
import React, { Fragment, useEffect, useState } from 'react';
import { Button, Container, Form, FormGroup, Input } from 'reactstrap';
import axios from 'axios';
import base_url from '../api/BootApi';
import { toast } from 'react-toastify';

const AddRoom = () => {

  useEffect(() =>{
    document.title="Add user Detatils  || Propary "
  },[]);


  const [room , setRoom]=useState({});

  // form handle Fuction
  const handleForm=(e)=>{
    console.log(room);
      postDatatoServer(room)
    e.preventDefault();
  };


  // Creating Function to post data on server
  const postDatatoServer=(data)=>{
    axios.post(`${base_url}/courses`,data).then(
      (response)=>{
        console.log(response);
        console.log("Success");
        toast.success(("Appoimenet Add Successfully..!"));
        setRoom({id:"",title:"",description:"" ,date:""});
      },
      (error)=>{
        console.log(error);
        console.log("Error");
        toast.error("Please check Your Server....!")
      }
    )
  }

  return (


      <Fragment>
      <h1 className='text-center m-lg-3' >Fill Patient Details</h1>

      <Form onSubmit={handleForm}>
        <FormGroup>
         <lable  for="title">Enter User Name </lable>
         <Input 
         type='text' placeholder='Enter Your Name'
          id='title'
         onChange={(e)=>{
          setRoom({...room,title:e.target.value });
         }}
         />
        </FormGroup>
        <FormGroup>
              <label>Contact Number</label>
              <Input  type='text' 
              placeholder='Enter here Number' 
                name='id'
                id='id'
                onChange={(e)=>{
                  setRoom({...room, id: e.target.value})
                }}
              />
         </FormGroup>

        <FormGroup>
            <labe for="description">Email</labe>
            <Input type='text'
            placeholder='Enter Your Email Id'
            id='description' 
            // style={{height : 100 }}
          onChange={(e)=>{
            setRoom({...room,description:e.target.value});
          }}
         />
        </FormGroup>

        
        <FormGroup>
            <labe for="date">Enter Your Apoiments Date </labe>
            <Input type='date'
           
            id='date' 
          onChange={(e)=>{
            setRoom({...room,date:e.target.value});
          }}
         />
        </FormGroup>



        <Container className='text-center'>
            <Button type='submit' color='success'>Get Appointment
            </Button>

            <Button type='reset' onClick={()=>{
              setRoom({id:"",title:"",description:""})
            }} color="warning m-lg-3"
            >Clear</Button>
        </Container>


      </Form>

      </Fragment>
  );
};

export default AddRoom;
