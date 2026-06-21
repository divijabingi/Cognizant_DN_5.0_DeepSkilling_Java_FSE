CREATE OR REPLACE FUNCTION CalculateAge(
    dob DATE
)
RETURN NUMBER
IS
    age_years NUMBER;
BEGIN
    age_years := FLOOR(MONTHS_BETWEEN(SYSDATE, dob) / 12);
    RETURN age_years;
END;
/

SELECT CustomerID,
       Name,
       CalculateAge(DOB) AS Age
FROM Customers;