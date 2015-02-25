package com.lqq.account.email;

/**
 * Created with IntelliJ IDEA.
 * User: liuqq
 * Date: 2015/2/25
 * Time: 17:09
 */
public interface AccountEmailService {
    public void sendEmail(String to, String subject, String htmlText);
}
