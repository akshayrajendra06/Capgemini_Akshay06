/* eslint-disable no-unused-vars */
import React, { useEffect } from "react";
import { Route, Router, Routes } from "react-router-dom";
import { Container,Button } from "reactstrap";

//rafce
const Home = () => {

    useEffect(()=>{
        document.title="Home || Thank You Visiting for website"
    },[]);
    
    return (
        <div>
            {/* <Jumbotron> */}
            <Container className="text-center">
                <h1 className="">Appointments Home Page </h1>

                <p >
                You can get information about Corona Hospital and about room services. 
                <br/> you want to know..? <br/>
                
               <i> Then click the button. </i>
                </p><a href="http://127.0.0.1:5501/src/Photos/Room.html">
                    <Button color="primary" outline>
                        Start Using 
                    </Button>
                    </a>
        
        


                </Container>
            {/* </Jumbotron> */}
        </div>
    );
}

export default Home;

