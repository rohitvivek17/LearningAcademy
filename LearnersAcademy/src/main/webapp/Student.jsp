<%@page import="com.learningAcademy.Entity.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.learningAcademy.DAO.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>Student Details</h1>
    <form method="post" action="student.jsp">
        <input type="hidden" name="action" value="addOrUpdate">
        <label for="studentId">Student ID:</label>
        <input type="text" name="studentId" id="studentId" /><br><br>
        <label for="studentName">Student Name:</label>
        <input type="text" name="studentName" id="studentName" /><br><br>
        <label for="studentAge">Student Age:</label>
        <input type="text" name="studentAge" id="studentAge" /><br><br>
        <input type="submit" value="Save" />
    </form>
    <hr>
    <h2>Student List</h2>
    <table>
        <tr>
            <th>Student ID</th>
            <th>Student Name</th>
            <th>Student Age</th>
            <th>Action</th>
        </tr>
        <%
            // Retrieve student list from the database and display it in the table
            List<Student> studentList = StudentDAO.getAllStudents();
            for (Student student : studentList) {
        %>
        <tr>
            <td><%= student.getStudentId() %> </td>
            <td><%= student.getStudentName() %></td>
            <td><%= student.getStudentAge() %></td>
            <td>
                <a href="student.jsp?action=edit&studentId=<%= student.getStudentId() %>">Edit</a>
                <a href="student.jsp?action=delete&studentId=<%= student.getStudentId() %>">Delete</a>
            </td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>