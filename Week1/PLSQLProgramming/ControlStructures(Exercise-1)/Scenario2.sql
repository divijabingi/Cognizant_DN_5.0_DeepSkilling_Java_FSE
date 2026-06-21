BEGIN
    FOR vip IN (
        SELECT CustomerID
        FROM Customers
        WHERE Balance > 10000
    )
    LOOP
        UPDATE Customers
        SET IsVIP = 'YES'
        WHERE CustomerID = vip.CustomerID;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('VIP status updated successfully');

    FOR cust IN (
        SELECT CustomerID, Name, Balance, IsVIP
        FROM Customers
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'CustomerID: ' || cust.CustomerID ||
            ' Name: ' || cust.Name ||
            ' Balance: ' || cust.Balance ||
            ' VIP: ' || NVL(cust.IsVIP,'NO')
        );
    END LOOP;
END;
/

--Output
SELECT CustomerID, Name, Balance, IsVIP
FROM Customers;