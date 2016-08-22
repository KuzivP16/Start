<?xml version="1.0" encoding="UTF-8"?>

<div
        xmlns:jsp="http://java.sun.com/JSP/Page"
        xmlns:spring="http://www.springframework.org/tags"
        xmlns:c="http://java.sun.com/jsp/jstl/core"
        version="2.0"
>




    ${user}

    <form action="/qq" method="get">
        <table>
            <tr><td>ID</td><td><input name="id" type="text" /></td></tr>
            <tr><td>NAME</td><td><input name="name" type="text" /></td></tr>
            <tr><td>GROUP</td><td><input name="group.name" type="text" /></td></tr>
            <tr><td></td><td><input type="submit" /></td></tr>
        </table>

    </form>
</div>