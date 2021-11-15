import React, { useState } from "react";
import ExpenseList from "./NewExpense/ExpenseList";
import ExpenseFilter from "./NewExpense/ExpenseFilter";
import ExpensesChart from "./ExpensesChart";
import Card from "./Card.js";
import "../style/Expenses.css";

const Expenses = (props) => {
  const [filteredYear, setFilteredYear] = useState("");

  const filterChangeHandler = (selectedYear) => {
    setFilteredYear(selectedYear);
  };

  const filteredExpenses = props.items.filter((expense) => {
    return expense.date.getFullYear().toString() === filteredYear;
  });

  return (
    <div>
      <Card className="expenses">
        <ExpenseFilter
          selected={filteredYear}
          onDropdownChange={filterChangeHandler}
        />
        <ExpensesChart expenses={filteredExpenses}/>
        <ExpenseList items={filteredExpenses}/>
      </Card>
    </div>
  );
};
export default Expenses;
