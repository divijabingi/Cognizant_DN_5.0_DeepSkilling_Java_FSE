import React from "react";

function LoginButton(props) {

    return (

        <button
    onClick={props.onClick}
    style={{
        backgroundColor: "#1976D2",
        color: "white",
        padding: "10px 20px",
        border: "none",
        borderRadius: "5px",
        cursor: "pointer",
        fontSize: "16px"
    }}
>
            Login
        </button>

    );

}

export default LoginButton;