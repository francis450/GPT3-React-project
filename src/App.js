import React from 'react';

import {Brand,CTA,Navbar} from './Components';
import {Blog,Features,Footer,Header,Possibility,WhatGPT3} from './Containers';
import './App.css'

const App = () => {//functional component
    return(
        <div className = "App">
            <div className = "gradient__bg">
                <Navbar />
                <Header />
            </div>
            <Brand />
            <WhatGPT3 />
            <Features />
            <Possibility />
            <CTA />
            <Blog />
            <Footer /> 
        </div>
    )
} 
export default App;