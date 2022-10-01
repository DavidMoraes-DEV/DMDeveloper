import About from "pages/About";
import Projects from "pages/Projects";
import Resume from "pages/Resume";
import { BrowserRouter, Route, Switch } from "react-router-dom";
import Navbar from "./components/Navbar";
import Home from "./pages/Home";

const Routes = () => (
    <BrowserRouter>
        <Navbar />
        <Switch>
            <Route path='/' exact>
                <Home />
            </Route>
            <Route path='/projects' exact>
                <Projects />
            </Route>
            <Route path='/resume' exact>
                <Resume />
            </Route>
            <Route path='/about' exact>
                <About />
            </Route>
        </Switch>
    </BrowserRouter>
);

export default Routes;