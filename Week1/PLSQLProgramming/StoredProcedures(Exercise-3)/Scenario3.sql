CREATE OR REPLACE PROCEDURE TransferFunds(
    from_acc IN NUMBER,
    to_acc IN NUMBER,
    amount IN NUMBER
)
AS
    balance_amt NUMBER;
BEGIN
    SELECT Balance
    INTO balance_amt
    FROM Accounts
    WHERE AccountID = from_acc;

    IF balance_amt >= amount THEN

        UPDATE Accounts
        SET Balance = Balance - amount
        WHERE AccountID = from_acc;

        UPDATE Accounts
        SET Balance = Balance + amount
        WHERE AccountID = to_acc;

        COMMIT;

        DBMS_OUTPUT.PUT_LINE('Fund transfer successful');

    ELSE

        DBMS_OUTPUT.PUT_LINE('Insufficient balance');

    END IF;
END;
/

BEGIN
    TransferFunds(101,102,1000);
END;
/
--Output
SELECT AccountID, Balance
FROM Accounts;