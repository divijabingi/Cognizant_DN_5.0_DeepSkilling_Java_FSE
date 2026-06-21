BEGIN
    FOR elders IN (
        SELECT CustomerID
        FROM Customers
        WHERE FLOOR(MONTHS_BETWEEN(SYSDATE, DOB)/12) > 60
    )
    LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = elders.CustomerID;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Interest rates updated successfully');

    FOR loan_rec IN (
        SELECT LoanID, CustomerID, InterestRate
        FROM Loans
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'LoanID: ' || loan_rec.LoanID ||
            ' CustomerID: ' || loan_rec.CustomerID ||
            ' InterestRate: ' || loan_rec.InterestRate
        );
    END LOOP;
END;
/
--Output
SELECT * FROM Loans;