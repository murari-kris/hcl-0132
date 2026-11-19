 import React, { useEffect, useState } from 'react'

 function SampleCode({empdata}) {

  const[Counter,setCounter]=useState(20);
   const[pointer,setPointer]=useState(100);

  useEffect(()=>{
    
    console.log("Counter="+Counter);
    console.log("pointer="+pointer);
  },[Counter,pointer])

  function changeCounter(){
    setCounter(Counter+2);
    
  }

  function changePointer(){
     setPointer(pointer-2);
  }
  return (
    <div>
    
    <h2>Counter Value={Counter}</h2>
    <h2>Counter Value={pointer}</h2>
    <button onClick={changeCounter}>Counter</button>
    <button onClick={changePointer}>Counter</button>

    </div>
  )
}

export default SampleCode
