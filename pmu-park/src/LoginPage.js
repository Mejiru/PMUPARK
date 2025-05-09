import React from "react";
import "./LoginPage.css";

const LoginPage = () => {
  return (
    <div className="login-bg">
      <div className="login-container">
        <h2>Welcome To PMU Parking</h2>
        <form>
          <input type="email" placeholder="Email" required />
          <input type="password" placeholder="Password" required />
          <button type="submit">Login</button>
        </form>
        <div className="register-link">
          No account? <a href="/register">Register</a>
        </div>
      </div>
    </div>
  );
};

export default LoginPage;