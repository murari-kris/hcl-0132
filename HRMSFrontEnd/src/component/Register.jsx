import React, { useState } from "react";

function Register() {

    const [empId, setEmpId] = useState("");
    const [empName, setEmpName] = useState("");
    const [empDesignation, setEmpDesignation] = useState("");
    const [techStack, setTechStack] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [loading, setLoading] = useState(false);

    async function sendData(e) {
        e.preventDefault();

        const employee = {
            id: Number(empId),
            name: empName,
            designation: empDesignation,
            stack: techStack,
            email: email,
            password: password
        };

        try {
            setLoading(true);

            const response = await fetch(
                "http://localhost:8080/api/user/register",
                {
                    method: "POST",
                    headers: {
                        "Content-Type": "application/json"
                    },
                    body: JSON.stringify(employee)
                }
            );

            if (response.ok) {
                alert("Employee Registered Successfully!");

                // Clear form after successful registration
                setEmpId("");
                setEmpName("");
                setEmpDesignation("");
                setTechStack("");
                setEmail("");
                setPassword("");

            } else {
                const message = await response.text();
                console.log("Registration failed:", message);
                alert("Registration Failed!");
            }

        } catch (error) {
            console.error("Error:", error);
            alert("Unable to connect to Spring Boot server");
        } finally {
            setLoading(false);
        }
    }

    return (
        <div className="container mt-5 mb-5">

            <div className="row justify-content-center">
                <div className="col-md-6">

                    <div className="card shadow p-4">

                        <h3 className="text-center mb-4">
                            Employee Registration
                        </h3>

                        <form onSubmit={sendData}>

                            {/* Employee ID */}
                            <div className="mb-3">
                                <label className="form-label">
                                    Employee ID
                                </label>

                                <input
                                    type="number"
                                    className="form-control"
                                    placeholder="Enter Employee ID"
                                    value={empId}
                                    onChange={(e) => setEmpId(e.target.value)}
                                    min="1"
                                    required
                                />
                            </div>

                            {/* Employee Name */}
                            <div className="mb-3">
                                <label className="form-label">
                                    Employee Name
                                </label>

                                <input
                                    type="text"
                                    className="form-control"
                                    placeholder="Enter Employee Name"
                                    value={empName}
                                    onChange={(e) => setEmpName(e.target.value)}
                                    required
                                />
                            </div>

                            {/* Email */}
                            <div className="mb-3">
                                <label className="form-label">
                                    Email Address
                                </label>

                                <input
                                    type="email"
                                    className="form-control"
                                    placeholder="Enter Email"
                                    value={email}
                                    onChange={(e) => setEmail(e.target.value)}
                                    required
                                />
                            </div>

                            {/* Designation */}
                            <div className="mb-3">
                                <label className="form-label">
                                    Designation
                                </label>

                                <input
                                    type="text"
                                    className="form-control"
                                    placeholder="Enter Designation"
                                    value={empDesignation}
                                    onChange={(e) =>
                                        setEmpDesignation(e.target.value)
                                    }
                                    required
                                />
                            </div>

                            {/* Tech Stack */}
                            <div className="mb-3">
                                <label className="form-label">
                                    Tech Stack
                                </label>

                                <input
                                    type="text"
                                    className="form-control"
                                    placeholder="Java, React, Spring Boot"
                                    value={techStack}
                                    onChange={(e) => setTechStack(e.target.value)}
                                    required
                                />
                            </div>

                            {/* Password */}
                            <div className="mb-3">
                                <label className="form-label">
                                    Password
                                </label>

                                <input
                                    type="password"
                                    className="form-control"
                                    placeholder="Enter Password"
                                    value={password}
                                    onChange={(e) => setPassword(e.target.value)}
                                    minLength={8}
                                    autoComplete="new-password"
                                    required
                                />
                            </div>

                            {/* Submit Button */}
                            <button
                                type="submit"
                                className="btn btn-primary w-100"
                                disabled={loading}
                            >
                                {loading ? "Registering..." : "Register"}
                            </button>

                        </form>

                    </div>
                </div>
            </div>
        </div>
    );
}

export default Register;