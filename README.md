Student Record Inserting System
Overview
The Student Record Inserting System is a desktop application built using Java Swing for the GUI and Hibernate ORM for database management. The application allows users to input student details, such as their name and roll number, and store them in a PostgreSQL database.

Features
User-Friendly GUI: Developed using Java Swing, the application provides a simple interface for adding student records.
Database Integration: Uses Hibernate ORM to interact with a PostgreSQL database for storing student data.
Real-Time Validation: Ensures that no fields are left empty before submitting the form.
Feedback: Provides user feedback on successful record insertion or if any error occurs during the process.
Tech Stack
Frontend: Java Swing (for GUI)
Backend: Hibernate ORM
Database: PostgreSQL
Build Tool: Maven
Setup and Installation
Prerequisites
Java 8 or higher
PostgreSQL installed and configured
Maven installed
Steps to Run
Clone the repository:

bash
Copy code
git clone https://github.com/your-username/student-record-inserting-system.git
Set up PostgreSQL:

Create a PostgreSQL database:
sql
Copy code
CREATE DATABASE student_db;
Update the database connection details in hibernate.cfg.xml.
Build and run the application using Maven:

bash
Copy code
mvn clean install
java -jar target/formgui-1.0.jar
Configuration
In the hibernate.cfg.xml file, update the following properties to match your local PostgreSQL setup:

xml
Copy code
<property name="hibernate.connection.url">jdbc:postgresql://localhost:5432/your_database</property>
<property name="hibernate.connection.username">your_username</property>
<property name="hibernate.connection.password">your_password</property>
Usage
Launch the application, and enter the student’s name and roll number.
Click the Submit button to store the record in the database.
If all fields are filled, a success message will appear. Otherwise, an error message will be displayed.
Future Enhancements
Adding the ability to update and delete records.
Displaying stored records in a table format within the GUI.
Exporting data to a CSV file.
