package com.thebund1st.daming.web

import com.thebund1st.daming.application.SmsVerificationCommandHandler
import com.thebund1st.daming.boot.http.EndpointsConfiguration
import com.thebund1st.daming.jwt.SmsVerifiedJwtIssuer
import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.context.annotation.Import
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

@WebMvcTest
@Import(EndpointsConfiguration)
class AbstractWebMvcTest extends Specification {

    @Autowired
    protected MockMvc mockMvc

    @SpringBean
    protected SmsVerificationCommandHandler smsVerificationHandler = Mock()

    @SpringBean
    protected SmsVerifiedJwtIssuer smsVerifiedJwtIssuer = Mock()
}
