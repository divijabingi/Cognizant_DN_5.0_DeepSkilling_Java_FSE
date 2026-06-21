CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    loan_amount NUMBER,
    interest_rate NUMBER,
    years NUMBER
)
RETURN NUMBER
IS
    monthly_installment NUMBER;
BEGIN
    monthly_installment :=
        (loan_amount +
        (loan_amount * interest_rate * years / 100))
        / (years * 12);

    RETURN ROUND(monthly_installment,2);
END;
/

SELECT LoanID,
       CalculateMonthlyInstallment(
           LoanAmount,
           InterestRate,
           5
       ) AS MonthlyInstallment
FROM Loans;