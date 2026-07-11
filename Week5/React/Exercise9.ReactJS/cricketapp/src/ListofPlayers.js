import React from "react";

function ListofPlayers(props) {

    return (
        <ul>
            {
                props.players.map((item, index) => (
                    <li key={index}>
                        Mr. {item.name} {item.score}
                    </li>
                ))
            }
        </ul>
    );
}

export default ListofPlayers;

export function Scorebelow70(props) {

    const players70 = props.players.filter(
        player => player.score < 70
    );

    return (
        <ul>
            {
                players70.map((item, index) => (
                    <li key={index}>
                        Mr. {item.name} {item.score}
                    </li>
                ))
            }
        </ul>
    );
}