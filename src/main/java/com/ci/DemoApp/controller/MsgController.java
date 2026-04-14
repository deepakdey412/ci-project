package com.ci.DemoApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MsgController {

    @GetMapping
    public String hello() {
        return """
                <html>
                <head>
                    <title>CI/CD App</title>
                    <style>
                        body {
                            margin: 0;
                            font-family: Arial, sans-serif;
                            background: linear-gradient(135deg, #1e3c72, #2a5298);
                            color: white;
                            text-align: center;
                        }
                        .container {
                            margin-top: 15%;
                        }
                        h1 {
                            font-size: 40px;
                        }
                        p {
                            font-size: 18px;
                            opacity: 0.9;
                        }
                        .box {
                            margin: 20px auto;
                            padding: 20px;
                            width: 60%;
                            background: rgba(255,255,255,0.1);
                            border-radius: 15px;
                            box-shadow: 0px 4px 15px rgba(0,0,0,0.3);
                        }
                        .btn {
                            display: inline-block;
                            margin-top: 20px;
                            padding: 10px 20px;
                            background: #00c6ff;
                            color: white;
                            border-radius: 25px;
                            text-decoration: none;
                            font-weight: bold;
                        }
                        .btn:hover {
                            background: #0072ff;
                        }
                    </style>
                </head>

                <body>

                    <div class="container">

                        <h1>🚀 Spring Boot CI/CD App</h1>

                        <div class="box">
                            <p>Welcome.. Your deployment is successful 🎉</p>
                            <p>This page is served directly from Java without Thymeleaf</p>
                        </div>

                        <a class="btn" href="https://spring.io/projects/spring-boot">Learn Spring Boot</a>

                    </div>

                </body>
                </html>
                """;
    }
}
