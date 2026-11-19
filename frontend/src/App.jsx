
import React, { useState } from 'react';
import AuthForm from './AuthForm';
import PostForm from './PostForm';

const App = () => {

    const [isAuthenticated, setIsAuthenticated] = useState(
        () => Boolean(localStorage.getItem("token"))
    );

    const [username, setUsername] = useState(
        () => localStorage.getItem("username") || ""
    );

    const handleLogin = (loggedInUsername) => {
        setUsername(loggedInUsername);
        setIsAuthenticated(true);
    };

    const handleLogout = () => {
        localStorage.removeItem("token");
        localStorage.removeItem("username");

        setUsername("");
        setIsAuthenticated(false);
    };

    return (
        <div className="min-h-screen bg-slate-100">

            {isAuthenticated ? (

                <div className="max-w-5xl mx-auto px-4 py-10">

                    <header className="flex justify-between items-center mb-10">
                        <div>
                            <h1 className="text-2xl font-bold text-slate-800">
                                My Dashboard
                            </h1>
                            <p className="text-slate-500">
                                Welcome, {username}
                            </p>
                        </div>

                        <button
                            onClick={handleLogout}
                            className="bg-red-600 hover:bg-red-700 text-white px-5 py-2 rounded-lg"
                        >
                            Logout
                        </button>
                    </header>

                    <PostForm />

                </div>

            ) : (

                <AuthForm onLogin={handleLogin} />

            )}

        </div>
    );
};

export default App;
