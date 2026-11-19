import { useState } from 'react'
import SampleCode from './component/SampleCode'
import UseFetchApi from './component/UseFetchApi'
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Home from './component/Home';
import Login from './component/Login';
import Register from './component/Register';
import Dashboard from './component/Dashboard';

function App() {

  //   const employee=[{
  //       ename:"Amit",
  //       empid:"3455"
  //   },
  //  {
  //       ename:"sumit",
  //       empid:"3455"
  //   },

  //   {
  //       ename:"ankur",
  //       empid:"3455"
  //   },
  // ]

  
 return ( <div>
        
        <BrowserRouter>
        <Routes>
          <Route path='/' element={<Home/>}></Route>
          <Route path='/login' element={<Login/>}></Route>
           <Route path='/register' element={<Register/>}></Route>
            <Route path='/dashboard' element={<Dashboard/>}></Route>
        </Routes>
        </BrowserRouter>
      
          
    </div>
  )
}

export default App
