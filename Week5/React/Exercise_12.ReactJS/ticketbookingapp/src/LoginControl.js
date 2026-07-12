import React, { Component } from "react";

import LoginButton from "./LoginButton";
import LogoutButton from "./LogoutButton";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

function Greeting(props) {

    const isLoggedIn = props.isLoggedIn;

    if (isLoggedIn) {
        return <UserPage />;
    }

    return <GuestPage />;
}

class LoginControl extends Component {

    constructor(props) {
        super(props);

        this.state = {
            isLoggedIn: false
        };
    }

    handleLoginClick = () => {

        this.setState({
            isLoggedIn: true
        });

    }

    handleLogoutClick = () => {

        this.setState({
            isLoggedIn: false
        });

    }

    render() {

        const isLoggedIn = this.state.isLoggedIn;

        let button;

        if (isLoggedIn) {

            button =
                <LogoutButton
                    onClick={this.handleLogoutClick}
                />;

        }
        else {

            button =
                <LoginButton
                    onClick={this.handleLoginClick}
                />;

        }

        return (

            <div>

                <Greeting isLoggedIn={isLoggedIn} />

                {button}

            </div>

        );

    }

}

export default LoginControl;