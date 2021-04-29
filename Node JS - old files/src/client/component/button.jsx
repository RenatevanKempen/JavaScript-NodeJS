// @flow

import React from 'react'

//type Props = {
//  label: string,
//  handleClick: Function,
//}

const Button = ({ label, handleClick }) => (
  <button onClick={handleClick}>{label}</button>
);

export default Button