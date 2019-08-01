package hello;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

import com.tiaa.controller.QuoteRequestController;
import com.tiaa.controller.QuoteRequestManagmentControler;

@ControllerAdvice(assignableTypes = 
{QuoteRequestController.class,
QuoteRequestManagmentControler.class})

public class TIAA_Advice {
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		SimpleDateFormat dateFormat =  new SimpleDateFormat("yyyy-mm-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor
				(dateFormat, false));
	}

}
