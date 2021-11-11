import React, { useState } from "react";

import "./ExpenseForm.css";

function ExpenseForm() {
  //   const [enteredTitle, setEnteredTitle] = useState('');
  //   const [enteredAmount, setEnteredAmount] = useState('');
  //   const [enteredDate, setEnteredDate] = useState('');
  const [userInput, setUserInuput] = useState({
    enteredTitle: "",
    enteredAmount: "",
    enteredDate: "",
  });

  const titleChangeHandler = (event) => {
    //setEnteredTitle(event.targer.value);
    setUserInuput({
      ...userInput,
      enteredTitle: event.target.value,
    });
  };

  const amountChangeHandler = (event) => {
    //setEnteredAmount(event.target.value);
    setUserInuput({
        ...userInput,
        enteredAmount: event.target.value,
      });
  };
  const dateChangeHandler = (event) => {
    //setEnteredDate(event.target.value);
    setUserInuput({
        ...userInput,
        enteredDate: event.target.value,
      });
  };

  return (
    <from>
      <div className="new-expense__controls">
        <div className="new-expense__control">
          <label>Title</label>
          <input type="text" onChange={titleChangeHandler} />
        </div>
        <div className="new-expense__control">
          <label>Amount</label>
          <input
            type="number"
            min="0.01"
            strp="0.01"
            onChange={amountChangeHandler}
          />
        </div>
        <div className="new-expense__control">
          <label>Date</label>
          <input
            type="date"
            min="2019-01-01"
            max="2022-12-31"
            onChange={dateChangeHandler}
          />
        </div>
      </div>
      <div className="new-expense__actions">
        <button type="submit">Add Expense</button>
      </div>
    </from>
  );
}
export default ExpenseForm;
