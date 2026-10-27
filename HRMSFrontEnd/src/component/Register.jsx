import React, { useState } from 'react'

function Register() {
    const[empId,setEmpId]=useState();
    const[EmpName,setEmpName]=useState();
    const[EmpDegination,setEmpDegination]=useState();
    const[TechStack,setTechStack]=useState();
    const[email,setEmail]=useState();
    const[password,setPassword]=useState();

    function sendData(){
         alert([empId,EmpName,EmpDegination,TechStack,email,password])
    }
  return (
    <div>
       <form>

        <div className="mb-3">
            <label className="form-label">Empid</label>
            <input
              type="number"
              onChange={(e)=>setEmpId(e.target.value)}
              className="form-control"
              placeholder="Enter empid"
              required
            />
            {empId}
          </div>

          <div className="mb-3">
            <label className="form-label">Name</label>
            <input
              type="text"
               onChange={(e)=>setEmpName(e.target.value)}
              className="form-control"
              placeholder="Enter name"
              required
            />
            {EmpName}
          </div>

          <div className="mb-3">
            <label className="form-label">Email Address</label>
            <input
              type="email"
               onChange={(e)=>setEmail(e.target.value)}
              className="form-control"
              placeholder="Enter email"
              required
            />
            {email}
          </div>

          <div className="mb-3">
            <label className="form-label">Degination</label>
            <input
              type="text"
               onChange={(e)=>setEmpDegination(e.target.value)}
              className="form-control"
              placeholder="Enter Degination"
              required
            />

            {EmpDegination}
          </div>

          <div className="mb-3">
            <label className="form-label">TechStack</label>
            <input
              type="text"
               onChange={(e)=>setTechStack(e.target.value)}
              className="form-control"
              placeholder="Enter TechStack like test Engineer, java, etc"
              required
            />

            {TechStack}
          </div>

          <div className="mb-3">
            <label className="form-label">Password</label>
            <input
              type="password"
               onChange={(e)=>setPassword(e.target.value)}
              className="form-control"
              placeholder="Enter password"
              required
            />

            {password}
          </div>

          <div className="mb-3 form-check">
            <input
              type="checkbox"
              className="form-check-input"
              id="remember"
            />
            <label className="form-check-label" htmlFor="remember">
              Remember me
            </label>
          </div>

          <button type="submit" className="btn btn-primary w-100" onClick={sendData}>
            Register
          </button>

        </form>

    </div>
  )
}

export default Register
