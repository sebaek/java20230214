package ch19.lecture.p02http;

import java.io.*;
import java.net.*;

public class C02Server {
	public static void main(String[] args) {
		int port = 80;

		try (
				ServerSocket serverSocket = new ServerSocket(port);) {

			System.out.println("요청 기다리는중..");

			try (
					Socket socket = serverSocket.accept();

					OutputStream os = socket.getOutputStream();
					PrintStream ps = new PrintStream(os);) {

			}

			ps.println("HTTP/1.1 200 OK");

			ps.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("서버 종료!");
	}
}
