@facebook
Feature: Create profile in Facebook 

Background: Launch Facebook
Given Launch Facebook "https://www.facebook.com/"
And Navigate to create new account

Scenario Outline: Create new Account
When Enter the name "<First name>"
When Enter the surname "<Surname>"
When Enter the number "<Mobile number>"
When Enter the password "<New password>"
When Enter the Date "<Date>"
When Enter the Month "<Month>"
When Enter the Year "<Year>"
When Click On Sigh Up
Then Take screenshot "<First name>"

Examples:
|First name|Surname|Mobile number|New password|Date|Month|Year|
|Santos    |G.M    |999999999   |j12345i|10|Aug|1999|
|karthik    |R    |999999499   |j12345i|11|Aug|1997|
#|Azhagu    |Q    |9994199999   |j12345i|10|Aug|1995|
#|Vignesh    |S    |999999999   |j12345i|10|Aug|1969|
#|priya    |B    |999999999   |j12345i|10|Aug|1998|
