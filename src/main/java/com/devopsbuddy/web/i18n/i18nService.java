package com.devopsbuddy.web.i18n;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

@Service
public class i18nService {

	/** The application logger */
	private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(i18nService.class);
	
	@Autowired
	private MessageSource messageSource;
	
	/* Returns a message for the given message id and the default locale in the session context
	 * @param messageId the key to the messages resouce file
	 */
	public String getMessage(String messageId){
		LOG.info("returns i18n text for messageId {}",messageId);
		Locale locale = LocaleContextHolder.getLocale();
		return getMessage(messageId,locale);
	}
	/* Returns a message for the given message id and locale 
	 * @param messageId the key to the messages resource file
	 * @param locale The Locale
	 */
	
	public String getMessage(String messageId, Locale locale){
		return messageSource.getMessage(messageId, null, locale);
	}
}