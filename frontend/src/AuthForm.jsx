
import React, { useState, useActionState } from 'react';
import api from './api';
import SubmitButton from './SubmitButton';

const AuthForm = ({ onLogin }) => {

    const [mode, setMode] = useState("login");

    const submitAction = async (prevState, formData) => {

        const username = formData.get("username")?.trim();
        const password = formData.get("password");

        if (!username || !password) {
            return {
                error: "Username and password are required",
                msg: "",
                username: username || ""
            };
        }

        try {

            if (mode === "register") {

                await api.post("/auth/register", {
                    username,
                    password
                });

                setMode("login");

                return {
                    error: null,
                    msg: "Registration successful! Please login.",
                    username
                };
            }

            // Login API
            const { data } = await api.post("/auth/login", {
                username,
                password
            });

            if (!data.token) {
                throw new Error("JWT token was not returned by the server");
            }

            // Store JWT
            localStorage.setItem("token", data.token);
            localStorage.setItem("username", data.username || username);

            // Notify parent component
            onLogin(data.username || username);

            return {
                error: null,
                msg: "",
                username: data.username || username
            };

        } catch (error) {

            console.error("Authentication error:", error);
            console.error("Backend response:", error.response?.data);

            return {
                error:
                    error.response?.data?.error ||
                    error.response?.data?.message ||
                    error.message ||
                    "Something went wrong. Please try again.",
                msg: "",
                username
            };
        }
    };

    const [state, formAction, isPending] = useActionState(
        submitAction,
        {
            error: null,
            msg: "",
            username: ""
        }
    );

    return (

        <div className="min-h-screen flex items-center justify-center bg-gradient-to-br from-blue-100 via-slate-100 to-indigo-100 px-4 py-10">

            <div className="w-full max-w-md">

                <div className="text-center mb-8">

                    <div className="inline-flex items-center justify-center w-16 h-16 bg-blue-600 text-white rounded-2xl shadow-lg mb-4">
                        <span className="text-3xl font-bold">J</span>
                    </div>

                    <h1 className="text-3xl font-bold text-slate-800">
                        JWT Authentication
                    </h1>

                    <p className="text-slate-500 mt-2">
                        Secure login powered by Spring Boot
                    </p>

                </div>

                <div className="bg-white rounded-2xl shadow-xl p-8">

                    <div className="flex bg-slate-100 rounded-lg p-1 mb-7">

                        <button
                            type="button"
                            onClick={() => setMode("login")}
                            disabled={isPending}
                            className={`w-1/2 py-2 rounded-md font-semibold transition ${
                                mode === "login"
                                    ? "bg-white text-blue-600 shadow"
                                    : "text-slate-500"
                            }`}
                        >
                            Login
                        </button>

                        <button
                            type="button"
                            onClick={() => setMode("register")}
                            disabled={isPending}
                            className={`w-1/2 py-2 rounded-md font-semibold transition ${
                                mode === "register"
                                    ? "bg-white text-blue-600 shadow"
                                    : "text-slate-500"
                            }`}
                        >
                            Register
                        </button>

                    </div>

                    <h2 className="text-2xl font-bold text-slate-800 mb-2">
                        {mode === "login"
                            ? "Welcome Back!"
                            : "Create Account"}
                    </h2>

                    <p className="text-sm text-slate-500 mb-6">
                        {mode === "login"
                            ? "Enter your credentials to access your account."
                            : "Fill in your details to create an account."}
                    </p>

                    {state.error && (
                        <div className="bg-red-50 border border-red-200 text-red-700 p-3 rounded-lg text-sm mb-4">
                            {state.error}
                        </div>
                    )}

                    {state.msg && (
                        <div className="bg-green-50 border border-green-200 text-green-700 p-3 rounded-lg text-sm mb-4">
                            {state.msg}
                        </div>
                    )}

                    <form action={formAction} className="space-y-5">

                        <div>
                            <label className="block text-sm font-semibold text-slate-700 mb-2">
                                Username
                            </label>

                            <input
                                type="text"
                                name="username"
                                placeholder="Enter your username"
                                defaultValue={state.username}
                                required
                                disabled={isPending}
                                autoComplete="username"
                                className="w-full border border-slate-300 rounded-lg p-3 outline-none focus:ring-2 focus:ring-blue-500 focus:border-blue-500 transition"
                            />
                        </div>

                        <div>
                            <label className="block text-sm font-semibold text-slate-700 mb-2">
                                Password
                            </label>

                            <input
                                type="password"
                                name="password"
                                placeholder="Enter your password"
                                required
                                disabled={isPending}
                                autoComplete={
                                    mode === "login"
                                        ? "current-password"
                                        : "new-password"
                                }
                                className="w-full border border-slate-300 rounded-lg p-3 outline-none focus:ring-2 focus:ring-blue-500 focus:border-blue-500 transition"
                            />
                        </div>

                        <SubmitButton
                            label={
                                mode === "login"
                                    ? "Login to Account"
                                    : "Create Account"
                            }
                        />

                    </form>

                    <p className="text-center text-xs text-slate-400 mt-6">
                        Secured with JWT Authentication
                    </p>

                </div>

            </div>

        </div>
    );
};

export default AuthForm;
