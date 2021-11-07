<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<style>
        .jumbotron {
            background-color: burlywood;
            text-align: center;
            color: whitesmoke;
        }

        li {
            list-style: none;
            margin-right: 50px;
            font-size: 1.2em;
            color: red;
        }

        .list-head {
            font-size: 1.5em;
            color: blue;
            padding: 10px;
        }

    </style>
</head>
<body>
	<div class="container mt-5">
        <div class="jumbotron"><h2>공지사항</h2></div>
        <div class="card-body">
            <div class="row">
                <div class="list-head">로그인 보너스</div>
                <ul>
                    <li>로그인 할 때마다 50point 지급</li>
                    <li>로그인 보너스는 하루 최대 5회</li>
                </ul>
                <div class="list-head">로그아웃 보너스</div>
                <ul>
                    <li>정상 로그아웃 시 10point 지급</li>
                    <li>로그아웃 보너스 제한 없음</li>
                </ul>
            </div>
        </div>
        <button class="btn btn-secondary text-right" onclick="script:history.back()">돌아가기</button>
    </div>
</body>
</html>