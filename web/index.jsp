<%--
  Created by IntelliJ IDEA.
  User: wangg
  Date: 2020/12/3
  Time: 8:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户信息</title>
</head>
<body>
<script src="js/jquery-2.1.0.min.js"></script>
<script>
    $(function () {
        window.onload = function () {
            $.ajax({
                //编写json格式，设置属性和值
                url: "show",
                contentType: "application/json;charset=UTF-8",
                dataType: "json",
                type: "get",
                success: function (data) {//请求成功后的回调函数
                    $("#tbody").empty();
                    var str = "";
                    for (var i = 0; i < data.length; i++) {
                        str += "<tr>" +
                            "<td>" + data[i].id + "</td>" +
                            "<td>" + data[i].kehuname + "</td>" +
                            "<td>" + data[i].diqv + "</td>" +
                            "<td>" + data[i].lianxiren + "</td>" +
                            "<td>" + data[i].weihulianxiren + "</td>" +
                            "<td>" + data[i].xiangmu + "</td>" +
                            "</tr>";
                    }
                    $("#tbody").show().append(str);
                }
            });

            $.ajax({
                //编写json格式，设置属性和值
                url: "lie",
                contentType: "application/json;charset=UTF-8",
                dataType: "json",
                type: "get",
                success: function (data) {//请求成功后的回调函数
                    $("#xiangmu").empty();
                    var str = "";
                    for (var i = 0; i < data.length; i++) {
                        str += "<option>" + data[i].xiangmu +
                            "</option>";
                    }
                    $("#xiangmu").show().append(str);
                }
            });
            $.ajax({
                //编写json格式，设置属性和值
                url: "liew",
                contentType: "application/json;charset=UTF-8",
                dataType: "json",
                type: "get",
                success: function (data) {//请求成功后的回调函数
                    $("#weihulianxiren").empty();
                    var str = "";
                    for (var i = 0; i < data.length; i++) {
                        str += "<option>" + data[i].weihulianxiren +
                            "</option>";
                    }
                    $("#weihulianxiren").show().append(str);
                }
            });
        };
        $("#FindAll").click(function () {
            //ajax请求
            var xiangmu = $("#xiangmu").val();
            var diqv = $("#diqv").val();
            var kehuname = $("#kehuname").val();
            var weihulianxiren = $("#weihulianxiren").val();
            var lianxiren = $("#lianxiren").val();

            $.ajax({
                //编写json格式，设置属性和值
                url: "show",
                contentType: "application/json;charset=UTF-8",
                dataType: "json",
                data: {

                    "kehuname": kehuname,
                    "diqv": diqv,
                    "lianxiren": lianxiren,
                    "weihulianxiren": weihulianxiren,
                    "xiangmu": xiangmu
                },
                type: "get",
                success: function (data) {//请求成功后的回调函数
                    $("#tbody").empty();
                    var str = "";
                    for (var i = 0; i < data.length; i++) {
                        str += "<tr>" +
                            "<td>" + data[i].id + "</td>" +
                            "<td>" + data[i].kehuname + "</td>" +
                            "<td>" + data[i].diqv + "</td>" +
                            "<td>" + data[i].lianxiren + "</td>" +
                            "<td>" + data[i].weihulianxiren + "</td>" +
                            "<td>" + data[i].xiangmu + "</td>" +
                            "</tr>";
                    }
                    $("#tbody").show().append(str);
                }
            });
        });

        $("#add").click(function () {
            //ajax请求
            var xiangmu = $("#xiangmu").val();
            var diqv = $("#diqv").val();
            var kehuname = $("#kehuname").val();
            var weihulianxiren = $("#weihulianxiren").val();
            var lianxiren = $("#lianxiren").val();
                $.ajax({
                //编写json格式，设置属性和值
                url: "add",
                contentType: "application/json;charset=UTF-8",
                dataType: "json",
                data: {
                    "kehuname": kehuname,
                    "diqv": diqv,
                    "lianxiren": lianxiren,
                    "weihulianxiren": weihulianxiren,
                    "xiangmu": xiangmu
                },
                type: "get",
                    success: function (data) {//请求成功后的回调函数
                        window.location.reload()
            }
        })});

        $("#update").click(function () {
            //ajax请求
            var xiangmu = $("#xiangmu").val();
            var diqv = $("#diqv").val();
            var kehuname = $("#kehuname").val();
            var weihulianxiren = $("#weihulianxiren").val();
            var lianxiren = $("#lianxiren").val();
            var id = $("#id").val();
            $.ajax({
                //编写json格式，设置属性和值
                url: "update",
                contentType: "application/json;charset=UTF-8",
                dataType: "json",
                data: {
                    "id": id,
                    "kehuname": kehuname,
                    "diqv": diqv,
                    "lianxiren": lianxiren,
                    "weihulianxiren": weihulianxiren,
                    "xiangmu": xiangmu
                },
                type: "get",
                success: function (data) {//请求成功后的回调函数
                    window.location.reload()
            }
        });
        });
    });


</script>


学生编号 : <input type="text" name="id" id="id">
性别 : <input type="text" name="kehuname" id="kehuname">
学生姓名 : <input type="text" name="diqv" id="diqv">
班级 : <input type="text" name="lianxiren" id="lianxiren">
年级 : <select name="weihulianxiren" id="weihulianxiren"></select>
专业 : <select name="xiangmu" id="xiangmu"></select>

<button id="FindAll">查询</button>
<button id="add">新增</button>

<table width="40%" border="1px" cellspacing="0">
    <tr>
        <td>学生编号</td>
        <td>性别</td>
        <td>学生姓名</td>
        <td>班级</td>
        <td>年级</td>
        <td>专业</td>
    </tr>
    <tbody id="tbody">
    </tbody>
</table>
</body>
</html>
