const express = require("express");
const mongoose = require("mongoose");
const Router = require("./routes")

const app = express();

app.use(express.json());

const username = "thepiratesofmarshall";
const pwd = "%40LIA2023";
const cluster = "LIACluster";
const dbname = "Eventi";

mongoose