import { CalculateScore } from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore
        Name={"Divija"}
        School={"Ideal Public School"}
        total={275}
        goal={3}
      />
    </div>
  );
}

export default App;