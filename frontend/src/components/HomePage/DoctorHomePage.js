import React from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import "../../css/DoctorHomePage.css";
import Header from "../Header/Header";
import { Link } from "react-router-dom";

function DoctorHomePage() {
  return (
    <div>
      <Header />
      {/* <h1 cla>Doctor HomePage</h1> */}
      <div className="container">
        <div className="card-grid">
          <Link to="/pendingpatient">
            <div className="card">
              <div className="card-body">
                <h4>Pending</h4>
              </div>
            </div>
          </Link>
          <div className="card">
            <div className="card-body">
              <h4>Ongoing</h4>
            </div>
          </div>

          <div className="card">
            <div className="card-body">
              <h4>Treated</h4>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default DoctorHomePage;
