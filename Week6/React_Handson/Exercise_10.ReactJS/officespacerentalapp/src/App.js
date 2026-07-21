import './App.css';
import office1 from "./images/office1.jpg";
import office2 from "./images/office2.jpg";
import office3 from "./images/office3.jpg";

function App() {

  const element = "Office Space";

  const officeList = [

  {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai",
    Image: office1
  },

  {
    Name: "Regus",
    Rent: 65000,
    Address: "Hyderabad",
    Image: office2
  },

  {
    Name: "WeWork",
    Rent: 55000,
    Address: "Bangalore",
    Image: office3
  }

];

  return (

    <div style={{ marginLeft: "50px" }}>

      <h1>{element}, at Affordable Range</h1>

      {
        officeList.map((item, index) => (

          <div key={index}>

            <img
              src={item.Image}
              alt={item.Name}
              width="25%"
            />

            <h2>Name: {item.Name}</h2>

            <h3
              style={{
                color: item.Rent <= 60000 ? "red" : "green"
              }}
            >
              Rent: Rs. {item.Rent}
            </h3>

            <h3>Address: {item.Address}</h3>

            <br />

          </div>

        ))
      }

    </div>

  );

}

export default App;