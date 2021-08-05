package com.ms.envioemail.services;

import com.ms.envioemail.models.EmailModel;
import com.ms.envioemail.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    EmailRepository emailRepository;

    public void sendEmail(EmailModel emailModel) {

    }
}
