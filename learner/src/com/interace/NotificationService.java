package com.interace;

public class NotificationService {
	public static void main(String[] args)
	{
		//object creation
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = notificationFactory.createNotification("SMS");
		notification.notifyUser();
	}
}
