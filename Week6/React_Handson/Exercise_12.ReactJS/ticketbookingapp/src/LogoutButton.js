import React from "react";

function LogoutButton(props) {

    return (

        <button
    onClick={props.onClick}
    style={{
        backgroundColor: "#E53935",
        color: "white",
        padding: "10px 20px",
        border: "none",
        borderRadius: "5px",
        cursor: "pointer",
        fontSize: "16px"
    }}
>
            Logout
        </button>

    );

}

export default LogoutButton;