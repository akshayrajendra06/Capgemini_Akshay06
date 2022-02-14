/* eslint-disable no-unused-vars */
import logo from './logo.svg';
import './App.css';
import { Button, Col, Container, Row } from "reactstrap";
import { ToastContainer, toast } from "react-toastify";
import Home from "./components/Home";

import Header from "./components/Header";
import Menus from './components/Menus';
// import { Route, Router, Routes, Switch } from 'react-router-dom';
import {  BrowserRouter as Router, Route, Routes, Switch} from 'react-router-dom';
import AddRoom from './components/AddRoom';
import Allrooms from './components/Allrooms';


function App() {

  const btnHandle = () => {
    toast("this is my first Message")
    toast.success("Done ", { // toast.error("Error")
      position: "top-center"
    });
  };
  return (
    <div>
    
     <Router>    
        <ToastContainer />
        <Container>
          <Header />
          <Row>
            <Col md={2}>
              <Menus />
            </Col>
            <Col md={10}>
            
            <Routes>
              <Route path='/' element={<Home/>} exact ></Route>
              <Route path="/add-couses" element={<AddRoom/>} exact ></Route>
              <Route path="/all-courses" element={<Allrooms/>} exact ></Route>
            </Routes>
            
              
              {/* <Home/> */}
            </Col>
          </Row>
        </Container>
        </Router>
        
    </div>
  );
}

export default App;
