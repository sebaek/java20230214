package ch09.exercise.exam07;

public class Chatting {
	class Chat {
		void start() {
		}
		
		void sendMessage(String message) {
		}
	}
	
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		
		Chat chat = new Chat() {
			void start() {
				while (true) {
					String inputDate = "안녕하세요";
					String message = "[" + nickName + "]" + inputDate;
					sendMessage(message);
				}
			};
		};
		
		chat.start();
	}
}
