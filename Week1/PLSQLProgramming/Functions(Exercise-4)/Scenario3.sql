CREATE OR REPLACE FUNCTION HasSufficientBalance(
    acc_id NUMBER,
    amount NUMBER
)
RETURN VARCHAR2
IS
    acc_balance NUMBER;
BEGIN
    SELECT Balance
    INTO acc_balance
    FROM Accounts
    WHERE AccountID = acc_id;

    IF acc_balance >= amount THEN
        RETURN 'YES';
    ELSE
        RETURN 'NO';
    END IF;
END;
/

SELECT AccountID,
       Balance,
       HasSufficientBalance(AccountID,5000) AS Status
FROM Accounts;