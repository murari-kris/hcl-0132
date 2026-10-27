import React from "react";

function Login() {
  const handleSubmit = (e) => {
    e.preventDefault();
  };

  return (
    <div className="container d-flex justify-content-center align-items-center min-vh-100">

      <div className="card shadow p-4" style={{ width: "400px" }}>

        <h3 className="text-center mb-4">HRMS Login</h3>

        <form onSubmit={handleSubmit}>

          <div className="mb-3">
            <label className="form-label">Email</label>
            <input
              type="email"
              className="form-control"
              placeholder="Enter email"
              required
            />
          </div>

          <div className="mb-3">
            <label className="form-label">Password</label>
            <input
              type="password"
              className="form-control"
              placeholder="Enter password"
              required
            />
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

          <button type="submit" className="btn btn-primary w-100">
            Login
          </button>

        </form>

      </div>
    </div>
  );
}

export default Login;