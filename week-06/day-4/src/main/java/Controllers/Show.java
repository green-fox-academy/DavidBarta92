package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Show {

  @RequestMapping(value="/show", method = RequestMethod.GET)
  public String  show(Model model){
    return "AccountsPage";
  }

}
