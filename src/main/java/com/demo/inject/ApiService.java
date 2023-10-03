package com.demo.inject;

public class ApiService {
    private EmailService emailService;
    private SMSService smsService;

    public ApiService() {
        super();
    }

    public ApiService(EmailService emailService, SMSService smsService) {
        super();
        this.emailService = emailService;
        this.smsService = smsService;
    }

    public boolean sendSMS(String msg) {
        return smsService.send(msg);
    }

    public boolean sendEmail(String msg) {
        return emailService.send(msg);
    }
}
