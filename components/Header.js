import React from "react";
import { Card } from "reactstrap";


function Header({ name, title }) {
    return (
        <div>

            <Card className="my-1 bg-warning">
                <h1 className="text-center my-3">
                    WELCOME TO CORONA HOSPITAL  
                </h1>
            </Card>

        </div>

    );

}

export default Header;
