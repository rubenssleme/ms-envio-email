package com.ms.envioemail.controllers;

import com.ms.envioemail.dtos.EmailDto;
import com.ms.envioemail.models.EmailModel;
import com.ms.envioemail.services.EmailService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EmailController {
    @Autowired
    EmailService emailService;
    @PostMapping("/sendind-email")
    public ResponseEntity<EmailModel>sendingEmail(@RequestBody @Valid EmailDto emailDto){
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(emailDto, emailModel);
        emailService.sendEmail(emailModel);
        return  new ResponseEntity<>(emailModel, HttpStatus.CREATED);
    }
}
