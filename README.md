# Splitwise
A project for Design and Integration of software systems 2023/2024
The real-time commited project is in the forked repository SplitWiseOriginal.
Splitwise is a distributed console application. The architecture we chose to design is client/server. The application is a simplified version of the popular expense-tracking app Splitwise. It aims to simplify sharing expenses with friends, individually or in groups. The client of our architecture is designed for our user’s needs, it accepts commands and sends them to the server. Then the server processes them, accepts the answer and gives it to the user in human-readable format. Our application uses a SQL database, established through object-relational mapping, using Jakarta Persistence. We also use Maven for project management. For testing we use Junit for writing Unit tests and Mockito for writing mockups. The communication protocol we chose to work with is TCP, as we need predictable and stable communication, as we exchange financial transactions.
##### Registration – this happens with the command “register”, followed by the username and password the user wants to create an account with
##### Log-in – functionality for already registered users. The user should write “login”, followed by username and password as well
##### Logout – the user can log out of their profile by typing in the command “logout”
##### Adding friend – a user can add another user as friend with the command “add-friend”, followed by the friend-to-be’s username
##### Creating a group – a user can create a group with other already registered users by typing in the command “create-group” after which they should write a name for the group and after that they should list all the participants
##### Adding expense to split with a friend – when the user types in “split”, followed by the friend’s username, the amount to be split and the reason for the split
##### Adding expense to split with a group – this functionality is accessed through typing the command “split-group” after which the user lists the group’s name, the amount to be split and the reason for the split
##### Getting information about all the money the user owes or is owed to, grouped by types of relations – friendships or groups – the user types in “get-status” in order to receive this information
##### Paying a friendship expense – you can give the money you owe to your friend with the command “pay”, followed by the amount and the name of the friend
##### Paying a group expense – you can pay what you owe to a group with the command “pay-group”, the amount and the group’s name
Use the jar files to start through command prompt, supports multiple clients at the same time.
