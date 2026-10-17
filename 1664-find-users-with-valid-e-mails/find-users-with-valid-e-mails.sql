
SELECT *
FROM Users
WHERE mail REGEXP '^[A-Za-z][A-Za-z0-9_.-]*@leetcode[.]com$'
  AND BINARY SUBSTRING_INDEX(mail, '@', -1) = BINARY 'leetcode.com';